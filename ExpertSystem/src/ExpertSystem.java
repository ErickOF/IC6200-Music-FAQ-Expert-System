import net.sf.clipsrules.jni.Environment;
import net.sf.clipsrules.jni.FactAddressValue;
import net.sf.clipsrules.jni.MultifieldValue;

public class ExpertSystem {
    private Environment clips;

    public ExpertSystem() {
        // Create CLIPS environment
        this.clips = new Environment();
    }

    private String evalExpression(String expression, String response, String field) {
        // Set the new fact
        this.clips.assertString(expression);
        this.clips.run();

        MultifieldValue mv = (MultifieldValue) clips.eval("(find-all-facts ((?f " + response +")) TRUE)");
        FactAddressValue fact = (FactAddressValue) mv.multifieldValue().get(0);

        try {
            return fact.getFactSlot("frequency").toString();
        } catch (Exception e) {
            System.out.println(e);
        }

        return "";
    }

    /**
     * Returns the frequency of a given note
     * 
     * Example:
     *      -getNoteFrequency("A", 0) -> 27.5
     * 
     * @param String note
     * @param Integer scale
     * 
     * @return frequency of the note
     */
    public double getNoteFrequency(String note, Integer k) {
        // Load the environment
        this.loadEnv();

        // Load problem rule
        this.clips.load(Constants.RULE_NOTE_FREQUENCY);

        // Load in the environment
        this.clips.reset();

        // Evaluate the expression and get the result
        String expression = "(requested-note " + note + " " + k + ")";
        String result = this.evalExpression(expression, "response-frequency", "frequency");

        return Float.parseFloat(result);
    }

    private void loadEnv() {
        // Clear environment
        this.clips.clear();

        // Load facts, functions, rule, and templates
        this.clips.load(Constants.FACTS);
        this.clips.load(Constants.FUNCTIONS);
        this.clips.load(Constants.TEMPLATES);
    }
}

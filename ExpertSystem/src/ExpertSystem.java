import net.sf.clipsrules.jni.Environment;
import net.sf.clipsrules.jni.FactAddressValue;
import net.sf.clipsrules.jni.MultifieldValue;

public class ExpertSystem {
    private Environment clips;

    public ExpertSystem() {
        // Create CLIPS environment
        this.clips = new Environment();
    }

    /**
     * Function to eval an expression in CLIPS
     *
     * @param expression - expression to evaluate in CLIPS
     * @param response - name of the structure
     * @param field - field where the response where stored
     * 
     * @return evaluation of the expression in CLIPS
     */
    private String evalExpression(String expression, String response, String field) {
        // Set the new fact
        this.clips.assertString(expression);
        this.clips.run();

        MultifieldValue mv = (MultifieldValue) clips.eval("(find-all-facts ((?f " + response +")) TRUE)");
        FactAddressValue fact = (FactAddressValue) mv.multifieldValue().get(0);

        try {
            return fact.getFactSlot(field).toString();
        } catch (Exception e) {
            System.out.println(e);
        }

        return "";
    }

    
    /**
     * Returns the distance between an interval
     * 
     * Example:
     *      -getIntervalDistance("C", "G") -> "quinta"
     * 
     * @param note1 - first note of the interval
     * @param note2 - second note of the interval
     * 
     * @return distance between an interval
     */
    public String getIntervalDistance(String note1, String note2) {
        // Load the environment
        this.loadEnv();

        // Load problem rule
        this.clips.load(Constants.RULE_INTERVAL_DISTANCE);

        // Load in the environment
        this.clips.reset();

        // Evaluate the expression and get the result
        String expression = "(requested-interval " + note1 + " " + note2 + ")";
        String result = this.evalExpression(expression, "response-distance", "distance");

        return result;
    }

    /**
     * Returns the frequency of a given note
     * 
     * Example:
     *      -getNoteFrequency("A", 0) -> 27.5
     * 
     * @param note
     * @param scale
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

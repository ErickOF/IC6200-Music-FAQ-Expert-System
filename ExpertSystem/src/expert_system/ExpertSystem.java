package expert_system;

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
     * @param response   - name of the structure
     * @param field      - field where the response where stored
     * 
     * @return evaluation of the expression in CLIPS
     */
    private String evalExpression(String expression, String response, String field) {
        // Set the new fact
        this.clips.assertString(expression);
        this.clips.run();

        MultifieldValue mv = (MultifieldValue) clips.eval("(find-all-facts ((?f " + response + ")) TRUE)");
        FactAddressValue fact = (FactAddressValue) mv.multifieldValue().get(0);

        try {
            return fact.getFactSlot(field).toString();
        } catch (Exception e) {
            System.out.println(e);
        }

        return "";
    }

    /**
     * Function to eval an expression in CLIPS
     *
     * @param expression - expression to evaluate in CLIPS
     * @param response   - name of the structure
     * @param field      - field where the response where stored
     * 
     * @return evaluation of the expression in CLIPS
     */
    private String[] evalExpression(String expression, String response, String[] fields) {
        // Set the new fact
        this.clips.assertString(expression);
        this.clips.run();

        MultifieldValue mv = (MultifieldValue) clips.eval("(find-all-facts ((?f " + response + ")) TRUE)");
        FactAddressValue fact = (FactAddressValue) mv.multifieldValue().get(0);

        final int size = fields.length;
        String[] result = new String[size];

        try {
            for (int i = 0; i < size; i++) {
                result[i] = fact.getFactSlot(fields[i]).toString();
            }

            return result;
        } catch (Exception e) {
            System.out.println(e);
        }

        return result;
    }
    /**
     * Returns the guitar circle of a given note
     * 
     * Example:
     *      -getGuitarCircle("C") -> "A D G C"
     * 
     * @param note - note to build guitar circle
     * 
     * @return guitar circle of a given note
     */
    public String[] getGuitarCircle(String note) {
        // Load the environment
        this.loadEnv();

        // Load problem rule
        this.clips.load(Constants.RULE_GUITAR_CIRCLE);

        // Load in the environment
        this.clips.reset();

        // Evaluate the expression and get the result
        String expression = "(requested-note " + note + " " + ")";
        String[] fields = { "vi", "ii", "V", "I" };

        String[] result = this.evalExpression(expression, "response-guitar-circle", fields);

        return result;
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
     * Returns the major scale base on a note
     * 
     * Example:
     *      -getMajorScale("C") -> "C D E F G A B"
     * 
     * @param note - note to build musical scale
     * 
     * @return major scale base on a note
     */
    public String[] getMajorScale(String note) {
        // Load the environment
        this.loadEnv();

        // Load problem rule
        this.clips.load(Constants.RULE_MAJOR_SCALE);

        // Load in the environment
        this.clips.reset();

        // Evaluate the expression and get the result
        String expression = "(requested-note " + note + " " + ")";
        //String[] fields = { "i", "ii", "iii", "iv", "v", "vi", "vii", "viii" };
        String[] fields = { "i", "ii", "iii", "iv", "v", "vi", "vii" };

        String[] result = this.evalExpression(expression, "response-scale", fields);

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

    /**
     * Load CLIPS environment
     */
    private void loadEnv() {
        // Clear environment
        this.clips.clear();

        // Load facts, functions, rule, and templates
        this.clips.load(Constants.FACTS);
        this.clips.load(Constants.FUNCTIONS);
        this.clips.load(Constants.TEMPLATES);
    }
}

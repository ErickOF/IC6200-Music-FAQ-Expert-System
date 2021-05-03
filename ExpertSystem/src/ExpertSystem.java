import net.sf.clipsrules.jni.Environment;
import net.sf.clipsrules.jni.FactAddressValue;
import net.sf.clipsrules.jni.MultifieldValue;

public class ExpertSystem {
    private Environment clips;

    public ExpertSystem() {
        // Create CLIPS environment
        this.clips = new Environment();
    }

    public double getNoteFrequency(String Note, Integer k) {
        // Clear environment
        this.clips.clear();

        // Load facts, functions, rules, and templates
        this.clips.load(Constants.FACTS);
        this.clips.load(Constants.FUNCTIONS);
        this.clips.load(Constants.TEMPLATES);
        this.clips.load(Constants.RULES);

        // Load in the environment
        this.clips.reset();

        // Set the new fact
        this.clips.assertString("(requested-note " + Note + " " + k + ")");
        this.clips.run();;

        MultifieldValue mv = (MultifieldValue) clips.eval("(find-all-facts ((?f response-frequency)) TRUE)");
        FactAddressValue fact = (FactAddressValue) mv.multifieldValue().get(0);

        try {
            return Float.parseFloat(fact.getFactSlot("frequency").toString());
        } catch (Exception e) {
            System.out.println(e);
        }

        return 0.0;
    }
}

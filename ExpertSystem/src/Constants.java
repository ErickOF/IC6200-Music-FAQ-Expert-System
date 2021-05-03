import java.nio.file.Paths;

public class Constants {
    public static final String USER_DIR = System.getProperty("user.dir");
    public static final String CLIPS_FILE_DIR = Paths.get(USER_DIR, "ExpertSystem", "src", "clips").toString();
    public static final String FACTS = Paths.get(CLIPS_FILE_DIR, "facts.clp").toString();
    public static final String FUNCTIONS = Paths.get(CLIPS_FILE_DIR, "functions.clp").toString();
    public static final String RULE_NOTE_FREQUENCY = Paths.get(CLIPS_FILE_DIR, "rule_note_frequency.clp").toString();
    public static final String RULE_INTERVAL_DISTANCE = Paths.get(CLIPS_FILE_DIR, "rule_interval_distance.clp").toString();
    public static final String TEMPLATES = Paths.get(CLIPS_FILE_DIR, "templates.clp").toString();
}

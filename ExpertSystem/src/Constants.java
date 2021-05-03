import java.nio.file.Paths;

public class Constants {
    public static final String USER_DIR = System.getProperty("user.dir");
    public static final String CLIPS_FILE_DIR = Paths.get(USER_DIR, "ExpertSystem", "src", "clips").toString();
    public static final String FACTS = Paths.get(CLIPS_FILE_DIR, "facts.clp").toString();
    public static final String FUNCTIONS = Paths.get(CLIPS_FILE_DIR, "functions.clp").toString();
    public static final String RULES = Paths.get(CLIPS_FILE_DIR, "rules.clp").toString();
    public static final String TEMPLATES = Paths.get(CLIPS_FILE_DIR, "templates.clp").toString();
}

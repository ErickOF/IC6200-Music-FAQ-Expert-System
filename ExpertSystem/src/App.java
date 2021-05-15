public class App {
    public static void main(String[] args) throws Exception {
        ExpertSystem expertSystem = new ExpertSystem();
        System.out.println(expertSystem.getNoteFrequency("A", 0));
        System.out.println(expertSystem.getIntervalDistance("C", "G"));
    }
}

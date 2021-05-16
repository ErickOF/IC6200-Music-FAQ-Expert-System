import expert_system.ExpertSystem;

public class App {
    public static void main(String[] args) throws Exception {
        ExpertSystem expertSystem = new ExpertSystem();

        System.out.println("La frecuencia correspondiente para A0 es " + expertSystem.getNoteFrequency("A", 0) + "Hz\n");

        System.out.println("La distancia entre C y G es " + expertSystem.getIntervalDistance("C", "G") + "\n");

        String[] scale = expertSystem.getMajorScale("C");

        System.out.print("La escala de C mayor es ");

        for (int i = 0; i < scale.length; i++) {
            System.out.print(scale[i] + " ");
        }

        System.out.println();
    }
}

import expert_system.ExpertSystem;

public class App {
    public static void main(String[] args) throws Exception {
        ExpertSystem expertSystem = new ExpertSystem();

        System.out.println("La frecuencia correspondiente para A0 es " + expertSystem.getNoteFrequency("A", 0) + "Hz\n");

        System.out.println("La distancia entre B y C# es " + expertSystem.getIntervalDistance("B", "C#"));
        System.out.println("La distancia entre B y D# es " + expertSystem.getIntervalDistance("B", "D#"));
        System.out.println("La distancia entre B y E es " + expertSystem.getIntervalDistance("B", "E"));
        System.out.println("La distancia entre B y F# es " + expertSystem.getIntervalDistance("B", "F#"));
        System.out.println("La distancia entre B y G# es " + expertSystem.getIntervalDistance("B", "G#"));
        System.out.println("La distancia entre B y A# es " + expertSystem.getIntervalDistance("B", "A#") + "\n");

        String[] scale = expertSystem.getMajorScale("B");

        System.out.print("La escala de B mayor es ");

        for (int i = 0; i < scale.length; i++) {
            System.out.print(scale[i] + " ");
        }

        System.out.println();
    }
}

import expert_system.ExpertSystem;

public class App {
    public static void main(String[] args) throws Exception {
        ExpertSystem expertSystem = new ExpertSystem();

        // Note frequency
        System.out.println("La frecuencia correspondiente para A0 es " + expertSystem.getNoteFrequency("A", 0) + "Hz\n");

        // Interval distance
        System.out.println("La distancia entre B y C# es " + expertSystem.getIntervalDistance("B", "C#"));
        System.out.println("La distancia entre B y D# es " + expertSystem.getIntervalDistance("B", "D#"));
        System.out.println("La distancia entre B y E es " + expertSystem.getIntervalDistance("B", "E"));
        System.out.println("La distancia entre B y F# es " + expertSystem.getIntervalDistance("B", "F#"));
        System.out.println("La distancia entre B y G# es " + expertSystem.getIntervalDistance("B", "G#"));
        System.out.println("La distancia entre B y A# es " + expertSystem.getIntervalDistance("B", "A#") + "\n");

        // Major scale
        String[] scale = expertSystem.getMajorScale("B");

        System.out.print("La escala de B mayor es ");

        for (int i = 0; i < scale.length; i++) {
            System.out.print(scale[i] + " ");
        }

        System.out.println("\n");

        // Guitar circle
        String[] guitarCircle = expertSystem.getGuitarCircle("C");

        System.out.print("El circulo de acordes para C es ");

        for (int i = 0; i < guitarCircle.length; i++) {
            System.out.print(guitarCircle[i] + " ");
        }

        System.out.println();
    }
}

import java.util.Scanner;

import expert_system.ExpertSystem;

public class App {
    public static void main(String[] args) throws Exception {
        ExpertSystem expertSystem = new ExpertSystem();
        Scanner input = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out
                    .println("***Bienvenido al menu del Sistema Experto que responde tus preguntas sobre música***\n");

            System.out.println("1. Calcular la frecuencia de una nota.");
            System.out.println("2. Obtener la distance entre dos notas.");
            System.out.println("3. Obtener la escala mayor dada una nota.");
            System.out.println("4. Obtener el circulo de acordes dada una nota.");
            System.out.println("5. Salir.\n");

            System.out.print("Opción: ");
            String option = input.nextLine();

            if (option.equals("1")) {
                boolean asking = true;

                while (asking) {
                    System.out.println("Ingrese la nota para la cual desea calcular la frecuencia.");
                    System.out.print("Nota (S para salir)): ");
                    String note = input.nextLine();

                    if (note.equalsIgnoreCase("S")) {
                        asking = false;
                        System.out.println("\n");
                    } else if (note.matches("(C|D|E|F|G|A|B)(#|b)[0-8]") || note.matches("(C|D|E|F|G|A|B)[0-8]")) {
                        String singleNote = note.length() == 3 ? note.substring(0, 2) : note.substring(0, 1);
                        Integer k = Integer.parseInt(note.substring(note.length() - 1));

                        System.out.println("La frecuencia de " + note + " es "
                                + expertSystem.getNoteFrequency(singleNote, k) + " Hz\n");
                        asking = false;
                    } else {
                        System.out.println("Nota no válida, por favor ingrésela de nuevo.\n");
                    }
                }
            } else if (option.equals("2")) {
                boolean asking = true;
                String note1 = "";
                String note2 = "";

                while (asking) {
                    boolean askingNote1 = true;
                    boolean askingNote2 = true;

                    while (askingNote1) {
                        System.out.println("Ingrese la primera nota.");
                        System.out.print("Nota1 (S para salir)): ");
                        note1 = input.nextLine();

                        if (note1.equalsIgnoreCase("S")) {
                            askingNote1 = false;
                            askingNote2 = false;
                            asking = false;
                            System.out.println("\n");
                        } else if (note1.matches("(C|D|E|F|G|A|B)(#|b)") || note1.matches("(C|D|E|F|G|A|B)")) {
                            askingNote1 = false;
                        } else {
                            System.out.println("Nota no válida, por favor ingrésela de nuevo.\n");
                        }
                    }

                    while (askingNote2) {
                        System.out.println("Ingrese la segunda nota.");
                        System.out.print("Nota2 (S para salir)): ");
                        note2 = input.nextLine();

                        if (note2.equalsIgnoreCase("S")) {
                            askingNote2 = false;
                            asking = false;
                            System.out.println("\n");
                        } else if (note2.matches("(C|D|E|F|G|A|B)(#|b)") || note2.matches("(C|D|E|F|G|A|B)")) {
                            askingNote2 = false;
                            asking = false;

                            System.out.println("La distancia entre " + note1 + " y " + note2 + " es "
                                    + expertSystem.getIntervalDistance(note1, note2) + "\n");
                        } else {
                            System.out.println("Nota no válida, por favor ingrésela de nuevo.\n");
                        }
                    }
                }
            } else if (option.equals("3")) {
                boolean asking = true;

                while (asking) {
                    System.out.println("Ingrese la nota para la cual desea obtener la escala mayor.");
                    System.out.print("Nota (S para salir)): ");
                    String note = input.nextLine();

                    if (note.equalsIgnoreCase("S")) {
                        asking = false;
                        System.out.println("\n");
                    } else if (note.matches("(C|D|E|F|G|A|B)(#|b)") || note.matches("(C|D|E|F|G|A|B)")) {
                        System.out.println("\nInfiriendo escala, por favor espere...\n");

                        String[] scale = expertSystem.getMajorScale(note);

                        System.out.print("La escala de " + note + " mayor es ");

                        for (int i = 0; i < scale.length; i++) {
                            System.out.print(scale[i] + " ");
                        }

                        System.out.println("\n");
                        asking = false;
                    } else {
                        System.out.println("Nota no válida, por favor ingrésela de nuevo.\n");
                    }
                }
            } else if (option.equals("4")) {
                boolean asking = true;

                while (asking) {
                    System.out.println("Ingrese la nota para la cual desea obtener el círculo de acordes.");
                    System.out.print("Nota (S para salir)): ");
                    String note = input.nextLine();

                    if (note.equalsIgnoreCase("S")) {
                        asking = false;
                        System.out.println("\n");
                    } else if (note.matches("(C|D|E|F|G|A|B)(#|b)") || note.matches("(C|D|E|F|G|A|B)")) {
                        String[] guitarCircle = expertSystem.getGuitarCircle(note);

                        System.out.print("El círculo de acordes de " + note + " es ");

                        for (int i = 0; i < guitarCircle.length; i++) {
                            System.out.print(guitarCircle[i] + " ");
                        }

                        System.out.println("\n");
                        asking = false;
                    } else {
                        System.out.println("Nota no válida, por favor ingrésela de nuevo.\n");
                    }
                }
            } else if (option.equals("5")) {
                System.out.println("\n***Gracias por usar el sistema. Lo esperamos pronto.***");
                running = false;
            } else {
                System.out.println("Opción no válida, por favor intente otra\n");
            }

            System.out.print("<Enter> para continuar...");
            input.nextLine();
        }

        input.close();
    }
}

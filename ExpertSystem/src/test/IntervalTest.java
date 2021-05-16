package test;

import expert_system.ExpertSystem;

public class IntervalTest {
    public void testIntervalC() {
        ExpertSystem expertSystem = new ExpertSystem();

        if (!expertSystem.getIntervalDistance("C", "C").equals("unisono")) {
            throw new RuntimeException("Interval C-C");
        }

        if (!expertSystem.getIntervalDistance("C", "C#").equals("segunda-menor")) {
            throw new RuntimeException("Interval C-C#");
        }

        if (!expertSystem.getIntervalDistance("C", "D").equals("segunda-mayor")) {
            throw new RuntimeException("Interval C-D");
        }

        if (!expertSystem.getIntervalDistance("C", "D#").equals("tercera-menor")) {
            throw new RuntimeException("Interval C-D#");
        }

        if (!expertSystem.getIntervalDistance("C", "E").equals("tercera-mayor")) {
            throw new RuntimeException("Interval C-E");
        }

        if (!expertSystem.getIntervalDistance("C", "F").equals("cuarta")) {
            throw new RuntimeException("Interval C-F");
        }

        if (!expertSystem.getIntervalDistance("C", "G").equals("quinta")) {
            throw new RuntimeException("Interval C-G");
        }

        if (!expertSystem.getIntervalDistance("C", "G#").equals("sexta-menor")) {
            throw new RuntimeException("Interval C-G#");
        }

        if (!expertSystem.getIntervalDistance("C", "A").equals("sexta-mayor")) {
            throw new RuntimeException("Interval C-A");
        }

        if (!expertSystem.getIntervalDistance("C", "A#").equals("septima-menor")) {
            throw new RuntimeException("Interval C-A#");
        }

        if (!expertSystem.getIntervalDistance("C", "B").equals("septima-mayor")) {
            throw new RuntimeException("Interval C-B");
        }
    }

    public void testIntervalD() {
        ExpertSystem expertSystem = new ExpertSystem();

        if (!expertSystem.getIntervalDistance("D", "D").equals("unisono")) {
            throw new RuntimeException("Interval D-D");
        }

        if (!expertSystem.getIntervalDistance("D", "D#").equals("segunda-menor")) {
            throw new RuntimeException("Interval D-D#");
        }

        if (!expertSystem.getIntervalDistance("D", "E").equals("segunda-mayor")) {
            throw new RuntimeException("Interval D-E");
        }

        if (!expertSystem.getIntervalDistance("D", "F").equals("tercera-menor")) {
            throw new RuntimeException("Interval D-F");
        }

        if (!expertSystem.getIntervalDistance("D", "F#").equals("tercera-mayor")) {
            throw new RuntimeException("Interval D-F#");
        }

        if (!expertSystem.getIntervalDistance("D", "G").equals("cuarta")) {
            throw new RuntimeException("Interval D-G");
        }

        if (!expertSystem.getIntervalDistance("D", "A").equals("quinta")) {
            throw new RuntimeException("Interval D-A");
        }

        if (!expertSystem.getIntervalDistance("D", "A#").equals("sexta-menor")) {
            throw new RuntimeException("Interval D-A#");
        }

        if (!expertSystem.getIntervalDistance("D", "B").equals("sexta-mayor")) {
            throw new RuntimeException("Interval D-B");
        }

        if (!expertSystem.getIntervalDistance("D", "C").equals("septima-menor")) {
            throw new RuntimeException("Interval D-C");
        }

        if (!expertSystem.getIntervalDistance("D", "C#").equals("septima-mayor")) {
            throw new RuntimeException("Interval D-C#");
        }
    }

    public void testIntervalE() {
        ExpertSystem expertSystem = new ExpertSystem();

        if (!expertSystem.getIntervalDistance("E", "E").equals("unisono")) {
            throw new RuntimeException("Interval E-E");
        }

        if (!expertSystem.getIntervalDistance("E", "F").equals("segunda-menor")) {
            throw new RuntimeException("Interval E-F");
        }

        if (!expertSystem.getIntervalDistance("E", "F#").equals("segunda-mayor")) {
            throw new RuntimeException("Interval E-F#");
        }

        if (!expertSystem.getIntervalDistance("E", "G").equals("tercera-menor")) {
            throw new RuntimeException("Interval E-G");
        }

        if (!expertSystem.getIntervalDistance("E", "G#").equals("tercera-mayor")) {
            throw new RuntimeException("Interval E-G#");
        }

        if (!expertSystem.getIntervalDistance("E", "A").equals("cuarta")) {
            throw new RuntimeException("Interval E-A");
        }

        if (!expertSystem.getIntervalDistance("E", "B").equals("quinta")) {
            throw new RuntimeException("Interval E-B");
        }

        if (!expertSystem.getIntervalDistance("E", "C").equals("sexta-menor")) {
            throw new RuntimeException("Interval E-C");
        }

        if (!expertSystem.getIntervalDistance("E", "C#").equals("sexta-mayor")) {
            throw new RuntimeException("Interval E-C#");
        }

        if (!expertSystem.getIntervalDistance("E", "D").equals("septima-menor")) {
            throw new RuntimeException("Interval E-D");
        }

        if (!expertSystem.getIntervalDistance("E", "D#").equals("septima-mayor")) {
            throw new RuntimeException("Interval E-D#");
        }
    }
}

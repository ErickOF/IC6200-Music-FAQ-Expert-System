package test;

import expert_system.ExpertSystem;

public class FrequencyTest {
    private static final int DIV = 100;

    private double computeFrequency(int k, int i) {
        return Math.floor(55 * Math.pow(2, i - 1) * Math.pow(Math.pow(2, 1.0 / 12.0), k) * DIV) / DIV ;
    }

    public void testFrequency() {
        ExpertSystem expertSystem = new ExpertSystem();

        if (Math.floor(expertSystem.getNoteFrequency("A", 0) * DIV) / DIV != this.computeFrequency(0, 0)) {
            throw new RuntimeException("Frequency A0");
        }

        if (Math.floor(expertSystem.getNoteFrequency("A#", 0) * DIV) / DIV != this.computeFrequency(1, 0)) {
            throw new RuntimeException("Frequency A#0");
        }

        if (Math.floor(expertSystem.getNoteFrequency("B", 0) * DIV) / DIV != this.computeFrequency(2, 0)) {
            throw new RuntimeException("Frequency B0");
        }

        if (Math.floor(expertSystem.getNoteFrequency("C", 1) * DIV) / DIV != this.computeFrequency(-9, 1)) {
            throw new RuntimeException("Frequency C1");
        }

        if (Math.floor(expertSystem.getNoteFrequency("C#", 1) * DIV) / DIV != this.computeFrequency(-8, 1)) {
            throw new RuntimeException("Frequency C#1");
        }

        if (Math.floor(expertSystem.getNoteFrequency("D", 1) * DIV) / DIV != this.computeFrequency(-7, 1)) {
            throw new RuntimeException("Frequency D1");
        }

        if (Math.floor(expertSystem.getNoteFrequency("D#", 1) * DIV) / DIV != this.computeFrequency(-6, 1)) {
            throw new RuntimeException("Frequency D#1");
        }

        if (Math.floor(expertSystem.getNoteFrequency("E", 1) * DIV) / DIV != this.computeFrequency(-5, 1)) {
            throw new RuntimeException("Frequency E1");
        }

        if (Math.floor(expertSystem.getNoteFrequency("F", 1) * DIV) / DIV != this.computeFrequency(-4, 1)) {
            throw new RuntimeException("Frequency F1");
        }

        if (Math.floor(expertSystem.getNoteFrequency("F#", 1) * DIV) / DIV != this.computeFrequency(-3, 1)) {
            throw new RuntimeException("Frequency F#1");
        }

        if (Math.floor(expertSystem.getNoteFrequency("G", 1) * DIV) / DIV != this.computeFrequency(-2, 1)) {
            throw new RuntimeException("Frequency G1");
        }

        if (Math.floor(expertSystem.getNoteFrequency("G#", 1) * DIV) / DIV != this.computeFrequency(-1, 1)) {
            throw new RuntimeException("Frequency G#1");
        }

        if (Math.floor(expertSystem.getNoteFrequency("A", 1) * DIV) / DIV != this.computeFrequency(0, 1)) {
            throw new RuntimeException("Frequency A1");
        }

        if (Math.floor(expertSystem.getNoteFrequency("A#", 1) * DIV) / DIV != this.computeFrequency(1, 1)) {
            throw new RuntimeException("Frequency A#1");
        }

        if (Math.floor(expertSystem.getNoteFrequency("B", 1) * DIV) / DIV != this.computeFrequency(2, 1)) {
            throw new RuntimeException("Frequency B1");
        }

        if (Math.floor(expertSystem.getNoteFrequency("C", 2) * DIV) / DIV != this.computeFrequency(-9, 2)) {
            throw new RuntimeException("Frequency C2");
        }

        if (Math.floor(expertSystem.getNoteFrequency("C#", 2) * DIV) / DIV != this.computeFrequency(-8, 2)) {
            throw new RuntimeException("Frequency C#2");
        }

        if (Math.floor(expertSystem.getNoteFrequency("D", 2) * DIV) / DIV != this.computeFrequency(-7, 2)) {
            throw new RuntimeException("Frequency D2");
        }

        if (Math.floor(expertSystem.getNoteFrequency("D#", 2) * DIV) / DIV != this.computeFrequency(-6, 2)) {
            throw new RuntimeException("Frequency D#2");
        }

        if (Math.floor(expertSystem.getNoteFrequency("E", 2) * DIV) / DIV != this.computeFrequency(-5, 2)) {
            throw new RuntimeException("Frequency E2");
        }

        if (Math.floor(expertSystem.getNoteFrequency("F", 2) * DIV) / DIV != this.computeFrequency(-4, 2)) {
            throw new RuntimeException("Frequency F2");
        }

        if (Math.floor(expertSystem.getNoteFrequency("F#", 2) * DIV) / DIV != this.computeFrequency(-3, 2)) {
            throw new RuntimeException("Frequency F#2");
        }

        if (Math.floor(expertSystem.getNoteFrequency("G", 2) * DIV) / DIV != this.computeFrequency(-2, 2)) {
            throw new RuntimeException("Frequency G2");
        }

        if (Math.floor(expertSystem.getNoteFrequency("G#", 2) * DIV) / DIV != this.computeFrequency(-1, 2)) {
            throw new RuntimeException("Frequency G#2");
        }

        if (Math.floor(expertSystem.getNoteFrequency("A", 2) * DIV) / DIV != this.computeFrequency(0, 2)) {
            throw new RuntimeException("Frequency A2");
        }

        if (Math.floor(expertSystem.getNoteFrequency("A#", 2) * DIV) / DIV != this.computeFrequency(1, 2)) {
            throw new RuntimeException("Frequency A#2");
        }

        if (Math.floor(expertSystem.getNoteFrequency("B", 2) * DIV) / DIV != this.computeFrequency(2, 2)) {
            throw new RuntimeException("Frequency B2");
        }

        if (Math.floor(expertSystem.getNoteFrequency("C", 3) * DIV) / DIV != this.computeFrequency(-9, 3)) {
            throw new RuntimeException("Frequency C3");
        }

        if (Math.floor(expertSystem.getNoteFrequency("C#", 3) * DIV) / DIV != this.computeFrequency(-8, 3)) {
            throw new RuntimeException("Frequency C#3");
        }

        if (Math.floor(expertSystem.getNoteFrequency("D", 3) * DIV) / DIV != this.computeFrequency(-7, 3)) {
            throw new RuntimeException("Frequency D3");
        }

        if (Math.floor(expertSystem.getNoteFrequency("D#", 3) * DIV) / DIV != this.computeFrequency(-6, 3)) {
            throw new RuntimeException("Frequency D#3");
        }

        if (Math.floor(expertSystem.getNoteFrequency("E", 3) * DIV) / DIV != this.computeFrequency(-5, 3)) {
            throw new RuntimeException("Frequency E3");
        }

        if (Math.floor(expertSystem.getNoteFrequency("F", 3) * DIV) / DIV != this.computeFrequency(-4, 3)) {
            throw new RuntimeException("Frequency F3");
        }

        if (Math.floor(expertSystem.getNoteFrequency("F#", 3) * DIV) / DIV != this.computeFrequency(-3, 3)) {
            throw new RuntimeException("Frequency F#3");
        }

        if (Math.floor(expertSystem.getNoteFrequency("G", 3) * DIV) / DIV != this.computeFrequency(-2, 3)) {
            throw new RuntimeException("Frequency G3");
        }

        if (Math.floor(expertSystem.getNoteFrequency("G#", 3) * DIV) / DIV != this.computeFrequency(-1, 3)) {
            throw new RuntimeException("Frequency G#3");
        }

        if (Math.floor(expertSystem.getNoteFrequency("A", 3) * DIV) / DIV != this.computeFrequency(0, 3)) {
            throw new RuntimeException("Frequency A3");
        }

        if (Math.floor(expertSystem.getNoteFrequency("A#", 3) * DIV) / DIV != this.computeFrequency(1, 3)) {
            throw new RuntimeException("Frequency A#3");
        }

        if (Math.floor(expertSystem.getNoteFrequency("B", 3) * DIV) / DIV != this.computeFrequency(2, 3)) {
            throw new RuntimeException("Frequency B3");
        }

        if (Math.floor(expertSystem.getNoteFrequency("C", 4) * DIV) / DIV != this.computeFrequency(-9, 4)) {
            throw new RuntimeException("Frequency C4");
        }

        if (Math.floor(expertSystem.getNoteFrequency("C#", 4) * DIV) / DIV != this.computeFrequency(-8, 4)) {
            throw new RuntimeException("Frequency C#4");
        }

        if (Math.floor(expertSystem.getNoteFrequency("D", 4) * DIV) / DIV != this.computeFrequency(-7, 4)) {
            throw new RuntimeException("Frequency D4");
        }

        if (Math.floor(expertSystem.getNoteFrequency("D#", 4) * DIV) / DIV != this.computeFrequency(-6, 4)) {
            throw new RuntimeException("Frequency D#4");
        }

        if (Math.floor(expertSystem.getNoteFrequency("E", 4) * DIV) / DIV != this.computeFrequency(-5, 4)) {
            throw new RuntimeException("Frequency E4");
        }

        if (Math.floor(expertSystem.getNoteFrequency("F", 4) * DIV) / DIV != this.computeFrequency(-4, 4)) {
            throw new RuntimeException("Frequency F4");
        }

        if (Math.floor(expertSystem.getNoteFrequency("F#", 4) * DIV) / DIV != this.computeFrequency(-3, 4)) {
            throw new RuntimeException("Frequency F#4");
        }

        if (Math.floor(expertSystem.getNoteFrequency("G", 4) * DIV) / DIV != this.computeFrequency(-2, 4)) {
            throw new RuntimeException("Frequency G4");
        }

        if (Math.floor(expertSystem.getNoteFrequency("G#", 4) * DIV) / DIV != this.computeFrequency(-1, 4)) {
            throw new RuntimeException("Frequency G#4");
        }

        if (Math.floor(expertSystem.getNoteFrequency("A", 4) * DIV) / DIV != this.computeFrequency(0, 4)) {
            throw new RuntimeException("Frequency A4");
        }

        if (Math.floor(expertSystem.getNoteFrequency("A#", 4) * DIV) / DIV != this.computeFrequency(1, 4)) {
            throw new RuntimeException("Frequency A#4");
        }

        if (Math.floor(expertSystem.getNoteFrequency("B", 4) * DIV) / DIV != this.computeFrequency(2, 4)) {
            throw new RuntimeException("Frequency B4");
        }
    }
}

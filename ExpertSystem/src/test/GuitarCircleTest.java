package test;

import java.util.StringJoiner;

import expert_system.ExpertSystem;

public class GuitarCircleTest {
    private String guitarCircleToString(String guitarCircle[]) {
        StringJoiner stringJoiner = new StringJoiner(" ");

        for (int i = 0; i < guitarCircle.length; i++) {
            stringJoiner.add(guitarCircle[i]);
        }

        return stringJoiner.toString();
    }

    public void testGuitarCircle() {
        ExpertSystem expertSystem = new ExpertSystem();

        if (!this.guitarCircleToString(expertSystem.getGuitarCircle("C")).equals("A D G C")) {
            throw new RuntimeException("Guitar Circle C");
        }

        if (!this.guitarCircleToString(expertSystem.getGuitarCircle("D")).equals("B E A D")) {
            throw new RuntimeException("Guitar Circle D");
        }

        if (!this.guitarCircleToString(expertSystem.getGuitarCircle("E")).equals("Db Gb B E")) {
            throw new RuntimeException("Guitar Circle E");
        }

        if (!this.guitarCircleToString(expertSystem.getGuitarCircle("F")).equals("D G C F")) {
            throw new RuntimeException("Guitar Circle F");
        }

        if (!this.guitarCircleToString(expertSystem.getGuitarCircle("G")).equals("E A D G")) {
            throw new RuntimeException("Guitar Circle G");
        }

        if (!this.guitarCircleToString(expertSystem.getGuitarCircle("A")).equals("Gb B E A")) {
            throw new RuntimeException("Guitar Circle A");
        }

        if (!this.guitarCircleToString(expertSystem.getGuitarCircle("B")).equals("Ab Db Gb B")) {
            throw new RuntimeException("Guitar Circle B");
        }
    }
}

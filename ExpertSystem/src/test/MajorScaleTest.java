package test;

import java.util.StringJoiner;

import expert_system.ExpertSystem;

public class MajorScaleTest {
    private String scaleToString(String[] scale) {
        StringJoiner strScale = new StringJoiner(" ");

        for (int i = 0; i < scale.length; i++) {
            strScale.add(scale[i]);
        }

        return strScale.toString();
    }

    public void testMajorScale() {
        ExpertSystem expertSystem = new ExpertSystem();

        if (this.scaleToString(expertSystem.getMajorScale("C")) == "C D E F G A B") {
            throw new RuntimeException("Major Scale C");
        }

        if (this.scaleToString(expertSystem.getMajorScale("D")) == "D E F# G A B C#") {
            throw new RuntimeException("Major Scale D");
        }
    }
}

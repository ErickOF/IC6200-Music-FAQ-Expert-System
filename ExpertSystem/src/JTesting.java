import test.FrequencyTest;
import test.IntervalTest;
import test.MajorScaleTest;

public class JTesting {
    public static void main(String[] args) {
        FrequencyTest frequencyTest = new FrequencyTest();
        frequencyTest.testFrequency();

        IntervalTest intervalTest = new IntervalTest();
        intervalTest.testIntervalC();
        intervalTest.testIntervalD();
        intervalTest.testIntervalE();

        MajorScaleTest majorScaleTest = new MajorScaleTest();
        majorScaleTest.testMajorScale();
    }
}

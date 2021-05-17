import test.FrequencyTest;
import test.GuitarCircleTest;
import test.IntervalTest;
import test.MajorScaleTest;

public class JTesting {
    public static void main(String[] args) {
        System.out.println("Testing frequencies...");
        FrequencyTest frequencyTest = new FrequencyTest();
        frequencyTest.testFrequency();
        System.out.println("Frequency test was finished\n");

        System.out.println("Testing intervals...");
        IntervalTest intervalTest = new IntervalTest();
        intervalTest.testIntervalC();
        intervalTest.testIntervalD();
        intervalTest.testIntervalE();
        System.out.println("Interval test was finished\n");

        System.out.println("Testing major scales...");
        MajorScaleTest majorScaleTest = new MajorScaleTest();
        majorScaleTest.testMajorScale();
        System.out.println("Major scale test was finished\n");

        System.out.println("Testing guitar circles...");
        GuitarCircleTest guitarCircleTest = new GuitarCircleTest();
        guitarCircleTest.testGuitarCircle();
        System.out.println("Guitar circle test was finished");
    }
}

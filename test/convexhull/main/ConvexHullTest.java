package convexhull.main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Heikki Haapala
 */
public class ConvexHullTest {

    /**
     *
     */
    public ConvexHullTest() {
    }

    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }

    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     *
     */
    @Before
    public void setUp() {
    }

    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class ConvexHull.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = {"test100", "at", "gift", "OUT"};
        ConvexHull.main(args);
        // just should not crash :P
    }

    /**
     * Test of startTimer and stopTimer methods, of class ConvexHull.
     */
    @Test
    public void testStartTimer() {
        System.out.println("startTimer");
        long startTime = System.currentTimeMillis();
        ConvexHull.startTimer();
        
        long endTime = System.currentTimeMillis();
        long time = ConvexHull.stopTimer();
        long time2 = endTime - startTime;
        long difference = Math.abs(time-time2);
        // difference of the timers should be max one ms
        if (difference > 1) {
            fail("Timer difference too great.");
        }
    }

    /**
     * Test of stopTimer method, of class ConvexHull.
     */
    @Test
    public void testStopTimer() {
        // tested with startTimer
    }
}

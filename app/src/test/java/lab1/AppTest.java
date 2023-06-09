/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test public void testSection1() {
        String expected = "num: 42\naverage: 95.5\nletter: A\nisTrue: true\n";
        assertEquals(expected, App.section1());
    }

    @Test
    public void testSection2() {
        String expected = "sum: 67\nproduct: 191.0\nmodulus: 2\nlogicalAnd: false\n";
        assertEquals(expected, App.section2());
    }

    @Test
    public void testSection3() {
        String expected = "Square of 1: 1\nSquare of 2: 4\nSquare of 3: 9\nSquare of 4: 16\nSquare of 5: 25\nSquare of 6: 36\nSquare of 7: 49\nSquare of 8: 64\nSquare of 9: 81\nSquare of 10: 100\nnum: 84\nnum: 168\n";
        assertEquals(expected, App.section3());
    }

    @Test
    public void testSection4() {
        String expected = "Even\nExcellent\n";
        assertEquals(expected, App.section4());
    }
}

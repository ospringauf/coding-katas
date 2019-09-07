package b2c.dojo.codewars.rectangle;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;


public class RectangleKataTest {
    @Test
    public void test13x5() {
        List<String> sol = Arrays.asList("(10*5)", "(13*5)", "(8*5)", "(5*3)", "(3*2)", "(2*1)");
        List<String> ans = Rectangle.rectIntoRects(13, 5);
        Collections.sort(sol);
        Collections.sort(ans);
        assertEquals(sol, ans);
    }

    @Test
    public void test22x6() {
        List<String> sol = Arrays.asList("(12*6)", "(18*6)", "(22*6)", "(12*6)", "(16*6)", "(10*6)", "(6*4)", "(4*2)");
        List<String> ans = Rectangle.rectIntoRects(22, 6);
        Collections.sort(sol);
        Collections.sort(ans);
        assertEquals(sol, ans);
    }

    @Test
    public void test8x5() {
        List<String> sol = Arrays.asList("(8*5)", "(5*3)", "(3*2)", "(2*1)");
        List<String> ans = Rectangle.rectIntoRects(8, 5);
        Collections.sort(sol);
        Collections.sort(ans);
        assertEquals(sol, ans);
    }

    @Test
    public void test20x8() {
        List<String> sol = Arrays.asList("(16*8)", "(20*8)", "(12*8)", "(8*4)");
        List<String> ans = Rectangle.rectIntoRects(20, 8);
        Collections.sort(sol);
        Collections.sort(ans);
        assertEquals(sol, ans);
    }

    @Test
    public void test4x3() {
        List<String> sol = Arrays.asList("(4*3)", "(2*1)", "(3*1)", "(2*1)");
        List<String> ans = Rectangle.rectIntoRects(4, 3);
        Collections.sort(sol);
        Collections.sort(ans);
        assertEquals(sol, ans);
    }

    @Test
    public void test7x5() {
        List<String> sol = Arrays.asList("(7*5)", "(4*2)", "(5*2)", "(3*2)", "(2*1)");
        List<String> ans = Rectangle.rectIntoRects(7, 5);
        Collections.sort(sol);
        Collections.sort(ans);
        assertEquals(sol, ans);
    }

    @Test
    public void test6x4() {
        List<String> sol = Arrays.asList("(6*4)", "(4*2)");
        List<String> ans = Rectangle.rectIntoRects(6, 4);
        Collections.sort(sol);
        Collections.sort(ans);
        assertEquals(sol, ans);
    }

    @Test
    public void test15x4() {
        List<String> sol = Arrays.asList("(8*4)", "(12*4)", "(15*4)", "(8*4)", "(11*4)", "(7*4)", "(4*3)", "(2*1)", "(3*1)", "(2*1)");
        List<String> ans = Rectangle.rectIntoRects(15, 4);
        Collections.sort(sol);
        Collections.sort(ans);
        assertEquals(sol, ans);
    }
}
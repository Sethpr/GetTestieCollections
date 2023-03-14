package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    @Test
    public void testPeek() {
        Queue<String> line = new LinkedList<>();
        String[] words = {"taco", "hot dog", "burger", "cake", "salad"}; //I sure am getting a lot out of this array
        line.addAll(Arrays.asList(words));
        String expected = "taco";

        String actual = line.peek();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        Queue<String> line = new LinkedList<>();
        String[] words = {"taco", "hot dog", "burger", "cake", "salad"}; //I sure am getting a lot out of this array
        line.addAll(Arrays.asList(words));
        String expected = "burger";

        line.remove();
        line.remove();
        String actual = line.peek();

        Assert.assertEquals(expected, actual);
    }
}

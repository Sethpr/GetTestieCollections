package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class TestDeque {
    @Test
    public void testGetLast() {
        Deque<String> line = new ArrayDeque<>();
        String[] words = {"taco", "hot dog", "burger", "cake", "salad"}; //I sure am getting a lot out of this array
        line.addAll(Arrays.asList(words));
        String expected = "salad";

        String actual = line.getLast();

        Assert.assertEquals(expected, actual);
    }
}

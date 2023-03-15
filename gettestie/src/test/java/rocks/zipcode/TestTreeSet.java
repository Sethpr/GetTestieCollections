package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.TreeSet;

public class TestTreeSet
{
    @Test
    public void testFirst() {
        String[] words = {"taco", "hot dog", "burger", "cake", "salad"};
        TreeSet<String> tree = new TreeSet<>();
        tree.addAll(Arrays.asList(words));
        String expected = words[2];

        String actual = tree.first();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPollLast() {
        String[] words = {"taco", "hot dog", "burger", "cake", "salad"};
        TreeSet<String> tree = new TreeSet<>();
        tree.addAll(Arrays.asList(words));
        String expected = words[0];
        int expectedLength = 4;

        String actual = tree.pollLast();
        int actualLength = tree.size();

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedLength, actualLength);
    }


}

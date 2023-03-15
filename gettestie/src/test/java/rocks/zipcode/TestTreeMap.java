package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TestTreeMap {
    @Test
    public void testLowerEntry() {
        String[] words = {"taco", "hot dog", "burger", "cake", "salad"};
        TreeMap<Integer, String> tree = new TreeMap<>();
        for (int i = 0; i < words.length; i++) {
            tree.put(i, words[i]);
        }

        String actual = tree.lowerEntry(3).getValue();

        Assert.assertEquals(actual, words[2]);
    }

    @Test
    public void testReplace() {
        String[] words = {"taco", "hot dog", "burger", "cake", "salad"};
        TreeMap<Integer, String> tree = new TreeMap<>();
        for (int i = 0; i < words.length; i++) {
            tree.put(i, words[i]);
        }
        String expected = "parmesan";

        tree.replace(3, expected);
        String actual = tree.get(3);

        Assert.assertEquals(expected, actual);
    }
}

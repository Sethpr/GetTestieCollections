package rocks.zipcode;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

public class TestSet {

    @Test
    void testAdd() {
        HashSet<String> set = new HashSet<>();
        String expected = "taco";

        set.add(expected);

        Assert.assertTrue(set.contains(expected));
    }


    @Test
    void testAddAll() {
        HashSet<String> set = new HashSet<>();
        String[] words = {"taco", "hot dog", "burger", "cake", "taco"};
        int expected = 4; //taco should only be put in once

        set.addAll(Arrays.asList(words));

        Assert.assertEquals(set.size(), expected);
    }
}

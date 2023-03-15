package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class TestVector {

    @Test
    public void testContainsAll() {
        String[] words = {"taco", "hot dog", "burger", "cake", "salad"};
        Vector<String> vec = new Vector<>(Arrays.asList(words));

        List<String> list = new ArrayList<>(Arrays.asList("taco", "burger", "salad"));

        Assert.assertTrue(vec.containsAll(list));
    }
}

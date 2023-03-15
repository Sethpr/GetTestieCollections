package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Array;
import java.util.*;

public class TestComparable {
    @Test
    public void testComparable() {
        String[] words = {"taco", "hot dog", "burger", "cake", "salad"};

        Assert.assertTrue(words[0].compareTo(words[1]) > 0);
        Assert.assertTrue(words[2].compareTo(words[2]) == 0);
        Assert.assertTrue(words[2].compareTo(words[0])<0);

    }
}

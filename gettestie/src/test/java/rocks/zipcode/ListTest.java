package rocks.zipcode;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {

    @Test
    void testClear() {
        List<String> list = new ArrayList<>();
        String[] words = {"taco", "hot dog", "burger", "cake", "taco"};
        list.addAll(Arrays.asList(words));

        list.clear();

        Assert.assertTrue(list.size()==0);
    }

    @Test
    void testIndexOf() {
        List<String> list = new ArrayList<>();
        String[] words = {"taco", "hot dog", "burger", "cake", "taco"};
        list.addAll(Arrays.asList(words));
        int expected = 2;

        int actual = list.indexOf("burger");

        Assert.assertEquals(expected,actual);
    }


}

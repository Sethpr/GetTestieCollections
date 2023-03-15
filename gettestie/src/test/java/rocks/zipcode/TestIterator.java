package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class TestIterator {
    @Test
    public void testIteratorTreeSet() {
        String[] words = {"taco", "hot dog", "burger", "cake", "salad"};
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(words));
        ListIterator<String> iter = list.listIterator();

        iter.next();
        Assert.assertTrue(iter.hasNext());
        Assert.assertEquals(iter.next(), words[1]);
        Assert.assertEquals(iter.previousIndex(), 1);
    }
}

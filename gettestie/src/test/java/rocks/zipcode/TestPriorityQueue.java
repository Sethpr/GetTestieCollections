package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.PriorityQueue;

public class TestPriorityQueue
{
    @Test
    public void testAdd() {
        String[] words = {"taco", "hot dog", "burger", "cake", "salad"};
        PriorityQueue<String> q = new PriorityQueue<>();
        q.addAll(Arrays.asList(words));
        String expected = "apple";
        String expected2 = words[2];

        q.add(expected);
        String actual = q.poll();
        String actual2 = q.peek();

        Assert.assertEquals(expected,actual);
        Assert.assertEquals(expected2, actual2);



    }

}

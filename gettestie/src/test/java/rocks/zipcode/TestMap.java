package rocks.zipcode;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestMap

{
    @Test
    void testGetKeys() {
        Map<String, Integer> map = new LinkedHashMap<>();
        String[] expected = {"taco", "hot dog", "burger", "cake", "salad"};
        for(String s: expected){
            map.put(s, 1);
        }

        String[] actual = map.keySet().toArray(new String[0]);

        Assert.assertEquals(expected, actual);
    }

    @Test
    void testContainKey() {
        Map<String, Integer> map = new LinkedHashMap<>();
        String[] expected = {"taco", "hot dog", "burger", "cake", "salad"};
        for(String s: expected){
            map.put(s, 1);
        }

        Assert.assertTrue(map.containsKey("burger"));
    }
}

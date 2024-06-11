package array;

import java.util.HashMap;
import java.util.Map;

public class duplicateSum {
    public static void main(String[] arg)
    {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        int[] input = {1,2,3,2,2,1,1,3,2,2};
        for (int i = 0; i < input .length; i++) {
            Integer value = map.get(input[i]);
            if(value == null) {
                map.put(input[i], input[i]);
            } else {
                map.put(input[i], value + input[i]);
            }
        }
        System.out.println(map.values());
    }
}

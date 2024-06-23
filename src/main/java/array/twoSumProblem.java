package array;

import java.util.HashMap;
import java.util.Map;

public class twoSumProblem {
    public static void main(String[] arg){
        int[] arr = {1,1,1,1,1,-1};
        int sum = 2;
        //twoSumMethod(arr,sum);
        twoSumMethod(arr, sum);
    }

    public static void twoSumMethod(int[] arr, int sum){
        Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();

        // Build frequency map
        for(int i =0; i < arr.length ;i++){
            if(freqMap.containsKey(arr[i])) {
                freqMap.put(arr[i], freqMap.get(arr[i])+1);
            } else {
                freqMap.put(arr[i],1);
            }
        }
        System.out.println("Entry Map : " + freqMap.entrySet());

        int pairs = 0;
        for(int num : arr){
            int diff = sum - num;

            if(freqMap.containsKey(num) && freqMap.containsKey(diff) && freqMap.get(num) != null && freqMap.get(diff) != null && freqMap.get(num) > 0 && freqMap.get(diff) > 0) {
                // Ensure the values are not null
                Integer numCount = freqMap.get(num);
                Integer diffCount = freqMap.get(diff);
                if(num == diff) {
                        // For pairs where num == diff, ensure there are at least 2 occurrences
                        if(numCount >= 2) {
                            freqMap.put(num, numCount - 2);
                            System.out.println("Pair Is : (" + num + ", " + diff + ")");
                            pairs++;
                        }
                    } else {
                        freqMap.put(num, numCount - 1);
                        freqMap.put(diff, diffCount - 1);
                        System.out.println("Pair Is : (" + num + ", " + diff + ")");
                        pairs++;
                    }
            }
        }

        System.out.println("Total pairs: " + pairs);
    }
}

package array;

import java.util.HashMap;
import java.util.Map;

public class twoSumProblem {
    public static void main(String[] arg){
        //Input -1
        int[] arr = {1,1,1,1,1};
        int sum = 2;
        //Input -2
        int[] arrOne = {1,1,1,1};
        int sumOne = 2;
        //Input 3
        int[] arrTwo = {1,1,1,1,-1};
        int sumTwo = 2;
        //Input -4
        int[] arrThree = {2,7,6,5,5,3,4,4,4,1};
        int sumThree = 8;
        //Input -5
        int[] arrFour = {2};
        int sumFour = 2;
        System.out.println("Input - 1");
        twoSumMethod(arr, sum);
        System.out.println("Input - 2");
        twoSumMethod(arrOne, sumOne);
        System.out.println("Input - 3");
        twoSumMethod(arrTwo, sumTwo);
        System.out.println("Input - 4");
        twoSumMethod(arrThree, sumThree);
        System.out.println("Input - 5");
        twoSumMethod(arrFour, sumFour);
    }
    public static void twoSumMethod(int[] arr, int sum){
        if(arr.length < 2){
            System.out.println("Invalid Array");
            return;
        }
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

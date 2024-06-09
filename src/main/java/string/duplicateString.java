package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class duplicateString {
    public static void main(String[] arg){
        String str = "My name is Peter, Everyone thinks Peter is not a good boy but peter is a good boy";
        //split a string based on multiple filters using regular expressions use "[regex]"
        String[] words = str.split("[,\\s]");
        System.out.println(Arrays.toString(words));
        Map<String, Integer> occuranceMap = new HashMap<String, Integer>();
        for(String word:words){
            if(occuranceMap.containsKey(word)){
                occuranceMap.put(word,occuranceMap.get(word)+1);
            } else {
                occuranceMap.put(word,1);
            }
        }
        System.out.println(occuranceMap.entrySet());
        findOccurane(occuranceMap);
    }

    public static Set<String> findOccurane(Map<String, Integer> map){
        Set<String> keys = new HashSet<String>();
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                keys.add(entry.getKey());
                System.out.println("Duplicate word is : "+entry.getKey()+", Occurance : "+entry.getValue());
            }
        }
        return keys;
    }
}

package string;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateString {
    public static void main(String[] arg)
    {
        String st="aabbcdegg";
        Set<Character> removeduplicates = new LinkedHashSet<Character>();
        char str[]=st.toCharArray();
        for(char c:str)
        {
            removeduplicates.add(c);
        }
        System.out.println("Set : "+removeduplicates);
        Iterator<Character> itr = removeduplicates.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }
    }
}
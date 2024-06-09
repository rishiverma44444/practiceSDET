package string;

import java.util.HashSet;
import java.util.Set;

public class reverseString {
    public static void main(String[] arg){
        String str = "Hello, World!";
        // System.out.println("Reverse string inbuilt method : "+strRevInBuilt(str));
        // System.out.println("Reverse string custom method  : "+strRevCustom(str));
        // System.out.println("Reverse inplace character method  : "+strRevSpecialOne("My name is khan!"));
        strRevSpecialOne("My name is khan!");
    }

    //Using String builder reverse inbuilt method
    public static String strRevInBuilt(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    //Implementing custom method for string reverse
    public static String strRevCustom(String str){
        char[] charArray = str.toCharArray();
        // Swap characters from beginning and end of the array
        for(int i=0; i < charArray.length/2; i++){
           char temp = charArray[i];
           charArray[i] = charArray[charArray.length-i-1];
           charArray[charArray.length-i-1] = temp;
        }
        return new String(charArray);
    }

    //Implement String reversal , keep special character at same place


    //Inplace reversal
   public static void strRevSpecialOne(String str) {
       String[] splt=str.split(" ");
       for(int i=0;i<splt.length;i++)
       {
           for(int j=(splt[i].length()-1);j>=0;j--)
           {
               if(splt[i].charAt(j)=='!'){
                   continue;
               }
               else{
                   System.out.print(splt[i].charAt(j));
               }
           }
           System.out.print(" ");
       }
    }
}

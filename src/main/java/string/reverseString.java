package string;

public class reverseString {
    public static void main(String[] arg) {
        String str = "Hello, World!";
        System.out.println("Reverse string inbuilt method : " + strRevInBuilt(str));
        System.out.println("Reverse string custom method  : " + strRevCustom(str));
    }
    //Using String builder reverse inbuilt method
    public static String strRevInBuilt(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
    //Implementing custom method for string reverse
    public static String strRevCustom(String str) {
        char[] charArray = str.toCharArray();
        // Swap characters from beginning and end of the array
        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = temp;
        }
        return new String(charArray);
    }
}
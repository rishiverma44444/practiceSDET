package string;

public class reversalWithIntactSpecialCharacter {
        public static void main(String[] args) {
            String originalString = "My name is, khan!";
            String reversedString = reverseString(originalString);
            System.out.println("Reversed string: " + reversedString);
        }
        public static String reverseString(String str) {
            char[] charArray = str.toCharArray();
            int left = 0;
            int right = charArray.length - 1;
            // Continue swapping characters from the beginning and end,
            // but ignore special characters and do not reverse their positions
            while (left < right) {
                if (!Character.isLetterOrDigit(charArray[left])) {
                    left++;
                } else if (!Character.isLetterOrDigit(charArray[right])) {
                    right--;
                } else {
                    // Swap only if both characters are letters or digits
                    char temp = charArray[left];
                    charArray[left] = charArray[right];
                    charArray[right] = temp;
                    left++;
                    right--;
                }
            }
            return new String(charArray);
        }
    }



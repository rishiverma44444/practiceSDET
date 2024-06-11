package string;

public class inplaceReversalWithSpecialCharacter {
    public static void main(String[] arg){
        String str = "My name is, khan!";
        System.out.println("inPlaceReversalSimple : "+inPlaceReversalSimple(str));
        System.out.println("inPlaceReversalInBuild : "+inPlaceReversalInBuild(str));
    }
    public static String inPlaceReversalSimple(String str){
        String[] splt = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : splt) {
            char[] reversedWord = new char[word.length()];
            int index = 0;
            // Fill reversedWord array with letters and digits in reverse order
            for (int j = word.length() - 1; j >= 0; j--) {
                char ch = word.charAt(j);
                if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                    reversedWord[index++] = ch;
                }
            }
            // Reinsert special characters in their original positions
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9'))) {
                    reversedWord[j] = ch;
                }
            }
            result.append(reversedWord).append(" ");
        }
        return result.toString().trim(); // Trim to remove the trailing space
    }

    //Here isLetterOrDigit is used to check special character or digits
    public static String inPlaceReversalInBuild(String str){
        String[] splt = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : splt) {
            char[] reversedWord = new char[word.length()];
            int index = 0;
            //Fill reversedWord array with letters and digits in reverse order
            for (int j = word.length() - 1; j >= 0; j--) {
                if (Character.isLetterOrDigit(word.charAt(j))) {
                    reversedWord[index++] = word.charAt(j);
                }
            }
            // Reinsert special characters in their original positions
            for (int j = 0; j < word.length(); j++) {
                if (!Character.isLetterOrDigit(word.charAt(j))) {
                    reversedWord[j] = word.charAt(j);
                }
            }
            result.append(reversedWord).append(" ");
        }
        return result.toString().trim(); // Trim to remove the trailing space
    }
}

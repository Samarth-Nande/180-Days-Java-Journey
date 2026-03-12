public class CountVowelsMethod {
    public static int CountVowelsMethod(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String word = "education";
        System.out.println("Vowel count: " + CountVowelsMethod(word));
    }
}
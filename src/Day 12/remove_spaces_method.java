public class remove_spaces_method {
    public static String removeSpaces(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result += str.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String text = "java is fun";
        System.out.println(removeSpaces(text));
    }
}
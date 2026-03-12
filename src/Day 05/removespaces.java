public class removespaces {
    public static void main(String[] args) {
        String str = "Java is powerful";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result = result + str.charAt(i);
            }
        }
        System.out.println("After removing spaces: " + result);
    }
}


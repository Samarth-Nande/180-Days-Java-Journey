public class countwords {
    public static void main(String[] args) {
        String str = "Java is very powerful language";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Number of words: " + count);
    }
}


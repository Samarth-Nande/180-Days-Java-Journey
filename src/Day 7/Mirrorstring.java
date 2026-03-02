public class Mirrorstring {
    public static void main(String[] args) {
        String str = "JAVA";
        StringBuilder reverse = new StringBuilder(str).reverse();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str + reverse);
        }
    }
}

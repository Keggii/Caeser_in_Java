public class Main {
    public static void main(String[] args) {
        String text = "kdoor zhowb";
        int shift = -3;
        String encrypted = encrypt(text.toLowerCase(), shift);
        System.out.println(encrypted);
    }

    public static String encrypt(String text, int shift) {
        String encrypted = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                encrypted += ' ';
                continue;
            }
            if ((char) (text.charAt(i) + shift) > 'z') {
                encrypted += (char) (text.charAt(i) - (26 - shift));
                continue;
            }
            if ((char) (text.charAt(i) + shift) < 'a') {
                encrypted += (char) (text.charAt(i) + (26 - shift));
                continue;
            }
            encrypted += (char) (text.charAt(i) + shift);
        }
        return encrypted;
    }

}
package ReverseTheNumber;

public class Main {
    public static void main(String[] args) {
        System.out.println(rev(5121));
        System.out.println(rev(69));
        System.out.println(rev(-122157));
    }

    public static String rev(int n) {
        String nRev = "";
        n = Math.abs(n);
        while (n > 0) {
            nRev += n % 10;
            n /= 10;
        }
        return nRev;
    }
}

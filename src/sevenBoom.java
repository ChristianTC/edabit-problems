public class sevenBoom {
    public static void main(String[] args) {
        int [] arr = {2, 55, 60, 97, 86};
        System.out.println(sevenBoom(arr));
    }

    public static String sevenBoom(int[] arr) {
        String str = "";
        for (int i : arr) {
            str += i;
        }
        if (str.indexOf("7")!=-1) {
            return "Boom!";
        }
        else
            return "there is no 7 in the array";
    }
}

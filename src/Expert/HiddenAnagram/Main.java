package Expert.HiddenAnagram;

public class Main {
    public static void main(String[] args) {
        System.out.println(hiddenAnagram("My world evolves in a beautiful space called Tesh.", "sworn love lived"));
        System.out.println(hiddenAnagram("An old west action hero actor.", "Clint Eastwood"));
        System.out.println(hiddenAnagram("Mr. Mojo Rising could be a song title", "Jim Morrison"));
        System.out.println(hiddenAnagram("Banana? margaritas.", "ANAGRAM"));
        System.out.println(hiddenAnagram("D  e b90it->?$ (c)a r...d,,#~", "bad credit"));
        System.out.println(hiddenAnagram("Bright is the moon", "Bongo mirth"));
    }

    public static String hiddenAnagram(String t, String p) {
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) >= 65 && t.charAt(i) <= 90 || t.charAt(i) >= 97 && t.charAt(i) <= 122) {
                str1 += t.charAt(i);
            }
        }
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) >= 65 && p.charAt(i) <= 90 || p.charAt(i) >= 97 && p.charAt(i) <= 122) {
                str2 += p.charAt(i);
            }
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        String[] v1 = str1.split("");
        String[] v2 = str2.split("");
        //v1[0] = String.valueOf('2');

        String opc[] = new String[v1.length - v2.length+1];


        for (int i = 0; i < v1.length - v2.length; i++) {
            String s2 = "";
            for (int j = i; j < i + v2.length; j++) {
                s2 += v1[j];
            }
            opc[i] = String.valueOf(s2);
        }
        opc[v1.length - v2.length] = String.valueOf(str1.substring(v1.length - v2.length));

//        System.out.println("\n" + str1 + "\n");
//        System.out.println("\n" + str2 + "\n");

        String response = "";

        for (String i : opc) {
            String auxI = i;
//            System.out.println(i);
            int cont = 0;
            for (int j = 0; j < v2.length; j++) {
                if (i.indexOf(v2[j]) != -1) {
//                    System.out.print(i.indexOf(v2[j])+" ");
                    i = i.substring(0, i.indexOf(v2[j]))+i.substring(i.indexOf(v2[j])+1);
                    cont++;
                } else {
//                    System.out.print(" - ");
                }

                //System.out.print(v2[j]);
            }
//            System.out.println();
            if (cont == str2.length()){
                response = auxI;
                break;
            }
            else {
                response = "noutfond";
            }
//            System.out.println(cont);
        }


        return "R =>>" + response;
    }

}

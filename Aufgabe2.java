/*
    Aufgabe 2) while-Schleifen
*/
public class Aufgabe2 {

    public static void main(String[] args) {
        String text;
        text = "Eine nennenswerte und geeignete Sprache.";
        String text1;
        text1 = "Anzahl der Zeichen ist nicht genug!";
        int i = 2;
        while (i < text.length()) {
            if (text.charAt(i) != 'e') System.out.print(text.charAt(i));
            i += 3;
        }
        System.out.println();
        i = 2;
        while (i < text1.length()) {
            if (text1.charAt(i) != 'e') System.out.print(text1.charAt(i));
            i += 3;
        }
        System.out.println();
        i = 0;
        while (i < text.length()) {
            System.out.print(text.charAt(i));
            if ((text.charAt(i) >= 'n' && text.charAt(i) <= 'z') || (text.charAt(i) >= 'N' && text.charAt(i) <= 'Z'))
                System.out.print(text.charAt(i));
            i++;
        }
        System.out.println();
        i = 0;
        while (i < text1.length()) {
            System.out.print(text1.charAt(i));
            if ((text1.charAt(i) >= 'n' && text1.charAt(i) <= 'z') || (text1.charAt(i) >= 'N' && text1.charAt(i) <= 'Z'))
                System.out.print(text1.charAt(i));
            i++;
        }
        System.out.println();
        i = 13;
        while (i < 130) {
            System.out.print(i + " ");
            i += 26;
        }
    }

}







/*
    Aufgabe 1) for-Schleifen
*/
public class Aufgabe1 {

    public static void main(String[] args) {

        int sum_teilbar_17 = 0;
        for (int i = 17; i < 340; i++) {
            if (i % 17 == 0) sum_teilbar_17 += i;
        }
        System.out.println(sum_teilbar_17);
        for (int i = 63; i <= 119; i++) {
            if (i == 63) System.out.print("#");
            if (i % 7 == 0 && i % 8 != 0) {
                System.out.print(i + "#");
            }
        }
        System.out.println();
        for (int i = 57; i > 47; i--) {
            if (i != 57) System.out.print(",");
            System.out.print((char) i);
        }
        System.out.println();
        int sum_d = 0;
        String text = "Drei durstige Dromedare durchqueren die Wüste der dutzenden dunklen Dünen!";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'd' || text.charAt(i) == 'D') {
                sum_d++;
            }
        }
        System.out.println(sum_d);
    }

}

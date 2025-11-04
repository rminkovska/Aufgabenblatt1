/*
    Aufgabe 5) Schleifen und Zeichnen innerhalb des CodeDraw-Fensters
*/

import codedraw.CodeDraw;
import codedraw.Palette;

public class Aufgabe5 {
    public static void main(String[] args) {
        double x = 300;
        double y = 300;
        CodeDraw myDrawObj = new CodeDraw((int) x, (int) y);
        int n = 7;
        for (int i = 0; i < n; i++) {
            myDrawObj.setLineWidth(4);
            myDrawObj.setColor(Palette.RED);
            myDrawObj.drawSquare(i * (x / n), i * (x / n), x / n);
        }
        for (int i = 1; i < n; i++) {
            myDrawObj.setLineWidth(2);
            myDrawObj.setColor(Palette.BLUE);
            myDrawObj.drawSquare(0, i * (x / n), x / n);
            myDrawObj.drawSquare(x - (x / n), (i - 1) * (x / n), x / n);
        }
        myDrawObj.show();
    }


}

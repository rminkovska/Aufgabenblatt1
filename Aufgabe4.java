/*
    Aufgabe 4) CodeDraw Bibliothek und Schleifen
*/

import codedraw.CodeDraw;
import codedraw.Palette;

public class Aufgabe4 {

    public static void main(String[] args) {

        int pixelWidth = 500;
        int pixelHeight = 500;
        CodeDraw myDrawObj = new CodeDraw(pixelWidth, pixelHeight);

        int numLinesQuadrant = 5;

        for (int i = 0; i < numLinesQuadrant; i++) {
            myDrawObj.setColor(Palette.GREEN);
            myDrawObj.drawLine(i * (pixelWidth / 2.0 / numLinesQuadrant), pixelHeight / 2.0, pixelWidth / 2.0, pixelHeight / 2.0 - ((i + 1) * (pixelHeight / 2.0 / numLinesQuadrant)));
            myDrawObj.setColor(Palette.ORANGE);
            myDrawObj.drawLine(i * (pixelWidth / 2.0 / numLinesQuadrant), pixelHeight / 2.0, pixelWidth / 2.0, pixelHeight / 2.0 + ((i + 1) * (pixelHeight / 2.0 / numLinesQuadrant)));
            myDrawObj.setColor(Palette.CYAN);
            myDrawObj.drawLine(pixelWidth / 2.0, pixelHeight / 2.0 - ((i + 1) * (pixelHeight / 2.0 / numLinesQuadrant)), pixelWidth - (i * (pixelWidth / 2.0 / numLinesQuadrant)), pixelHeight / 2.0);
            myDrawObj.setColor(Palette.MAGENTA);
            myDrawObj.drawLine(pixelWidth / 2.0, pixelHeight / 2.0 + ((i + 1) * (pixelHeight / 2.0 / numLinesQuadrant)), pixelWidth - (i * (pixelWidth / 2.0 / numLinesQuadrant)), pixelHeight / 2.0);
        }

        myDrawObj.setLineWidth(2);
        myDrawObj.setColor(Palette.BLACK);
        myDrawObj.drawLine(pixelWidth / 2.0, 0, pixelWidth / 2.0, pixelHeight);//vertical line
        myDrawObj.drawLine(0, pixelHeight / 2.0, pixelWidth, pixelHeight / 2.0);//horizontal line

        myDrawObj.show();
    }
}

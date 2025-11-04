/*
    Aufgabe 3) Simulation mit Schleifen
*/

import codedraw.CodeDraw;
import codedraw.Palette;

public class Aufgabe3 {

    public static void main(String[] args) {
        float numNests = 50.0f;
        float numBears = 10.0f;
        float maxCap = 100.0f;
        float r = 0.8f;
        float k = 0.045f;
        float b = 0.17f;
        float m = 0.12f;
        float dt = 0.1f;

        for (int i = 1; i <= 1000; i++) {
            float oldBears = numBears;
            float oldNests = numNests;
            float freeCap = maxCap - oldNests;
            numNests = oldNests + (1.0f / maxCap * freeCap * r * oldNests - k * oldNests * oldBears) * dt;
            numBears = oldBears + (b * k * oldNests * oldBears - m * oldBears) * dt;
            System.out.format("Iteration: %d | numNests: %.2f | numBears: %.2f%n", i, numNests, numBears);
            for (int j = 0; j < Math.round(numNests * 2); j++) {
                System.out.print("#");
            }
            System.out.println();
            for (float j = 0; j < Math.round(numBears * 4); j++) {
                System.out.print("B");
            }
            System.out.println();
        }
    }
}

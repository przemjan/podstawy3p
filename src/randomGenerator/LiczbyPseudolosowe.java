package randomGenerator;

import java.util.Random;

public class LiczbyPseudolosowe {
    public static void main(String[] args) {
        int losowaLiczba1;
        int losowaLiczba2;
        double losowaLiczba3;

        Random losowanie = new Random();

        //losujemy randoma w całym zakresie int
        losowaLiczba1 = losowanie.nextInt();

        System.out.println ("RNG to " + losowaLiczba1 );


        // losujemy randoma od 0-99
        losowaLiczba2 = losowanie.nextInt(100);

        System.out.println ("RNG to " + losowaLiczba2 );


        // losujemy randoma double  0-1
        losowaLiczba3 = losowanie.nextDouble();

        System.out.println ("RNG to " + losowaLiczba3 );

        // https://github.com/przemjan/trzeciaPgr3
        //1,2,12,14
        //zadania7 - 2 z 3, 6, 7, 8 ,9,10, 14, 17 z 18, 19||21||22
    }
}
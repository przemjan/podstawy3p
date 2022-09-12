package podstawy;

import java.util.Scanner;

public class ScanerDemo {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj numer buta: ");
        int numerButa = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Podaj srednią");
        double average = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("Podaj imię");

        String name = keyboard.nextLine();


        System.out.println("Numer buta: " + numerButa +" średnia " + average +" imię " + name);


        //https://github.com/przemjan/podstawy3p
        //zad 8, 15, 19, 20
    }
}

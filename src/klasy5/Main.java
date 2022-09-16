package klasy5;

public class Main {
    public static void main(String[] args) {
        int sides = 6;

        Kostka kostka = new Kostka(sides);

        Gracz gracz1 = new Gracz("Jerzy");
        Gracz gracz2 = new Gracz("Waldek");

        gracz1.rzutKostka(kostka);
        gracz2.rzutKostka(kostka);

        System.out.println("Gracz 1 wynik: " + gracz1.getScore());
        System.out.println("Gracz 2 wynik: " + gracz2.getScore());

    }
}

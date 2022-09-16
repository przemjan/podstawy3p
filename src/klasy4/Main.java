package klasy4;

public class Main {
    public static void main(String[] args) {

        final int SIDES =6;
        Gracz gracz1 = new Gracz("Franek",SIDES);
        Gracz gracz2 = new Gracz("Józek",SIDES);

        gracz1.rzut();
        gracz2.rzut();

        System.out.println("Wynik gracza1: " + gracz1.getScore());
        System.out.println("Wynik gracza2: " + gracz2.getScore());

    }
}

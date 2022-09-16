package klasy3;

public class Main1 {
    public static void main(String[] args) {

        double dlugosc = 3,szerokosc =5;

        Prostokat maly = new Prostokat(dlugosc,szerokosc);

        double pole = maly.obliczPole();

        System.out.println(pole);
        //następny prostokąt

        Prostokat duzy;
    }
}

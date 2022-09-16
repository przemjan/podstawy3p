package klasy2;

public class Main {
    public static void main(String[] args) {
        Osoba kolega1 = new Osoba("Franek");



        String name = kolega1.getName();
        System.out.println(name);

        Osoba kolega2 = new Osoba("Józek");

        System.out.println(kolega2.getName());

        //zmienne statyczne są wspólne dla wszystkich instancji klas
        System.out.println("Ilość osób: " + Osoba.getIloscOsob());
        System.out.println("Ilość osób: " + Osoba.getIloscOsob());

        Osoba kolega3 = new Osoba("Bogdan");
    }
    public static void changeName(Osoba osoba, String name){

        osoba.setName(name);
    }

}

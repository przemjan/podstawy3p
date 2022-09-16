package klasy1;

public class Main {
    public static void main(String[] args) {
        Osoba kolega1 = new Osoba();

        kolega1.setName("Franek");

        String name = kolega1.getName();
        System.out.println(name);

        Osoba kolega2 = new Osoba();
        kolega2.setName("Józek");
        System.out.println(kolega2.getName());


    }
    public static void changeName(Osoba osoba, String name){
        osoba.setName(name);
    }

}

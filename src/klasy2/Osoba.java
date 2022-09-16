package klasy2;

public class Osoba {

    private String imie;
    private static int iloscOsob =0;

    public Osoba (String name){
        imie = name;
        iloscOsob++;
    }

    public void setName(String name) {

        imie = name;
    }

    public String getName() {

        return imie;
    }

    public static int getIloscOsob() {
        return iloscOsob;
    }
}

package klasy4;

import klasy5.Kostka;

public class Gracz {
    private String name;
    private int score;
    private Kostka kostka;

    public Gracz(String name,int size ){
        this.name = name;

        kostka = new Kostka(size);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public int rzut(){
        int temp = kostka.roll();
        score+=temp;
        return temp;
    }




}

package klasy5;

public class Gracz {
    private String name;

    private int score;
    public Gracz(String name){
        this.name = name;
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

    public int rzutKostka(Kostka kostka){
        int temp = kostka.roll();
        score+= temp;
        return temp;
    }


}

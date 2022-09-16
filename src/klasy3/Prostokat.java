package klasy3;

public class Prostokat {
    private double dlugosc;
    private double szerokosc;

    public Prostokat(double length, double width){
        dlugosc = length;
        szerokosc = width;
    }

    public double getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(double length) {
        this.dlugosc = length;
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(double width) {
        this.szerokosc = szerokosc;
    }

    public double obliczPole(){
        return dlugosc*szerokosc;
    }

}

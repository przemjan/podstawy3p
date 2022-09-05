public class StringiDemo {
    public static void main(String[] args) {

        String name = "Franek";

        char inicjal;
        inicjal = name.charAt(0);

        int length = name.length();

        String male, duze;

        male = name.toLowerCase();
        duze = name.toUpperCase();

        System.out.println("Imie orig: " + name + " " + male + duze);


    }
}

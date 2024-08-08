package package1.app;

public class Equals {
    public static void main(String[] args) {
        String first = "Muhammad AlFatih";
        String second = "Muhammad";
        second = second + "AlFatih";

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Muhammad AlFatih";
        System.out.println(first == third);
        System.out.println(first.equals(third));
    }
}

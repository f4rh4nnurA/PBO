public class Perkalianku1 {
    void perkalian(int a, int b){
        System.out.println(a * b);
    }

    void perkalian(double a, double b){
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        Perkalianku1 objek = new Perkalianku1();
        objek.perkalian(25, 43);
        objek.perkalian(34.56, 23.7);
    }
}

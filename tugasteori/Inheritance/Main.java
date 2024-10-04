import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Lingkaran l1 = new Lingkaran();
        System.out.println("Masukkan r: ");
        float jari2 = sc.nextFloat();
        l1.r = jari2;
        float kelilingLingkaran = l1.hitungKeliling();
        float luasLingkaran = l1.hitungLuas();
        System.out.println("Keliling lingkaran: " + kelilingLingkaran);
        System.out.println("Luas lingkaran: " + luasLingkaran);
    }
}
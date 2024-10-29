import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi objek
        Lahan lahan = new Lahan(2.5, "Lempung");
        Waktu waktu = new Waktu("Musim Panas");
        Cuaca cuaca = new Cuaca();
        Pemain pemain = new Pemain(1000, 100);
        Toko toko = new Toko();

        // Tanaman yang bisa dipilih
        Tanaman[] tanamanList = { new Padi(), new Jagung(), new Sayuran() };

        boolean running = true;
        while (running) {
            System.out.println("\nApa yang ingin Anda lakukan?");
            System.out.println("1. Tanam tanaman");
            System.out.println("2. Siram lahan");
            System.out.println("3. Pupuk lahan");
            System.out.println("4. Berantas hama");
            System.out.println("5. Lihat cuaca");
            System.out.println("6. Lihat hari berikutnya");
            System.out.println("7. Jual barang");
            System.out.println("8. Lihat inventori");
            System.out.println("9. Keluar");

            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1: // Tanam tanaman
                    System.out.println("Pilih tanaman yang ingin ditanam:");
                    for (int i = 0; i < tanamanList.length; i++) {
                        System.out.println((i + 1) + ". " + tanamanList[i].getNama());
                    }
                    System.out.print("Masukkan pilihan Anda: ");
                    int pilihanTanaman = scanner.nextInt();
                    if (pilihanTanaman >= 1 && pilihanTanaman <= tanamanList.length) {
                        lahan.menanam(tanamanList[pilihanTanaman - 1]);
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                    break;
                case 2: 
                    lahan.menyiram();
                    break;
                case 3: 
                    lahan.memupuk();
                    break;
                case 4: 
                    lahan.memberantasHama();
                    break;
                case 5: 
                    cuaca.tampilkanCuaca();
                    break;
                case 6: 
                    waktu.hariSelanjutnya();
                    cuaca.updateCuaca(); 
                    cuaca.tampilkanCuaca(); 
                    if (new Random().nextInt(5) == 0) {
                        lahan.serangHama(); 
                    }
                    for (Tanaman tanaman : tanamanList) {
                        tanaman.tumbuh(waktu, cuaca, lahan);
                        if (tanaman.siapPanen()) {
                            pemain.tambahInventori(tanaman.getNama());
                            System.out.println(tanaman.getNama() + " siap dipanen!");
                        }
                    }
                    break;
                case 7: 
                    System.out.print("Masukkan nama barang yang ingin dijual: ");
                    scanner.nextLine(); 
                    String barang = scanner.nextLine();
                    System.out.print("Masukkan jumlah barang yang ingin dijual: ");
                    int jumlah = scanner.nextInt();
                    toko.beli(barang, jumlah, pemain);
                    break;
                case 8: 
                    pemain.tampilkanInventori();
                    break;
                case 9: 
                    running = false;
                    System.out.println("Keluar dari permainan.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    } 
}

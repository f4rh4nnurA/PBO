
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pemain pemain = new Pemain(500);
        Toko toko = new Toko();
        Lahan lahan = new Lahan(2.5, "Lempung");
        Cuaca cuaca = new Cuaca();

        System.out.println("Selamat datang di game pertanian.");
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Beli Benih");
            System.out.println("2. Tanam Tanaman");
            System.out.println("3. Lihat Cuaca");
            System.out.println("4. Lihat Inventori");
            System.out.println("5. Siram Tanaman");
            System.out.println("6. Berantas Hama");
            System.out.println("7. Jual Hasil Panen");
            System.out.println("8. Lihat Uang");
            System.out.println("9. Keluar");

            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Pilih benih yang ingin dibeli:");
                    System.out.println("1. Padi - Rp50");
                    System.out.println("2. Jagung - Rp30");
                    System.out.println("3. Sayuran - Rp20");

                    System.out.print("Masukkan pilihan Anda: ");
                    int pilihanBenih = scanner.nextInt();
                    Tanaman tanaman = null;

                    switch (pilihanBenih) {
                        case 1:
                            tanaman = toko.jualBenih("Padi", pemain);
                            break;
                        case 2:
                            tanaman = toko.jualBenih("Jagung", pemain);
                            break;
                        case 3:
                            tanaman = toko.jualBenih("Sayuran", pemain);
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                    }

                    if (tanaman != null) {
                        pemain.tambahInventori(tanaman);
                    }
                    break;

                case 2:
                    if (pemain.getInventori().isEmpty()) {
                        System.out.println("Anda belum memiliki tanaman di inventori. Beli benih dulu di toko.");
                    } else {
                        pemain.tampilkanInventori();
                        System.out.print("Pilih tanaman yang ingin ditanam: ");
                        int pilihanTanam = scanner.nextInt();
                        if (pilihanTanam > 0 && pilihanTanam <= pemain.getInventori().size()) {
                            Tanaman tanamanUntukDitanam = pemain.getInventori().get(pilihanTanam - 1);
                            lahan.menanam(tanamanUntukDitanam);
                            tanamanUntukDitanam.tumbuh(cuaca, lahan);

                            if (tanamanUntukDitanam.siapPanen()) {
                                System.out.println(tanamanUntukDitanam.getNama() + " siap untuk dipanen!");
                            }
                        } else {
                            System.out.println("Pilihan tanaman tidak valid.");
                        }
                    }
                    lahan.resetSiram(); 
                    break;

                case 3:
                    cuaca.updateCuaca();
                    cuaca.tampilkanCuaca();
                    break;

                case 4:
                    pemain.tampilkanInventori();
                    break;

                case 5:
                    lahan.siramTanaman();
                    break;

                case 6:
                    lahan.memberantasHama();
                    break;

                case 7:
                    if (pemain.getInventori().isEmpty()) {
                        System.out.println("Tidak ada tanaman untuk dijual.");
                    } else {
                        for (int i = 0; i < pemain.getInventori().size(); i++) {
                            Tanaman tanamanUntukJual = pemain.getInventori().get(i);
                            if (tanamanUntukJual.siapPanen()) {
                                toko.beliHasilPanen(tanamanUntukJual, pemain);
                                pemain.getInventori().remove(tanamanUntukJual);
                                i--;
                            }
                        }
                    }
                    break;

                case 8:
                    System.out.println("Uang pemain saat ini: Rp" + pemain.getUang());
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
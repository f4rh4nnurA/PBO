import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Anggota2 donny = new Anggota2(111333444, "Donny", 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        System.out.print("\nMasukkan jumlah pinjaman: ");
        int jumlahPinjaman = input.nextInt();
        donny.pinjam(jumlahPinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.print("\nMasukkan jumlah angsuran: ");
        int jumlahAngsuran = input.nextInt();
        donny.mengangsurPinjaman(jumlahAngsuran);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.print("\nMasukkan jumlah pinjaman lagi: ");
        jumlahPinjaman = input.nextInt();
        donny.pinjam(jumlahPinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.print("\nMasukkan jumlah angsuran lagi: ");
        jumlahAngsuran = input.nextInt();
        donny.mengangsurPinjaman(jumlahAngsuran);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        input.close();
    }
}
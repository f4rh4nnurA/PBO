public class Anggota2 {
    private String nama;
    private int noKtp;
    private int limitPinjaman;
    private int jumlahPinjaman;

    Anggota2(int noKtp, String nama, int limitPinjaman) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public void mengangsurPinjaman(double angsuran) {
        if (jumlahPinjaman == 0) {
            System.out.println("Anda sekarang tidak mempunyai pinjaman");
        } else if (angsuran >= (0.1 * jumlahPinjaman)) {
            jumlahPinjaman -= angsuran;
        } else if (angsuran < (0.1 * jumlahPinjaman)) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int pinjaman) {
        if ((pinjaman + jumlahPinjaman) > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        } else if ((jumlahPinjaman + pinjaman) <= limitPinjaman) {
            jumlahPinjaman += pinjaman;
        }
    }
}
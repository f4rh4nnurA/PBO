public class Lahan {
    private double ukuran;
    private String jenisTanah;
    private boolean adaHama;
    private boolean disiram;

    public Lahan(double ukuran, String jenisTanah) {
        this.ukuran = ukuran;
        this.jenisTanah = jenisTanah;
        this.adaHama = false;
        this.disiram = false;
    }

    public void menanam(Tanaman tanaman) {
        System.out.println("Menanam " + tanaman.getNama() + " di lahan berukuran " + ukuran + " hektar dengan jenis tanah " + jenisTanah);
    }

    public void serangHama() {
        adaHama = true;
        System.out.println("Hama menyerang lahan!");
    }

    public void memberantasHama() {
        if (adaHama) {
            System.out.println("Hama telah diberantas dari lahan.");
            adaHama = false;
        } else {
            System.out.println("Tidak ada hama di lahan.");
        }
    }

    public boolean isAdaHama() {
        return adaHama;
    }

    public void siramTanaman() {
        disiram = true;
        System.out.println("Tanaman telah disiram.");
    }

    public boolean isDisiram() {
        return disiram;
    }

    public void resetSiram() {
        disiram = false;
    }
}

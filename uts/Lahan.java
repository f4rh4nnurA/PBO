public class Lahan {
    private double ukuran; 
    private String jenisTanah;
    private boolean adaHama;

    public Lahan(double ukuran, String jenisTanah) {
        this.ukuran = ukuran;
        this.jenisTanah = jenisTanah;
        this.adaHama = false;
    }

    public void menanam(Tanaman tanaman) {
        System.out.println("Menanam " + tanaman.getNama() + " di lahan berukuran " + ukuran + " hektar dengan jenis tanah " + jenisTanah);
    }

    public void menyiram() {
        System.out.println("Lahan disiram.");
    }

    public void memupuk() {
        System.out.println("Lahan diberi pupuk.");
    }

    public void memberantasHama() {
        if (adaHama) {
            System.out.println("Hama telah diberantas dari lahan.");
            adaHama = false;
        } else {
            System.out.println("Tidak ada hama di lahan.");
        }
    }

    public void serangHama() {
        adaHama = true;
        System.out.println("Hama menyerang lahan!");
    }

    public boolean isAdaHama() {
        return adaHama;
    }

    public double getUkuran() {
        return ukuran;
    }

    public String getJenisTanah() {
        return jenisTanah;
    }
}

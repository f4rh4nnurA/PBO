public class Tanaman {
    protected String nama;
    protected int hariTumbuh;
    protected int hargaJual; 

    public Tanaman(String nama, int hariTumbuh, int hargaJual) {
        this.nama = nama;
        this.hariTumbuh = hariTumbuh;
        this.hargaJual = hargaJual;
    }

    public String getNama() {
        return nama;
    }

    public int getHargaJual() {
        return hargaJual;
    }

    public void tumbuh(Cuaca cuaca, Lahan lahan) {
        if (lahan.isAdaHama()) {
            System.out.println(nama + " tidak bisa tumbuh karena ada hama.");
            return;
        }

        if (lahan.isDisiram() && hariTumbuh > 0 && !cuaca.getKondisi().equals("Badai")) {
            hariTumbuh--;
            System.out.println(nama + " sedang tumbuh. Hari tersisa untuk panen: " + hariTumbuh);
        } else if (cuaca.getKondisi().equals("Badai")) {
            System.out.println(nama + " rusak karena badai.");
        }
    }

    public boolean siapPanen() {
        return hariTumbuh == 0;
    }

    public int getHariTumbuh() {
        return hariTumbuh;
    }
}
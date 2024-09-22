public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public float hitungHargaJual () {
        return hargaDasar - ((diskon/100) * hargaDasar);
    }

    public void tampilData () {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Kode Barang: " + kode);
        System.out.println("Harga Jual: " + hitungHargaJual());
    }
}

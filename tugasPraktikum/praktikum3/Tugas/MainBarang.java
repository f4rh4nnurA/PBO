public class MainBarang {
    public static void main(String[] args) {
        Barang brg1 = new Barang();
        brg1.diskon = 20;
        brg1.hargaDasar = 50000;
        brg1.kode = "1A";
        brg1.namaBarang = "Kardus";
        brg1.hitungHargaJual();
        brg1.tampilData();
    }
}

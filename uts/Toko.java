public class Toko {
    public void jual(String barang, int jumlah, Pemain pemain) {
        int harga = jumlah * 10; // Misalnya harga per barang 10
        pemain.kurangiUang(harga);
        System.out.println("Anda membeli " + jumlah + " " + barang + ". Uang tersisa: " + pemain.getUang());
    }

    public void beli(String barang, int jumlah, Pemain pemain) {
        int harga = jumlah * 15; // Misalnya harga jual 15
        pemain.tambahUang(harga);
        System.out.println("Anda menjual " + jumlah + " " + barang + ". Uang bertambah: " + pemain.getUang());
    }
}

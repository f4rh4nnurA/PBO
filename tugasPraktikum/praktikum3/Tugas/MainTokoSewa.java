public class MainTokoSewa {
    public static void main(String[] args) {
        TokoSewaGame plggn1 = new TokoSewaGame();
        plggn1.namaGame = "cen";
        plggn1.harga = 3000;
        plggn1.namaPelanggan = "seinlong";
        plggn1.lamaSewa = 3;
        plggn1.idPelanggan = 1;
        plggn1.hitungHargaSewa();
        plggn1.tampilkanDataPeminjaman();
    }
}

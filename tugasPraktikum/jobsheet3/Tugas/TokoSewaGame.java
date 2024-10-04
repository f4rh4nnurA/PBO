public class TokoSewaGame {
    public String namaGame;
    public int idPelanggan;
    public String namaPelanggan;
    public int harga;
    public int lamaSewa;

    public void tampilkanDataPeminjaman () {
        System.out.println("\t\t\tTransaksi Peminjaman video Game");
        System.out.println("Nama Game\t: " + namaGame);
        System.out.println("Nama Pelanggan\t: " + namaPelanggan);
        System.out.println("Id pelanggan\t: " + idPelanggan);
        System.out.println("Harga Sewa\t: " + hitungHargaSewa());
        System.out.println("Lama Sewa: " + lamaSewa);
    }

    public int hitungHargaSewa(){
        return harga * lamaSewa;
    }
}

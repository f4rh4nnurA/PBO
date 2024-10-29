import java.util.ArrayList;
import java.util.List;

public class Pemain {
    private int uang;
    private int energi;
    private List<String> inventori;

    public Pemain(int uang, int energi) {
        this.uang = uang;
        this.energi = energi;
        this.inventori = new ArrayList<>();
    }

    public void tambahInventori(String item) {
        inventori.add(item);
        System.out.println(item + " ditambahkan ke inventori.");
    }

    public void kurangiUang(int jumlah) {
        uang -= jumlah;
    }

    public void tambahUang(int jumlah) {
        uang += jumlah;
    }

    public int getUang() {
        return uang;
    }

    public int getEnergi() {
        return energi;
    }

    public void kurangiEnergi(int jumlah) {
        energi -= jumlah;
    }

    public void tambahEnergi(int jumlah) {
        energi += jumlah;
    }

    public void tampilkanInventori() {
        System.out.println("Inventori: " + inventori);
    }
}

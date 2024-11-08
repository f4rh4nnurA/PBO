import java.util.ArrayList;
import java.util.List;

class Pemain {
    private int uang;
    private List<Tanaman> inventori;

    public Pemain(int uangAwal) {
        this.uang = uangAwal;
        this.inventori = new ArrayList<>();
    }

    public void tambahInventori(Tanaman tanaman) {
        inventori.add(tanaman);
        System.out.println(tanaman.getNama() + " ditambahkan ke inventori.");
    }

    public void kurangiUang(int jumlah) {
        uang -= jumlah;
        System.out.println("Uang berkurang, sisa uang: " + uang);
    }

    public void tambahUang(int jumlah) {
        uang += jumlah;
        System.out.println("Uang bertambah, jumlah uang sekarang: " + uang);
    }

    public int getUang() {
        return uang;
    }

    public void tampilkanInventori() {
        System.out.println("Inventori: ");
        int index = 1;
        for (Tanaman tanaman : inventori) {
            System.out.println(index + ". " + tanaman.getNama() + ", hari untuk panen: " + tanaman.getHariTumbuh());
            index++;
        }
    }

    public List<Tanaman> getInventori() {
        return inventori;
    }
}
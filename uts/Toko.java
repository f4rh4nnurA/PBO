import java.util.HashMap;
import java.util.Map;

public class Toko {
    private Map<String, Integer> hargaBenih;

    public Toko() {
        hargaBenih = new HashMap<>();
        hargaBenih.put("Padi", 50);
        hargaBenih.put("Jagung", 30);
        hargaBenih.put("Sayuran", 20);
    }

    public Tanaman jualBenih(String nama, Pemain pemain) {
        if (pemain.getUang() >= hargaBenih.get(nama)) {
            pemain.kurangiUang(hargaBenih.get(nama));
            System.out.println(nama + " telah dibeli.");
            switch (nama) {
                case "Padi": 
                    return new Padi();
                case "Jagung":
                    return new Jagung();
                case "Sayuran": 
                    return new Sayuran();
                default: 
                    return null;
            }
        } else {
            System.out.println("Uang tidak cukup untuk membeli " + nama);
            return null;
        }
    }

    public void beliHasilPanen(Tanaman tanaman, Pemain pemain) {
        int harga = tanaman.getHargaJual();
        pemain.tambahUang(harga);
        System.out.println("Hasil panen " + tanaman.getNama() + " telah dijual seharga Rp" + harga);
    }
}
abstract class Tanaman {
    private String nama;
    private int hariTumbuh;

    public Tanaman(String nama, int hariTumbuh) {
        this.nama = nama;
        this.hariTumbuh = hariTumbuh;
    }

    // Method tumbuh dipengaruhi oleh cuaca dan lahan
    public void tumbuh(Waktu waktu, Cuaca cuaca, Lahan lahan) {
        if (lahan.isAdaHama()) {
            System.out.println(getNama() + " tidak bisa tumbuh karena lahan terkena hama.");
            return;
        }

        if (cuaca.getKondisi().equals("Cerah") || cuaca.getKondisi().equals("Mendung")) {
            kurangiHariTumbuh();
            System.out.println(getNama() + " tumbuh dengan baik. Hari tersisa untuk panen: " + getHariTumbuh());
        } else if (cuaca.getKondisi().equals("Hujan")) {
            System.out.println(getNama() + " tumbuh lebih lambat karena hujan. Hari tersisa untuk panen: " + getHariTumbuh());
        } else if (cuaca.getKondisi().equals("Badai")) {
            System.out.println(getNama() + " rusak karena badai, tidak bisa tumbuh hari ini.");
        }
    }

    public String getNama() {
        return nama;
    }

    public int getHariTumbuh() {
        return hariTumbuh;
    }

    public void kurangiHariTumbuh() {
        if (hariTumbuh > 0) {
            hariTumbuh--;
        }
    }

    public boolean siapPanen() {
        return hariTumbuh == 0;
    }
    
}

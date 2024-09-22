public class Persegi {
    public int sisi;

    public int  hitungLuasPersegi (int sisi) {
        return sisi * sisi;
    }

    public int hitungKelilingPersegi (int sisi) {
        return 4 * sisi;
    }

    public void tampilkanHasilHitung () {
        System.out.println("Keliling persegi\t: " + hitungKelilingPersegi(sisi));
        System.out.println("Luas Persegi\t: " + hitungLuasPersegi(sisi));
    }
}

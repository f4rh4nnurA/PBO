public class Waktu {
    private int hari;
    private String musim;
    private static final int HARI_PER_MUSIM = 30;

    public Waktu(String musim) {
        this.hari = 0;
        this.musim = musim;
    }

    public void hariSelanjutnya() {
        hari++;
        if (hari % HARI_PER_MUSIM == 0) {
            gantiMusim();
        }
        System.out.println("Hari ke-" + hari + " pada musim " + musim);
    }

    private void gantiMusim() {
        String[] musimList = { "Musim Semi", "Musim Panas", "Musim Gugur", "Musim Dingin" };
        musim = musimList[(hari / HARI_PER_MUSIM) % musimList.length];
        System.out.println("Musim telah berganti menjadi: " + musim);
    }

    public int getHari() {
        return hari;
    }

    public String getMusim() {
        return musim;
    }

    public void setMusim(String musim) {
        this.musim = musim;
    }
}

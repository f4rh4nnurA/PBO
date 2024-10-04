public class Lingkaran extends BangunDatar {
    public float r;
    Lingkaran(){
        super();
    }

    @Override
    public float hitungKeliling() {
        keliling = 2 * (float)Math.PI * r;
        return keliling;
    }

    @Override
    public float hitungLuas() {
        keliling = (float)Math.PI * r * r;
        return luas;
    }
}

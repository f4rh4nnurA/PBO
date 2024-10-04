public class Lingkaran {
    public double phi;
    public double r;

    public double hitungLuas(){
        return phi*r*r;
    }

    public double hitungKeliling(){
        return 2*phi*r;
    }

    public void tampilkanHasil(){
        System.out.println("Hasil keliling  : " + hitungKeliling());
        System.out.println("Hasil Luas      : " + hitungLuas());
    }
}

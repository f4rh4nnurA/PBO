public class Anggota1 {
    private String nama;
    private String alamat;
    private float simpanan;

    Anggota1void setNama(String nama){
        this.nama = nama;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public String getNama(){
        return nama;
    }

    public String getAlamat(){
        return alamat;
    }

    public float getSimpanan(){
        return simpanan;
    }

    public void setor(float uang){
        simpanan += uang;
    }

    public void tarik(float uang){
        simpanan -= uang;
    }
}

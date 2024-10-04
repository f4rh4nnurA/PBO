public class Pegawai {
    private String nip;
    private String nama;
    Pegawai(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }   

    public String setNip(String nip){
        return this.nip = nip;
    }

    public String getNip () {
        return nip;
    }

    public String setNama (String nama){
        return this.nama = nama;
    }

    public String getNama (){
        return nama;  
    }

    public String info(){
        String info = "";
        info += "Nip: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}

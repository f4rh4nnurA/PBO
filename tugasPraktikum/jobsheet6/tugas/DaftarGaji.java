public class DaftarGaji {
    public Pegawai[] listPegawai;
    private int jumlahPegawai;

    public DaftarGaji(int ukuran) {
        listPegawai = new Pegawai[ukuran];
        jumlahPegawai = 0;
    }

    public void addPegawai(Pegawai pegawai) {
        if (jumlahPegawai < listPegawai.length) {
            listPegawai[jumlahPegawai] = pegawai;
            jumlahPegawai++;
        } else {
            System.out.println("Daftar pegawai penuh!");
        }
    }

    public void printSemuaGaji() {
        for (int i = 0; i < jumlahPegawai; i++) {
            System.out.println("Nama: " + listPegawai[i].getNama() + ", Gaji: " + listPegawai[i].getGaji());
        }
    }
}

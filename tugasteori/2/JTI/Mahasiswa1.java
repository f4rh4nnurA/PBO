public class Mahasiswa1 extends MataKuliah {
    public String nama;
    public long nim;
    public String kelas;

    public String masukkanNama(String namaMahasiswa) {
        return nama = namaMahasiswa;
    }

    public long masukkanNIM(Long nimMahasiswa) {
        return nim = nimMahasiswa;
    }

    public String masukkanNamaKelas(String namaKelas) {
        return kelas = namaKelas;
    }

    public void tampilkanDataMahasiswa() {
        System.out.println("\t\t\t\tData Mahasiswa");
        System.out.println("Nama Mahasiswa\t: " + nama);
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Kelas\t\t: " + kelas);
        System.out.println("Nilai\t\t: " + nilai);
        System.out.println("Mata Kuliah\t: " + namaMataKuliah);
        System.out.println("Dosen\t\t: " + namaDosen);
    }

}

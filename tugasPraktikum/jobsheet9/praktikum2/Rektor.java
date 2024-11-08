public class Rektor {
    public void beriSertifikatCumlaude(Icumlaude mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude");
        System.out.println("Selamat! Bagaimana Anda bisa cumlaude?");

        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();

        System.out.println("-----------------------------------------------");
    }
}

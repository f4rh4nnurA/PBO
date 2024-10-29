import java.util.Random;
public class Cuaca {
    private String kondisi;
    private double suhu;
    private double curahHujan;
    private double kelembaban;

    public Cuaca() {
        updateCuaca();
    }

    public void updateCuaca() {
        String[] kondisiList = { "Cerah", "Mendung", "Hujan", "Badai" };
        Random rand = new Random();
        kondisi = kondisiList[rand.nextInt(kondisiList.length)];
        suhu = 20 + rand.nextDouble() * 15; // Suhu antara 20°C hingga 35°C
        curahHujan = rand.nextDouble() * 100; // Curah hujan antara 0mm hingga 100mm
        kelembaban = 30 + rand.nextDouble() * 70; // Kelembaban antara 30% hingga 100%
    }

    public void tampilkanCuaca() {
        System.out.println("Cuaca saat ini: " + kondisi + ", Suhu: " + suhu + "°C, Curah Hujan: " + curahHujan + "mm, Kelembaban: " + kelembaban + "%");
    }

    public String getKondisi() {
        return kondisi;
    }

    public double getSuhu() {
        return suhu;
    }

    public double getCurahHujan() {
        return curahHujan;
    }

    public double getKelembaban() {
        return kelembaban;
    }
}

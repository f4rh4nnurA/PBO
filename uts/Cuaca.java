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
        suhu = 20 + rand.nextDouble() * 15;
        curahHujan = rand.nextDouble() * 100;
        kelembaban = 30 + rand.nextDouble() * 70;
    }

    public void tampilkanCuaca() {
        System.out.println("Cuaca saat ini: " + kondisi + ", Suhu: " + suhu + "°C, Curah Hujan: " + curahHujan + "mm, Kelembaban: " + kelembaban + "%");
    }

    public String getKondisi() {
        return kondisi;
    }
}
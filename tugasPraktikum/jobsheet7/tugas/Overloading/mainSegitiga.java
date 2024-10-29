public class mainSegitiga {
    public static void main(String[] args) {
        Segitiga sgtg1 = new Segitiga();
        System.out.println("Total sudut dengan sudutA = 60: " + sgtg1.totalSudut(60));
        System.out.println("Total sudut dengan sudutA = 60 dan sudutB = 50: " + sgtg1.totalSudut(60, 50));
        System.out.println("Keliling dengan sisiA = 3, sisiB = 4, sisiC = 5: " + sgtg1.keliling(3, 4, 5));
        System.out.println("Keliling dengan sisiA = 3 dan sisiB = 4 (Pythagoras): " + sgtg1.Keliling(3, 4));   
    }
}

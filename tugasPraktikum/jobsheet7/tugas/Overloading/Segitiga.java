public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA){
        return 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB){
        return 180 - (sudutA + sudutB);
    }

    public static int keliling (int sisiA, int sisiB, int sisiC){
        return sisiA + sisiB + sisiC;
    }

    public double Keliling (int sisiA, int sisiB){
        return Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
    }


}

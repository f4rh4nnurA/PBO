public class Laptop {
    private String merk;
    private Processor proc;

    public Laptop (String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public Laptop () {
        
    }

    public String setMerk (String merk){
        return this.merk = merk;
    }

    public String getMerk(){
        return merk;
    }

    public Processor setProc (Processor proc){
        return this.proc = proc;
    }

    public Processor getProc(){
        return proc;
    }

    public void info (){
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}

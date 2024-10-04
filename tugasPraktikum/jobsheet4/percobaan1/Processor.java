class Processor {
    private String merk;
    private double cache;

    public Processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    public Processor() {

    }

    public String setMerk(String merk) {
        return this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public double setCache(double cache) {
        return this.cache = cache;
    }

    public String getCache() {
        return cache;
    }

    public void info() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Laptop = %.2f\n", cache);
    }
}

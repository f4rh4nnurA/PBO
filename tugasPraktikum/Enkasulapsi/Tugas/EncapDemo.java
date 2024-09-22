public class EncapDemo {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public int getAge () {
        return age;
    }

    public void setAge(int newAge){
        if (newAge <= 30 && newAge >= 18) {
            age = newAge;
        } else {
            System.out.println("nilai minimum harus bernilai 18, dan nilai maksimal harus bernilai 30");
        }
    }
}

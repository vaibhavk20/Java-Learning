class Human{
    private int age;
    private String name;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }

}

public class EncapsulationExample {
    public static void main(String[] args) {
        Human obj1 = new Human();
        // obj1.name = "vaibhav";
        // obj1.age = 25;

        obj1.setName("vaibahv");
        obj1.setAge(25);
        System.out.println(obj1.getName()+": "+obj1.getAge());
    }
    
}

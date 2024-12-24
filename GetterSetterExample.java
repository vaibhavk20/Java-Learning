class Human{
    private String name;
    private int age;

    //default constructor example
    public Human(){
        //constructor has same name as class name 
        //it excute without calling 
        // its good practics to the assign the value inside the method

        name = "ram";
        age = 21;
    }

    //parameterized constructor
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    

}

public class GetterSetterExample {
    public static void main(String[] args) {
        Human obj = new Human("vaibhav",25);
        Human obj1 = new Human();

        System.out.println(obj.getName()+": "+obj.getAge());

        System.out.println(obj1.getName()+": "+obj1.getAge());

    }
    /* 
     * java camelcase nameing follow 
     * class and interface - Calc
     * Variable and method - add, multiplication
     * constant PIE
     */
}

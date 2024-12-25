import tools.Laptop;

public class Inheritance {
    public static void main(String[] args) {
        AdvCalc obj1 = new AdvCalc();

        int r1 = obj1.add(4,5);
        int r2 = obj1.mul(4,5);
        System.out.println("additiong is:" + r1 + " " + r2);

        //we are calling from the packages
        //also use the concept of the inheritance.
        Laptop L1 = new Laptop();

        L1.computerComponents();

    }
    /*
      * inheritance is used for the reduce code redundancy.
      * we call the any class method in the other class with help of the extend keyword.
      * Inheritance laptop is computer it mean laptop has all features of the computer.
      * we can also use the multilevel inheritance. calc ==> advCalc ==> scientificCal etc.
      * java not supports the multiple inheritance.
      */
}

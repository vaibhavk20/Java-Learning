class A{
    public A(){
        System.out.println("inside A");
    }
    public A(int n){
        this();
        System.out.println("inside A int");
    }
}

class B extends A{
    public B(){
        System.out.println("inside B");
    }
    public B(int n){
        super(n);
        // this();
        System.out.println("inside B int");
    }
}


public class SuperAndThisExample {

    public static void main(String[] args) {
        new B(5); //its a annoums object we can not reuse it.

    }
    /*
     * every constructor has the super() method its invisible we have call it. 
     * super() is use for the call the parameterised constructor. eg. super(5).
     * ths() is use for the call default constructor and prameterised.
     * 
     */
    
}

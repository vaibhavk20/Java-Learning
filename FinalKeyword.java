class Watch{
    public final void show(){
        System.out.println("inside the Watch Vaibhav is owner of this watch.");
    }
}
class OwnWatch extends Watch {
    
}

public class FinalKeyword {
    public static void main(String[] args) {
        
        OwnWatch obj = new OwnWatch();
        obj.show();
    }

    /*
     * final keyword is use as the constant.
     * final => variable, method, class.
     * if final keyword is used the we can't change that variable value.
     * for class we can't inheritance.
     * for the method we can't override the method.
     */
    
}

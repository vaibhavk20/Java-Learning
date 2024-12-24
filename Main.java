public class Main{
    public static void main(String[] args){
        System.out.println("hello Rupa!");
        System.out.println("I am learning Java form W3 schools.");
        System.out.println("I am learning it for the my project.");

        System.out.println(3+3);
        System.out.println(3*3);
        System.out.println(3^2);
        System.out.println(6/2);

        //this the basic print statements for practices.

        /* This is the multiline comment use in java */

        /* java variables
         * string ==> "Hello"
         * int ==> 123
         * float ==> 12.12
         * char ==> a or b single characters.
         * boolean ==> true or false.
         */

         String name = "Rupa";
         System.out.println(name);

         int rollNo = 2203;
         System.out.println(rollNo);

         // declare later assingment
         int newNum;
         newNum  = 1520;
         System.out.println(newNum);

         // constant by final keyword we con't reassinged it.
         final int id = 23;
         System.out.println(id);

         // concatenation by + 
         System.out.println("hello: " + name);

         int sum = newNum+id;
         System.out.println(sum);

         //multiple variables declaration 
         int x = 1, y = 2;
         System.out.println(x+y);

         //one value to multiple variables
         int a,b,c ;
         a = b = c = 10;
         System.out.println(a+b+c);

         /*
          * The general rules for naming variables are:

            Names can contain letters, digits, underscores, and dollar signs
            Names must begin with a letter
            Names should start with a lowercase letter, and cannot contain whitespace
            Names can also begin with $ and _
            Names are case-sensitive ("myVar" and "myvar" are different variables)
            Reserved words (like Java keywords, such as int or boolean) cannot be used as names

          */
        
        System.out.println(name.length());

        String txt = "please locate where \"locate\" occurs!";
        System.out.println(txt.indexOf("where"));
        
        // for escape any special character then add just \ before it.
        System.out.println(txt);

    }
}
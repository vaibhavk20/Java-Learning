class Calculator{
    public int add(){
        int num1 = 12;
        int num2 = 32;

        System.out.println(num1+num2);
        return 0;
    }

    public int sub(int num1, int num2){
        System.out.println(num1-num2);

        return 0 ;
    }

    public int arr(){
        int nums[][] = new int[3][3];
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(nums[i][j]);
            }
        }

        return 0;
    }
}

class Student{
    String name;
    int roll;
}


public class ClassesExamples {
    public static void main(String[] args) {
        System.out.println("test classes.");

        // Calculator cal = new Calculator();

        // int result = cal.sub(20,3);

        // System.out.println(result);

        // int nums[][] = new int[3][3];
        
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums[i].length;j++){

        //         // nums[i][j] = (int)(Math.random()*10);
        //         nums[i][j] = i;

        //         System.out.print(nums[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // ==================================================================================
        Student students[] = new Student[3];
        String names[] = {"ram","vaibhav","rupa"};

        for(int i=0;i<students.length;i++){
            students[i] = new Student();
            students[i].name = names[i];
            students[i].roll = i+1;
            System.out.println(students[i].name + " : " + students[i].roll);
        }

    
    }
}

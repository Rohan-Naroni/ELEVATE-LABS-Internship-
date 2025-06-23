import java.util.Arrays;
import java.util.Scanner;

class Java_Console_Calculator{

    private static double Addition(double nums[]){
        double result = nums[0];
        for (int i = 1; i<nums.length;i++) {
            result += nums[i];
        }
        return result;
    }


    private static double Substraction(double nums[]){
        double result = nums[0];
        for (int i =1; i<nums.length;i++) {
            result -= nums[i];
        }
        return result;
    }

    private static double Multiplication(double nums[]){
        double result = nums[0];
        for (int i = 1; i<nums.length; i++) {
            result *= nums[i];
            
        }
        return result;
    }

    private static double Division(double nums[]){
        double result = nums[0];
        for (int i = 1; i<nums.length;i++) {
            if (nums[i] == 0) {
                System.out.println("Cannot divide by zero");
                return Double.NaN;
            }
            result /= nums[i];
            
        }
        return result;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int userinput = 0;


        while (userinput!=5) {
            

            System.out.println("enter which operation do you want to Perform");
            System.out.println(" 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division\n 5.Exit");
            userinput = sc.nextInt();
            

            // System.out.println(Arrays.toString(nums));

            if (userinput == 5) {
                System.out.println("\nExiting...");
                return;
            }

            if (userinput<1 || userinput>5) {
                System.out.println("\nInvalid Value Please Enter Correct Value...");
                continue;
                
            }


            System.out.println("\non how many number you want to perform operation");
            int size = sc.nextInt();

            double [] nums = new double[size];
            System.out.println("Enter Numbers...");
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextDouble();
            }
            

            switch (userinput) {


                
                case 1:
                    System.out.println("\n............Addition............\n");
                    System.out.println("Result: "+Addition(nums)+"\n");
                    break;
                case 2:
                    System.out.println("\n............Substraction............\n");
                    System.out.println("Result: "+Substraction(nums)+"\n");
                    break;
                case 3:
                    System.out.println("\n............Multiplication............\n");
                    System.out.println("Result: "+Multiplication(nums)+"\n");
                    break;
                case 4:
                    System.out.println("\n............Division............\n");
                    System.out.println("Result: "+Division(nums)+"\n");
                    break;
                case 5:
                    System.out.println("\n............Exit............\n");
                    break;
            
            }
            
            
        }

       
    }
}
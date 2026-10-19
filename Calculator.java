////
/// 
/// 
/// 
/// 

import java.util.Scanner;



public class Calculator{
    public static void header(){
        System.out.println("=====Calculator=====");
    }

    public static double calculator(int num1, String opperation, int num2){
        if (opperation.equals("Addition")){
            int total = num1 + num2;
            return total;

        } else if (opperation.equals("Subtraction")){
            int total = num1 - num2;
            return total;
        } else if (opperation.equals("Division")){
            return (double) num1 / num2;
        
        }else if (opperation.equals("Multiplication")){
            int total = num1 * num2;
            return total;
        }else{
            return 0;
        }


    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
       

        

        // Start calculator  
        header();

        // ask for input


        double answer = 0;
        boolean useMemory = false;
        int count = 0;
        String recalculate = "yes";
        Double storedValue = null;
        while (recalculate.equals("yes")){


            int num1 = 0;
            int num2 = 0;
            
            
           
            System.out.println("Addition\nSubtraction\nDivision\nMultiplication\n");

            String opperation = input.nextLine();

            System.out.println("please enter the first number: ");
            num1 = Integer.parseInt(input.nextLine());
    

            System.out.println("Please enter second number: ");
            num2 = Integer.parseInt(input.nextLine());

            answer = calculator(num1, opperation, num2);
            System.out.println(answer);
       
            System.out.println("would you like to calculate again:(Yes-No)");
            recalculate = input.nextLine();
            count ++;

        }    
            
    System.out.println("=====Thanks for using Calculator=====");
    input.close();
    }   
} 
    
   
    


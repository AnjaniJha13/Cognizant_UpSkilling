import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        
        //even
        if(number % 2 == 0){
            System.out.println(number + " is an even number");
        }else{ //odd
            System.out.println(number + " is an odd number");
        }

        sc.close();
    }
    
}

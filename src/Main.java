import java.util.Scanner;

public class Main {
    static void subtractAndAdd(int number,int originalNumber, boolean isAdding){
        System.out.println(number);
        if(isAdding && number == originalNumber){
            // this condition helps us to stop adding when the original number reached, we did this with using an empty return
            // (it helps us ina way to end our function prematurely)
           return;
        }
        if(isAdding || number <=0){
            // recursive call
            subtractAndAdd(number + 5,originalNumber, true); // switch to adding pace
        }else{
            // until the conditions met we are doing a continuous recursive call ( with every cal number gets subtracted by 5)
            // same goes for above
            subtractAndAdd(number - 5,originalNumber,false); // subtracting phase
        }

    }
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter a number : ");
      int number = input.nextInt();
       subtractAndAdd(number,number,false); // Starting with subtracting phase
    }
}
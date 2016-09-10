/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class factorial  {
    public static void main(String args[]) {
        for (int counter = 0; counter <= 10; counter++){
            System.out.printf("%d! = %d\n", counter,
            factorial(counter));
        }
    }
    public static long factorial(long number) {
        if (number <= 1)
            return 1;
        else
            return number * factorial(number - 1);
    }
}

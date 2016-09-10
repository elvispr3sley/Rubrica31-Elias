/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */


    


public class seriefibunacci { 
public static long fib(int n) { 
if (n <= 1) return n; 
else return fib(n-1) + fib(n-2); 
} 

public static void main(String[] args) { 
int N = 25; 
for (int i = 1; i <= N; i++) 
System.out.println(i + ": " + fib(i)); 
} 

}

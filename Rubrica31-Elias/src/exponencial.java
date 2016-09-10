/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class exponencial{
 
	public static void main(String[] args) throws Exception{
 
		int resul = 1, base, exponente;
		short i;
 
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));	
		System.out.print("Ingrese base: ");
                base = Integer.parseInt(bf.readLine());
 
                System.out.print("Ingrese exponente: ");
                exponente = Integer.parseInt(bf.readLine());
 
        for(i=1; i<=exponente; i++){
 
        	resul = resul * base;
        }
 
        System.out.println("resultado: " +resul);
	}
}
 
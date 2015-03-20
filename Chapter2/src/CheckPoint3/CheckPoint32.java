/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CheckPoint3;

import java.util.Scanner;

/**
 *
 * @author Sima-Niaz
 */
public class CheckPoint32 {
    public static void main(String[] args){
        double payRate,hours,total;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your payrate: ");
        payRate = input.nextDouble();
        
        System.out.println("HOw many hours did you work? ");
        hours = input.nextDouble();
        
        total = hours * payRate;
        
        
        if (hours > 40){
          double subtotal = (hours-40) *  (payRate * 1.5);
          total = (40 * payRate) + subtotal;
            
        }
         
         System.out.println(total);
       
        
    
        
    
    }}

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
public class CheckPoint3 {
    public static void main(String[] args){
        int x =5;
        int y ;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Plese enter a value for y: ");
        y= keyboard.nextInt();
        
        if(y ==20){
            x = 0;
            
        }
        System.out.println(x);
    }
}

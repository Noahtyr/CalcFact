/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication66;

/**
 *
 * @author virk04
 */
public class Main {

    public static void main(String[] args) {

        calcfact(33);
        
    }

    public static int calcfact(int n) {
        int result;
       
        if (n == 1) {

            result = 1;

        } else {
            result = n * calcfact(n - 1);
        }
        System.out.println(result);
        return result;

    }
    
    
}

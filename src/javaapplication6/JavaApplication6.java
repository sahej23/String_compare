/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author BAGGAS
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = new String("hello");
        String s1 = new String("hi");
        System.out.println("for == "+(s==s1));
        System.out.println("for equals: "+s.equals(s1));
        System.out.println("for compareTo: "+s.compareTo(s1));
        System.out.println("for equalsIgnoreCase: "+s.equalsIgnoreCase(s1));
        
    }
    
}

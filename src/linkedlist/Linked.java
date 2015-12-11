/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author explo_000
 */
public class Linked {
    
    public static String data;
    
    public static Linked next;
    
    public Linked(String data) {
    
        this.data = data;
    
}
    
    public static void display() {
        
        
        System.out.println(data + " 1");
        
    }
    
    public String toString() {
    
    return data;
    
}
    
    public static void main(String args[]) {
        
         LinkList Links = new LinkList();
         
         Links.add("0");
         Links.add("1");
         Links.add("2");
         
         Links.display();
         
    }
    
}

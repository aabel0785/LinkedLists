package linkinglists;
import java.util.Scanner;

public class Link {
	
        public static boolean OneCh;
	public String input;
	public static int InZero;
	
	public Link next; 
	
	public Link(String input){
		
		this.input = input;
		
	}
	
	public void display(){
		
            if (OneCh == true) {
		System.out.print(input);
            } else {
                
                System.out.print(input + ", ");
                
            }
	}
	
	public String toString(){
		
		return input;
		
	}
	
	public static void main(String[] args) {
		
		LinkList1 theLinkedList = new LinkList1();
                Scanner sc = new Scanner(System.in);
		
		theLinkedList.insertFirstLink("Five");
                theLinkedList.insertFirstLink("Four");
		theLinkedList.insertFirstLink("Three");
		theLinkedList.insertFirstLink("Two");
		theLinkedList.insertFirstLink("One");
                
                String test = "One";
                
                theLinkedList.removeLink(test);
                
                boolean ExCh = false;
                while (ExCh == false) {
                theLinkedList.display();
                System.out.println("\n 1) Add \n 2) Remove Front \n "
                        + "3) Remove Last \n 4) Remove Specific \n 5) Exit");
                
                    try {
                        
                         InZero = sc.nextInt();
                         
                    }    
                    catch (Exception e) {
                     
                        System.out.println("ERROR: Illegal input");
                        
                    } finally {
                                  
                
                    if (InZero == 1) {
                        
                        System.out.println("What would you like to add?");
                            String InOne = sc.next();
                            
                        theLinkedList.insertFirstLink(InOne);
                        
                    } else if (InZero == 2) {
                        
                        theLinkedList.removeFirst();
                        
                    } else if (InZero == 3) {
                        
                        theLinkedList.removeLast();
                        
                    } else if (InZero == 4) {
                        
                        System.out.println("Which link would you like to remove?");
                            String InFour = sc.next();
                            
                            System.out.println(InFour);
                            
                            theLinkedList.removeLink(InFour);
                        
                    } else if (InZero == 5) {
                        
                        System.out.println("Goodbye");
                            ExCh = true;
                        
                    } else {
                        
                        System.out.println("ERROR: Invalid Input");                       
                        
                    }
                    
                    }
                
                }
		
		System.exit(0);
		
		
	}
	
}

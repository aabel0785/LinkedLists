package linkinglists;
import java.util.Scanner;

public class Link {
	
        public static boolean OneCh;
        static aLink aLink;
	public String input1;
        public int inInt;
	public static int InZero;
	public Link next; 
	
        public static class aLink {
            
            int place;
            String name;

        public aLink(int place, String name) {
            this.place = place;
            this.name = name;
        }
            
        }
        
        aLink Obj = new aLink(inInt, input1);
        
	public Link(aLink Obj){
		
                this.Obj = Obj;
				
	}
	
	public void display(){
		
            if (OneCh == true) {
                
		System.out.print(Obj.name + " " + Obj.place);
                
            } else {
                
                System.out.print(Obj.name + " " + Obj.place + ", ");
                
            }
	}
	
	public String toString(){
		
		return Obj.name;
		
	}
	
	public static void main(String[] args) {
		
		LinkList1 theLinkedList = new LinkList1();
                Scanner sc = new Scanner(System.in);
		
		theLinkedList.insertFirstLink(0, "Five");
                theLinkedList.insertFirstLink(0, "Four");
		theLinkedList.insertFirstLink(0, "Three");
		theLinkedList.insertFirstLink(0, "Two");
		theLinkedList.insertFirstLink(0, "One");
                
                                
                boolean ExCh = false;
                while (ExCh == false) {
                theLinkedList.display();
                System.out.println("\n 1) Add \n 2) Remove Front \n "
                        + "3) Remove Last \n 4) Remove Specific \n 5) Remove Index \n 6) Add Index \n 7) Exit");
                
                    try {
                        
                         InZero = sc.nextInt();
                         
                    }    
                    catch (Exception e) {
                     
                        System.out.println("ERROR: Illegal input");
                        
                    } finally {
                                  
                
                    if (InZero == 1) {
                        
                        System.out.println("What would you like to add?");
                            String InOne = sc.next();
                            
                        theLinkedList.insertFirstLink(0, InOne);
                        
                    } else if (InZero == 2) {
                        
                        theLinkedList.removeFirst();
                        
                    } else if (InZero == 3) {
                        
                        theLinkedList.removeLast();
                        
                    } else if (InZero == 4) {
                        
                        System.out.println("Which link would you like to remove?");
                            String InFour = sc.next();
                            
                            System.out.println(InFour);
                            
                            theLinkedList.removeLink(InFour);
                        
                    } else if (InZero == 7) {
                        
                        System.out.println("Goodbye");
                            ExCh = true;
                        
                    } else if (InZero == 5) {
                        
                        System.out.println("What index would you like to remove?");                    
                            int InFive = sc.nextInt();
                            
                        System.out.println(InFive);
                        
                        theLinkedList.removeIndex(InFive);
                        
                    } else if (InZero == 6) {
                        
                        System.out.println("What would you like to add?");
                            String InSixS = sc.next();
                            
                        System.out.println("At what index?");
                            int InSixI = sc.nextInt();
                            
                        theLinkedList.addIndex(InSixS, InSixI);
                        
                    } else {
                        
                         System.out.println("ERROR: Invalid Input");   
                        
                    }
                    
                    }
                
                }
		
		System.exit(0);
		
		
	}
	
}

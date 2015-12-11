/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Austin Abel
 */

  
    
    public class LinkList {
        
        public Linked firstLink;
        
        LinkList() {
            
            firstLink = null;
            
        }
        
        public boolean isNull() {
            
            return(firstLink == null);
            
        }
        
        public void add(String data) {
            
            Linked newLink = new Linked(data);
            
            newLink.next = firstLink;
            
            firstLink = newLink;
            
            System.out.println("I added " + firstLink);            
            
        }
        
        public Linked remove() {
            
            Linked LinkRef = firstLink;
            
            if(!isNull()) {
                
                firstLink = firstLink.next;
                
            } else {
                
                System.out.println("Empty Linked List");
                
            }
            
            return LinkRef;
            
        }
        
        public void display() {
            
            Linked theLink = firstLink;
		
		// Start at the reference stored in firstLink and
		// keep getting the references stored in next for
		// every Link until next returns null
		
		for(boolean i = false; i == false;){
			
                        if (theLink.next == null) {
                            
                            System.out.println("Next Link: " + theLink.next);
                            
                            i = true;
                            
                        } else {
                    
			theLink.display();
			
                        System.out.println(firstLink + " 2");
                        
                        System.out.println(theLink + " 3");
                        
			System.out.println("Next Link: " + theLink.next);
			
			theLink = theLink.next;
			
			System.out.println();
			
                        }
		}
        }
            
        public Linked search(String data) {
            
            Linked Temp = firstLink;
            
            if(!isNull()) {
                
                while (Linked.data != data) {
                    
                    if (Temp.next == null) {
                        
                        return null;
                        
                    } else {
                        
                        Temp = Temp.next;
                        
                    }
                    
                }
                
            } else {
                
                System.out.println("Empty Linked List");
                
            }
           
            return Temp;
            
        }
        
        public Linked removeSpec(String data) {
            
            Linked curLink = firstLink;
            Linked prvLink = firstLink;
            
            while (curLink.data != data) {
                
                if (curLink.next == null) {
                    
                    return null;
                    
                } else {
                    
                    prvLink = curLink;
                    curLink = curLink.next;
                    
                    
                }
                
            }
            
            if (curLink == firstLink) {
                
                firstLink = firstLink.next;
                
            } else {
                
                System.out.println("Found a Match");
                System.out.println("currentLink " + curLink);
                System.out.println("firstLink " + firstLink);
                
                prvLink.next = curLink.next;
                
            }
                      
            return curLink;
            
        }
        
    }

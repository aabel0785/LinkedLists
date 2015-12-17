package linkinglists;

import linkinglists.Link.*;


class LinkList1{
     
	public Link firstLink; 
	
	LinkList1(){
		
		
		firstLink = null;
		
	}
	
	public boolean isEmpty(){
		
		return(firstLink == null);
		
	}
	
	public void insertFirstLink(int inInt, String input){
            
                aLink Obj = new aLink(inInt, input);
            
		Link newLink = new Link(Obj);
                
                Link Temp = new Link(Obj);
                
                System.out.println(newLink.next + " " + firstLink + " " + newLink);

                newLink.next = firstLink;
		
		firstLink = newLink;
                
                System.out.println(newLink.next + " " + firstLink + " " + newLink);
                
                while (newLink.next != null) {
                
                    newLink.next.Obj.place += 1;
                    
                    newLink = newLink.next;

                }
                
	}
	
	public Link removeFirst(){
		
		Link linkReference = firstLink;
		
		if(!isEmpty()){
		
			firstLink = firstLink.next;
		
		} else {
			
			System.out.println("Empty LinkedList");
			
		}
                
                while (linkReference.next != null) {
                
                    linkReference.next.Obj.place -= 1;
                    
                    linkReference = linkReference.next;

                }
		
		return linkReference;
		
	}
	
	public void display(){
		
		Link theLink = firstLink;
		
		while(theLink != null){
			
                        if (theLink.next == null) {
                            
                            Link.OneCh = true;
                            
                        } else {
                            
                            Link.OneCh = false;
                            
                        }
                    
			theLink.display();
			
			theLink = theLink.next;

			
		}
		
	}
	
	public Link find(String bookName){
		
		Link theLink = firstLink;
		
		if(!isEmpty()){
		
			while(theLink.Obj.name != bookName){
			
				if(theLink.next == null){
					return null;
				
				} else {
				
					theLink = theLink.next;
				
				}
			
			}
			
		} else {
			
			System.out.println("Empty LinkedList");
			
		}
		
		return theLink;
		
	}
	
	public Link removeLink(String bookName){
		
		Link currentLink = firstLink;
		Link previousLink = firstLink;
		                
		while(currentLink.Obj.name != bookName){
			
			if(currentLink.next == null){

				
				return null; 
				
			} else {

				
				previousLink = currentLink; 
				
				currentLink = currentLink.next;
				
			}
			
		}
		
		if(currentLink == firstLink){
			
			firstLink = firstLink.next;
			
		} else {
			
			previousLink.next = currentLink.next;
			
		}
		
		return currentLink;
		
	}
        
        
        public Link removeLast() {
            		
                Link currentLink = firstLink;
		Link previousLink = firstLink;
            
		while(currentLink.next != null){
			
			previousLink = currentLink; 
				
                        currentLink = currentLink.next;
			
		}
		
                
                if(currentLink == firstLink){
			
			firstLink = firstLink.next;
			
		} else if (currentLink.next == null) {
			
			previousLink.next = currentLink.next;
			
		}
                
		return currentLink;
            
        }
        
        public Link removeIndex(int index) {
            
                Link linkReference = firstLink;
                Link currentLink = firstLink;
		Link previousLink = firstLink;
		               
		while(currentLink.Obj.place != index){
			
			if(currentLink.next == null){

				
				return null; 
				
			} else {

				
				previousLink = currentLink; 
				
				currentLink = currentLink.next;
				
			}
			
		}
		
		if(currentLink == firstLink){
			
			firstLink = firstLink.next;
			
		} else {
			
			previousLink.next = currentLink.next;
			
		}
                
                linkReference.Obj.place = 0;
                
                while (linkReference.next != null) {
                
                    linkReference.next.Obj.place = linkReference.Obj.place + 1;
                    
                    linkReference = linkReference.next;

                }
		
		return currentLink;
		
        }
        
        public Link addIndex (String addition, int index) {
            
                aLink Obj = new aLink(index, addition);
            
                Link linkReference = firstLink;
                Link currentLink = firstLink;
		Link previousLink = firstLink;
		              
                Link newLink = new Link(Obj);
                
                Link Temp = new Link(Obj);
                
		
                
		while(currentLink.Obj.place != index){
			
			if(currentLink.next == null){

				
				return null; 
				
			} else {

				
				previousLink = currentLink; 
				
				currentLink = currentLink.next;
				
			}
			
		}
		
                    System.out.println(newLink.next + " " + currentLink + " " + newLink);
			
			newLink.next = currentLink;
		
                        currentLink = newLink;
			
                        System.out.println(newLink.next + " " + currentLink + " " + newLink);

		
                
                linkReference.Obj.place = 0;
                
                while (linkReference.next != null) {
                
                    linkReference.next.Obj.place = linkReference.Obj.place + 1;
                    
                    linkReference = linkReference.next;

                }
		
		return currentLink;            
            
        }
	
}

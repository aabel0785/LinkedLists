package linkinglists;


class LinkList1{
	
	
	public Link firstLink; 
	
	LinkList1(){
		
		
		firstLink = null;
		
	}
	
	public boolean isEmpty(){
		
		return(firstLink == null);
		
	}
	
	public void insertFirstLink(String input){
		
		Link newLink = new Link(input);
                
		newLink.next = firstLink;
		
		firstLink = newLink;
		
	}
	
	public Link removeFirst(){
		
		Link linkReference = firstLink;
		
		if(!isEmpty()){
		
			firstLink = firstLink.next;
		
		} else {
			
			System.out.println("Empty LinkedList");
			
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
		
			while(theLink.input != bookName){
			
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
		
                System.out.println(currentLink + " " + previousLink + " " + firstLink);
                
		while(currentLink.input != bookName){
			
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
	
}

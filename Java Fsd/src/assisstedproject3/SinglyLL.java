package assisstedproject3;

public class SinglyLL {
	 
	      
	    class Node{  
	        int data;  
	        Node next;  
	          
	        public Node(int data) {  
	            this.data = data;  
	            this.next = null;  
	        }  
	    }  
	   
	    
	    public Node head = null;  
	    public Node tail = null;  
	      
	   
	    public void addNode(int data) {  
	       
	        Node newNode = new Node(data);  
	          
	      
	        if(head == null) {  
	            
	            head = newNode;  
	            tail = newNode;  
	        }  
	        else {  
	            
	            tail.next = newNode;  
	          
	            tail = newNode;  
	        }  
	    }  
	      
	    
	    public void deleteFromStart() {  
	          
	        
	        if(head == null) {  
	            System.out.println("List is empty");  
	            return;  
	        }  
	        else {  
	        	    if(head != tail) { 
	                head = head.next;  
	        }
	                else{  
	                head = tail = null;  
	            }  
	        }  
	    }
	          
	   
	    public void display() {  
	        Node current = head;  
	        if(head == null) {  
	            System.out.println("List is empty");  
	            return;  
	        }  
	        while(current != null) {  
	            
	            System.out.print(current.data + " ");  
	            current = current.next;  
	        }  
	        System.out.println();  
	    }  
	      
	    public static void main(String[] args) {  
	          
	    	SinglyLL sList = new SinglyLL();  
	          
	      
	        sList.addNode(10);  
	        sList.addNode(40);  
	        sList.addNode(30);  
	        sList.addNode(20);  
	          
	       
	        System.out.println("Original List: ");  
	        sList.display();  
	          
	        while(sList.head != null) {  
	            sList.deleteFromStart();  
	            
	            System.out.println("Updated List: ");  
	            sList.display();  
	        }  
	    }  
	}  
	

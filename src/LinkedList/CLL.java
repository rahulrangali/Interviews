package LinkedList;
import java.util.LinkedList;

public class CLL {
	
	@SuppressWarnings("unchecked")
	public void insert(LinkedList head, int value){
		
		@SuppressWarnings("rawtypes")
		LinkedList temp = new LinkedList(value);
		
		if(head == null){
			temp.next = temp;
			head = temp;
			return head;
		}
		else if(head.next == head){
			head.next = temp;
			temp.next = head;
			if(value <= head.data){
				head = temp;
			}
			return head;
		}
		else if(value <= head.data){
			LLN current = head;
			while(current.next != head){
				current = current.next;
			}
			current.next = temp;
			temp.next = head;
			return head;
		}
		else{
			LLN current = head;
			while(current.next != head || current.next.data <= value ){
				current = current.next;
			}
			temp.next = current.next;
			current.next = temp;
			return head;
		
		}
		
		
	}

}

package Linked_list;

class  QueueEmptyException extends Exception{
    
}

public class Queue_adapter<T> {
    
    
    private Node<T>front;
	private Node<T>rear;
	private int size;

	public Queue_adapter() {
        front=null;
		rear=null;
		size=0;

	}

	public void enqueue(T data) {
        Node<T>newnode=new Node(data);
		
		if(front==null||rear==null) {
			front=newnode;
			rear=newnode;
			
		}
		rear.next=newnode;
		rear=rear.next;
		size++;

	}

	public int size() {
        return size;

	}

	public boolean isEmpty() {
        if(front==null) {
			return true;
		}
		else {
			return false;
		}

	}

	public T dequeue() throws QueueEmptyException {
        if(front==null) {
			throw  new QueueEmptyException();
		}
		size--;
		T temp=front.data;
		front=front.next;
		return temp;
		

	}

	public T front() throws QueueEmptyException {
         if(front==null) {
			throw  new QueueEmptyException();
		}
        return front.data;

	}
}

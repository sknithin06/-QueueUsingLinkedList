package bridgelabz;
public class QueueLinkedList {
	private QNode front, rear;
	private int currentSize;
	class QNode {
	    int num;
	    QNode next;
	}
	public QueueLinkedList() {
		QNode front = null;
		QNode rear = null;
		int currentSize = 0;
	}
	public boolean isEmpty() {
		return (currentSize == 0);
	}
	public void  enqueue(int num) {
		QNode oldRear = rear;
		rear = new QNode();
		rear.num = num;
		rear.next = null;
		 if (isEmpty()) {
			 front = rear;
		 }
		 else {
			 oldRear.next = rear;
		 }
		 currentSize++;
		 System.out.println(num+ " added to the queue");
	}    
	public int dequeue(){
		 int num = front.num;
		 front = front.next;
		 if (isEmpty()) {
			 rear = null;
		 }
		 currentSize--;
		 System.out.println(num+ " removed from the queue");
		 return num;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Queue Problems");
		
		QueueLinkedList list =new QueueLinkedList();
		list.enqueue(56);
		list.enqueue(30);
		list.enqueue(70);
		
		list.dequeue();
		list.dequeue();
		list.dequeue();
	}
}

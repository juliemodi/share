
public class Runner {

	public static void main(String[] args) {
		
//		LinkedList list = new LinkedList();
//		list.insert(7);
//		list.insert(9);
//		list.insert(3);
//		
//		list.insertAtStart(23);
//		list.insertAt(2, 67);
//		
//		list.deleteAt(3);
//		list.show();
		
		Stack nums = new Stack();
		nums.push(6);
		nums.push(7);
		nums.push(9);
		nums.push(13);
		
		nums.pop();
		System.out.println(nums.peek());
		
		nums.show();
	}

}

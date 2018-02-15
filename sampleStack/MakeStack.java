class MakeStack {
	public static void main(String[] args) {
		Stack s1 = new Stack();
		
		s1.push(78);
		s1.push(57);
		s1.push(47);
		s1.displayStack();
		System.out.println("Poping one element from stack. Now Stack is :");
		s1.pop();
		s1.displayStack();
	}
}
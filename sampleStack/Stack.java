class Stack {
	int stck[] = new int[10];
	int tos;
	
	Stack() {
		tos = -1;
	}
	
	//PUSH
	void push(int item) {
		if(tos==9) {
			System.out.println("Stack is full");
		} else {
			++tos;
			stck[tos] = item;
		}
	}
	
	//POP
	int pop() {
		if(tos < 0) {
			System.out.println("Stack is empty");
			return 0;
		} else {			
			return stck[tos--];
		}
	}
	
	void displayStack() {
		int indx = tos;
		if(indx == -1) {
			System.out.println("Stack is empty!");
		} else {
			while (indx > -1) {
				System.out.println(stck[indx]);
				--indx;
			}
		}
	}
}
import java.util.ArrayList;

class Stack<T>{
	private ArrayList arr;
	public Stack(){
		arr = new ArrayList();
	}
	public <T> Stack(T input){
		arr = new ArrayList();
		arr.add(input);
	}

	public <T> void push(T input){
		arr.add(input);
	}

	public Object pop(){
		return arr.remove(arr.size() -1);
	}

	public Boolean isEmpty(){
		return arr.isEmpty();
	}
}

public class balanceChecker{
	Stack s;
	String str;

	balanceChecker(String str){
		s = Stack();
		for(String line : str){
			s.push(line);
		}
	}

	public Boolean check(String pair){
		String leftside = pair.split()[0];
		String rightside = pair.split()[1];
		Boolean left_side_found = false;
		while(!s.isEmpty()){
			String line = s.pop();
			if( line.contains(leftside) ){
				left_side_found = true;
			}
		}
		
	}	
}
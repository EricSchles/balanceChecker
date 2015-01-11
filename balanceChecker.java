import java.util.ArrayList;

class Stack{
	private ArrayList arr;
	public Stack(){
		arr = new ArrayList();
	}
	public Stack(String input){
		arr = new ArrayList();
		arr.add(input);
	}

	public void push(String input){
		arr.add(input);
	}

	public String pop(){
		return arr.remove(arr.size() -1).toString();
	}

	public Boolean isEmpty(){
		return arr.isEmpty();
	}
}

public class balanceChecker{
	Stack s;
	String str;

	balanceChecker(String str){
		s = new Stack();
		String[] arr = str.split("\n");
		for(String line : arr){
			s.push(line);
		}
	}

	public Boolean check(String closure){
		String[] pair = closure.split("");
		String leftside = pair[0];
		String rightside = pair[1];
		Boolean left_side_found = false;
		Boolean balanced = true;
		while(!s.isEmpty()){
			String line = s.pop();
			
			if( !left_side_found){
				if(line.contains(rightside)){
					return false;
					//this means we found a right side before a left side
				}
			}

			if( line.contains(leftside) ){
				left_side_found = true;
				balanced = false;
			}

			if(left_side_found){
				if(line.contains(rightside)){
					balanced = true;
					left_side_found = false;
				}
			}
		}
		return balanced;	
	}	
}
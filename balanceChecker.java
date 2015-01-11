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

	public Boolean check(String pairs){
		pairs.split(pairs);
	}
}
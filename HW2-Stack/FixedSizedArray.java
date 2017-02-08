/*
   @author Shiying Li

*/


public final class FixedSizedArray<T> implements StackInterface <T>{
	private T[] stack;
	private int topIndex;
	private boolean initialized = false;
	private static final int maxSize = 10;
	private T newEntry;
	
	public FixedSizedArray(){
		this(maxSize);
	}
	
	public FixedSizedArray(int initialCapacity){
		checkCapacity(initialCapacity);
		
		@SuppressWarnings("unchecked")
		T[]tempStack = (T[])new Object[initialCapacity]);
		stack = tempStack;
		topIndex = -1;
		initialized = true;
		
	}
	private void checkCapacity(int initialCapacity) {
		// TODO Auto-generated method stub
		
	}

	public void push(T newEntry){
		checkInitialization();
		
		stack [topIndex + 1] = newEntry;
		topIndex++;
	}
	

	public T peek(){
		checkInitialization();
		if(isEmpty())
			throw new EmptyStackException();
		else 
			return stack[topIndex];
	}

	private void checkInitialization(){
		if(!initialized){
			throw new SecurityException("Stack object is not initialized properly.");
		}
	}
	
	public boolean isEmpty(){
		return topIndex < 0;
	}
	
	public void clear(){
		while(!isEmpty())
			remove();
	}
	
	private void EmptyStackException(){
		if(isEmpty()){
			throw new SecurityException("Stack is empty.");
		}
	}
	
	public void push(T newEntry){
		checkInitialization();
		stack.add(newEntry);
	}
	
	public T peek(){
		checkInitialization();
		if(isEmpty())
			throw new EmptyStackException();
		else 
			return stack.lastElement();
	}
	
	public T pop(){
		checkInitialization();
		if (isEmpty())
			throw new EmptyStackException();
		else
			return stack.remove(stack.size()-1);
	}
	
	public boolean isEmpty(){
		return stack.isEmpty();
	}
	public void clear(){
		stack.clear();
	}
}

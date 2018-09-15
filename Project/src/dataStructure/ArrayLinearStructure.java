package dataStructure;

import java.lang.reflect.Array;

import TDA.iHash;

public class ArrayLinearStructure<T> implements iHash<T> {

	T[] array;
	private boolean hashFunctionOne;

	@SuppressWarnings("unchecked")
	public ArrayLinearStructure(Class<T> c, int length, boolean a) {
		array = (T[]) Array.newInstance(c, length);
		hashFunctionOne = a;
	}
	

	public T[] getArray() {
		return (T[]) array;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int length() {
		return array.length;
	}

	@Override
	public void tableInsert(Node<T> newNode) {
		// TODO Auto-generated method stub

	}

	@Override
	public void tableDelete(int Key) {
		// TODO Auto-generated method stub

	}

	@Override
	public Node<T> tableRetrieve() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashFunction() {
		
		if(hashFunctionOne) {
			
		}
		else {
			
		}
		
		
		return 0;
		
	}

}

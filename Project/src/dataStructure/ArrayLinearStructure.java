package dataStructure;

import java.lang.reflect.Array;

import TDA.iHash;
import model.Player;

public class ArrayLinearStructure<T> implements iHash<T> {

	T[] array;

	@SuppressWarnings("unchecked")
	public ArrayLinearStructure(Class<T> c, int length) {
		array = (T[]) Array.newInstance(c, length);
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
	public int hashFunction(int key) {
		return key % length();
		
	}
	
	public void alberto() {
		
	}
	
	//ALBERTO ES UNA LOCA

}

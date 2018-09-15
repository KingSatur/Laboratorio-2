package dataStructure;

import java.lang.reflect.Array;

import TDA.iHash;

public class ArrayLinearStructure<T> implements iHash<T> {

	T[] array;

	@SuppressWarnings("unchecked")
	public ArrayLinearStructure(Class<T> c, int slot) {
		array = (T[]) Array.newInstance(c, slot);
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
		// TODO Auto-generated method stub
		return 0;
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
	public int hashFunctionOne() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int hashFunctionTwo() {
		// TODO Auto-generated method stub
		return 0;
	}

}

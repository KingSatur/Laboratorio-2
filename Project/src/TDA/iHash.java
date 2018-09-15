package TDA;

import dataStructure.Node;

public interface iHash<T> {

	public boolean isEmpty();

	public int length();

	public void tableInsert(Node<T> newNode);

	public void tableDelete(int Key);

	public Node<T> tableRetrieve();

	public int hashFunction();


}

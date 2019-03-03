package llPositionalList;

import java.util.NoSuchElementException;

import interfaces.Position;
import interfaces.PositionalList;

public class PLElementsBackwardIterator<E>  {
	
	PLIteratorL2F<E> iter;
	PositionalList<E> list; 
	E current, recent;

	public PLElementsBackwardIterator(PositionalList<E> list) {
		this.list = list; 
		current = list.last().getElement(); 
		recent = null;
		iter= new PLIteratorL2F<E>(list);
		
	}
	public boolean hasNext() {
		return current != null;
	}
	
	public E next() throws NoSuchElementException {
		return iter.next().getElement();

	}
	public void remove() throws IllegalStateException { 
		if (recent == null)
			throw new IllegalStateException("Invalid state to apply remove."); 
		//list.remove(recent); 
		recent = null; 
	}

}

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class MyArrayList<E> extends ArrayList<E>{

	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		return super.add(e);
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		super.add(index, element);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return super.addAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return super.addAll(index, c);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		//super.clear();
		
		try {
			System.out.println("\nUnsuported operation\n");
			throw new MyException();
		} catch (MyException e) {
			// TODO Auto-generated catch block
		}
		
	}

	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return super.contains(o);
	}

	@Override
	public void ensureCapacity(int minCapacity) {
		// TODO Auto-generated method stub
		super.ensureCapacity(minCapacity);
	}

	@Override
	public void forEach(Consumer<? super E> action) {
		// TODO Auto-generated method stub
		super.forEach(action);
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return super.get(index);
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return super.indexOf(o);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return super.isEmpty();
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return super.iterator();
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return super.lastIndexOf(o);
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return super.listIterator();
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return super.listIterator(index);
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		// return super.remove(index);
		try {
			System.out.println("\nUnsuported operation");
			throw new MyException();
		} catch (MyException e) {
			// TODO Auto-generated catch block
		}
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
//		return super.remove(o);
		
		try {
			System.out.println("\nUnsuported operation");
			throw new MyException();
		} catch (MyException e) {
			// TODO Auto-generated catch block
		}
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		// return super.removeAll(c);
		
		try {
			System.out.println("\nUnsuported operation");
			throw new MyException();
		} catch (MyException e) {
			// TODO Auto-generated catch block
		}
		return false;
	}

	@Override
	public boolean removeIf(Predicate<? super E> filter) {
		// TODO Auto-generated method stub
		return super.removeIf(filter);
	}

	@Override
	protected void removeRange(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		super.removeRange(fromIndex, toIndex);
	}

	@Override
	public void replaceAll(UnaryOperator<E> operator) {
		// TODO Auto-generated method stub
		super.replaceAll(operator);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return super.retainAll(c);
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return super.set(index, element);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return super.size();
	}

	@Override
	public void sort(Comparator<? super E> c) {
		// TODO Auto-generated method stub
		super.sort(c);
	}

	@Override
	public Spliterator<E> spliterator() {
		// TODO Auto-generated method stub
		return super.spliterator();
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return super.subList(fromIndex, toIndex);
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return super.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return super.toArray(a);
	}

	@Override
	public void trimToSize() {
		// TODO Auto-generated method stub
		super.trimToSize();
	}

}

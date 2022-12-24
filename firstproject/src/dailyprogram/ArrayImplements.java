package dailyprogram;

import java.util.Iterator;

public class ArrayImplements {

	private Object[] myArray;
	private int position = 0;

	public ArrayImplements(int size) {
		this.myArray = new Object[size];
	}

	public void addElements(Object obj) {
		if (this.position >= this.size()) {
			grow();
		}

		this.myArray[position] = obj;
		position++;
	}

	private Object[] grow() {
		Object[] temp = this.myArray;
		this.myArray = new Object[this.size() * 2];
		for (int i = 0; i < temp.length; i++) {
			this.myArray[i] = temp[i];
		}
		return this.myArray;
	}

	public int size() {

		return this.myArray.length;
	}

	public Object getElements(int index) {
		return this.myArray[index];
	}

	public void getAllElements() {
		for (Object item : myArray) {
			System.out.println(item + " ");
		}
	}

	private class Iku implements Iterator {
		int temp;

		@Override
		public boolean hasNext() {
			if (temp < position) {
				return true;
			} else {
				return false;
			}

		}

		@Override
		public Object next() {

			return myArray[temp++];
		}

	}

	public Iterator iterator() {
		
		return new Iku();
	}

}

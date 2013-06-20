package com.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
	MenuItem[] list;
	int position = 0;

	public DinerMenuIterator(MenuItem[] list) {
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		return position >= list.length || list[position] == null ? false : true;
	}

	@Override
	public Object next() {
		return list[position++];
	}

	@Override
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException(
					"You can't remove an item until you've done at least one next()");
		} else if (list[position - 1] != null) {
			int i = position - 1;
			for (; i < list.length - 1; i++) {
				list[i] = list[i + 1];
			}
			list[i] = null;
		}
	}

}

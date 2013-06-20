package com.iteratorInterface;

import com.compsite.MenuItem;

public class DinerMenuIterator implements Iterator {
	MenuItem[] items;
	int position = 0;

	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		return position >= items.length || items[position] == null ? false
				: true;
	}

	@Override
	public Object next() {
		return items[position++];
	}

}

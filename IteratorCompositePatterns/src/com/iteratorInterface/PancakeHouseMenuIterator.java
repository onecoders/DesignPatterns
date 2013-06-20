package com.iteratorInterface;

import java.util.ArrayList;

import com.compsite.MenuItem;

public class PancakeHouseMenuIterator implements Iterator {

	ArrayList<MenuItem> items;
	int position = 0;

	public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		return position >= items.size() ? false : true;
	}

	@Override
	public Object next() {
		return items.get(position++);
	}

}

package com.collection.common;

import java.util.Comparator;

public class PersonDecending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Person p1 = (Person)o1;
		Person p2 = (Person)o2;
		return p2.getName().compareTo(p1.getName());
	}
	
}

package com.te.collection.conversion;

import java.util.ArrayList;
import java.util.List;

public class CollectionToArray {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(4);
		list.add(2);

		Integer arr[] = new Integer[list.size()];

		list.toArray(arr);
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

	}

}

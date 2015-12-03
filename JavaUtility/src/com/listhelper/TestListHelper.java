package com.listhelper;

public class TestListHelper {

	public static void main(String[] args) {
		ListHelper helper = new ListHelper();
		 helper.setValue("0");
		Boolean isExist=helper.containList(0);
		assert !isExist;
	}
}

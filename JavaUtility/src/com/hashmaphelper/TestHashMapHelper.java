package com.hashmaphelper;

public class TestHashMapHelper {

	public static void main(String[] args) {
		HashMapHelper helper = new HashMapHelper();
		
		helper.setKeyValueRelation(1,"a");
		String value= helper.getValueFromKey(1);		
		Boolean isExist=helper.containsKey(1);
		
		assert value.equals("a");
		assert isExist;
	}

}

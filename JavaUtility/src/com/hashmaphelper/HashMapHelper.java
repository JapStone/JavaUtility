package com.hashmaphelper;

import java.util.HashMap;
import java.util.Map;

public class HashMapHelper {

	private HashMap<Integer,String> hashMap = new HashMap();
	
	public void setKeyValueRelation(Integer key,String value){
		hashMap.put(key, value);
	}
	
	public String getValueFromKey(Integer key){
		return hashMap.get(key);
	}
	
	public Boolean containsKey(Integer key){
		return hashMap.containsKey(key);		
	}
}

package com.mapBasic;

import java.util.HashMap;

public class MapBasic {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<>();
		
		
		map.put(101, "Suraj");
		map.put(101, "Sss");
		map.put(102, "dhiraj");
		map.put(103, "dd");
		map.put(null, null);
		
		System.out.print(map);
		
	}

}

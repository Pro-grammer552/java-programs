package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Extract {

	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("A+2");
		arr.add("B+12");
		arr.add("D+4");
		arr.add("DD+4");

		System.out.println(arr);
		Map<String, String> ans = new HashMap<String, String>();
		for (int i = 0; i < arr.size(); i++) {
			String s = arr.get(i);
			String k = "";
			String v = "";

			for (int j = 0; j < s.length(); j++) {
				char ch = s.charAt(j);

				if (ch>='A' && ch<='Z') {
					k += ch; 
				}
				if (ch>='0' && ch<='9') {
					v += ch; 
				}
			}
			ans.put(k, v);
		}
		System.out.println(ans);
	}

}

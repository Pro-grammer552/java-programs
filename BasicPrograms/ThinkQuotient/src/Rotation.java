import java.util.ArrayList;
import java.util.HashSet;

/*
 * Create a left rotation and a right rotation function that
 *  returns all the left rotations and right rotations of a string.
Examples
leftRotations("abc") ➞ ["abc", "bca", "cab"]
rightRotations("abc") ➞ ["abc", "cab", "bca"]
leftRotations("abcdef") 
➞ ["abcdef", "bcdefa", "cdefab", "defabc", "efabcd", "fabcde"]
rightRotations("abcdef") 
➞ ["abcdef", "fabcde", "efabcd", "defabc", "cdefab", "bcdefa"]
 */

public class Rotation {
//Right rotation
	public static void main(String[] args) {

//		String a = "abc";
//		ArrayList<String> b = new ArrayList<String>();
//		int length = a.length();
//
//		for (int i = 0; i < length; i++) {
//			//String res = a.substring(length - i) + a.substring(0, length - i);
//			 String res = a.substring(i) + a.substring(0, i);
//			// 0 abc
//			// c ab
//			// b ca
//
//			b.add(res);
//		}
//		System.out.println(b.toString());
//
//		System.out.println("--------------");
//
//		// System.out.println(b);
//	}
//
//}
		//leftRotations("abc") ➞ ["abc", "bca", "cab"]
		
		
		//rightRotations("abc") ➞ ["abc", "cab", "bca"]
		
		
		
		String a = "abc";
		ArrayList<String> b = new ArrayList<String>();
		int length = a.length();

		for (int i = 0; i < length; i++) {
			StringBuilder res = new StringBuilder(length);

			for (int j = i; j < length; j++) {
				res.append(a.charAt(j));
			}

			for (int j = 0; j < i; j++) {
				res.append(a.charAt(j));
			}

			b.add(res.toString());
			System.out.println(b.toString());
		}

	}
}

/*
 
Create a function that takes a string and returns the reversed string.
 However there's a
 few rules to follow in order to make the challenge interesting:
The UPPERCASE/lowercase positions must be kept in the same
 order as the original string (see example #1 and #2).
Spaces must be kept in the same order as the original string (see example #3).

Examples
specialReverseString("Edabit") ➞ "Tibade"
specialReverseString("UPPER lower") ➞ "REWOL reppu"
specialReverseString("1 23 456") ➞ "6 54 321"
					 10230456->60540321
 */

public class jisaCompany {

	public static void main(String[] args) {
		String word = "Edabit";
		//String word=s.next();
		int ln=word.length();
		
		char ch;

		for(int i=ln-1;i>=0;i--)
		{
			ch=word.charAt(i);
			if(i==ln-1 || i==0)
			{
				if(ch>='a' && ch<='z')
				{
					char res=Character.toUpperCase(ch);
					System.out.print(res);
				}
				if(ch>='A' && ch<='Z')
				{
					char res=(char)(ch+32);
					System.out.print(res);
				}
			}
			else
			{
				System.out.print(ch);
			}
			
		}


// String a = "UPPER lower";
//	        StringBuilder sb = new StringBuilder(a);
//	        sb.reverse();
//	        
//	        String ch1 = "";
//	        String ch2 = "";
//
//	        for (int i = 0; i < sb.length(); i++) {
//	            char ch = sb.charAt(i);
//
//	            if (ch == ' ') {
//	                ch1 += ' ';
//	            } else if (Character.isUpperCase(a.charAt(i))) {
//	                ch1 += Character.toUpperCase(ch);
//	            } else {
//	                ch2 += Character.toLowerCase(ch);
//	            }
//	        }
//
//	        String rev = ch1.concat(ch2);
//	        System.out.println(rev);

//	        String str = "1 23 456";
//	        StringBuilder sb = new StringBuilder();
//	        int a = 1;
//	        int c = 0;
//	        
//	        for (int i = str.length() - 1; i >= 0; i--) {
//	            if (str.charAt(i) != ' ') {
//	                sb.append(str.charAt(i));
//	                c++;
//	                
//	               
//	                if (c == a) {
//	                    sb.append(" ");
//	                    c = 0;
//	                    a++;
//	                }
//	            }
//	        }
//
//	      
//	       System.out.println(sb.toString());
	}
}
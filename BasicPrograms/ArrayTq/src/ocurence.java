
public class ocurence {

	public static void main(String[] args) {
		String s = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn't really happy.";
		String target = "happy";
		String lo=s.toLowerCase();
		String word[] = lo.split(" ");

		int count = 0;
		 for (int i = 0; i < word.length; i++) {
	            if (word[i].equalsIgnoreCase(target)) {
	                count++;
	            }
	        }

		System.out.println("Count" + count);

	}

}

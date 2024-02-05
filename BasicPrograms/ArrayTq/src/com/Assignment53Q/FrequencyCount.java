package com.Assignment53Q;

public class FrequencyCount {

	public static void main(String[] args) {
		int n[] = new int[] { 10, 20, 20, 40, 50, 50, 50 };

		int ne[] = new int[n.length];
		int i = 0;
		int j = i + 1;

		for (i = 0; i < n.length; i++) {
			int count = 1;
			if(n[i]==-1)
				continue;
			for (j = i + 1; j < n.length; j++) {
				if (n[i] == n[j]) {
					count++;
					n[j]=-1;
					ne[i] = n[i];
					
				}

			}
			System.out.println(n[i] + " " + count);
			//i += count - 1;
		}

	}
}

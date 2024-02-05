package com.Assignment53Q;

public class SecondLargest {

	public static void main(String[] args) {
		
//		
//			int []a={1,4,3,4,1,3,5,6,55,63,63,11};
//			int b[]=new int[a.length];
//			
//			int count;
//			for(int i=0;i<a.length;i++)
//			{
//				count=0;
//				for(int j=i+1;j<a.length;j++)
//				{
//					if(a[i]==a[j])
//					{
//						
//						count++;
//						b[i]=a[i];
//						break;
//					}
//					
//				}
//			//	System.out.println(a[i]+" "+count+" ");
//				if(count==0)
//				{
//					System.out.println(b[i]);
//				}
//			}
//		}
//}

		int n[] = new int[] { 10, 20, 30, 40, 50, 60, 70 };

		int ne[] = new int[n.length];
		int temp;

		for (int i = 0; i < n.length; i++) {

			for (int j = i + 1; j < n.length; j++) {

				if (n[i] < n[j]) { // 10<20

					temp = n[i];

					n[i] = n[j];

					n[j] = temp;

					ne[i] = n[j];

				}

			}

		}
		System.out.println(ne[0]);
	}

}

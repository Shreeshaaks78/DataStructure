package src;

import java.util.Scanner;

public class Min_Max {
	public static void main(String[]args) {
		Scanner ob=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter array size:");
		int size=ob.nextInt();
		for(int i=0;i<size;i++) {
			a[i]=ob.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+" ");
		}
		int max=a[0];
		int min=a[0];
		for(int i=1;i<size;i++) {
			if(a[i]<min) {
				min=a[i];
			}
			if (a[i] > max) {
                max = a[i]; // Update max if a larger element is found
            }
        }

        // Print the results
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
		
	}
}

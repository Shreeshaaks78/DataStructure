package src;

import java.util.Scanner;

public class Rotate_the_string {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int num[]=new int[20];
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.println(num[i]);
		}
		System.out.println("Enter the position to rotate:");
		int pos=sc.nextInt();
		for (int i = 0; i < pos; i++) {
            int temp = num[0];
            for (int j = 0; j < size - 1; j++) {
                num[j] = num[j + 1];
            }
            num[size - 1] = temp;
        }
		System.out.println("Rotated string");
		for(int i=0;i<size;i++) {
			System.out.print(num[i]);
		}
	}

}

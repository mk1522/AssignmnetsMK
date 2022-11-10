package basic;

import java.util.Arrays;
import java.util.Scanner;

public class a2 {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num of elements to check ");
		int n = sc.nextInt();
		
		int[] input = new int[n];
		System.out.println("enter  elements  ");
		for(int i=0;i<n;i++) {
		input[i] =sc.nextInt();
		
		}
		for(int i=0;i<n;i++) {
		System.out.print(" "+input[i]);
		}
		String[] NE= new String[n];
		String[] NO=new String[n];
		String[] PE=new String[n];
		String[] PO=new String[n];
		
		//---------------------------
		int l = 0,m=0;
		int k=0,j=0;
		for(int i=0;i<n;i++) {
			 
			if(input[i]<0) {
				
				if(input[i]%2==0) {
					NE[j]= Integer.toString(input[i]);
					j++;
					//System.out.println("Negative even numbers"+input[i]);
				}
				else 
					
					NO[k]= Integer.toString(input[i]);
					k++;
					//System.out.println("Negative odd numbers"+input[i]);
			}
			else if(input[i]>0) {
				
				if(input[i]%2==0) {
					PE[l]= Integer.toString(input[i]);
					l++;
					//System.out.println("positive even numbers"+input[i]);
				}
				else 
					PO[m]= Integer.toString(input[i]);
				m++;
					//System.out.println("positive odd numbers"+input[i]);
			}
			else 
				System.out.println("number is zero"+input[i]);
				
			}
				
			System.out.println("POSITIVE EVEN NUMBERS "+Arrays.toString(PE) );
			System.out.println("POSITIVE ODD NUMBERS "+Arrays.toString(PO)  );
			System.out.println("NGATIVE EVEN NUMBERS "+Arrays.toString(NE) );
			System.out.println("NGATIVE ODD NUMBERS "+Arrays.toString(NO) );
				
			}
		
		
	}
	



package edu.kh.array.practice.run.PracticeRun;
import java.util.Scanner;

public class PracticeService {
	Scanner sc = new Scanner(System.in);
	//=========================practice1
	public void practice1() {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int sum=0;
		
		for(int i=1; i<arr.length; i++) {
			
			System.out.print(arr[i]+" ");
			if(arr[i]%2==0) {
				sum+=arr[i];
				
			}
			
		}System.out.printf("\n짝수 번째 인덱스합: %d",sum);
		
		
	}
	
	//=========================practice2
	public void practice2() {
		int[] arr =new int[10];
		int sum=0;
		
		for(int i=1; i<arr.length; i++) {
			
			System.out.print(i+" ");
			if(i%3==0) {
				sum+=i;
				
			}
			
		}System.out.printf("\n짝수 번째 인덱스합: %d",sum);
	}
	
	//=========================practice3
	public void practice3() {
			
	}
	
	//=========================practice4
	public void practice4() {
		
	}
	
	//=========================practice5
	public void practice5() {
		
	}
	
	//=========================practice6
	public void practice6() {
		
	}
	
	//=========================practice7
	public void practice7() {
		
	}
}

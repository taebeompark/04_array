package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
	Scanner sc =new Scanner(System.in);
	/*배열(Array)
	 * 같은 자료형의 변수를 하나의 묶음으로 다루는것
	 * 묶여진 변수들은 하나의 배열명으로 불러지고
	 * 구분은 index를 이용한.(index는 0부터 시작하는 정수)
	 * 
	 * 
	 * */
	public void ex1() {
	
		//변수 vs 배열
		//변수선언
		int num;
		//stack 영역에 int 자료형을 저장 할수 있는 공간 4byte를 할당하고
		//그공간에 num이라는 이름부여
		
		//변수 대입
		num=10;
		
		//생선된 num 이라는 변수 공간에 10을 대입.
		
		//변수사용
		System.out.println("num에 저장된값: "+num);
		//num이 작성된자리에 num 에 저장된값을 읽어와서 출력
		
		
		//===========================================
		
		//배열의 선언
		int[] arr;
		//stack 영역에 int[](int배열) 자료형 공간을 4byte할당하고
		//그공간에 arr 이라는이름부여
		//**해당변수는 참조형으로 주소값만을 저장할 수있다
		
		//배열의 할당
		arr = new int[3];
		
		//new: "new연산자 "라고하며
		//heap메모리 영역에 새로운 공간(배열,객체)을 할당
		
		//int[3] : int자료형변수 3개를 하나의 묶음으로 나타내는 배열
		
		//new in[3]: heap영역에 int 3칸짜리 int[]을 생성(할당)
		//**생성된 int[]에는 시작 주소가 지정된다.
		
		//arr = new int[3];
		//int[]     int[]  --> 같은자료형 ===연산가능	
		
		//heap영역에 생성된 int[]의 시작주소를
		// stack영역에 생성된 arr 변수에 대입
		
		//arr 변수가 int[]을 참조하게됨
		//그래서 arr을 참조형이라고 함
		
		
		//배열요소의 값 대입
		//arr은 int[] 참조형 변수지만
		//arr[0]은 int 자료형 변수이기때문제 정수값을 대입할수있다/
		
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 1000;
		
		System.out.println("arr의 주소값:"+arr);
		
		//배열요소값읽어오기
		System.out.println(arr[0]);//arr이참조하고잇는 배열의 0번째 인덱스 값가져옴
		System.out.println(arr[1]);//arr이참조하고잇는 배열의 0번째 인덱스 값가져옴
		System.out.println(arr[2]);//arr이참조하고잇는 배열의 0번째 인덱스 값가져옴
		
	}
	
	public void ex2() {
		
		//배열 선언및 할당
		int[] arr =new int[4];

		arr[0]=100;
		arr[1]=200;
		arr[2]=500;
		arr[3]=1000;
		//배열의길이 (몇칸인가): 배열명.length
		System.out.println("배열의 길이: "+arr.length);
		
		
		//배열과 for문
		for(int i =0;i< arr.length;i++) {
			// 0 1 2 3
			System.out.printf("arr[%d]에 저장된값 : %d\n",i,arr[i]);
		}
		
	}
	public void ex3() {
		//5명의 키(cm)를 입력받고 평균 구하기
		//1번키 입력: 170.5
		//2번키 입력: 171.5
		//3번키 입력: 190.5
		//4번키 입력: 173.5
		//5번키 입력: 174.5
		
		//평균: ~cm
		double[] height = new double[5];
		//double[] 자료형 참조 변수 height를 stack 영역에 생성하고
		//height에 heap 영역에 새로 생성된 double 5칸짜리 double[]의 시작주소대입
		for (int i=0; i<height.length;i++) {
			System.out.print((i+1)+"번 키 입력:");//1 2 3  4 5
			height[i] =sc.nextDouble(); // 0 1 2 3 4
			//각 인덱스에 입력받은 값을 대입 (초기화)
			
		}
		System.out.println();
		double sum =0;
		for(int i =0; i<height.length; i++) {
			sum+=height[i];//배열에 저장된값을 sum에누적한다.
		}
		
		System.out.printf("\n 평균: %.2f\n",sum/height.length);
		
	}
	public void ex4() {
		//입력 받은 인원 수 만큼의 점수를 입력받아 배열에 저장
		//입력이 완료되면 점수,합계,평균,최고점,최저점 출력
		
		//ex)
		//입력 받을 인원수:4
		//1번 점수입력:100
		//2번 점수입력:80
		//3번 점수입력:50
		//4번 점수입력:60
		
		//합계: 290
		//평균: 72.5
		//최고점: 100
		//최저점: 50
		
		
	
		
		
		System.out.printf("입력받을 인원수:");
		int input = sc.nextInt();
		
		//배열선언및 할당
		//할당할 배열의 크기는 입력받은 크기만큼(input)
		int[] arr = new int[input];
		
		//합계 저장용변수
		int sum=0;
		for (int i=0; i<arr.length;i++) {
			System.out.print((i+1)+"번 점수 입력:");
			arr[i] =sc.nextInt(); 
			
	
		}
		
		for(int j=0; j<arr.length;j++) {
			
			sum+=arr[j];
		}
		System.out.println("합계 :"+sum);
		System.out.println("평균 :"+sum/(arr.length));
		
		//최저점/최고점 구하기
		int max =arr[0];
		int min =arr[0];
		
		//아래 for문을 이용해서 score 배열에 있는 모든값과max,min비교
		//arr[i]값이 max보다 크면 max대입
		//arr[i]값이 min보다 작으면 min대입
		for(int i=0;i<arr.length; i++) {
			if(arr[i]>max) {//최고점비교
				max =arr[i];
			}
			if(arr[i]<min) { //최저점비교
				min =arr[i];
			}
			
		}
		/*
		Math.max(max, i)
		Math.min(max, i)
		*/
		System.out.println("최고점:"+ max);
		System.out.println("최저점:"+ min);
		
	}
	
	
	public void ex5() {
		//배열 선언과 동시에 초기화
		char[] arr = new char[5];
		//char[] arr이 참조하는 배열요소에A,B,C,D,E대하기
		for(int i=0;i< arr.length;i++) {
			arr[i]=(char)('A'+i);
			//A==65
			//B=66
			//C==67
		}
		//Arrays 클래스
		//자바에서 제공하는 배열 과 관련된 기능을 모아둔 클래스
		int[] arr2= new int[4];
		//Arrays.toString(배열명): 모든 요소값을 출력
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		//배열선언과 동시에 (할당및)초기화
		char[] arr3 = {'A','B','C','D','E'};
		//{}(중괄호)는 배열의 리터럴 표기법
		System.out.println(Arrays.toString(arr3));
	}
	
	public void ex6() {
		
	}
	
}

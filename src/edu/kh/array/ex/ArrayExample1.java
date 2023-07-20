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
			//B==66
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
		//점심메뉴 뽑기 프로그램
		String[] arr = {"김밥","버거","백반","국밥","나물", "밥"};
		
		System.out.println("오늘 점심 메뉴:"+arr[(int)(Math.random()*6)]);
		//0.0 <=x <1.0						//-> 0 1 2 3 4 5
		//0.0 <=x*6 <6.0
		//0<(int)(x*6)<6
		
	}
	public void ex7() {
		//배열을 이용한 검색
		//입력받은 정수가 배열에 잇는지 없는지 확인
		//만약 잇다면 몇번 인덱스에 존재하는지 확인
		
		int[] arr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		System.out.print("정수 입력: ");
		int input=sc.nextInt();
		
		//신호를 나타내기 위한 변수
		//flag == false : 일치하는 값이 존재않음
		//flag == true : 일치하는 값이 존재
		
		boolean flag =false;//검사 전에는 없다고 가정
		//arr 배열 요소 순차접근(반복접근)
		for(int i=0;i < arr.length; i++) {
			if(arr[i]==input) {
				System.out.println(i+"번째 인덱스에 존재");
				
				flag = true;//일치하는 값이 있으므로 true변경
			}
		}
		//flag 상태를 검사
		if(!flag) {//flag==false
			System.out.println("존재하지않음");
		}
	}
	public void ex8() {
		//입력 받은 값과 일치 값이 있으면 인덱스 번호 출력
		//없으면"존재하지 않음"
		
		String[] arr= {"사과", "딸기", "바나나", "키위", "멜론", "아보카도"};
		System.out.print("과일입력:");
		String input = sc.next();
		
		boolean flag =false;
		for(int i=0;i < arr.length; i++) {
			if(arr[i].equals(input)) {//string비교시 equals()사용
				System.out.println(i+"번째 인덱스에 존재");
				
				flag = true;//일치하는 값이 있으므로 true변경
			}
		}
		
		if(!flag) {
			System.out.println("존재하지않음");
		}
	}
	public void ex9() {
		//1.문자열을 입력받아 한글자씩 잘라내어 char 배열에 순서대로 저장
		//2.문자 하나를 입력받아 일치하는 문자가 char배열에 몇개 존재하는지 확인
		//3. 단, 일치하는 문자가 없을경우 "존재하지 않습니다"출력
		
		//[사용 해야되는 기술,기능]
		//1)배열검색
		//2)String.length() : 문자열의 길이
		//ex) "Hello".length ->5
		
		//3) String.chaAt(index): 문자열에서 특정 index에 위치한 문자 하나를 얻어옴
		//ex) "Hello".charAt(1) -> 'e'
		//	   01234
		//4)count(숫자 세기)
		
		System.out.print("문자열 입력:");
		String input = sc.nextLine(); //한줄(띄어쓰기포함) 입력받기
		//1.문자열을 입력받아 한글자씩 잘라내어 char 배열에 순서대로 저장
		char[] arr = new char[input.length()];
		for(int i=0 ; i<arr.length; i++) {
		
			arr[i] =input.charAt(i);
			//arr[i]에 입력받은 문자열 중 i 번째 문자를 대입
			
		}
		System.out.println(Arrays.toString(arr));
		
		//2.문자 하나를 입력받아 일치하는 문자가 char배열에 몇개 존재하는지 확인
		System.out.println("검색할 문자 입력:");
		char ch = sc.next().charAt(0);
		
		int count = 0;//같은글자 개수를 세기위한변수
		for(int i=0; i< arr.length;i++) {
			if(arr[i]==ch){
				//arr[i]값과 검색할 문자가 ch가같은경우
				//=>카운트
				count++;
			}
		}
		
		//결과 출력
		
		if(count>0) {
			System.out.println(count+"개 있음");
			
		}else {
			
			//3. 단, 일치하는 문자가 없을경우 "존재하지 않습니다"출력
			System.out.println("존재하지 않음");
		}
		
	}
}

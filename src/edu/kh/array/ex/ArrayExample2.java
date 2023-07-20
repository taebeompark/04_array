package edu.kh.array.ex;

import java.util.Arrays;

public class ArrayExample2 {
	
		//얕은복사 (shallow)
		//-> 주소를 복사하여 서로가 다른 두 변수가
		//하나의 배열(또는객체)을 참조하는상태를 만드는 복사방법
		public void shallowCopy() {
			int[] arr = {1,2,3,4,5};	
			
			//얕은복사진행
			int[] copyArr = arr;//주소만 복사
			
			//배열값 변경
			System.out.println("변경전");
			System.out.println("arr:"+ Arrays.toString(arr));
			System.out.println("copyArr"+ Arrays.toString(copyArr));
			
			//얕은 복사한 배열의 값을 변경해보자
			copyArr[2]=999;
			System.out.println("변경후");
			System.out.println("arr:"+ Arrays.toString(arr));
			System.out.println("copyArr"+ Arrays.toString(copyArr));
			
		}
		public void shallowCopy1() {
			//깊은복사
			//같은 자료형의 새로운 배열을 만들어서
			//기존 배열의 데이터를 모두 복사하는법
			
		}
		public void deepCopy() {
			int[] arr= {1,2,3,4,5};//원본
			
			
		//1.for문을 이용한 깊은복사
			
			int[] copyArr1 =new int[arr.length];
			for(int i=0; i <arr.length; i++) {
				copyArr1[i] =arr[i];
			}
		//2. System.arraycopy(원본배열,원본복사 시작 인덱스,
		//						복사배열,복사할배열의 삽입 시작인덱스,복사길이);
			int[] copyArr2 = new int[arr.length];
			System.arraycopy(arr,0,copyArr2,0, arr.length);
			
			
			
		//3.복사할 배열 참조 변수 = Arrays.copyOf(원본배열,복사할길이);
			int[] copyArr3 = Arrays.copyOf(arr,arr.length);
			
		//값변경후 확인	
		copyArr1[4] =0;	
		copyArr2[4] =999;	
		copyArr3[4] =5000;	
			
			System.out.println("arr:"+Arrays.toString(arr));
			System.out.println("copyArr1:"+Arrays.toString(copyArr1));
			System.out.println("copyArr2:"+Arrays.toString(copyArr2));
			System.out.println("copyArr3:"+Arrays.toString(copyArr3));
			
		
		}
		//배열을 이용한 중복 데이터 제거+정렬
		public void createLottoNumber() {
			//1. 1~45 사이 중복되지않는 난수 6개 생성
			//2.생성된 난수가 오름차 순으로 정렬
			
			//1) 정수6개를 저장할 배열 선언및할당
			int[] lotto = new int[6];
			//2)생성된 배열을 처음부터 끝까지 순차 접근하는 for문작성
			for(int i=0; i<lotto.length;i++) {
				//3)1~45사이 난수생성
				int random =(int)(Math.random()*45+1);
				//0.0 <=x <1.0
				//0.0 <=x * 45 <45.0
				//1.0 <=x*45+1<46.0
				//1 <=- (int)(x*45+1)<46
				//1~45
				
				//4)생성된 난수를 순서대로 배열요소에 삽입
				lotto[i]=random;
				
			
				//5)중복검사를 위한 for문작성
				for(int x=0; x< i; x++) {
					
				//6)현재 생성된 난수와 같은수가
				//앞쪽 요소에 있는지검사
					if(random == lotto[x]) {
						i--;
						// i가 1씩 증가할때마다 난수가 하나 생성된다.
						//->중복값이 있으므로 난수를 새로 하나 더 생성해야된다
						//-->i는 기본적으러 0~5 까지 6회 반복되지만
						//i값을 인위적으로 1감소시켜서 촐 7회 반복되는 모양을 만든것.
						break;
						//앞쪽에서 중복데이터를 발견하면
						//남은값을 비교할필요가 없다
						//->효율향상을 위해서는 검사하는 for문을 종료
					}
				}
				
			}
			//7)오름차순 정렬
			//->선택,삽입,버블,퀵 등등
			//->자바가 정렬방법을 미리 만들어서 제공학있음
			// Arrays.sort(배열명):배열내 값들이 오름차순으로 정렬됨
			Arrays.sort(lotto);
			//결과출력
			System.out.println(Arrays.toString(lotto));
		}

}

package basic_1;

public class Main4 {
	
	public static void main(String[] args) {
		
		// 10진수를 2진수로 변환 
		
		int inputNum = 19;
		int bin[] = new int[100]; // 2진수로 변활 될 때 2진수의 값들을 저장 할 용도로 사용할 array
		
		/* 10진수를 2진수로 바꿀 때 계속 2로 나누어야 한다.
		 * 
		 * 19 / 2     9 ... 1
		 *  9 / 2 	  4 ... 1
		 *  4 / 2 	  2 ... 0 
		 *  2 / 2	  1 ... 0
		 *  1 / 2     0 ... 1
		 *  
		 *  010011 => 19 
		 */
		
		int i = 0;
		int mok = inputNum;
		
		// 계속 2로 나누는 반복이니까 while를 사용 함
		
		while(mok > 0) {
			
			bin[i] = mok % 2; // 최초 값 mok을 2로 나눈 값을 다시 mok에 넣어준다.
			mok /= 2;
			i++;
		}
		
		i--; // mok이 0보다 작을 때 while문을 빠져 나오게 되는데, 빠져나오는 순간 마지막 순서인 i가 ++ 되면서 인덱스 한 부분이 더 증가 한다 
			// 그래서 --를 해줘야한다
		
		for (; i >= 0; i--) {
			System.out.print(bin[i]);
		}
		
		
	}
	
	
	

}

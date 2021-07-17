/*
 * P170 : 입력받은 숫자의 각 자리의 합 구하기
 */
package kr.co.job.oper;

import java.util.Scanner;

public class WhileTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0, sum = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		String tmp = scan.nextLine();
		num = Integer.parseInt(tmp);
//		num = Integer.parseInt(scan.nextLine());
//		num = Integer.parseInt(tmp); // parseInt(): 문자열을 정수로 바꾸는 함수.
	
		while(num!=0) {
			sum = sum + num%10;
			//print
			num = num /10;
//	345		=>34	=>3
		
		}
		
		scan.close();
		
		
	}
	
}


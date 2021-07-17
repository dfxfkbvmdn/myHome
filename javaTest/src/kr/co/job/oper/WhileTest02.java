package kr.co.job.oper;

public class WhileTest02 {

	public static void main(String[] args) {
		int i =1 ,  sum=0;
		while(true){
			sum += i; // sum = sum + i
			i++; // i 1증가
			if(i==10) {
				break;	// while문
			}
		}
		System.out.println("sum = " + sum);
	
	}

}

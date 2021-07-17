package kr.co.job.oper;

public class WhileTest04 {

	public static void main(String[] args) {
		/*
		 * While문과 Math.random() 메소드를 이용
		 * 
		 * 1~6의 눈을 갖는 두개의 주사위를 던졌을 때
		 * 주사위 눈의 값을 (1주사위눈, 2주사위 눈)형태로 출력하고
		 * 두개의 눈이 서로 다른 값이면 계속 주사위를 던지고
		 * 두개의 눈이 같으면 멈추는 코드 작성 // break
		 */
		int dice1 = 0, dice2 = 0;
		
		
		
		
		//System.out.println(Math.random());
		
		/*sauce들 1. Math.random() ~ 0-9
		  
		 2. while(조건) {
		 	실행문				//조건이 참일때 실행문을 반복한다.
		 }*/
		
//		int tmp = 0;
//		tmp = (int)(Math.random()*6)+1;
//		System.out.println(tmp);
		
		while(true) {
			dice1 = (int)(Math.random()*6)+1;
			dice2 = (int)(Math.random()*6)+1;
			System.out.printf("(1주사위 눈 : %d, 2주사위 눈: %d)%n", dice1, dice2);
			if(dice1==dice2) {
				break;
			}
		}
		System.out.println("숫자가 같아서 주사위 던짐을 멈췄습니다.");
	
	}

}

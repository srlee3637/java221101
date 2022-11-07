package naver.srlee3637.exercise;
import java.util.Scanner;
public class Exercise07 {

	public static void main(String[] args) {

		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------------------");
			System.out.print("선택> ");
			int selectNum = 0;
			try {
				
				selectNum = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("1 ~ 4 숫자만 입력하세요");
				scanner.nextLine();
			}
			
			if(selectNum == 1) {
				System.out.print("예금액>");
				balance += scanner.nextInt();
				
			}else if(selectNum == 2) {
				System.out.print("출금액>");
				balance -= scanner.nextInt();
			}else if(selectNum == 3) {
				System.out.print("잔고>" + balance + "\n");
				
			}else if(selectNum == 4) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		
	}

}

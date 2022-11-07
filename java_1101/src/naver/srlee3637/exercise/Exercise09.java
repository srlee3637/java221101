package naver.srlee3637.exercise;
import java.util.Scanner;
public class Exercise09 {//page183 이것이 자바다 

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		int selectNo = 0;
		while(run) {
			
			System.out.println("-------------------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택> ");
			try {
				selectNo = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("1~5사이의 숫자만 입력하세요");
				scanner.nextLine();
			}
			

			if(selectNo == 1) {
				System.out.print("학생수>");
				studentNum = scanner.nextInt();

			}else if(selectNo == 2){
				scores = new int[studentNum];
				for(int i = 0; i < studentNum; i++) {
					System.out.print("scores["+ i +"]>");
					scores[i] = scanner.nextInt();
				}

			}else if(selectNo == 3){
				for(int i = 0; i < studentNum; i++) {
					System.out.print("scores["+ i +"]:" + scores[i] + "\n");
				}


			}else if(selectNo == 4){
				int studentMax = 0;
				double avg = 0;
				for(int i = 0; i < studentNum; i++) {
					
					if(scores[i] > studentMax) {
						studentMax = scores[i]; 
					}
					avg += scores[i];
				}
				System.out.print("최고 점수:" + studentMax +"\n");
				System.out.print("평균 점수:" + avg/(double)studentNum +"\n");


			}else if(selectNo == 5) {
				System.out.println("프로그램 종료");
				run = false;
			}
		}
		scanner.close();
	}

}

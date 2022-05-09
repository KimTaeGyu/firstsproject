package test1;
import java.util.Scanner;
public class first {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =0; //학생 수 setting
		int[] kor_stu = null;
		int[] eng_stu = null;
		int[] mat_stu = null; 
		//이게 0으로 정의를 한건지 왜 이렇게 한건지 모르겠음
		
		while(true)
		{
			System.out.println("-----------------------");
			System.out.println(" 1 : 채점               ");
			System.out.println(" 2 : 성적처리            ");
			System.out.println(" 3 : 구간 합 구하기   	   ");
			System.out.println(" 4 : 소감               ");
			System.out.println(" 5 : 종료               ");
			System.out.println("-----------------------");
			System.out.print(" menu select : ");
			String sel = s.next();
			

		     if (sel.equals("1")) //문자열 비교  

			{
				System.out.print("몇명입니까? :");
				n = s.nextInt();
				
			    kor_stu = new int[n];
				eng_stu = new int[n];
				mat_stu = new int[n];
				
				for(int i=0; i<n; i++)

				{
					kor_stu[i] = eng_stu[i] = mat_stu[i] = 0;
				}
				
				//국어 답안지
				int[] kor_dapji = new int[] {1,2,3,4,1,2,3,4,1,2};
				System.out.println("\n------------------------------");
				System.out.print("국어 정답 :");
				
				for(int i=0; i<10; i++)
					System.out.printf("%2d",kor_dapji[i]);
				
				//영어 답안지
				int[] eng_dapji = new int[] {1,2,3,4,1,2,3,4,1,2};
				System.out.print("\n영어 정답 :");
				
				for(int i=0; i<10; i++)
					System.out.printf("%2d",eng_dapji[i]);
				
				//수학 답안지
				int[] mat_dapji = new int[] {1,2,3,4,1,2,3,4,1,2};
				System.out.print("\n수학 정답 :");
				
				for(int i=0; i<10; i++)
					System.out.printf("%2d",mat_dapji[i]);
				System.out.println("\n------------------------------");
				
				

				for (int j=0; j<n; j++)
				{
					//학생 고정 답안지
					int[] korhak_dapji = new int[] {4,3,2,1,4,3,2,1,4,3};
					int[] enghak_dapji = new int[] {1,2,3,4,1,2,3,4,1,2};
					int[] mathak_dapji = new int[] {3,2,1,4,1,3,4,1,2,3};
					//시험
					
					System.out.printf("학생%d:",j+1);
					//j+1 을 한 이유는 학생이 0부터 시작하면 안되니까한것
					
					//국어채점
					System.out.print("   ");
					int o = 0; //맞은 개수
					for (int i=0; i<10; i++)
					{
						if(kor_dapji[i] == korhak_dapji[i])
						{
							o++;
							System.out.print(" O");
						}
						else
							System.out.print(" X");
					}

					//점수발표
					System.out.printf("  jumsu = %d점\n", o*10);
					kor_stu[j] = o*10;
					
					System.out.print("        ");
					int O = 0; //맞은 개수
					for (int i=0; i<10; i++)
					{
						if(eng_dapji[i] == enghak_dapji[i])
						{
							o++;
							System.out.print(" O");
						}
						else
							System.out.print(" X");
					}

					//점수발표
					System.out.printf("  jumsu = %d점\n", o*10);
					eng_stu[j] = o*10;
					
					System.out.print("        ");
					int o1 = 0; //맞은 개수
					for (int i=0; i<10; i++)
					{
						if(mat_dapji[i] == mathak_dapji[i])
						{
							o1++;
							System.out.print(" O");
						}
						else
							System.out.print(" X");
					}

					//점수발표
					System.out.printf("  jumsu = %d점\n", o1*10);
					System.out.printf("-----------------------\n");
					mat_stu[j] = o1*10;
					
					
					System.out.printf("번호 과목1 과목2 과목3 \n");
					System.out.printf("학생%d %d %d %d\n",j+1,O*10,o*10,o1*10);
					System.out.printf("-----------------------\n");
				
			
				}
			}
			else if (sel.equals("2"))
			{
				
				
			}
				

				else if (sel.equals("3"))
				{
					System.out.print("x는 몇부터할까요? :");
					n = s.nextInt();
					System.out.print("y는 몇까지할까요? :");
					n = s.nextInt();
					//x와 y의 값을 각각 부여하고 구간합
					int even = 0; 
					int odd = 0; 
					//짝수 홀수를 0으로 정의함
					for (int i = 0; i <= n; i++) {
						if (i % 2 == 0) { 
							even += i; 
						} else { 
							odd += i; 
						}
					}
					//반복문 for를 이용해서 n으로 입력된 값만큼 반복
					//숫자를 2로 나누었을때 나머지가 0이라면 even에 저장
					//그게 아니라면 (홀수)odd에 저장을 한다
					System.out.println("짝수 합 : " + even); 
					System.out.println("홀수 합 : " + odd); 
					//왜 일부 숫자는 다르게 나오는지 이해가 안가는건 기분탓인가
					
					//출력
					
				}
				
	
				else if (sel.equals("4"))
				{
					System.out.println("-----------------------");
					System.out.println("print : 괄호안 내용을 단순히 출력.");
					System.out.println("printf : C에서의 printf와 동일. %d, %s 등을 쓰기위해 사용");
					System.out.println("println : 괄호안 내용을 출력한 후 마지막에 개행문자가 포함되어 있어 출력후 한 줄 띄워짐.");
				}
	
				else if (sel.equals("5"))
				{
					System.out.println("굿바이!");
					break;
					

			}
			else continue;
		}
		s.close();
	} //main
}//class
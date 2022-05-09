//0414 #2 답안지 채점
// n명 3과목 10문항 4지선다 랜덤답안 작성
// 정답 직접 입력
package test1;
import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n =0; //학생 수 setting
		int[] kor_stu = null;
		int[] eng_stu = null;
		int[] mat_stu = null; 
		while(true)
		{
			System.out.println("----------------");
			System.out.println(" 0 : 학생 수 입력 ");
			System.out.println(" 1 : 국어 채점  	");
			System.out.println(" 2 : 영어 채점  	");
			System.out.println(" 3 : 수학 채점    ");
			System.out.println(" 4 : 종료      	");
			System.out.println(" 5 : max min  	");
			System.out.println("----------------");
			System.out.print(" menu select : ");
			String sel = s.next();
			if (sel.equals("0"))
			{
				System.out.print("n :");
				n = s.nextInt();
			    kor_stu = new int[n];
				eng_stu = new int[n];
				mat_stu = new int[n];
				for(int i=0; i<n; i++)
				{
					kor_stu[i] = eng_stu[i] = mat_stu[i] = 0;
				}
				
			}
			else if (sel.equals("1")) //문자열 비교  
			{
				//국어 학생수 입력
				
				//국어 답안지
				int[] kor_dapji = new int[10];
				for(int i=0; i<10; i++)
				{
					kor_dapji[i] = (int)(Math.random()*4+1);
				}
				System.out.print("정답 :");
				for(int i=0; i<10; i++)
					System.out.printf("%2d",kor_dapji[i]);
				System.out.println("\n--------------------------");
				
				//int[] kor_stu = new int[n];
				//for(int i=0; i<n; i++) kor_stu[i] = 0; // reset
				
				for (int j=0; j<n; j++) //학생 수가 3명
				{
					//학생 답안지
					int[] stu_dapji = new int[10];
					
					//시험
					System.out.printf("학생%d:",j+1);
					for(int i=0; i<10; i++)
					{
						stu_dapji[i] = (int)(Math.random()*4+1); //1~4
						System.out.printf("%2d",stu_dapji[i]);
					}
					
					//채점
					System.out.print("\n   ");
					int o = 0; //맞은 개수
					for (int i=0; i<10; i++)
					{
						
						if(kor_dapji[i] == stu_dapji[i])
						{
							o++;
							System.out.print(" O");
						}
						else
							System.out.print(" X");
					}
					//점수발표
					System.out.printf("  jumsu = %d\n", o*10);
					kor_stu[j] = o*10;
				}//학생 3명 for;
			}
			else if (sel.equals("2"))
				;
			else if (sel.equals("3"))
				;
			else if (sel.equals("4"))
			{
				System.out.println("존나배고파 슈슈슋슛ㅅ슛ㅅㅅ시 슈발롬아");
				break;
			}
			else if (sel.equals("5"))
			{
				//kor max min
				int max = 0;
				int min = 100;
				int hap = 0,ave=0;
				for(int i=0; i<n; i++)
				{
					if (max < kor_stu[i])
						max = kor_stu[i];
					hap += kor_stu[i];
				}
				System.out.printf("max : %d\n", max);
				System.out.printf("ave : %d\n", ave);
				System.out.printf("hap : %d\n", hap);
			}
			else continue;
		}
		s.close();
	} //main
}//class

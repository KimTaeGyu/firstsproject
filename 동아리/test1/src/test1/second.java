//0414 #2 ����� ä��
// n�� 3���� 10���� 4������ ������� �ۼ�
// ���� ���� �Է�
package test1;
import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n =0; //�л� �� setting
		int[] kor_stu = null;
		int[] eng_stu = null;
		int[] mat_stu = null; 
		while(true)
		{
			System.out.println("----------------");
			System.out.println(" 0 : �л� �� �Է� ");
			System.out.println(" 1 : ���� ä��  	");
			System.out.println(" 2 : ���� ä��  	");
			System.out.println(" 3 : ���� ä��    ");
			System.out.println(" 4 : ����      	");
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
			else if (sel.equals("1")) //���ڿ� ��  
			{
				//���� �л��� �Է�
				
				//���� �����
				int[] kor_dapji = new int[10];
				for(int i=0; i<10; i++)
				{
					kor_dapji[i] = (int)(Math.random()*4+1);
				}
				System.out.print("���� :");
				for(int i=0; i<10; i++)
					System.out.printf("%2d",kor_dapji[i]);
				System.out.println("\n--------------------------");
				
				//int[] kor_stu = new int[n];
				//for(int i=0; i<n; i++) kor_stu[i] = 0; // reset
				
				for (int j=0; j<n; j++) //�л� ���� 3��
				{
					//�л� �����
					int[] stu_dapji = new int[10];
					
					//����
					System.out.printf("�л�%d:",j+1);
					for(int i=0; i<10; i++)
					{
						stu_dapji[i] = (int)(Math.random()*4+1); //1~4
						System.out.printf("%2d",stu_dapji[i]);
					}
					
					//ä��
					System.out.print("\n   ");
					int o = 0; //���� ����
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
					//������ǥ
					System.out.printf("  jumsu = %d\n", o*10);
					kor_stu[j] = o*10;
				}//�л� 3�� for;
			}
			else if (sel.equals("2"))
				;
			else if (sel.equals("3"))
				;
			else if (sel.equals("4"))
			{
				System.out.println("��������� ������������������ ���߷Ҿ�");
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

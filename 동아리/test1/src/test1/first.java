package test1;
import java.util.Scanner;
public class first {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =0; //�л� �� setting
		int[] kor_stu = null;
		int[] eng_stu = null;
		int[] mat_stu = null; 
		//�̰� 0���� ���Ǹ� �Ѱ��� �� �̷��� �Ѱ��� �𸣰���
		
		while(true)
		{
			System.out.println("-----------------------");
			System.out.println(" 1 : ä��               ");
			System.out.println(" 2 : ����ó��            ");
			System.out.println(" 3 : ���� �� ���ϱ�   	   ");
			System.out.println(" 4 : �Ұ�               ");
			System.out.println(" 5 : ����               ");
			System.out.println("-----------------------");
			System.out.print(" menu select : ");
			String sel = s.next();
			

		     if (sel.equals("1")) //���ڿ� ��  

			{
				System.out.print("����Դϱ�? :");
				n = s.nextInt();
				
			    kor_stu = new int[n];
				eng_stu = new int[n];
				mat_stu = new int[n];
				
				for(int i=0; i<n; i++)

				{
					kor_stu[i] = eng_stu[i] = mat_stu[i] = 0;
				}
				
				//���� �����
				int[] kor_dapji = new int[] {1,2,3,4,1,2,3,4,1,2};
				System.out.println("\n------------------------------");
				System.out.print("���� ���� :");
				
				for(int i=0; i<10; i++)
					System.out.printf("%2d",kor_dapji[i]);
				
				//���� �����
				int[] eng_dapji = new int[] {1,2,3,4,1,2,3,4,1,2};
				System.out.print("\n���� ���� :");
				
				for(int i=0; i<10; i++)
					System.out.printf("%2d",eng_dapji[i]);
				
				//���� �����
				int[] mat_dapji = new int[] {1,2,3,4,1,2,3,4,1,2};
				System.out.print("\n���� ���� :");
				
				for(int i=0; i<10; i++)
					System.out.printf("%2d",mat_dapji[i]);
				System.out.println("\n------------------------------");
				
				

				for (int j=0; j<n; j++)
				{
					//�л� ���� �����
					int[] korhak_dapji = new int[] {4,3,2,1,4,3,2,1,4,3};
					int[] enghak_dapji = new int[] {1,2,3,4,1,2,3,4,1,2};
					int[] mathak_dapji = new int[] {3,2,1,4,1,3,4,1,2,3};
					//����
					
					System.out.printf("�л�%d:",j+1);
					//j+1 �� �� ������ �л��� 0���� �����ϸ� �ȵǴϱ��Ѱ�
					
					//����ä��
					System.out.print("   ");
					int o = 0; //���� ����
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

					//������ǥ
					System.out.printf("  jumsu = %d��\n", o*10);
					kor_stu[j] = o*10;
					
					System.out.print("        ");
					int O = 0; //���� ����
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

					//������ǥ
					System.out.printf("  jumsu = %d��\n", o*10);
					eng_stu[j] = o*10;
					
					System.out.print("        ");
					int o1 = 0; //���� ����
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

					//������ǥ
					System.out.printf("  jumsu = %d��\n", o1*10);
					System.out.printf("-----------------------\n");
					mat_stu[j] = o1*10;
					
					
					System.out.printf("��ȣ ����1 ����2 ����3 \n");
					System.out.printf("�л�%d %d %d %d\n",j+1,O*10,o*10,o1*10);
					System.out.printf("-----------------------\n");
				
			
				}
			}
			else if (sel.equals("2"))
			{
				
				
			}
				

				else if (sel.equals("3"))
				{
					System.out.print("x�� ������ұ��? :");
					n = s.nextInt();
					System.out.print("y�� ������ұ��? :");
					n = s.nextInt();
					//x�� y�� ���� ���� �ο��ϰ� ������
					int even = 0; 
					int odd = 0; 
					//¦�� Ȧ���� 0���� ������
					for (int i = 0; i <= n; i++) {
						if (i % 2 == 0) { 
							even += i; 
						} else { 
							odd += i; 
						}
					}
					//�ݺ��� for�� �̿��ؼ� n���� �Էµ� ����ŭ �ݺ�
					//���ڸ� 2�� ���������� �������� 0�̶�� even�� ����
					//�װ� �ƴ϶�� (Ȧ��)odd�� ������ �Ѵ�
					System.out.println("¦�� �� : " + even); 
					System.out.println("Ȧ�� �� : " + odd); 
					//�� �Ϻ� ���ڴ� �ٸ��� �������� ���ذ� �Ȱ��°� ���ſ�ΰ�
					
					//���
					
				}
				
	
				else if (sel.equals("4"))
				{
					System.out.println("-----------------------");
					System.out.println("print : ��ȣ�� ������ �ܼ��� ���.");
					System.out.println("printf : C������ printf�� ����. %d, %s ���� �������� ���");
					System.out.println("println : ��ȣ�� ������ ����� �� �������� ���๮�ڰ� ���ԵǾ� �־� ����� �� �� �����.");
				}
	
				else if (sel.equals("5"))
				{
					System.out.println("�¹���!");
					break;
					

			}
			else continue;
		}
		s.close();
	} //main
}//class
package students_control;
import java.util.*;

public class StuMain {
	
	//��ʾ������¼���ѧ����Ϣ
	public void showStudent(Student head){
		if(head.student != null){
			System.out.println("\t" + head.student.get_id() + "\t" +  head.student.get_name() + "\t" + 
					head.student.get_gender() + "\t" +  head.student.get_score());
			showStudent(head.student);//�ݹ���ú������������������ѧ������Ϣ
		}
	}
	//��ѧ������Ϣ¼��������
	public void inputToStudents(Student head){
		if(head.student == null){
			head.student = new Student();//Ϊ¼���µĵ�ѧ����Ϣ����洢�ռ�
			StuKeyboardInput stuKeyboardInput = new StuKeyboardInput();//ѧ����Ϣд��
			int f = stuKeyboardInput.input_If(head.student);
			if(f == 4){
				System.out.println("\n\t��¼��^_^\n");
			}
			else
			{
				System.out.println("\n\t¼��ʧ��>_<\n");
			}
			return;
		}
		else{
			inputToStudents(head.student);//ѭ���ݹ飬�������ӵ�ѧ����Ϣ¼������������
		}
	}
	public void control(){
		StuMenu stumenu = new StuMenu();//�˵�����
		Student head = new Student();//ѧ������
		StuQuery stuQuery = new StuQuery();//���ܶ���
		/**************��������ʵ��*******************/
		while(true){
			String n = stumenu.stu_menu1();//��ʾ�˵�
			switch(n){
			    //¼��ѧ����Ϣ
				case "1":{
					while(true){
						this.inputToStudents(head);//������Ϣ¼�뺯��
						System.out.println("\t1������������س�����¼��" + "\n\t0���� 0 �˳�" + "\n��ѡ��");
						Scanner scanner = new Scanner(System.in);
						String k = scanner.next();
						if(k.compareTo("0") == 0){
							break;
						}
					}
				}
				break;
				//��ѯȫ��ѧ������Ϣ
				case "2":{
					if(head.student == null){
						System.out.println("\n\t���ڻ�δ¼���κ�ѧ����Ϣ\n");
						break;
					}
					System.out.println("��¼��ѧ����Ϣ���£�");
					System.out.println("\tѧ��" + "\t����" + "\t�Ա�" + "\t�ɼ�");
					showStudent(head);//��ʾȫ��ѧ������Ϣ
				}
				break;
				//����ѧ����Ϣ�Ĳ�ѯ����
				case "3":{
					while(true){
						System.out.print("��ѡ��" + "\n\t1����ѧ��������ѯ" + "\n\t2����ѧ��ѧ�Ų�ѯ" +
							"\n\t0������" + "\n�����룺");
						Scanner scanner = new Scanner(System.in);
						String k = scanner.next();
						if(k.compareTo("1") == 0){
							System.out.print("��������Ҫ��ѯ��ѧ��������");
							String name = scanner.next();
							stuQuery.seekStudentBy_Name(head, name);//ͨ��ѧ��������������Ϣ�Ĳ�ѯ
						}
						if(k.compareTo("2") == 0){
							System.out.print("��������Ҫ��ѯ��ѧ��ѧ�ţ�");
							String id = scanner.next();
							stuQuery.seekStudentBy_ID(head, id);//ͨ��ѧ����ѧ�Ž�����Ϣ�Ĳ�ѯ
						}
						if(k.compareTo("0") == 0){
							break;
						}
						if(k.compareTo("1") == 0 && k.compareTo("2") == 0 && k.compareTo("0") == 0){
							System.out.println("�����������������");
						}
					}
				}
				break;
				//ѧ����Ϣ��ɾ��
				case "4":{
					while(true){
						System.out.print("��ѡ��" + "\n\t1����ѧ����������ɾ��" + "\n\t2����ѧ��ѧ�Ž���ɾ��" +
							"\n\t0������" + "\n�����룺");
						Scanner scanner = new Scanner(System.in);
						String k = scanner.next();
						if(k.compareTo("1") == 0){
							System.out.print("��������Ҫɾ����ѧ��������");
							String name = scanner.next();
							stuQuery.deleteStudentBy_Name(head, name);//��ѧ������������ɾ��
							System.out.println("\n\t��ɾ��^_^\n");
						}
						if(k.compareTo("2") == 0){
							System.out.print("��������Ҫɾ����ѧ��ѧ�ţ�");
							String id = scanner.next();
							stuQuery.deleteStudentBy_ID(head, id);//��ѧ����ѧ�Ž���ɾ��
							System.out.println("\n\t��ɾ��^_^\n");
						}
						if(k.compareTo("0") == 0){
							break;
						}
						if(k.compareTo("1") == 0 && k.compareTo("2") == 0){
							System.out.println("�����������������");
						}
					}
				}
				break;
				//��ѧ������Ϣ��������
				case "5":{
					while(true){
						System.out.print("��ѡ��" + "\n\t1����ѧ��ѧ�Ž�������" + "\n\t2����ѧ���ɼ���������" +
							"\n\t0������" + "\n�����룺");
						Scanner scanner = new Scanner(System.in);
						String k = scanner.next();
						if(k.compareTo("1") == 0){
							stuQuery.countStudent(head);//�õ�������¼���ѧ���ĸ���
							stuQuery.orderStudentBy_ID(head,stuQuery.number - 1);//ͨ��ѧ����ѧ�Ž�������
							System.out.println("\n\t��������ɣ��ɷ�����һ����в�ѯ^_^\n");
						}
						if(k.compareTo("2") == 0){
							stuQuery.countStudent(head);//�õ�������¼��ѧ���ĸ���
							stuQuery.orderStudentBy_Score(head,stuQuery.number - 1);//ͨ��ѧ����������������
							System.out.println("\n\t��������ɣ��ɷ�����һ����в�ѯ^_^\n");
						}
						if(k.compareTo("0") == 0){
							break;
						}
						if(k.compareTo("1") == 0 && k.compareTo("2") == 0){
							System.out.println("�����������������");
						}
					}
				}
				break;
				case "0":return;//����
				default :{
					System.out.print("����������������룺");
				}
			}
		}
	}
}

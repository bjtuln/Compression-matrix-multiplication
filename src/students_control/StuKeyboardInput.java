package students_control;
import java.util.*;

public class StuKeyboardInput {
	public int input_If(Student student){
		System.out.print("��������ѧ������Ϣ��ѧ��   ����   �Ա�   �ɼ�����");
		Scanner scanner = new Scanner(System.in);
		String studentInF = scanner.nextLine();
		StringTokenizer str = new StringTokenizer(studentInF," ");
		int num = str.countTokens();
		while(str.hasMoreTokens() && num == 4)
        {   //����ѭ������ȡ�ַ���str1����һ�����Է���,�����
               String str1 = str.nextToken();
               student.set_id(str1);//��ѧ����ѧ��д��ڵ�
               String str2 = str.nextToken();
               student.set_name(str2);//��ѧ��������д��ڵ�
               String str3 = str.nextToken();
               student.set_gender(str3);//��ѧ�����Ա�д��ڵ�
               String str4 = str.nextToken();
               student.set_score(str4);//��ѧ���ĳɼ�д��ڵ�
        }
		return num;
	}
}

package students_control;
import java.util.*;

public class StuMenu {
	//�˵�ѡ��
	public String stu_menu1(){
		System.out.print("��ѡ�������Ŀ��\n" + 
		"\t1��¼��ѧ������Ϣ\n" +
				"\t2����ѯȫ����¼��ѧ������Ϣ\n" +
		"\t3����ѯ����ѧ������Ϣ����������ѧ�ţ�\n" +
				"\t4��ɾ��ѧ������Ϣ\n" +
		"\t5����ѧ����������\n" +
				"\t0���˳�\n" +
		"�����룺");
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();
	//	scanner.close();
		return n;
	}
}

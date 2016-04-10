package students_control;

public class StuQuery {
	public int number;//��¼�����е�ѧ���ĸ���
	//����ó�������ѧ���ĸ���
	public void countStudent(Student head){
		if(head.student != null){
			number ++;
			countStudent(head.student);//�ݹ�ѭ��������ѧ���ĸ���
		}
	}
	//������ͨ��ѧ����ѧ�Ž�������
	public void orderStudentBy_ID(Student head , int n){
		while(n > 0 && head.student.student != null){
			if(head.student.get_id().compareTo(head.student.student.get_id()) < 0 ){
				Student student = new Student();//�����µĿռ�洢ĳһ�ڵ�
				student = head.student;//�½ڵ�ĸ�ֵ
				
				//��ԭ�ڵ�ɾ���������µĽڵ���룬ʵ�ֽڵ��ǰ���û�
				head.student = head.student.student;
				student.student = head.student.student;
				head.student.student = student;
			}
			n --;
			orderStudentBy_ID(head.student,n);//�ݹ���ú�����ʵ������
		}
	}
	//������ͨ��ѧ���ĳɼ���������
	public void orderStudentBy_Score(Student head , int n){
		while(n > 0 && head.student.student != null){
			if(head.student.get_score().compareTo(head.student.student.get_score()) < 0){
				Student student = new Student();//�����µĿռ�洢ĳһ�ڵ�
				student = head.student;//�½ڵ�ĸ�ֵ
				
				//��ԭ�ڵ�ɾ���������µĽڵ���룬ʵ�ֽڵ��ǰ���û�
				head.student = head.student.student;
				student.student = head.student.student;
				head.student.student = student;
			}
			n --;
			orderStudentBy_Score(head.student,n);//�ݹ���ú�����ʵ������
		}
	}
	//������ͨ��ѧ����ѧ�Ž��в���
	public void seekStudentBy_ID(Student head , String n){
		if(head.student != null){
			if(head.student.get_id().compareTo(n) == 0){
				head.student.showMe();//�������������ѧ������Ϣ
			}
			seekStudentBy_ID(head.student,n);//�ݹ飬��ѯ��������������ѧ��
		}
	}
	//������ͨ��ѧ�����������в���
	public void seekStudentBy_Name(Student head , String name){
		if(head.student != null){
			if(head.student.get_name().equals(name)){
				head.student.showMe();//�������������ѧ������Ϣ
			}
			seekStudentBy_Name(head.student,name);//�ݹ飬��ѯ��������������ѧ��
		}
	}
	//������ͨ��ѧ����ѧ�Ž���ɾ��
	public void deleteStudentBy_ID(Student head , String n){
		if(head.student.student != null){
			if(head.student.get_id().compareTo(n) == 0){
				head.student = head.student.student;//�����������Ľڵ���и���
				if(head.student.student == null){
					if(head.student.get_id().compareTo(n) == 0){
						head.student = null;//�������������ѧ��λ������������ֱ�ӽ����ÿ�
						return;
					}
					return;
				}
				deleteStudentBy_ID(head,n);//�ݹ飬����������������ѧ����Ϣ����ɾ��
			}
			deleteStudentBy_ID(head.student,n);//�ݹ飬����������������ѧ����Ϣ����ɾ��
		}
		else{
			if(head.student.get_id().compareTo(n) == 0){
				head.student = null;//�������������ѧ��λ������������ֱ�ӽ����ÿ�
			}
		}
	}
	//������ͨ��ѧ������������ɾ��
	public void deleteStudentBy_Name(Student head , String name){
		if(head.student.student != null){
			if(head.student.get_name().equals(name)){
				head.student = head.student.student;//�����������Ľڵ���и���
				if(head.student.student == null){
					if(head.student.get_id().compareTo(name) == 0){
						head.student = null;//�������������ѧ��λ������������ֱ�ӽ����ÿ�
						return;
					}
					return;
				}
				deleteStudentBy_Name(head,name);//�ݹ飬����������������ѧ����Ϣ����ɾ��
			}
			deleteStudentBy_Name(head.student,name);//�ݹ飬����������������ѧ����Ϣ����ɾ��
		}
		else{
			if(head.student.get_name().equals(name)){
				head.student = null;//�������������ѧ��λ������������ֱ�ӽ����ÿ�
			}
		}
	}
}

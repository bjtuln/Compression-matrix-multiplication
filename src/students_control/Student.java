package students_control;

public class Student {
	private String id;//ѧ����ѧ��
	private String name;//ѧ��������
	private String gender;//ѧ���Ա�
	private String score;//ѧ���ɼ�
	public Student student = null;//����ڵ�
	
	//���úͶ�ȡѧ��ѧ��
	public void set_id(String n){
		id = n;
	}
	public String get_id(){
		return id;
	}
	//���úͶ�ȡѧ������
	public void set_name(String s){
		name = s;
	}
	public String get_name(){
		return name;
	}
	//���úͶ�ȡѧ���Ա�
	public void set_gender(String g){
		gender = g;
	}
	public String get_gender(){
		return gender;
	}
	//���úͶ�ȡѧ���ɼ�
	public void set_score(String n){
		score = n;
	}
	public String get_score(){
		return score;
	}
	//���ѧ������Ϣ
	public void showMe(){
		System.out.println("\tѧ��ѧ�ţ�" + get_id() + "\t������" + get_name() +
				"\t�Ա�" + get_gender() +"\t�ɼ���"  + get_score());
	}
}

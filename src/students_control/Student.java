package students_control;

public class Student {
	private String id;//学生的学号
	private String name;//学生的姓名
	private String gender;//学生性别
	private String score;//学生成绩
	public Student student = null;//链表节点
	
	//设置和读取学生学号
	public void set_id(String n){
		id = n;
	}
	public String get_id(){
		return id;
	}
	//设置和读取学生姓名
	public void set_name(String s){
		name = s;
	}
	public String get_name(){
		return name;
	}
	//设置和读取学生性别
	public void set_gender(String g){
		gender = g;
	}
	public String get_gender(){
		return gender;
	}
	//设置和读取学生成绩
	public void set_score(String n){
		score = n;
	}
	public String get_score(){
		return score;
	}
	//输出学生的信息
	public void showMe(){
		System.out.println("\t学生学号：" + get_id() + "\t姓名：" + get_name() +
				"\t性别：" + get_gender() +"\t成绩："  + get_score());
	}
}

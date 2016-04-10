package students_control;

public class StuQuery {
	public int number;//记录链表中的学生的个数
	//计算得出链表中学生的个数
	public void countStudent(Student head){
		if(head.student != null){
			number ++;
			countStudent(head.student);//递归循环，计算学生的个数
		}
	}
	//方法：通过学生的学号进行排序
	public void orderStudentBy_ID(Student head , int n){
		while(n > 0 && head.student.student != null){
			if(head.student.get_id().compareTo(head.student.student.get_id()) < 0 ){
				Student student = new Student();//申请新的空间存储某一节点
				student = head.student;//新节点的赋值
				
				//将原节点删除，并将新的节点插入，实现节点的前后置换
				head.student = head.student.student;
				student.student = head.student.student;
				head.student.student = student;
			}
			n --;
			orderStudentBy_ID(head.student,n);//递归调用函数，实现排序
		}
	}
	//方法：通过学生的成绩进行排序
	public void orderStudentBy_Score(Student head , int n){
		while(n > 0 && head.student.student != null){
			if(head.student.get_score().compareTo(head.student.student.get_score()) < 0){
				Student student = new Student();//申请新的空间存储某一节点
				student = head.student;//新节点的赋值
				
				//将原节点删除，并将新的节点插入，实现节点的前后置换
				head.student = head.student.student;
				student.student = head.student.student;
				head.student.student = student;
			}
			n --;
			orderStudentBy_Score(head.student,n);//递归调用函数，实现排序
		}
	}
	//方法：通过学生的学号进行查找
	public void seekStudentBy_ID(Student head , String n){
		if(head.student != null){
			if(head.student.get_id().compareTo(n) == 0){
				head.student.showMe();//输出满足条件的学生的信息
			}
			seekStudentBy_ID(head.student,n);//递归，查询所有满足条件的学生
		}
	}
	//方法：通过学生的姓名进行查找
	public void seekStudentBy_Name(Student head , String name){
		if(head.student != null){
			if(head.student.get_name().equals(name)){
				head.student.showMe();//输出满足条件的学生的信息
			}
			seekStudentBy_Name(head.student,name);//递归，查询所有满足条件的学生
		}
	}
	//方法：通过学生的学号进行删除
	public void deleteStudentBy_ID(Student head , String n){
		if(head.student.student != null){
			if(head.student.get_id().compareTo(n) == 0){
				head.student = head.student.student;//将满足条件的节点进行覆盖
				if(head.student.student == null){
					if(head.student.get_id().compareTo(n) == 0){
						head.student = null;//如果满足条件的学生位于链表的最后，则直接将其置空
						return;
					}
					return;
				}
				deleteStudentBy_ID(head,n);//递归，将所有满足条件的学生信息进行删除
			}
			deleteStudentBy_ID(head.student,n);//递归，将所有满足条件的学生信息进行删除
		}
		else{
			if(head.student.get_id().compareTo(n) == 0){
				head.student = null;//如果满足条件的学生位于链表的最后，则直接将其置空
			}
		}
	}
	//方法：通过学生的姓名进行删除
	public void deleteStudentBy_Name(Student head , String name){
		if(head.student.student != null){
			if(head.student.get_name().equals(name)){
				head.student = head.student.student;//将满足条件的节点进行覆盖
				if(head.student.student == null){
					if(head.student.get_id().compareTo(name) == 0){
						head.student = null;//如果满足条件的学生位于链表的最后，则直接将其置空
						return;
					}
					return;
				}
				deleteStudentBy_Name(head,name);//递归，将所有满足条件的学生信息进行删除
			}
			deleteStudentBy_Name(head.student,name);//递归，将所有满足条件的学生信息进行删除
		}
		else{
			if(head.student.get_name().equals(name)){
				head.student = null;//如果满足条件的学生位于链表的最后，则直接将其置空
			}
		}
	}
}

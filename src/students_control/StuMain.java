package students_control;
import java.util.*;

public class StuMain {
	
	//显示所有已录入的学生信息
	public void showStudent(Student head){
		if(head.student != null){
			System.out.println("\t" + head.student.get_id() + "\t" +  head.student.get_name() + "\t" + 
					head.student.get_gender() + "\t" +  head.student.get_score());
			showStudent(head.student);//递归调用函数，输出链表中所有学生的信息
		}
	}
	//将学生的信息录入链表中
	public void inputToStudents(Student head){
		if(head.student == null){
			head.student = new Student();//为录入新的的学生信息申请存储空间
			StuKeyboardInput stuKeyboardInput = new StuKeyboardInput();//学生信息写入
			int f = stuKeyboardInput.input_If(head.student);
			if(f == 4){
				System.out.println("\n\t已录入^_^\n");
			}
			else
			{
				System.out.println("\n\t录入失败>_<\n");
			}
			return;
		}
		else{
			inputToStudents(head.student);//循环递归，将新增加的学生信息录入链表的最后面
		}
	}
	public void control(){
		StuMenu stumenu = new StuMenu();//菜单对象
		Student head = new Student();//学生对象
		StuQuery stuQuery = new StuQuery();//功能对象
		/**************主方法的实现*******************/
		while(true){
			String n = stumenu.stu_menu1();//显示菜单
			switch(n){
			    //录入学生信息
				case "1":{
					while(true){
						this.inputToStudents(head);//调用信息录入函数
						System.out.println("\t1、按任意键，回车继续录入" + "\n\t0、按 0 退出" + "\n请选择：");
						Scanner scanner = new Scanner(System.in);
						String k = scanner.next();
						if(k.compareTo("0") == 0){
							break;
						}
					}
				}
				break;
				//查询全部学生的信息
				case "2":{
					if(head.student == null){
						System.out.println("\n\t现在还未录入任何学生信息\n");
						break;
					}
					System.out.println("已录入学生信息如下：");
					System.out.println("\t学号" + "\t姓名" + "\t性别" + "\t成绩");
					showStudent(head);//显示全部学生的信息
				}
				break;
				//单个学生信息的查询函数
				case "3":{
					while(true){
						System.out.print("请选择：" + "\n\t1、按学生姓名查询" + "\n\t2、按学生学号查询" +
							"\n\t0、返回" + "\n请输入：");
						Scanner scanner = new Scanner(System.in);
						String k = scanner.next();
						if(k.compareTo("1") == 0){
							System.out.print("请输入您要查询的学生姓名：");
							String name = scanner.next();
							stuQuery.seekStudentBy_Name(head, name);//通过学生的姓名进行信息的查询
						}
						if(k.compareTo("2") == 0){
							System.out.print("请输入您要查询的学生学号：");
							String id = scanner.next();
							stuQuery.seekStudentBy_ID(head, id);//通过学生的学号进行信息的查询
						}
						if(k.compareTo("0") == 0){
							break;
						}
						if(k.compareTo("1") == 0 && k.compareTo("2") == 0 && k.compareTo("0") == 0){
							System.out.println("输入错误，请重新输入");
						}
					}
				}
				break;
				//学生信息的删除
				case "4":{
					while(true){
						System.out.print("请选择：" + "\n\t1、按学生姓名进行删除" + "\n\t2、按学生学号进行删除" +
							"\n\t0、返回" + "\n请输入：");
						Scanner scanner = new Scanner(System.in);
						String k = scanner.next();
						if(k.compareTo("1") == 0){
							System.out.print("请输入您要删除的学生姓名：");
							String name = scanner.next();
							stuQuery.deleteStudentBy_Name(head, name);//按学生的姓名进行删除
							System.out.println("\n\t已删除^_^\n");
						}
						if(k.compareTo("2") == 0){
							System.out.print("请输入您要删除的学生学号：");
							String id = scanner.next();
							stuQuery.deleteStudentBy_ID(head, id);//按学生的学号进行删除
							System.out.println("\n\t已删除^_^\n");
						}
						if(k.compareTo("0") == 0){
							break;
						}
						if(k.compareTo("1") == 0 && k.compareTo("2") == 0){
							System.out.println("输入错误，请重新输入");
						}
					}
				}
				break;
				//对学生的信息进行排序
				case "5":{
					while(true){
						System.out.print("请选择：" + "\n\t1、按学生学号进行排序" + "\n\t2、按学生成绩进行排序" +
							"\n\t0、返回" + "\n请输入：");
						Scanner scanner = new Scanner(System.in);
						String k = scanner.next();
						if(k.compareTo("1") == 0){
							stuQuery.countStudent(head);//得到链表中录入的学生的个数
							stuQuery.orderStudentBy_ID(head,stuQuery.number - 1);//通过学生的学号进行排序
							System.out.println("\n\t排序已完成，可返回上一层进行查询^_^\n");
						}
						if(k.compareTo("2") == 0){
							stuQuery.countStudent(head);//得到链表中录入学生的个数
							stuQuery.orderStudentBy_Score(head,stuQuery.number - 1);//通过学生的姓名进行排序
							System.out.println("\n\t排序已完成，可返回上一层进行查询^_^\n");
						}
						if(k.compareTo("0") == 0){
							break;
						}
						if(k.compareTo("1") == 0 && k.compareTo("2") == 0){
							System.out.println("输入错误，请重新输入");
						}
					}
				}
				break;
				case "0":return;//返回
				default :{
					System.out.print("输入错误，请重新输入：");
				}
			}
		}
	}
}

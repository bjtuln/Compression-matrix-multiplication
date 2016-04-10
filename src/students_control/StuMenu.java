package students_control;
import java.util.*;

public class StuMenu {
	//菜单选项
	public String stu_menu1(){
		System.out.print("请选择服务项目：\n" + 
		"\t1、录入学生的信息\n" +
				"\t2、查询全部已录入学生的信息\n" +
		"\t3、查询单个学生的信息（姓名或者学号）\n" +
				"\t4、删除学生的信息\n" +
		"\t5、对学生进行排序\n" +
				"\t0、退出\n" +
		"请输入：");
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();
	//	scanner.close();
		return n;
	}
}

package students_control;
import java.util.*;

public class StuKeyboardInput {
	public int input_If(Student student){
		System.out.print("请您输入学生的信息（学号   姓名   性别   成绩）：");
		Scanner scanner = new Scanner(System.in);
		String studentInF = scanner.nextLine();
		StringTokenizer str = new StringTokenizer(studentInF," ");
		int num = str.countTokens();
		while(str.hasMoreTokens() && num == 4)
        {   //利用循环来获取字符串str1中下一个语言符号,并输出
               String str1 = str.nextToken();
               student.set_id(str1);//将学生的学号写入节点
               String str2 = str.nextToken();
               student.set_name(str2);//将学生的姓名写入节点
               String str3 = str.nextToken();
               student.set_gender(str3);//将学生的性别写入节点
               String str4 = str.nextToken();
               student.set_score(str4);//将学生的成绩写入节点
        }
		return num;
	}
}

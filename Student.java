import java.io.*;
import static java.lang.System.out;
import java.util.*;
import java.lang.*;
class a{
	static int age;
	static int count = 0;
	int enroll;
	a(){
		Scanner st = new Scanner(System.in);
		out.println("Enter enroll no ");
		enroll = st.nextInt();	
	}
	public static void data(){
		Scanner st = new Scanner(System.in);
		out.println("Enter the user age ");
		int inp = st.nextInt();
		if (inp > 4 & inp < 40){
			age = inp;
			count += 1;
		}
	}
	protected void cleanup() {
		out.println("Object deleted "+count);
		count -= 1;
	}
	public void  show (){
		out.println("age is "+age+" count is "+count+" enroll is "+enroll);
	}
}
class Student{
	public static void main(String[] args){
		a r;
		a obj = new a();
		obj.data();
		obj.show();
		r = obj;
		r.show();
		obj.cleanup();
	}
}
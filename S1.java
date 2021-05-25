import java.util.*;

abstract class S2{
int RollNo;
String Name;
String Div;

abstract Student Setdata(int RollNo,String Name,String Div);
abstract void Getdata();
}
 class Student extends S2
 {
Student Setdata(int RollNo,String Name,String Div)
{
this.RollNo=RollNo;
this.Name=Name;
this.Div=Div;
return this;
}

void Getdata()
{
System.out.println("Student RollNo is :"+RollNo);
System.out.println("Student Name is :"+Name);
System.out.println("Student Div is :"+Div);

}
}

public class S1{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of studets for whom you want to add data");
try{
int n = sc.nextInt();
Student[]obj=new Student[n];
for(int i =0;i<obj.length;i++)
{
Student student = new Student();
obj[i]=student.Setdata(sc.nextInt(),sc.next(),sc.next());

}

for(Student d : obj)
{
	d.Getdata();
System.out.println();

}
}catch(InputMismatchException e){System.err.println("Expected a integer within range of 1 to 60");}
finally{
System.out.println("Exit with return 0");
}
}
}
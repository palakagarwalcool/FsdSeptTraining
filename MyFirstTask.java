import java.util.Scanner;
class MyFirstTask{
public static void main(String[] arg)
{
System.out.println("My first task");
Scanner sc = new Scanner(System.in);
int salary=sc.nextInt();
double hra=0.15*salary;
double da = 0.6*salary;
double tax=0.0;
if(salary<500000)
{
	tax=0.0;
}
else if(salary>=500000 && salary<=1000000)
{
	tax=0.2*salary;
}
else{
	tax=0.3*salary;
}
System.out.println(salary+hra+da-tax);
}
}

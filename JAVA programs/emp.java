import java.util.*;
class emp
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the employee number:");
int empno=s.nextInt();
System.out.println("Enter the employee name:");
String empname=s.next();
System.out.println("Enter the employee grade:");
char grade=s.next().charAt(0);
System.out.println("Enter the employee salary:");
double salary=s.nextDouble();
double comm=0;
if(grade=='A' || grade=='a')
comm=0.14*salary;
else if(grade=='B' || grade=='b')
comm=0.10*salary;
else if(grade=='C' || grade=='c')
comm=0.07*salary;
else
System.out.println("Invalid");

System.out.println("employee number: "+ empno +" employee name "+ empname +" employee grade "+ grade + " salary "+ salary+ "commission "+ String.format("%.2f",comm));
}
}

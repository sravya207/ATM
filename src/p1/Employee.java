package p1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;

public class Employee {
	public String id,name,desg;
   public  int bSal;
   public  float totSal;
   

	@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", desg=" + desg + ", bSal=" + bSal + ", totSal=" + totSal + "]";
}


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//String id,name,desg;
	   // int bSal;
	   //float totSal;
	   System.out.println("enter the value of n");
	   int n =Integer.parseInt(s.nextLine());
	   Employee ob[] = new Employee[n];
	   for(int i =0;i<ob.length;i++) {
		   System.out.println("enter employee "+(i+1)+"***");
		  ob[i]= new Employee();
		   System.out.println("enter the id");
		   ob[i].id = s.nextLine();
		   System.out.println("enter the name");
		   ob[i].name= s.nextLine();
		   System.out.println("enter the desg");
		   ob[i].desg = s.nextLine();
		   System.out.println("enter the bsal");
		   ob[i].bSal = Integer.parseInt(s.nextLine());
		   ob[i].totSal = ob[i].bSal+(0.93F*ob[i].bSal)+(0.63F*ob[i].bSal);
		   
		   
	   }
	   System.out.println("employeedetails");
	   Spliterator<Employee> sp = Arrays.spliterator(ob);
	   sp.forEachRemaining((k) ->
	   {
		   System.out.println(k.toString());
		   
	   });
	}
	
	

}

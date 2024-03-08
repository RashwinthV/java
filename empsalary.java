package Day_9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class employee{
	String name,dept,designation;
	int empid,salary,exp;
	public employee(String name, String dept, String designation, int empid, int salary, int exp) {
		super();
		this.name = name;
		this.dept = dept;
		this.designation = designation;
		this.empid = empid;
		this.salary = salary;
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "employee\n [name=" + name + ", dept=" + dept + ", designation=" + designation + ", empid=" + empid
				+ ", salary=" + salary + ", exp=" + exp + "]\n";
	}
}
public class empsalary {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<employee> emp=new ArrayList<>();
			Scanner ip=new Scanner(System.in);
			System.out.println("Enter no of records: ");
			int n=ip.nextInt();
			for(int i=0;i<n;i++) {
				System.out.println("Enter name:");
				String name=ip.next();
				System.out.println("Enter department:");
				String dept=ip.next();
				System.out.println("Enter designation:");
				String designation=ip.next();
				System.out.println("Enter ID:");
				int empid =ip.nextInt();
				System.out.println("Enter Salary:");
				int salary =ip.nextInt();
				System.out.println("Enter Experience:");
				int exp =ip.nextInt();
				emp.add(new employee(name, dept, designation, empid, salary, exp));
			}
			System.out.println(emp);

			int ch,i=1;
			
			System.out.println("Sort by \n1.Salary\n2.ID\n3.Experience\n4.Department\n5.Name");
			do {
			System.out.println("Enter the choice: ");
			ch=ip.nextInt();
			switch(ch){
			case 1:
				Collections.sort(emp,(obj1,obj2)->(obj1.salary-obj2.salary));
				System.out.println("sorted by salary \n"+emp);
				break;
			case 2:
				Collections.sort(emp,(obj1,obj2)->(obj1.empid-obj2.empid));
				System.out.println("sorted by Employee ID \n"+emp);
				break;
			case 3:
				Collections.sort(emp,(obj1,obj2)->(obj1.exp-obj2.exp));
				System.out.println("sorted by Experience \n"+emp);
				break;
			case 4:
		        Collections.sort(emp, (obj1, obj2) -> obj1.dept.compareTo(obj2.dept));
		        System.out.println("sorted by department\n" + emp);
		        break;
		    case 5:
		        Collections.sort(emp, (obj1, obj2) -> obj1.name.compareTo(obj2.name));
		        System.out.println("sorted by name\n" + emp);
		        break;
			case 6:
				System.out.println("Exiting......");
				System.exit(0);
				default:
					System.out.println("Invalid Choice!!!");

			}
			}
			while(i!=0);
		
ip.close();		
}



	}

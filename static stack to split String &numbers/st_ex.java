package Day11;

import java.util.Scanner;

public class st_ex {

	public static void main(String[] args) {
		

				Scanner sc =new Scanner(System.in);
				st_ex_mo s=new st_ex_mo();

				int n=1;
				while(n!=0) {
					System.out.println(" 1.Push \n 2.Pop \n 3.Show \n 4.Capacity \n 5.Exit");
					System.out.println("Enter Your Choice ");
					int choice=sc.nextInt();
					switch (choice) {
					case 1: 
						for(int i=0;i<1;i++) {
							System.out.println("Enter value to Push");
							String d=sc.next();
							
							s.push(d);
							}
						break;
					case 2: 
						s.pop();
						break;
					case 3:
						s.show();
						break;
					case 4:
						System.out.println("The Capacity of the String Stack is "+s.size1());
						System.out.println("The Capacity of the Numeric Stack is "+s.size2());
						break;
					case 5:
						System.out.println("Exiting...");
						System.exit(0);
						break;
					default :
						System.out.println("Invalid Choice");
					}
					}
				sc.close();
			}

		}

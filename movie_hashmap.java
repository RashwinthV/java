package Day10;

import java.util.*;

public class movie_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ip=new Scanner(System.in);
		System.out.println("Enter No Of Values");
		int n=ip.nextInt();
		String [] ar= {"mov1","mov2","mov3","mov4"};
		int [] ra=new int[n];//values
		
		
		for(int i=0;i<n;i++) {
			ra[i]=0;
		}
		Map<String,Integer> m=new HashMap<>();
		for( int i=0;i<n;i++) {
			m.put(ar[i], ra[i]);
		}
		System.out.println(m);
	   int a=1;
	   int like=0;
	   int li=0;
	   int ko=0;
	   int mo=0;
			  
		do {
			int ch;
			System.out.println("Enter your Choice: ");
			ch=ip.nextInt();
			switch(ch) {
			case 1:
				like+=1;
				m.replace("mov1" , like);
			  break;
			case 2:
				li+=1;
				m.replace("mov2" , li);
				  break;
			case 3:
				ko+=1;
				m.replace("mov3" , ko);
				  break;
			case 4:
				mo+=1;
				m.replace("mov4" , mo);
				  break;
			case 5:
				System.out.println("Exiting .......");
				System.out.println(m);
				System.exit(0);
			default:
				System.out.println("Invalid choice!!!");
			}
		}
		while(a==1);
		ip.close();
	}
}
import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int m = cin.nextInt();
		int n = cin.nextInt();
		
		boolean k = false;
		for(int i=m;i<=n;i++){
			int a = i/100;
			int b = (i - 100*a)/10;
			int c = (i - 100*a - 10*b);
			if((a*a*a+b*b*b+c*c*c)==i){
				System.out.print(i+" ");
				k = true;
			}
		}
		if(!k){
			System.out.println("no");
		}
	}

}
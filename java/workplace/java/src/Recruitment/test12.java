package Recruitment;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test12 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int num_length = cin.nextInt();
		cin.nextLine();
		String a = cin.nextLine();
		String b = cin.nextLine();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<num_length;i++){
			if(String.valueOf(a.charAt(i)).equals(String.valueOf(b.charAt(i)))){
				list.add(0);
			}else{
				list.add(1);
			}
		}
		int result = 0;
		for(int i=0;i<num_length;i++){
			result += list.get(i)*Math.pow(2, num_length-i-1);
		}
		System.out.println(result);
	}
}
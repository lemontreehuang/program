package Recruitment;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String[] a = cin.nextLine().split("");
		int rank = 0;
		List<String> charList = new ArrayList<String>();
		for(int i=0;i<a.length;i++){
			if(charList.size()==0){
				
			}
			if(a[i].equals("[")){
				charList.add("[");
			}else{
				rank++;
				charList.remove(charList.size()-1);
			}
		}
	}

}
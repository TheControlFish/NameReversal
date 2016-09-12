import java.io.*;
import java.util.*;
public class NameReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbScanner = new Scanner(System.in);
		System.out.print("Enter Name: ");
		String str = kbScanner.nextLine();
		str = str.toLowerCase();
		for (int i = str.length()-1; i >= 0; i--){
			System.out.print(str.substring(i,i+1));
		}
	}

}

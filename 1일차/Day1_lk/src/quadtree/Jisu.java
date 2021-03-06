package quadtree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Jisu {
	private static int index;
	private static String input;
	
	public static void main(String args[]) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("/Users/klee/workspace/eclipse/Day1/Data/quadtree.txt"));
		int T = sc.nextInt();
		String temp = sc.nextLine();
		for(int t = 0; t < T; t++) {
			index = 0;
			input = sc.nextLine();
			System.out.println(recursive());
			
		}
		sc.close();
	}
	
	public static String recursive() {
		
		
		if(input.charAt(index) == 'b' || input.charAt(index) == 'w') {
			
			index++;
			return Character.toString(input.charAt(index-1));

		}else if(input.charAt(index) == 'x') {
			
			index++;
			String first = recursive();
			String second = recursive();
			String third = recursive();
			String fourth = recursive();
			return "x"+third + fourth + first + second;
		}
		return "";
	}
}

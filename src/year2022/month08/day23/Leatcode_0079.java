package year2022.month08.day23;
import java.io.IOException;
import java.util.*;
//Permutations
public class Leatcode_0079 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int staircase[] = new int[4];
		
		staircase[0] = 0;
		staircase[1] = 1;
		staircase[2] = 2;
		
		for(int index = 3; index < 4; index++) {
			staircase[index] = staircase[index - 1 ] + staircase[index - 2 ];
		}
		
		System.out.println(staircase[3]);
		
	}

	

}

package Sng;

import java.util.Arrays;
import java.util.Scanner;

public class PlayList extends Practice {
	public void getplaylist(int num) {
		String[] songs= {"s1","s2","s3"};
		
		System.out.println("Initial play list"+Arrays.asList(songs));

		for(int i=3;i<num;i++) {
			System.out.print("\nEnter next song : ");
			songs[2]=songs[1];
			songs[1]=songs[0];
			songs[0]=super.sc.next();
			System.out.println("Current play list"+Arrays.asList(songs));
		}
	 }
	
}


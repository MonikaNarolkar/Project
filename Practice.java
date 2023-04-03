package Sng;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
//import java.util.Set;
//import java.util.TreeSet;

public class Practice {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	
	
	int num;
	
	System.out.println("Enter number of songs");
	num=sc.nextInt();
	PlayList p=new PlayList();
	p.getplaylist(num);
	
	}

 
}
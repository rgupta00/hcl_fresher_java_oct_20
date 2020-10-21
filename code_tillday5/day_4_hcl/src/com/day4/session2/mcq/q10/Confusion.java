package com.day4.session2.mcq.q10;

import java.util.Random;
//Ctrl+ shift + o

public class Confusion {
	
	private static Random random=new Random();
	public static void main(String[] args) {

		StringBuffer word=null;
		switch (random.nextInt(5)) {
		//0 1 2 3 4
		case 1:
			word=new StringBuffer('M');
			break;

		default:
			word=new StringBuffer('N');
		}
	
		word.append('a');
		word.append('b');
		
		System.out.println(word);
	}

}

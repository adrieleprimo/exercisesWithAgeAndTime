package entities;

import java.util.Scanner;

public class ageDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int days = sc.nextInt();
		int years = days/365;
		days -= years*365;
		int mounths = days/30;
		days -= mounths*30;
		//int day = days*30;
		//days -= day*30;
		int day = days;
		
		
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", years, mounths, day);
		sc.close();

	}

}

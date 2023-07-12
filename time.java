package application;

import java.util.Scanner;

public class hoursMinutes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
	
		
      int hours = N/3600;
      N-=  hours*3600;
      
      int minutes = N /60;
       N-= minutes*60;
      int seconds = N;
        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);
		
		
		sc.close();

	}

}

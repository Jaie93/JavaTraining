package com.yash.exception2;

import java.util.Scanner;

public class Attendance {
	public static void main(String[] args) {
		char presentDays[] = new char[30];
		System.out.println("Ener the attendance:");
		Scanner sc = new Scanner(System.in);
		int present = 0, leave = 0;
		for (int i = 0; i < presentDays.length; i++) {
			System.out.println("Enter the attendance:" + (i + 1));
			presentDays[i] = sc.next().charAt(0);
			if (presentDays[i] == 'P') {
				present++;
			}
			if (presentDays[i] == 'L') {
				leave++;
			}
			if (i > 3) {
				try {
					if (presentDays[i - 4] == presentDays[i - 3] && presentDays[i - 3] == presentDays[i - 2]
							&& presentDays[i - 2] == presentDays[i - 1] && 'A' == presentDays[i - 1])
						throw new AbscondingException("---ABSCONDING---");
				} catch (AbscondingException e) {
					System.out.println(e);
				}
			}
			if (leave > 2) {
				try {
					throw new LeaveLimitExceedException("---LEAVE LIMIT EXCEED EXCEPTION---");

				} catch (LeaveLimitExceedException e) {
					System.out.println(e);
				}

			}
		}

		System.out.println("-----Salary-----:" + present * 1000);
		System.exit(0);

	}

}

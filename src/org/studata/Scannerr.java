package org.studata;

import java.util.Scanner;

public class Scannerr {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Student Id ");
		short StudentId  = s.nextShort();
		System.out.println("Student id is "+StudentId);
		
		
		System.out.println("Enter the Student Name is ");
		String Name = s.nextLine();
		System.out.println("Student name is "+Name);
		
		System.out.println("Enter the Tamil Mark ");
		short TamilMark = s.nextShort();
		System.out.println("Tamil MArk is "+TamilMark);

		System.out.println("Enter the English Mark");
		byte EnglishMark = s.nextByte();
		System.out.println("English Mark is "+EnglishMark);

		System.out.println("Enter the English Mark");
		short MathsMark = s.nextShort();
		System.out.println("Maths Mark is "+MathsMark);

		System.out.println("Enter the Science Mark");
		byte ScienceMark = s.nextByte();
		System.out.println("Science Mark is "+ScienceMark);


		System.out.println("Enter the Social Mark");
		short Socialmark = s.nextShort();
		System.out.println("Social Mark is "+Socialmark);

		System.out.println("Enter the Total Mark is ");
		short TotalMark = s.nextShort();
		System.out.println("Total Mark is "+TotalMark);

		System.out.println("Enter the Average Mark ");
		float AverageMark = s.nextFloat();
		System.out.println("Average Mark is "+AverageMark);













				
				
				
				
				
				


	}

}

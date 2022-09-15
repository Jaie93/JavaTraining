package com.yash.traning.opps.homeAssignemnt.problem4;


import java.util.Scanner;

public class AreaTest {
	
	public static void main(String[] args) {
		
		Area area=new Area();
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter the three side");
		
		double L =s.nextDouble();
		double W =s.nextDouble();
		double H =s.nextDouble();
		
		
		
		if(L==W || L==H || W==H) {
			
			area.areaOfSquare(L,W,H);
			
		}
		else  {
			
			area.areaOfRectangle(L,W,H);
		
		
			area.areaOfTraingle(L, W, H);
			
			if(H== L+W || L==H+W || H==L+W){
	            System.out.println("Right-Angle Triangle");
			}
	            else {
	            	System.out.println("NotRight-Angle Triangle");
	            }
			
		}
	
}
}
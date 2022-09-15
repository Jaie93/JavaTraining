package com.yash.traning.opps.homeAssignemnt.problem8;

public class Finalize {

	 public static void main(String[] args) {
	        MyEmployee e1=new MyEmployee(101);
	        MyEmployee e2=new MyEmployee(102);
	        MyEmployee e3=new MyEmployee(103);
	        MyEmployee e4=new MyEmployee(104);
	        MyEmployee e5=new MyEmployee(105);
	            
	            e2=null;
	            e5=null;
	            System.gc();
	            
	            for(int i=1;i<6;i++) {
	                String e="e"+i;
	                System.out.println(e+":"+e.hashCode());
	            }
	            System.out.println("e2="+e2);
	            System.out.println("e5="+e5);
	            
	    }
}

package com.yash.string6;

//WAP to demonstrate how memory is allocated to string objects in memory heap and string constant pool.
public class Task6_MemoryHeapAndScp {
	
public static void main(String[] args) 
{
        
       String s = new String("Bhushan"); // 2 object  using new keyword

       String s1 = new String("Bhushan"); // 1 object using new keyword

       String s2 = "Bhushan"; // o object using literals

       String s3 = "Bhushan"; // o object using literals



       System.out.println("S: " + s.hashCode());  //Hashcode will be same for all objects
        System.out.println("S1: " + s1.hashCode()); //Hashcode will be same for all objects
        System.out.println("S2: " + s2.hashCode()); //Hashcode will be same for all objects
        System.out.println("S3: " + s3.hashCode()); //Hashcode will be same for all objects



       System.out.println(s.equals(s3)); // contains are same
        System.out.println("In Heap memory: " + s1 == s3);



   }

}

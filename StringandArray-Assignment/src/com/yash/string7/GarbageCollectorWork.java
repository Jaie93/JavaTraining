package com.yash.string7;

//WAP to demonstrate how garbage collector work when any memory is not referenced by string object.
public class GarbageCollectorWork 
{
	public void finalize() {
		System.out.println("Object Is Garbage Collected");
		}

	public static void main(String[] args) {
		GarbageCollectorWork s2 = new GarbageCollectorWork();//reference
		GarbageCollectorWork s3 = new GarbageCollectorWork();
		s2=s3;
		System.gc();
	}
}
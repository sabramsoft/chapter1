package com.two95.threads;

public class VectorVsList {

	public static void main(String[] args) {

		VectorResource vr = new VectorResource();
		vr.createVector();
		CollectionThread ct1 = new CollectionThread("Thread1",vr,1);
		CollectionThread ct2 = new CollectionThread("Thread2",vr,1);
		ct1.start();
		ct2.start();
		
		ArrayListResource al = new ArrayListResource();
		al.createArrayList();
		CollectionThread ct3 = new CollectionThread("Thread3",al,1);
		CollectionThread ct4 = new CollectionThread("Thread4",al,1);
		ct3.start();
		ct4.start();

	}

}

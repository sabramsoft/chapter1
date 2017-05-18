package com.two95.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class PrinterTest {

	public static void main(String[] args) {

		// Create the resource
		Vector<Printer> printers = new Vector<Printer>();
		printers.add(new Printer());
		printers.add(new Printer());
		printers.add(new Printer());
		printers.add(new Printer());
		// Create Threads
		PrinterThread p1 = new PrinterThread(printers, "Document1");
		PrinterThread p2 = new PrinterThread(printers, "Document2");
		PrinterThread p3 = new PrinterThread(printers, "Document3");
		PrinterThread p4 = new PrinterThread(printers, "Document4");
		p1.start();
		p2.start();
		p3.start();
		p4.start();
	}

}

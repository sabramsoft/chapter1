package com.two95.threads;

import java.util.Vector;

public class PrinterThread extends Thread {
	Vector<Printer> printers ;
	String data;

	public PrinterThread(Vector<Printer> printersList, String data) {
		this.printers = printersList; 
		this.data = data;
	}

	public void run() {
		Printer p = printers.get(0);
		printers.remove(0);
		p.print(data);
	}
}
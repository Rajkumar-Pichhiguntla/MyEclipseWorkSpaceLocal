package com.thread;

public class ReportApp {
	
	public static void main(String[] args)  {
		SharedResource sr=new SharedResource();
		Downloader downloader=new Downloader(sr);
		ReportProcessor rp=new ReportProcessor(sr);
		 
		downloader.start();
		rp.start();
		
		
		
		
	}

}
class SharedResource{
	boolean isDownloaded=false;
	
	public synchronized void setDownloaded(boolean value) {
		isDownloaded=value;
		notify();
	}
	
	public synchronized void isDownloaded() {
		while(!isDownloaded) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Waiting interrupted..");
			}
		}
	}
}

class Downloader extends Thread{
	SharedResource sr;
	
	Downloader(SharedResource sr){
		this.sr=sr;
	}
	
	public void run() {
		System.out.println("File Downloading....");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
//		sr.isDownloaded=true;
		
		sr.setDownloaded(true);
		System.out.println("Download Completed..");
	}
}

class ReportProcessor extends Thread{
	SharedResource sr;
	
	ReportProcessor(SharedResource sr){
		this.sr=sr;
	}
	
	public void run() {
		System.out.println("Waiting for download complete..");
		sr.isDownloaded();
		System.out.println("Report Processing");
		try {
			Thread.sleep(100);
			System.out.println("Report Ready");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
	}
}

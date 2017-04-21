package io.github.iqiancheng.daily.datastructure.thread;

/**
 * Synichronized线程
 * @author qian.cheng
 * @see SynchronizedObject
 */
public class SynchronizedThread implements Runnable{
	private String name;
	private SynchronizedObject sObject;
	
	public SynchronizedThread(SynchronizedObject sObject, String name){
		this.sObject = sObject;
		this.name = name;
	}

	public void run() {
		sObject.syn(name);
	}
}

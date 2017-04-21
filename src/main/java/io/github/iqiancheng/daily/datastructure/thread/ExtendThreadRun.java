package io.github.iqiancheng.daily.datastructure.thread;

/**
 * RunExtendThread
 * @author qian.cheng
 * @see ExtendThread
 */
public class ExtendThreadRun {
	
	public static void main(String args[]){
		ExtendThread instance = new ExtendThread();
		instance.start();
		
		while(instance.count != 5){
			try{
				Thread.sleep(250);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

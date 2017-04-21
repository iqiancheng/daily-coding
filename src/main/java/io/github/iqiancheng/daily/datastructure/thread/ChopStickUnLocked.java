package io.github.iqiancheng.daily.datastructure.thread;

/**
 * 
 * @author qian.cheng
 */
public class ChopStickUnLocked extends ChopStickLocked {
	public ChopStickUnLocked(){
		super();
	}
	
	public boolean pickUp(){
		return lock.tryLock();
	}

}

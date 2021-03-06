package io.github.iqiancheng.daily.datastructure.designPatterns.singleton.threadSafetyVolatile;

/**
 * 高效的线程安全的单例模式实现类
 * @author qian.cheng
 *
 */
public class Singleton {
    private static volatile Singleton instance;
    
    private Singleton(){}
    
    public static Singleton getInstance(){
        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        
        return instance;
    }

}

package io.github.iqiancheng.daily.guava.string;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

/**
 * -----------------------------------------
 * @描述  测试类
 * @作者  fancy
 * @邮箱  fancydeepin@yeah.net
 * @日期  2012-8-26 <p>
 * -----------------------------------------
 */
public class Test {

    public static void main(String[] args){
        /**
         * 泛型编译后会去参数化（擦拭法），因此无法直接用反射获取泛型的参数类型
         * 可以把泛型用做一个方法的参数类型，方法可以保留参数的相关信息，这样就可以用反射先获取方法的信息
         * 然后再进一步获取泛型参数的相关信息，这样就得到了泛型的实际参数类型
         */
        try {
            Class<?> clazz = Test.class; //取得 Class
            Method method = clazz.getDeclaredMethod("applyCollection", Collection.class); //取得方法
            Type[] type = method.getGenericParameterTypes(); //取得泛型类型参数集
            ParameterizedType ptype = (ParameterizedType)type[0];//将其转成参数化类型,因为在方法中泛型是参数,且Number是第一个类型参数
            type = ptype.getActualTypeArguments(); //取得参数的实际类型
            System.out.println(type[0]); //取出第一个元素
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //声明一个空的方法,并将泛型用做为方法的参数类型
    public void applyCollection(Collection<Number> collection){
        
    }
}
package io.github.iqiancheng.daily.guava.string;

import com.google.common.collect.Lists;
import com.google.common.reflect.TypeToken;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * @author qian.cheng
 */
public class Ttest {

    public static void main(String[] args) {
        JobSaveReq<String> test = new JobSaveReq<String>();
        List<Integer> test3 = Lists.newArrayList();
//
//        getParameterizedType(test);
//        getParameterizedType(test2);
//        System.out.println(getTclass(test2.getClass()));
//        System.out.println(getclass(test.getClass()));
        getParameterizedType(test);
    }


    public static void getParameterizedType(Object inst){
        System.out.println(((ParameterizedType) TypeToken.of(inst.getClass()).getType()).getActualTypeArguments()[0]);
    }

     static  Class<?> getTclass(Class clazz) {
            if (clazz == null) {
                clazz = (Class<?>) ((ParameterizedType) clazz.getGenericSuperclass()).getActualTypeArguments()[0];
            }
            return clazz;
        }

    static Type  getclass(Class clazz) {
        //代码块,也可将其放置到构造子中
        {
            //entityClass =(Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
            try {
                Type type = clazz.getGenericSuperclass(); //获取实际运行的类的直接超类的泛型类型
                TypeToken.of(clazz).getType();
                if(type instanceof ParameterizedType){ //如果该泛型类型是参数化类型

                    Type[] parameterizedType = ((ParameterizedType)type).getActualTypeArguments();//获取泛型类型的实际类型参数集
                    return parameterizedType[0]; //取出第一个(下标为0)参数的值
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return null;
    }
}

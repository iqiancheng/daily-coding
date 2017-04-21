package io.github.iqiancheng.daily.guava.string;

import com.google.common.reflect.TypeResolver;
import com.google.common.reflect.TypeToken;

/**
 * @author qian.cheng
 */
public class TypeTest<T> {
    public static void main(String[] args) {
        JobSaveReq<String> test1 = new JobSaveReq<String>();
        TypeResolver typeResolver = new TypeResolver();
        System.out.println(typeResolver.resolveType(test1.getClass()));;

        TypeToken.of(test1.getClass()).getTypes();
    }
}

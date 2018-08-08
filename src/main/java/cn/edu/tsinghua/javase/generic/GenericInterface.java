package cn.edu.tsinghua.javase.generic;

import java.io.Serializable;

/**
 * @author mingfei.net@gmail.com
 * @link https://github.com/thu/JavaSE_20170902/
 * @since 22:26 20 Oct 2017
 */
public interface GenericInterface<T extends Serializable, E, S, U, V> {
    V method(T t, E e, U u);
}

//class GenericImpl<T> implements GenericInterface<T> {
//
//    @Override
//    public T method(T t) {
//        return null;
//    }
//}

class GenericImpl<T extends Serializable, E, S, U, V> implements GenericInterface<T, E, S, U, V> { // *****
    @Override
    public V method(T t, E e, U u) {
        return null;
    }
}

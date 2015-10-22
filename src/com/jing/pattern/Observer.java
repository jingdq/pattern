package com.jing.pattern;

/**
 * Created by jingdongqi on 10/22/15.
 */
public interface Observer<T> {

    void onUpdate(Observable<T> observable ,T data);

}

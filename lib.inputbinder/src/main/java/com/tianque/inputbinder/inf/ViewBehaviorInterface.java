package com.tianque.inputbinder.inf;

/**
 * Created by way on 2018/3/5.
 */

public interface ViewBehaviorInterface<T> {

    T getContent();

    void setContent(T content);
}

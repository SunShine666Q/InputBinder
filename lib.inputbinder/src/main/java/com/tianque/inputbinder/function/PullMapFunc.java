package com.tianque.inputbinder.function;

import java.util.Map;

@FunctionalInterface
public interface QueryMapFunc {
    Map<String,String> doQuery();
}

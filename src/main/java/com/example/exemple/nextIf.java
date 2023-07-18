package com.example.exemple;

import java.util.List;

@SuppressWarnings("unchecked")
@FunctionalInterface
public interface nextIf<T> {
    boolean hasNext(List<T> list, Integer limit);
}

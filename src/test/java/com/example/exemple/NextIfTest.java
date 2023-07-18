package com.example.exemple;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;


@ExtendWith(MockitoExtension.class)
public class NextIfTest {


    private final Integer startOffSet = 0;
    private final Integer limit = 10;
    private nextIf nextIf = (list, size) -> list.size() >= limit;


    @Test
    void test1(){

        var numberList = new java.util.ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));

        int offset = startOffSet;

        do {

            if(numberList.size() <= offset){
                numberList.clear();
            }

            offset += limit;
        } while (nextIf.hasNext(numberList, limit));


   }



    @Test
    void test2(){

        List<String> stringList =  new java.util.ArrayList<>(List.of("1","2","3","4","5","6","7","8","9","10","11","12"));


        int offset = startOffSet;
        do {

            if(stringList.size() <= offset){
                stringList.clear();
            }

            offset += limit;
        } while (nextIf.hasNext( stringList, limit));


    }


}

package com.epam.onboarding.mentoring.java8;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaExpressions {

    public void primeNumber(){
        ArrayList<Integer> num= new ArrayList();
        num.add(199);
        num.add(3);
        num.add(5);
        num.add(73);

        Collections.sort(num,(i1,i2)->{
            if (i1>i2){
            return -1;
            }
            else if(i1<i2){
                return  1;
            }
            else
                return 0;
        });
        System.out.println(num);
    }



}

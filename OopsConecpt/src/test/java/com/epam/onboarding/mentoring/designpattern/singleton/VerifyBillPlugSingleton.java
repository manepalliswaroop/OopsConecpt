package com.epam.onboarding.mentoring.designpattern.singleton;

import com.epam.onboarding.mentoring.designpattern.singleton.BillPlugSingleton;

public class VerifyBillPlugSingleton
{
    public static void main(String[] args) {
        BillPlugSingleton test = BillPlugSingleton.getInstance();
        BillPlugSingleton test1 = BillPlugSingleton.getInstance();
        if(test1.equals(test))
            System.out.println("is equal");
        else
            System.out.println("not equal");
    }
}

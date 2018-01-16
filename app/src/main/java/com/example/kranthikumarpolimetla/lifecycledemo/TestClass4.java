package com.example.kranthikumarpolimetla.lifecycledemo;

/**
 * Created by kranthikumarpolimetla on 1/15/18
 * Copy right KR Minds 2018
 */

public class TestClass4 extends TestClass{
    @Override
    public int sum() {
        return 0;
    }

    //final is a non-access modifier applicable only to a variable, a method or a class.
    public final int sum2() {
        return 2;
    }

    //static vs final
    //Once it has been assigned, the value of the final variable cannot change.
    // static means it belongs to the class not an instance, this means that there is only one copy of that variable/method shared between all instances of a particular Class.
}

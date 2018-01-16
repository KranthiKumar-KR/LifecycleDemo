package com.example.kranthikumarpolimetla.lifecycledemo;

public interface TestIClass3 {
    //interface can only have abstract methods, we need not mention methods explicitlely with
    //with abstract keywords
    //every method in an interface is by default public
    // we cannot use static keyword in an interface because static means we cant override or change the behavior once defined
    // if you want to make a method as static then you should provide body to that method explicitely
    // since java 8, java supports default methods, in which we can define a body
    // before java 8 interfaces can only have abstract methods (methods without body or implementation) or variables
    // interfaces methods cannot have method definitions before java 8
    public  void sum();
     /*public void sume() {

    }*/
}

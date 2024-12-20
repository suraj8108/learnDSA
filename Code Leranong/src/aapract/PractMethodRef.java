package aapract;

import java.util.function.BiFunction;

interface Sayable{  
    void say();  
} 

interface Sayable1{  
    PractMethodRef say();  
} 

public class PractMethodRef {
	PractMethodRef() {
		System.out.println("Constructor called");
	}
	public static void saySomething() {
		System.out.println("Hello");
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	
	public static void main(String[] args) {
        Sayable sayable = PractMethodRef::saySomething;  
        sayable.say();
        
        BiFunction<Integer, Integer, Integer> myAdd = PractMethodRef::add;
        System.out.println(myAdd.apply(10, 20));
        
        Sayable1 say = PractMethodRef::new;
        System.out.println(say.say());
        
	}
}

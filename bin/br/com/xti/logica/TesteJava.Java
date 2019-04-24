1. Write a final class named Orders that manages a map of Order objects. As key
should be used a Calendar object with the associated day.
The class Orders must have two methods:
void pushOrder( Order order, java.util.Date date) - Insertion method of a
object Order in the map using as key the date argument.
Order[] getOrders() - Returns the array of all the objects in the map in ascending order of
the key

import java.util.*;
public final class Ordens{
	public static void pushOrder(Order order, java.util.Date date){
		Order[] umArray;
		umArray = new int[0];
		
		System.out.println(Order.length);
		System.out.println(Arrays.toString(Order));
		// naõ terminei
	}
}

2. Suggest an alternative to the class Calendar as a map key and explain you opinion
regarding the previous question and respective solution.
public class Calendar{
	// naõ terminei
}

3. If an object of the class Person contains a reference to an object of the class Car and the
object of the class Car has a reference to the Person object that references it and the
program executing has no references to the referred objects, are they garbage collected or
not? And why?

//Answer:
/**
* In what I understood of the question the objects are without reference, thus being objects they are collected as garbage.
* Java garbage collection is the process by which Java programs perform automatic memory management. 
* Java programs compile to bytecode which can be run on a Java Virtual Machine (JVM). When Java programs run in the JVM, 
* objects are created in the heap, which is a part of the memory dedicated to the program. Eventually, some objects will no longer be needed. 
* The garbage collector locates these unused objects and deletes them to free up memory.
*
* Java garbage collection is an automatic process. The programmer does not need to explicitly mark objects to be deleted. 
* The garbage collection implementation is in the JVM itself. Each JVM can implement garbage collection any way you want; 
* the only requirement is that it meets the specifications of the JVM. Although there are many JVMs, Oracle's HotSpot is by far the most common. 
* Offers a robust and mature set of garbage collection options.
*/

4. In Java, how many bytes are used to keep a int in memory? 
// int i = 2_000_000_000; //2 bilhões 32 bits = 4 byte

And a long? 
// long l = 9_000_000_000_000_000_000; // 9 quintilhão 8 bytes (64 bits)

Is there any distinction between 32 bit virtual machines and 64 bit virtual machines regarding this?
//In fact a Java Application running in a 64 bit JVM will consume more RAM compared to a 32 bit JVM. All internal datastructures will need more RAM. ... 
//The only differences between 32-bit and 64-bit builds of any program are the sizes of machine words, the amount of addressable memory, 
//and the Operating System ABI in use.



5. What is a singleton? 
//The Singleton pattern allows you to create single objects for which there is only one instance. 
//This pattern provides a global access point, as well as a global variable, but without the disadvantages of global variables.

Can you exemplify with a concrete implementation? 
public class Singleton {
 
    private static Singleton uniqueInstance;
 
    private Singleton() {
    }
 
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new Singleton();
 
        return uniqueInstance;
    }
}

What are the dvantages anda disavantages of using a singleton? 
//Ensure the existence of a single instance of the related class in the system;
//Provide a central access point for this instance.
//By guaranteeing a single instance of a class, we can avoid undesirable situations, such as high memory consumption when we need the same object.
//The disadvantage depends on the example approach: Singleton instance will be created as soon as the class is initialized, 
//because the class construct is in a static attribute, and this is not always desirable in applications - 
//you may want to delay this process and control exactly what point at which instantiation will occur (doing a sort of "lazing loading").
//The public static operation can be accessed easily by using the class name and operation name (Singleton.getInstance()).

Is it possible to have more than a instance of a singleton in the same JVM?
//Multiple Singleton classes (related or non-inheritable) can obey the same interface, 
//allowing a particular singleton to be chosen to work with a given run-time application

6. We want to create a class Dog with the following properties: height, weight, race,
name. Furthermore we want o rewrite the equals method using only the properties race
and name. Write the class with all the methods required to the it’s correct performance.
public class Dog{
	public void dog(...){
		double height  = 1;// Exemplo
		double weight = 2;
		double race = 3;
		
		System.out.println(height, weight, race);
		
		
	}
}

public class alterar extends Dog{
	@override
	public void dog(...){
		double height  = 10;// Exemplo
		double weight = 20;
		double race = 30;
		
		System.out.println(height, weight, race);
	}
}
//There are several ways to change it depends on the purpose.


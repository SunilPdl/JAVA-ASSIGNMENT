 
## Default Method In Interface 

 Before Java 8, interfaces could have only abstract methods. The implementation of these methods has to be provided in a separate class. So, if a new method is to be added in an interface, then its implementation code has to be provided in the class implementing the same interface. To overcome this issue, Java 8 has introduced the concept of default methods which allow the interfaces to have methods with implementation without affecting the classes that implement the interface.



// A simple program to Test Interface default 
```java
interface TestInterface 
{ 
    // abstract method 
    public void square(int a); 
  
    // default method 
    default void show() 
    { 
      System.out.println("Default Method Executed"); 
    } 
} 
  
class TestClass implements TestInterface 
{ 
    // implementation of square abstract method 
    public void square(int a) 
    { 
        System.out.println(a*a); 
    } 
  
    public static void main(String args[]) 
    { 
        TestClass d = new TestClass(); 
        d.square(4); 
  
        // default method executed 
        d.show(); 
    } 
} 
```




## Inheritance In Java


	The process by which one class acquires the properties or data members and functionalities or methods of another class is called inheritance. The aim of inheritance is to provide the reusability of code so that a class has to write only the unique features and rest of the common properties and functionalities can be extended from the another class.
	
## Example:
```java
	class Teacher {
   String designation = "Teacher";
   String collegeName = "Beginnersbook";
   void does(){
	System.out.println("Teaching");
   }
}

public class PhysicsTeacher extends Teacher{
   String mainSubject = "Physics";
   public static void main(String args[]){
	PhysicsTeacher obj = new PhysicsTeacher();
	System.out.println(obj.collegeName);
	System.out.println(obj.designation);
	System.out.println(obj.mainSubject);
	obj.does();
   }
}
}
```





## Difference between Abstract class Interface
SN.No | Title | LINK
:----:|:---------------:|:---------------:
1| Abstract class can have abstract and non-abstract methods. | Interface can have only abstract methods. Since Java 8, it can have default and static methods also.
2| Abstract class doesn't support multiple inheritance.	| Interface supports multiple inheritance.
3| Abstract class can have final, non-final, static and non-static variables. | Interface has only static and final variables.
4| Abstract class can provide the implementation of interface. | Interface can't provide the implementation of abstract class.
5| The abstract keyword is used to declare abstract class. | The interface keyword is used to declare interface.
6| An abstract class can extend another Java class and implement multiple Java interfaces. | An interface can extend another Java interface only.
7| An abstract class can be extended using keyword "extends". | An interface can be implemented using keyword "implements".
8| A Java abstract class can have class members like private, protected, etc. | Members of a Java interface are public by default.
9|Example:
public abstract class Shape{public abstract void draw();} | Example:public interface Drawable{void draw();}



## Nested Interface


We can declare an interface in another interface or class. Such an interface is termed as a nested interface.

The following are the rules governing a nested interface.

A nested interface declared within an interface must be public.
A nested interface declared within a class can have any access modifier.
A nested interface is by default static.
Following is an example of a nested interface.

## Example
```java
Live Demo

class Animal {
   interface Activity {
      void move();
   }
}
class Dog implements Animal.Activity {
   public void move() {
      System.out.println("Dogs can walk and run");
   }
}
public class Tester {
   public static void main(String args[]) {
      Dog dog = new Dog();
      dog.move();
   }
}
```

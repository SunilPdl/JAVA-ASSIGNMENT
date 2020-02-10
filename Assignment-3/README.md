##In This Way Create Own Exception:
* All exceptions must be a child of Throwable.

* If you want to write a checked exception that is automatically enforced by the Handle or Declare Rule, you need to extend the Exception class.

* If you want to write a runtime exception, you need to extend the RuntimeException class.


##Example:
```java
import java.io.IOException;
class Testthrows1{
  void m()throws IOException{
    throw new IOException("device error");//checked exception
  }
  void n()throws IOException{
    m();
  }
  void p(){
   try{
    n();
   }catch(Exception e){System.out.println("exception handled");}
  }
  public static void main(String args[]){
   Testthrows1 obj=new Testthrows1();
   obj.p();
   System.out.println("normal flow...");
  }
}
```

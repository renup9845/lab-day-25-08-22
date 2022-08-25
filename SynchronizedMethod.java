public class SynchronizedMethod
{
public static void main(String[] args) 
{
// Create an object of class Table.	
  Table obj = new Table();
  Thread1 t1 = new Thread1(obj);
  Thread2 t2 = new Thread2(obj);
    t1.start(); 
    t2.start();
 }
}

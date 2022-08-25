public class Table 
{
  // Here, method is synchronized.
synchronized void printTable(int n) 
{
for(int i = 1; i <= 5; i++)
{  
 System.out.println(n * i);  
 try
 {  
   Thread.sleep(400);  
 }
catch(InterruptedException ie)
{
 System.out.println(ie);
 }  
 }}  
}
public class Thread1 extends Thread
{
// Declaration of variable t of class type Table.
  Table t; 
// Declare one parameterized constructor and pass variable t as a parameter.
Thread1(Table t)
{  
   this.t = t;  
}  
public void run()
{  
   t.printTable(2);  
 }  
}
public class Thread2 extends Thread
{
Table t;  
Thread2(Table t)
{  
  this.t = t;  
}  
public void run()
{  
  t.printTable(10);  
 }  
}

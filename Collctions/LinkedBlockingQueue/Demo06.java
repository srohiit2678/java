import java.util.concurrent.*;
class Demo06
{
public static void main(String[] args)throws InterruptedException
{
LinkedBlockingQueue li = new LinkedBlockingQueue(3); // 3 (capacity) elements
li.put(10); 
li.put(20);
li.put(30);//will insert 3 and wait for more space to insert next elements upto infinity
li.put(40);
li.put(50);
System.out.println(li);
}
}
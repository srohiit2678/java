import java.util.concurrent.*;
class Demo05
{
public static void main(String[] args)
{
LinkedBlockingQueue li = new LinkedBlockingQueue(3); // 3 (capacity) elements
li.offer(10); 
li.offer(20);
li.offer(30);// only 3 will insert remaining where rejecte
li.offer(40);
li.offer(50);
System.out.println(li);
}
}
import java.util.concurrent.*;
class Demo10
{
public static void main(String[] args)
{
LinkedBlockingQueue li = new LinkedBlockingQueue(); // 3 (capacity) elements
li.offer(10); 
li.offer(20);
li.offer(30);
li.offer(40);
li.offer(50);
System.out.println(li.poll());// element
System.out.println(li.poll());//remove FIFO if no element exist than null
System.out.println(li);

}
}
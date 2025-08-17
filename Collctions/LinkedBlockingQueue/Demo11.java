import java.util.concurrent.*;
class Demo11
{
public static void main(String[] args)
{
LinkedBlockingQueue li = new LinkedBlockingQueue(); // 3 (capacity) elements
li.offer(10); 
li.offer(20);
li.offer(30);
li.offer(40);
li.offer(50);
System.out.println(li.remove());// element
System.out.println(li.remove());//remove FIFO if no element exist than NoSuchElementException
System.out.println(li);

}
}
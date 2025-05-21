import java.util.concurrent.*;
class Demo04
{
public static void main(String[] args)
{
LinkedBlockingQueue li = new LinkedBlockingQueue(3); // 3 (capacity) elements
li.add(10); 
li.add(20);
li.add(30);
li.add(40);// throw IllegalStateException : Queue is full
// 3 elements are allowed to insert
li.add(50);
System.out.println(li);
}
}
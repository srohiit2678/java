/* 1 */



class Foo
{
static int x=100;

void m()
{
System.out.println(x);
x++;
}
}
 
class Test
{
public static void main(String... a)
{
Foo f1=new Foo();
Foo f2=new Foo();
Foo f3=new Foo();

f1.m();
f2.m();
f3.m();
}
}

/* //2
import java.util.Scanner;

class Student
{
int roll;
String name;
double per;

void getStudent()
{
Scanner sc=new Scanner(System.in);
System.out.println("ENter roll no=");
roll=sc.nextInt();

System.out.println("ENter Name=");
name=sc.next();

System.out.println("ENter percentage=");
per=sc.nextDouble();

}

 void putStudent()
{
System.out.println("Roll no="+roll);
System.out.println("Name="+name);
System.out.println("Percentage="+per);
System.out.println();
}
}

class Test
{
public static void main(String arg[])
{
Student s[]=new Student[3];
int i;

for(i=0;i<s.length;i++)
{
s[i]=new Student();
s[i].getStudent();
}
for(i=0;i<s.length;i++)
{
s[i].putStudent();
}
}
}
 */

/*//3
class Test
{
public static void main(String arg[])
{
int x=100;

byte b=(byte)x;

System.out.println(b);
}
}

//
//DPA(Dynamic Polymorphic Assignment)
//Assigning child class's object into parent class's reference variable
class Foo
{
void m()
{
System.out.println("Hello Foo");
}
}


class Doo extends Foo
{
void m()
{
System.out.println("Hello Doo");
}
}

class Test
{
public static void main(String arg[])
{
Foo f=new Doo();
f.m();
}
}

//
//DPA(Dynamic Polymorphic Assignment)
//Assigning child class's object into parent class's reference variable
class Foo
{
void m()
{
System.out.println("Hello Foo");
}
}


class Doo extends Foo
{
void m()
{
System.out.println("Hello Doo");
}
void n()
{
System.out.println("Bye");
}
}

class Test
{
public static void main(String arg[])
{
Foo f=new Doo();
f.m();
f.n();//error
}
}

//
import java.util.Scanner;

class Test
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter 1st value=");
int x=sc.nextInt();

System.out.print("Enter 2nd value=");
int y=sc.nextInt();
try
{
System.out.println("inside try");
int z=x/y;

System.out.println("Value="+z);
}
catch(NullPointerException e)
{
System.out.println(e.getMessage());
}
finally
{
System.out.println("chalega hi chalega");
}
System.out.println("Rest code");
}
}
//


*/

/* //4
class Raj
{
Raj()
{
System.out.println("Raj Kapoor");
}
}
//

class Raj
{
Raj()
{
super();
System.out.println("Raj Kapoor");
}
}

class Rishi extends Raj
{
Rishi()
{
super();
System.out.println("Rishi Kapoor");
}
}

class Ranbir extends Rishi
{
Ranbir()
{
super();
System.out.println("Ranbir Kapoor");
}
}

class Test
{
public static void main(String arg[])
{
Ranbir r=new Ranbir();

}
}

//
 class Foo
{
Foo(int a,int b)
{
System.out.println("Add="+(a+b));
}
}

class Doo extends Foo
{
Doo()
{
super(12,13);
System.out.println("Hello");
}
}

class Test
{
public static void main(String arg[])
{
Doo d=new Doo();
}
}


//
class Foo
{
int x=100;
}

class Doo extends Foo
{
int x=200;
void m()
{
System.out.println("Value="+super.x);
System.out.println("Value="+x);
}
}

class Test
{
public static void main(String arg[])
{
Doo d=new Doo();
d.m();
}
}

//
class Foo
{
void fun()
{
System.out.println("Hello Foo");
}
}

class Doo extends Foo
{
void fun()
{
System.out.println("Hello Doo");
}
void m()
{
super.fun();
}
}

class Test
{
public static void main(String arg[])
{
Doo d=new Doo();
d.m();
}
}
//
Checked Exception->Except decendent of RuntimeException every exception are checked exception.

Unchecked Exception->Decendent of RuntimeException is known as unchecked exception.

//
class Test
{
public static void main(String arg[])
{
Class.forName("com.mysql.jdbc.Driver");
}
}
//
import java.sql.*;

class Test
{
public static void main(String arg[])
{
Connection cn=DriverManager.getConnection("","","");
}
}

//
import java.io.*;

class Test
{
public static void main(String arg[])
{
FileOutputStream fos=new FileOutputStream("Hello.txt");
}
}
// 
import java.io.*;

class Test
{
public static void main(String arg[])
{
System.out.println("Hiii");
try
{
Thread.sleep(3000);
}
catch(Exception e)
{

}
System.out.println("Bye");
}
}
//

import java.util.Scanner;
import java.io.*;

class Foo
{
void m()throws Exception
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter first value=");
int x=sc.nextInt();
System.out.print("Enter second value=");
int y=sc.nextInt();

int z=x/y;

System.out.println("Value="+z);
}
}



class Doo
{
void n()throws Exception
{
Foo f=new Foo();
f.m();
}
}



class Test
{
public static void main(String arg[])
{
try
{
Doo d=new Doo();
d.n();
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
System.out.println("Rest code");
}
}
//
import java.util.Scanner;
import java.io.*;

class Foo
{
void m()throws Exception
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter first value=");
int x=sc.nextInt();
System.out.print("Enter second value=");
int y=sc.nextInt();

int z=x/y;

System.out.println("Value="+z);
}
}



class Doo
{
void n()throws Exception
{
Foo f=new Foo();
f.m();
}
}



class Test
{
public static void main(String arg[])throws Exception
{

Doo d=new Doo();
d.n();
System.out.println("Rest code");
}
}
//



 */

/* //5
class Test
{
public static void main(String arg[])
{
Integer x=new Integer(100);
System.out.println("Value="+x);
}
}
//
class Test
{
public static void main(String arg[])
{
Integer x=100;
System.out.println("Value="+x);
}
}

//
class Test
{
public static void main(String arg[])
{
String s1="12";
String s2="34";
System.out.println("Value="+(s1+s2));
}
}
//

//convert string to Integer
class Test
{
public static void main(String arg[])
{
String s1="12";
String s2="34";

Integer i1=Integer.parseInt(s1);
Integer i2=Integer.parseInt(s2);

System.out.println("Value="+(i1+i2));
}
}
//
class Test
{
public static void main(String arg[])
{
String s1="12.3";
String s2="34.5";


Float i1=Float.parseFloat(s1);
Float i2=Float.parseFloat(s2);

System.out.println("value="+(i1+i2));
}
}
//
//convert non-primitive into string
class Test
{
public static void main(String arg[])
{
Integer i=100;

String s=i.toString();
System.out.println("value="+s);
}
}
//
//convert primitive into non-primitive
//boxing
class Test
{
public static void main(String arg[])
{
int x=100;
 
Integer i=Integer.valueOf(x);
System.out.println("value="+i);
}
}
//
//convert primitive into non-primitive
//Auto-boxing
class Test
{
public static void main(String arg[])
{
int x=100;
 
Integer i=x;
System.out.println("value="+i);
}
}
//
//convert non-primitive into primitive
//Unboxing
//xxxValue()
class Test
{
public static void main(String arg[])
{
Integer i=100;
int x=i.intValue();
System.out.println("value="+x);
}
}
//
//convert non-primitive into primitive
//Auto-unboxing

class Test
{
public static void main(String arg[])
{
Integer i=100;
int x=i;
System.out.println("value="+x);
}
}
//
//convert primitive into string
class Test
{
public static void main(String arg[])
{
int i=100;

String s=String.valueOf(i);
System.out.println("value="+s);
}
}

//
//convert String into primitive
class Test
{
public static void main(String arg[])
{
String s="100";

int i=Integer.parseInt(s);
System.out.println(i);
}
}
//




 */

/* // 6
 The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.


Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

Java Collection means a single unit of objects. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).



What is Collection in Java
A Collection represents a single unit of objects, i.e., a group.
//
import java.util.ArrayList;

class Test
{
public static void main(String arg[])
{
String s[]={"Ramlal","Shamlal","Babulal","Jhetalal","Shantilal"};

for(String i:s)
{
System.out.println(i);
}

}
}

//

import java.util.ArrayList;

class Test
{
public static void main(String arg[])
{
ArrayList<Integer> al=new ArrayList<>();
al.add(12);
al.add(11);
al.add(32);
al.add(24);
al.add(17);

for(Integer i:al)
{
System.out.println(i);
}
}
}
//
import java.util.ArrayList;
import java.util.Iterator;

class Test
{
public static void main(String arg[])
{
ArrayList<Integer> al=new ArrayList<>();
al.add(12);
al.add(11);
al.add(32);
al.add(24);
al.add(17);


Iterator itr=al.iterator();

while(itr.hasNext())
{
System.out.println(itr.next());
}


}
}
//
import java.util.ArrayList;
import java.util.ListIterator;

class Test
{
public static void main(String arg[])
{
ArrayList<Integer> al=new ArrayList<>();
al.add(12);
al.add(11);
al.add(32);
al.add(24);
al.add(17);


ListIterator itr=al.listIterator();

while(itr.hasNext())
{
System.out.println(itr.next());
}
System.out.println(al);
System.out.println();



while(itr.hasPrevious())
{
System.out.println(itr.previous());
}
System.out.println(al);
}
}

//
import java.util.Vector;
import java.util.ListIterator;

class Test
{
public static void main(String arg[])
{
Vector<Integer> al=new Vector<>();
al.add(12);
al.add(11);
al.add(32);
al.add(24);
al.add(17);


ListIterator itr=al.listIterator();

while(itr.hasNext())
{
System.out.println(itr.next());
}
System.out.println(al);
System.out.println();



while(itr.hasPrevious())
{
System.out.println(itr.previous());
}
System.out.println(al);
}
}
//
import java.util.LinkedList;
import java.util.ListIterator;

class Test
{
public static void main(String arg[])
{
LinkedList<Integer> al=new LinkedList<>();
al.add(12);
al.add(11);
al.add(32);
al.add(24);
al.add(17);


ListIterator itr=al.listIterator();

while(itr.hasNext())
{
System.out.println(itr.next());
}
System.out.println(al);
System.out.println();



while(itr.hasPrevious())
{
System.out.println(itr.previous());
}
System.out.println(al);
}
}
//

import java.util.LinkedList;
import java.util.ListIterator;

class Test
{
public static void main(String arg[])
{
LinkedList<Integer> al=new LinkedList<>();
al.add(12);
al.add(11);
al.add(32);
al.add(24);
al.add(17);


ListIterator itr=al.listIterator();

while(itr.hasNext())
{
System.out.println(itr.next());
}
System.out.println(al);
System.out.println();



while(itr.hasPrevious())
{
System.out.println(itr.previous());
}
System.out.println(al);
}
}
//


 */

 /*// 7    
 
 import java.util.HashSet;

class Test
{
public static void main(String arg[])
{
HashSet<Integer> al=new HashSet<>();

al.add(12);
al.add(11);
al.add(32);
al.add(24);
al.add(17);
al.add(12);
System.out.println(al);
}
}
//
import java.util.LinkedHashSet;

class Test
{
public static void main(String arg[])
{
LinkedHashSet<Integer> al=new LinkedHashSet<>();

al.add(12);
al.add(11);
al.add(32);
al.add(24);
al.add(17);
al.add(12);
System.out.println(al);
}
}
//
import java.util.TreeSet;

class Test
{
public static void main(String arg[])
{
TreeSet<Integer> al=new TreeSet<>();

al.add(12);
al.add(11);
al.add(32);
al.add(24);
al.add(17);
al.add(12);
System.out.println(al);
}
}
//
import java.util.ArrayList;
import java.util.Collections;

class Test
{
public static void main(String arg[])
{
ArrayList<Integer> al=new ArrayList<>();

al.add(12);
al.add(11);
al.add(32);
al.add(24);
al.add(17);
al.add(12);
System.out.println(al);

Collections.sort(al);

System.out.println(al);
}
}
//
class Foo
{
public String toString()
{
return "Hello";
}
}

class Test
{
public static void main(String arg[])
{
Foo f=new Foo();
System.out.println(f.toString());
}
}
//
public class Student {

int roll;
String name;
float per;

    public Student(int roll, String name, float per) {
        this.roll = roll;
        this.name = name;
        this.per = per;
    }

    @Override
    public String toString() {
        return roll + ":" + name + ":" + per;
    }


   
}
//
import java.util.ArrayList;


public class Test1 {

    public static void main(String[] args) {
       
    Student s1=new Student(102,"Shamlal",12.3f);    
    Student s2=new Student(103,"Babulal",15.5f);
    Student s3=new Student(101,"Ramlal",23.45f);
     
        ArrayList<Student> al=new ArrayList<>();
       
        al.add(s1);
        al.add(s2);
        al.add(s3);
   
        System.out.println(al);
    }

   
}


 */

 /*//11 
 import java.util.ArrayList;

class Test
{
public static void main(String arg[])
{
ArrayList<Integer> al=new ArrayList<>();

al.add(12);
al.add(11);
al.add(32);
al.add(24);
al.add(17);

System.out.println(al);

al.remove(1);
System.out.println(al);

boolean b=al.isEmpty();

System.out.println(b);

al.clear();
System.out.println(al);

b=al.isEmpty();

System.out.println(b);

}
}
//
import java.util.ArrayList;

class Test
{
public static void main(String arg[])
{
ArrayList<Integer> al=new ArrayList<>();

boolean x=al.add(12);
al.add(11);
al.add(32);
al.add(24);
al.add(17);
System.out.println(x);
System.out.println(al);

al.remove(1);
System.out.println(al);

boolean b=al.isEmpty();

System.out.println(b);

al.clear();
System.out.println(al);

b=al.isEmpty();

System.out.println(b);

}
}
//
import java.util.ArrayList;

class Test
{
public static void main(String arg[])
{
ArrayList<Integer> al1=new ArrayList<>();

al1.add(12);
al1.add(11);
al1.add(32);
al1.add(24);
al1.add(17);

ArrayList<Integer> al2=new ArrayList<>();

al2.add(12);
al2.add(13);
al2.add(32);
al2.add(22);
al2.add(17);


al1.addAll(al2);


System.out.println(al1);
System.out.println(al2);
}
}

//
import java.util.ArrayList;

class Test
{
public static void main(String arg[])
{
ArrayList<Integer> al1=new ArrayList<>();

al1.add(12);
al1.add(11);
al1.add(32);
al1.add(24);
al1.add(17);

ArrayList<Integer> al2=new ArrayList<>();

al2.add(12);
al2.add(13);
al2.add(32);
al2.add(22);
al2.add(17);


al1.removeAll(al2);


System.out.println(al1);
System.out.println(al2);
}
}
//
import java.util.ArrayList;

class Test
{
public static void main(String arg[])
{
ArrayList<Integer> al1=new ArrayList<>();

al1.add(12);
al1.add(11);
al1.add(32);
al1.add(24);
al1.add(17);

ArrayList<Integer> al2=new ArrayList<>();

al2.add(12);
al2.add(13);
al2.add(32);
al2.add(22);
al2.add(17);


al1.retainAll(al2);


System.out.println(al1);
System.out.println(al2);
}
}
//
import java.util.HashMap;

class Test
{
public static void main(String arg[])
{
HashMap<Integer,String> hm=new HashMap<>();


hm.put(101,"Ramlal");
hm.put(102,"Shamlal");
hm.put(103,"Babulal");
hm.put(101,"Shantilal");
System.out.println(hm);

}
}
//
import java.util.LinkedHashMap;

class Test
{
public static void main(String arg[])
{
LinkedHashMap<Integer,String> hm=new LinkedHashMap<>();


hm.put(101,"Ramlal");
hm.put(102,"Shamlal");
hm.put(103,"Babulal");
hm.put(101,"Shantilal");
System.out.println(hm);

}
}
//
import java.util.LinkedHashMap;

class Test
{
public static void main(String arg[])
{
LinkedHashMap<String,String> hm=new LinkedHashMap<>();


hm.put("abc","Ramlal");
hm.put("def","Shamlal");
hm.put("ghi","Babulal");

System.out.println(hm);

}
}
//
import java.util.TreeMap;

class Test
{
public static void main(String arg[])
{
TreeMap<String,String> hm=new TreeMap<>();


hm.put("def","Ramlal");
hm.put("abc","Shamlal");
hm.put("ghi","Babulal");

System.out.println(hm);

}
}
//


 
 */
/*//12
ArrayList    LinkedList
1) ArrayList internally uses a dynamic array to store the elements.    LinkedList internally uses a doubly linked list to store the elements.
2) Manipulation with ArrayList is slow because it internally uses an array. If any element is removed from the array, all the other elements are shifted in memory.    Manipulation with LinkedList is faster than ArrayList because it uses a doubly linked list, so no bit shifting is required in memory.
3) An ArrayList class can act as a list only because it implements List only.    LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
4) ArrayList is better for storing and accessing data.    LinkedList is better for manipulating data.
5) The memory location for the elements of an ArrayList is contiguous.    The location for the elements of a linked list is not contagious.
6) Generally, when an ArrayList is initialized, a default capacity of 10 is assigned to the ArrayList.    There is no case of default capacity in a LinkedList. In LinkedList, an empty list is created when a LinkedList is initialized.
7) To be precise, an ArrayList is a resizable array.    LinkedList implements the doubly linked list of the list interface.

...........................................................

HashSet    LinkedHashSet    TreeSet
How they work internally?    HashSet uses HashMap internally to store it’s elements.    LinkedHashSet uses  LinkedHashMap internally to store it’s elements.    TreeSet uses TreeMap internally to store it’s elements.
Order Of Elements    HashSet doesn’t maintain any order of elements.    LinkedHashSet maintains insertion order of elements. i.e elements are placed as they are inserted.    TreeSet orders the elements according to supplied Comparator. If no comparator is supplied, elements will be placed in their natural ascending order.
Performance    HashSet gives better performance than the LinkedHashSet and TreeSet.    The performance of LinkedHashSet is between HashSet and TreeSet. It’s performance is almost similar to HashSet. But slightly in the slower side as it also maintains LinkedList internally to maintain the insertion order of elements.    TreeSet gives less performance than the HashSet and LinkedHashSet as it has to sort the elements after each insertion and removal operations.
Insertion, Removal And Retrieval Operations    HashSet gives performance of order O(1) for insertion, removal and retrieval operations.    LinkedHashSet also gives performance of order O(1) for insertion, removal and retrieval operations.    TreeSet gives performance of order O(log(n)) for insertion, removal and retrieval operations.
How they compare the elements?    HashSet uses equals() and hashCode() methods to compare the elements and thus removing the possible duplicate elements.    LinkedHashSet also uses equals() and hashCode() methods to compare the elements.    TreeSet uses compare() or compareTo() methods to compare the elements and thus removing the possible duplicate elements. It doesn’t use equals() and hashCode() methods for comparision of elements.
Null elements    HashSet allows maximum one null element.    LinkedHashSet also allows maximum one null element.    TreeSet doesn’t allow even a single null element. If you try to insert null element into TreeSet, it throws NullPointerException.
Memory Occupation    HashSet requires less memory than LinkedHashSet and TreeSet as it uses only HashMap internally to store its elements.    LinkedHashSet requires more memory than HashSet as it also maintains LinkedList along with HashMap to store its elements.    TreeSet also requires more memory than HashSet as it also maintains Comparator to sort the elements along with the TreeMap.
When To Use?    Use HashSet if you don’t want to maintain any order of elements.    Use LinkedHashSet if you want to maintain insertion order of elements.    Use TreeSet if you want to sort the elements according to some Comparator.
..................................................
//

import java.util.*;  
class Test{
 
public static void main(String args[]){
 
PriorityQueue<String> queue=new PriorityQueue<String>();  
queue.add("Amit");  
queue.add("Vijay");  
queue.add("Karan");  
queue.add("Jai");  
queue.add("Rahul");  
System.out.println("head:"+queue.element());  
 
System.out.println("iterating the queue elements:");  
Iterator itr=queue.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
queue.remove();  
System.out.println("after removing one elements:");  
Iterator<String> itr2=queue.iterator();  
while(itr2.hasNext()){  
System.out.println(itr2.next());  
}  
}  
}
//

import java.util.HashMap;
import java.util.Iterator;

class Test
{
public static void main(String args[])  
{  
HashMap<Integer, String> hm = new HashMap<Integer, String>();  //implements map interface  
hm.put(110,"Ravi");  
hm.put(120,"Prateek");  
hm.put(130, "Davesh");    
hm.put(140, "Kamal");  
hm.put(150, "Pawan");  
Iterator<Integer> it=hm.keySet().iterator();  //keyset is a method which gives Collection's type object
while(it.hasNext())  
{  
int key=it.next();  
System.out.println("Roll no.: "+key+"     name: "+hm.get(key));  
}  
}  
}

//

 */

/*
 * //13
 
 ankit@ankit-pc:~$ mysql -u root -p
Enter password:
ERROR 1045 (28000): Access denied for user 'root'@'localhost' (using password: YES)
ankit@ankit-pc:~$ mysql -u root -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 9
Server version: 8.0.35-0ubuntu0.20.04.1 (Ubuntu)

Copyright (c) 2000, 2023, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| COLLEGE            |
| clg                |
| college            |
| company            |
| dbn                |
| exam               |
| hospital           |
| information_schema |
| mysql              |
| performance_schema |
| phpmyadmin         |
| sys                |
+--------------------+
12 rows in set (0.01 sec)

mysql> create database College;
Query OK, 1 row affected (0.02 sec)

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| COLLEGE            |
| College            |
| clg                |
| college            |
| company            |
| dbn                |
| exam               |
| hospital           |
| information_schema |
| mysql              |
| performance_schema |
| phpmyadmin         |
| sys                |
+--------------------+
13 rows in set (0.00 sec)

mysql> use College;
Database changed
mysql> show tables;
Empty set (0.00 sec)

mysql> create table student(RollNo int,name text,Percentage float);
Query OK, 0 rows affected (0.04 sec)

mysql> show tables;
+-------------------+
| Tables_in_College |
+-------------------+
| student           |
+-------------------+
1 row in set (0.00 sec)

mysql> insert into student values(101,'Ramlal',12.3);
Query OK, 1 row affected (0.01 sec)

mysql> select * from student;
+--------+--------+------------+
| RollNo | name   | Percentage |
+--------+--------+------------+
|    101 | Ramlal |       12.3 |
+--------+--------+------------+
1 row in set (0.00 sec)

mysql> insert into student values(102,'Shamlal',15.5);
Query OK, 1 row affected (0.01 sec)

mysql> insert into student(name,rollno,percentage) values('Ankit',103,99.99);
Query OK, 1 row affected (0.00 sec)

mysql> select * from student;
+--------+---------+------------+
| RollNo | name    | Percentage |
+--------+---------+------------+
|    101 | Ramlal  |       12.3 |
|    102 | Shamlal |       15.5 |
|    103 | Ankit   |      99.99 |
+--------+---------+------------+
3 rows in set (0.00 sec)

mysql> select rollno from student;
+--------+
| rollno |
+--------+
|    101 |
|    102 |
|    103 |
+--------+
3 rows in set (0.00 sec)

mysql> select rollno,name from student;
+--------+---------+
| rollno | name    |
+--------+---------+
|    101 | Ramlal  |
|    102 | Shamlal |
|    103 | Ankit   |
+--------+---------+
3 rows in set (0.00 sec)

mysql> select * from student;
+--------+---------+------------+
| RollNo | name    | Percentage |
+--------+---------+------------+
|    101 | Ramlal  |       12.3 |
|    102 | Shamlal |       15.5 |
|    103 | Ankit   |      99.99 |
+--------+---------+------------+
3 rows in set (0.00 sec)

mysql> select * from student orderby name;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'name' at line 1
mysql> select * from student order by name;
+--------+---------+------------+
| RollNo | name    | Percentage |
+--------+---------+------------+
|    103 | Ankit   |      99.99 |
|    101 | Ramlal  |       12.3 |
|    102 | Shamlal |       15.5 |
+--------+---------+------------+
3 rows in set (0.00 sec)

mysql> select * from student order by name desc;
+--------+---------+------------+
| RollNo | name    | Percentage |
+--------+---------+------------+
|    102 | Shamlal |       15.5 |
|    101 | Ramlal  |       12.3 |
|    103 | Ankit   |      99.99 |
+--------+---------+------------+
3 rows in set (0.00 sec)

mysql> select * from student where name='Ramlal';
+--------+--------+------------+
| RollNo | name   | Percentage |
+--------+--------+------------+
|    101 | Ramlal |       12.3 |
+--------+--------+------------+
1 row in set (0.00 sec)

mysql> select * from student where rollno=103;
+--------+-------+------------+
| RollNo | name  | Percentage |
+--------+-------+------------+
|    103 | Ankit |      99.99 |
+--------+-------+------------+
1 row in set (0.01 sec)

mysql> select * from student where percentage>=15 and percentage<=30;
+--------+---------+------------+
| RollNo | name    | Percentage |
+--------+---------+------------+
|    102 | Shamlal |       15.5 |
+--------+---------+------------+
1 row in set (0.00 sec)

mysql> select * from student where percentage>=15 or percentage<=30;
+--------+---------+------------+
| RollNo | name    | Percentage |
+--------+---------+------------+
|    101 | Ramlal  |       12.3 |
|    102 | Shamlal |       15.5 |
|    103 | Ankit   |      99.99 |
+--------+---------+------------+
3 rows in set (0.00 sec)

mysql>

//


ankit@ankit-pc:~$ javac A.java
ankit@ankit-pc:~$ java PredicateInterfaceExample
true
ankit@ankit-pc:~$ javac A.java
ankit@ankit-pc:~$ java PredicateInterfaceExample
false
ankit@ankit-pc:~$ mysql -u root -p;
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 18
Server version: 8.0.35-0ubuntu0.20.04.1 (Ubuntu)

Copyright (c) 2000, 2023, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use College
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> show table;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '' at line 1
mysql> show tables;
+-------------------+
| Tables_in_College |
+-------------------+
| student           |
+-------------------+
1 row in set (0.00 sec)

mysql> select * from student;
+--------+---------+------------+
| RollNo | name    | Percentage |
+--------+---------+------------+
|    101 | Ramlal  |       12.3 |
|    102 | Shamlal |       15.5 |
|    103 | Ankit   |      99.99 |
+--------+---------+------------+
3 rows in set (0.01 sec)

mysql> update student set percentage=22.3 where rollno=101;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from student;
+--------+---------+------------+
| RollNo | name    | Percentage |
+--------+---------+------------+
|    101 | Ramlal  |       22.3 |
|    102 | Shamlal |       15.5 |
|    103 | Ankit   |      99.99 |
+--------+---------+------------+
3 rows in set (0.00 sec)

mysql> update student set name='Babulal' where rollno=102;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from student;
+--------+---------+------------+
| RollNo | name    | Percentage |
+--------+---------+------------+
|    101 | Ramlal  |       22.3 |
|    102 | Babulal |       15.5 |
|    103 | Ankit   |      99.99 |
+--------+---------+------------+
3 rows in set (0.00 sec)

mysql> delete from student where rollno=103;
Query OK, 1 row affected (0.02 sec)

mysql> select * from student;
+--------+---------+------------+
| RollNo | name    | Percentage |
+--------+---------+------------+
|    101 | Ramlal  |       22.3 |
|    102 | Babulal |       15.5 |
+--------+---------+------------+
2 rows in set (0.00 sec)

mysql> alter table student change name student_name text;
Query OK, 0 rows affected (0.03 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select * from student;
+--------+--------------+------------+
| RollNo | student_name | Percentage |
+--------+--------------+------------+
|    101 | Ramlal       |       22.3 |
|    102 | Babulal      |       15.5 |
+--------+--------------+------------+
2 rows in set (0.00 sec)

mysql> alter table student add mobile text;
Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select * from student;
+--------+--------------+------------+--------+
| RollNo | student_name | Percentage | mobile |
+--------+--------------+------------+--------+
|    101 | Ramlal       |       22.3 | NULL   |
|    102 | Babulal      |       15.5 | NULL   |
+--------+--------------+------------+--------+
2 rows in set (0.00 sec)

mysql> update student set mobile='8787878787' where rollno=101;
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from student;
+--------+--------------+------------+------------+
| RollNo | student_name | Percentage | mobile     |
+--------+--------------+------------+------------+
|    101 | Ramlal       |       22.3 | 8787878787 |
|    102 | Babulal      |       15.5 | NULL       |
+--------+--------------+------------+------------+
2 rows in set (0.00 sec)

mysql> alter table student drop mobile;
Query OK, 0 rows affected (0.02 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select * from student;
+--------+--------------+------------+
| RollNo | student_name | Percentage |
+--------+--------------+------------+
|    101 | Ramlal       |       22.3 |
|    102 | Babulal      |       15.5 |
+--------+--------------+------------+
2 rows in set (0.00 sec)

mysql> insert into student values(101,'Shamlal',12.3);
Query OK, 1 row affected (0.02 sec)

mysql> select * from student;
+--------+--------------+------------+
| RollNo | student_name | Percentage |
+--------+--------------+------------+
|    101 | Ramlal       |       22.3 |
|    102 | Babulal      |       15.5 |
|    101 | Shamlal      |       12.3 |
+--------+--------------+------------+
3 rows in set (0.00 sec)

mysql> drop table student;
Query OK, 0 rows affected (0.02 sec)

mysql> show tables;
Empty set (0.00 sec)

mysql> create table student(rollno int primary key,name text,perce
ntage float);
Query OK, 0 rows affected (0.04 sec)

mysql> insert into student values(101,'Shamlal',12.3);
Query OK, 1 row affected (0.01 sec)

mysql> insert into student values(101,'Babulal',11.3);
ERROR 1062 (23000): Duplicate entry '101' for key 'student.PRIMARY'
mysql> insert into student values(102,'Shamlal',12.3);
Query OK, 1 row affected (0.01 sec)

mysql> select * from student;
+--------+---------+------------+
| rollno | name    | percentage |
+--------+---------+------------+
|    101 | Shamlal |       12.3 |
|    102 | Shamlal |       12.3 |
+--------+---------+------------+
2 rows in set (0.01 sec)

mysql> drop database College;
Query OK, 1 row affected (0.02 sec)

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| COLLEGE            |
| clg                |
| college            |
| company            |
| dbn                |
| exam               |
| hospital           |
| information_schema |
| mysql              |
| performance_schema |
| phpmyadmin         |
| sys                |
+--------------------+
12 rows in set (0.00 sec)

mysql>
 */
/*



//15

JDBC Connectivity

Steps

1.Load the driver class

Class.forName("");

2.Create Connection Object

Connection cn=DriverManager.getConnection("url","username","password");


3.Make the statement Object
Statement smt=cn.createStatement();

4.Execute the query
a.
DML Operation->
int i=smt.executeUpdate();

b.
DDL Operation->
ResultSet rs=smt.executeQuery();

5. Close the connection
cn.close();
 


///


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test1 {
    public static void main(String[] args) {
     
    try
    {
     Class.forName("com.mysql.cj.jdbc.Driver");
    Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
    Statement smt=cn.createStatement();
     int i=smt.executeUpdate("insert into student values(101,'Ramlal',12.3)");
    if(i>0)
    {
        System.out.println("Data Insert");  
    }
    cn.close();
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());  
    }
       
    }
}
*/
/*
//18
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
     
    try
    {
       
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter roll no=");
        int roll=sc.nextInt();
       
       
        System.out.print("Enter name=");
        String name=sc.next();
       
        System.out.print("Enter Percentage=");
        float per=sc.nextFloat();
       
        //load the driver class
     Class.forName("com.mysql.cj.jdbc.Driver");
   //make connection object
     Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
   //make the statement object
     Statement smt=cn.createStatement();
     
     //execute query
     int i=smt.executeUpdate("insert into student values("+roll+",'"+name+"',"+per+")");
    if(i>0)
    {
        System.out.println("Data Insert");  
    }
    cn.close();
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());  
    }
       
    }
}


*/

/*//20
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class Test2 {
    public static void main(String[] args) {
     
    try
    {
       
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter roll no=");
        int roll=sc.nextInt();
       
       
        System.out.print("Enter name=");
        String name=sc.next();
       
        System.out.print("Enter Percentage=");
        float per=sc.nextFloat();
       
        //load the driver class
     Class.forName("com.mysql.cj.jdbc.Driver");
   //make connection object
     Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
   //make the statement object
        PreparedStatement ps=cn.prepareStatement("insert into student values(?,?,?)");
        ps.setInt(1, roll);
        ps.setString(2, name);
        ps.setFloat(3, per);
   
        boolean b=ps.execute();
    if(b==false)
    {
        System.out.println("Data Insert");  
    }
    cn.close();
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());  
    }
       
    }
}
 */

 /*//20

 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
     
    try
    {
       
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter roll no where you want update=");
        int roll=sc.nextInt();
       
       
        System.out.print("Enter new name=");
        String name=sc.next();
       
       
       
        //load the driver class
     Class.forName("com.mysql.cj.jdbc.Driver");
   //make connection object
     Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
   //make the statement object
     Statement smt=cn.createStatement();
     
     //execute query
     int i=smt.executeUpdate("update student set name='"+name+"' where roll="+roll);
    if(i>0)
    {
        System.out.println("Data Update");  
    }
    cn.close();
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());  
    }
       
    }
}
//

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Test5 {
    public static void main(String[] args) {
     
    try
    {
       
       
        //load the driver class
     Class.forName("com.mysql.cj.jdbc.Driver");
   //make connection object
     Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
   //make the statement object
     Statement smt=cn.createStatement();
     
     //execute query
     ResultSet rs=smt.executeQuery("select * from student");
   
     while(rs.next())
     {
         //System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3));  
     //System.out.println(rs.getString("roll")+","+rs.getString("name")+","+rs.getString("percentage"));
         //System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getFloat(3));  
     
     System.out.println(rs.getInt("roll")+","+rs.getString("name")+","+rs.getFloat("percentage"));
     }
     
     
    cn.close();
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());  
    }
       
    }
}

Add class comment…


Announcement: "import java.sql.Connection; import…"
class
Created Dec 20, 2023Dec 20, 2023
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class Test4 {
    public static void main(String[] args) {
     
    try
    {
       
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter roll no where u want update=");
        int roll=sc.nextInt();
       
       
        System.out.print("Enter new name=");
        String name=sc.next();
       
       
       
        //load the driver class
     Class.forName("com.mysql.cj.jdbc.Driver");
   //make connection object
     Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
   //make the statement object
        PreparedStatement ps=cn.prepareStatement("update student set name=? where roll=?");
       
        ps.setString(1, name);
        ps.setInt(2, roll);
   
        boolean b=ps.execute();
    if(b==false)
    {
        System.out.println("Data Update");  
    }
    cn.close();
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());  
    }
       
    }
}

  */

  /*// 21

  ankit@ankit-pc:~$ mysql -u root -p;
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 8
Server version: 8.0.35-0ubuntu0.20.04.1 (Ubuntu)

Copyright (c) 2000, 2023, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use demo
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> create table station(train_no int,name text,distance float);
Query OK, 0 rows affected (0.05 sec)

mysql> insert into station value(11464,'Amritsar_Express',1350);
Query OK, 1 row affected (0.01 sec)

mysql> select * from station;
+----------+------------------+----------+
| train_no | name             | distance |
+----------+------------------+----------+
|    11464 | Amritsar_Express |     1350 |
+----------+------------------+----------+
1 row in set (0.00 sec)

mysql> DELIMITER &&  
mysql> CREATE PROCEDURE get_train()  
    -> BEGIN  
    -> insert into station values(66767,'samstipur_express',1200);
    -> update station set name='Mangalnath_express' where trainno=11464;
    -> select * from station;
    ->      
    -> END
    -> && DELIMITER ;
Query OK, 0 rows affected (0.02 sec)

    ->
[1]+  Stopped                 mysql -u root -p
ankit@ankit-pc:~$ mysql -u root -p;
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 9
Server version: 8.0.35-0ubuntu0.20.04.1 (Ubuntu)

Copyright (c) 2000, 2023, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use demo;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> select * from station;
+----------+------------------+----------+
| train_no | name             | distance |
+----------+------------------+----------+
|    11464 | Amritsar_Express |     1350 |
+----------+------------------+----------+
1 row in set (0.00 sec)

mysql> call get_train;
ERROR 1054 (42S22): Unknown column 'trainno' in 'where clause'
mysql> alter table station change train_no trainno int;\
Query OK, 0 rows affected (0.04 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> call get_train;
+---------+--------------------+----------+
| trainno | name               | distance |
+---------+--------------------+----------+
|   11464 | Mangalnath_express |     1350 |
|   66767 | samstipur_express  |     1200 |
|   66767 | samstipur_express  |     1200 |
+---------+--------------------+----------+
3 rows in set (0.02 sec)

Query OK, 0 rows affected (0.02 sec)

mysql> drop procedure get_train;
Query OK, 0 rows affected (0.01 sec)

mysql> DELIMITER &&  
mysql> CREATE PROCEDURE get_train(no int,naam text,distance float,update_name text,uno int)  
    -> BEGIN  
    -> insert into station values(66767,'samstipur_express',1200);
    -> update station set name='Mangalnath_express' where trainno=11464;
    -> select * from station;
    ->      
    -> END
    -> && DELIMITER ;
Query OK, 0 rows affected (0.02 sec)

    ->
[2]+  Stopped                 mysql -u root -p
ankit@ankit-pc:~$ mysql -u root -p;
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 10
Server version: 8.0.35-0ubuntu0.20.04.1 (Ubuntu)

Copyright (c) 2000, 2023, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use demo
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> drop procedure get_train;
Query OK, 0 rows affected (0.02 sec)

mysql> DELIMITER &&  
mysql> CREATE PROCEDURE get_train(no int,naam text,distance float,update_name text,uno int)  
    -> BEGIN  
    -> insert into station values(no,naam,distance);
    -> update station set name=update_name where trainno=uno;
    -> select * from station;
    ->      
    -> END
    -> && DELIMITER ;
Query OK, 0 rows affected (0.02 sec)

    ->
[3]+  Stopped                 mysql -u root -p
ankit@ankit-pc:~$ mysql -u root -p;
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 11
Server version: 8.0.35-0ubuntu0.20.04.1 (Ubuntu)

Copyright (c) 2000, 2023, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use demo
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> call get_train(14326,'Punjab_mail',1000,'Gujrat_Express',11464);
+---------+-------------------+----------+
| trainno | name              | distance |
+---------+-------------------+----------+
|   11464 | Gujrat_Express    |     1350 |
|   66767 | samstipur_express |     1200 |
|   66767 | samstipur_express |     1200 |
|   14326 | Punjab_mail       |     1000 |
+---------+-------------------+----------+
4 rows in set (0.02 sec)

Query OK, 0 rows affected (0.02 sec)

mysql>
   //
DELIMITER &&  
CREATE PROCEDURE get_train(no int,naam text,distance float,update_name text,uno int)  
BEGIN  
insert into station values(no,naam,distance);
update station set name=update_name where trainno=uno;  
END
&& DELIMITER ;
//
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.DriverManager;

public class Test6 {
    public static void main(String[] args) {
       
       
        try
        {
           
           
            Class.forName("com.mysql.cj.jdbc.Driver");
           
Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
CallableStatement cs=cn.prepareCall("call get_train(32145,'Shanti_Express',1500,'Shatabdi',14326)");
           
            boolean b=cs.execute();
            if(b!=true)
            {
                System.out.println("Data update");
            }
            else
            {
                System.out.println("Data not update");
            }
            cn.close();
           
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}

//


   */

   /*// 25
   import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Serv implements Servlet
{

    @Override
    public void init(ServletConfig config) throws ServletException {
       
    }

    @Override
    public ServletConfig getServletConfig() {
   
        return null;
       
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
   
        PrintWriter   pw=res.getWriter();
        pw.println("Hello All");
    }

    @Override
    public String getServletInfo() {
    return null;    
    }

    @Override
    public void destroy() {
       
    }
   
}

//
*/

/*
 //26

 <html>
<head>
<title>
First Program
</title>
</head>
<body>
Welcome &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;All<br>
hello
</body>
</html>
//
<html>
<body>
<pre>
Hello       All
welcome
</pre>
</body>
</html>

//
<html>
<body>
<h1>Welcome</h1>
<h2>Welcome</h2>
<h3>Welcome</h3>
<h4>Welcome</h4>
<h5>Welcome</h5>
<h6>Welcome</h6>
</body>
</html>
//
<!--
Inline tag example
-->
<html>
<body>
<i>Hello All</i>
Welcome
</body>
</html>
//

<!--
block tag example
-->
<html>
<body>
<h3>Hello All</h3>
Welcome
</body>
</html>

//

<html>
<body>
<p>Today its tuesday.<br> Weather is awsome today</p>
<p>Today its tuesday.<br> Weather is awsome today</p>

</body>
</html>
//
<html>
<body>
<table border="2" align="center">
<caption><h2>Student Result</h2></caption>
<tr>
<th>Roll no</th><th>Name</th><th>Percentage</th>
</tr>
<tr>
<td>101</td><td>Ramlal</td><td>12.3%</td>
</tr>
<tr>
<td>102</td><td>Shamlal</td><td>15.5%</td>
</tr>
<tr>
<td>103</td><td>Ankit</td><td>99.99%</td>
</tr>
</table>
</body>
</html>
//
<html>
<body bgcolor="orange">
<h1 style="color:red;font-size:40">Welcome</h1>
<p style="color:green;font-size:30">Today its tuesday.<br>Weather is awsome today</p>
<p style="color:blue;font-size:20">Today its tuesday.<br>Weather is awsome today</p>
</body>
</html>
//
<html>
<head>
<style>

body
{
background-color:orange;
}

h1
{
color:red;
font-size:40;
}
p
{
color:blue;
font-size:30;
}
</style>
</head>
<body>
<h1>Welcome</h1>
<p>Today its tuesday.<br>Weather is awsome today</p>
<p>Today its tuesday.<br>Weather is awsome today</p>
</body>
</html>

//

<html>
<head>
<link href="tuesday.css" rel="stylesheet">
</head>
<body>
<h1>Welcome</h1>
<p>Today its tuesday.<br>Weather is awsome today</p>
<p>Today its tuesday.<br>Weather is awsome today</p>
</body>
</html>

//

<html>
<body>
<a href="2.html">Click Here</a>
</body>
</html>

//


 */
/*  // 27
 * 
 * <html>
<body>

<form action="2.html" method="post">
<table border="3">
<caption><h2>Student Form</h2></caption>
<tr><td>Name</td><td><input type="text" name="n" placeholder="Enter name" required></td></tr>
<tr><td>Password</td><td><input type="password" name="pwd"></td></tr>
<tr><td>Email</td><td><input type="email" name="mail"></td></tr>
<tr><td>Mobile</td><td><input type="number" name="mob"></td></tr>
<tr><td>Gender</td><td><input type="radio" name="gen" value="male">Male<input type="radio" name="gen" value="female">Female</td></tr>
<tr><td>Hobbies</td><td><input type="checkbox" name="hob" value="playing">Playing<input type="checkbox" name="hob" value="reading">Reading<input type="checkbox" name="hob" value="music">Music</td></tr>
<tr><td>Address</td><td><textarea name="add" rows="5" cols="20"></textarea></td></tr>
<tr><td>State</td><td><select name="st"><option>Choose state</option><option>MP</option><option>UP</option><option>AP</option><option>Delhi</option></select></td></tr>
<tr><td>Choose File</td><td><input type="file" name="img"></td></tr>
<tr><td>DOB</td><td><input type="date" name="dob"></td></tr>
<tr><td><input type="reset" value="clear"></td><td><input type="submit" value="Register"></td></tr>
</table>
</form>
</body>
</html>


 */
   /*// 28
Servlet Life Cycle methods

init()->It will execute when we give first request to the servlet.

service()->It will execute always when ever we give request to servlet.

destroy()->It will execute when server will stop.

//

<!DOCTYPE html>
<!--
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="Add">
            <pre>
<input type="text" name="no1" placeholder="Enter first number">  
<input type="text" name="no2" placeholder="Enter second number">
            <input type="submit" value="Add">
            </pre>
        </form>
    </body>
</html>

//
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Add extends GenericServlet
{

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    PrintWriter pw=res.getWriter();
   
    String num1=req.getParameter("no1");
    String num2=req.getParameter("no2");
       
    int n1=Integer.parseInt(num1);
    int n2=Integer.parseInt(num2);
   
    int n3=n1+n2;
    pw.println("Add="+n3);
    }
   
}

//

   */

   /*
    * 

    //2

    class A
{
static void a()
{
int x=12,y=0,z;
z=x/y;
System.out.println("value="+z);
}
}


class B
{
static void b()
{
A.a();
}
}

class C
{
static void c()
{
B.b();
}
}

class D
{
static void d()
{
C.c();
}
}

class Test
{
public static void main(String arg[])
{
try
{
D.d();
}
catch(Exception e)
{
//System.out.println(e.toString());
e.printStackTrace();
}
System.out.println("Rest code");
}
}
    */

    /*
     * 
     * 
     * //5
     * 
     * if(i>0)
                {
                  // out.println("Data update");
                    //RequestDispatcher rd=request.getRequestDispatcher("Fetch");
                //rd.forward(request, response);
                    response.sendRedirect("Fetch");
                }


//



*/

/*//11
ankit@ankit-pc:~$ mysql -u root -p;
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 13
Server version: 8.0.35-0ubuntu0.20.04.1 (Ubuntu)

Copyright (c) 2000, 2023, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| CLG                |
| COLLEGE            |
| College            |
| DBN                |
| JOB_KHOJO          |
| clg                |
| college            |
| company            |
| dbn                |
| demo               |
| exam               |
| hospital           |
| information_schema |
| mysql              |
| performance_schema |
| phpmyadmin         |
| school             |
| scrap_app          |
| sys                |
+--------------------+
19 rows in set (0.01 sec)

mysql> use DBN;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> show tables;
+---------------+
| Tables_in_DBN |
+---------------+
| student       |
+---------------+
1 row in set (0.00 sec)

mysql> create table user(id int primary key auto_increment,name text,email text unique key);
ERROR 1170 (42000): BLOB/TEXT column 'email' used in key specification without a key length
mysql> create table user(id int primary key auto_increment,name text,email varchar(50) unique key);
Query OK, 0 rows affected (0.04 sec)

mysql> insert into user values('Ramlal','Ram@gmail.com');
ERROR 1136 (21S01): Column count doesn't match value count at row 1
mysql> insert into user(name,email) values('Ramlal','Ram@gmail.com');
Query OK, 1 row affected (0.01 sec)

mysql> select * from user;
+----+--------+---------------+
| id | name   | email         |
+----+--------+---------------+
|  1 | Ramlal | Ram@gmail.com |
+----+--------+---------------+
1 row in set (0.00 sec)

mysql> insert into user(name,email) values('Shamlal','Sham@gmail.com');
Query OK, 1 row affected (0.02 sec)

mysql> select * from user;
+----+---------+----------------+
| id | name    | email          |
+----+---------+----------------+
|  1 | Ramlal  | Ram@gmail.com  |
|  2 | Shamlal | Sham@gmail.com |
+----+---------+----------------+
2 rows in set (0.00 sec)

mysql> drop table user;
Query OK, 0 rows affected (0.02 sec)

mysql> create table user(id int primary key auto_increment,name text,email text unique key);
ERROR 1170 (42000): BLOB/TEXT column 'email' used in key specification without a key length
mysql> create table user(id int primary key auto_increment,name text,email varchar(50) unique key);
Query OK, 0 rows affected (0.04 sec)

mysql> insert into user values(100,'Shamlal','Sham@gmail.com');
Query OK, 1 row affected (0.02 sec)

mysql> delete from user where id=100;
Query OK, 1 row affected (0.02 sec)

mysql> insert into user(name,email) values('Shamlal','Sham@gmail.com');
Query OK, 1 row affected (0.01 sec)

mysql> select * from user;
+-----+---------+----------------+
| id  | name    | email          |
+-----+---------+----------------+
| 101 | Shamlal | Sham@gmail.com |
+-----+---------+----------------+
1 row in set (0.00 sec)

mysql>
*/
class demooooo1{
	//static int x=12;
	  private void sum(){
		System.out.println("1");
	
	}
}
class demooooo2 extends demooooo1{
		private void sum(){
		System.out.println("2");
	
	}	
}
class demooooo{
public static void main(String ar[]){

demooooo1 a = new demooooo1();

demooooo2 b = new demooooo2();
//a.sum();
b.sum();	
}
}

/*
1 -> T
2 -> F
3 -> T
4 -> F (type return_type1 is not compatible with return_type2)
5 -> F(1.5)
6 -> F
7 -> F
8 -> F
9 -> F (can't updated just need to declare first)
10-> F
11-> F
12-> F
13-> F
14-> T
15-> T
16-> T
17-> T
18-> F
19-> F
20-> T
21-> T
22-> F
23-> F
24-> T (T if interface is applyed in case of instance variable with same name)
25-> T
26-> F
27-> T
28-> T
29-> F
30-> T (can be inherited but not be override)
31-> F (in RUN-TIME POLYMOREPHYSM we can)
32-> F
33-> F
34-> F
35-> F
*/
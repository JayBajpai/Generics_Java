public class Generics<X,Y,Z>{
private X first;
private Y second;
private Z third;
public Generics(X a1,Y a2, Z a3){
first = a1;
second = a2;
third = a3;
}
public X getFirst(){
return first;
}
public Y getSecond(){
return second;
}
public Z getThird()
{
return third;
}
 public static void main(String[] args){
 Generics<Integer,Integer,Integer> obj1 = new Generics <Integer,Integer,Integer>(1,2,3);
 System.out.println("First number is" + obj1.getFirst());
  System.out.println("Second number is" + obj1.getSecond());
  System.out.println("Third number is" + obj1.getThird());
 int a = obj1.getFirst().compareTo(obj1.getSecond());
 if (a == 0){
	 System.out.println("both are equal");
 }
 else{
 System.out.println("obj1.getFirst is less than obj1.getSecond");
  System.out.println(a);
 }
  int b = obj1.getSecond().compareTo(obj1.getThird());
  if (b == 0){
	  System.out.println("both are equal");
  }
  else{
	  System.out.println("obj1.getSecond is less than obj1.getThird");
  }
   System.out.println(b);
 Generics<Double,Double,Double> obj2 = new Generics <Double,Double,Double>(1.1,1.2,1.3);
  System.out.println("obj1.getSecond is less than obj1.getThird");
  System.out.println("First number is" + obj2.getFirst());
  System.out.println("Second number is" + obj2.getSecond());
  System.out.println("Third number is" + obj2.getThird());
 
 
 }
 
}
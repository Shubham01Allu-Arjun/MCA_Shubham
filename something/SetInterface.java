package something;


import java.util.*;
public class SetInterface {
public static void main(String args[]) {
Set<String> s= new HashSet<String>();
s.add("IRON MAN");
s.add("DOCTOR STRANGE");
s.add("CAPTAIN AMERICA");
s.add("THOR");
s.add("HULK");
s.add("VISION");
System.out.println("Priting values of SET A: \n");
Iterator<String> it=s.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
System.out.println("\n");
Set<String> s2=new HashSet<String>(s);
System.out.println("Entering values from Set A to Set B and printing Set B:\n");

Iterator<String> it2=s2.iterator();
while(it2.hasNext())
{
System.out.println(it2.next());
}
System.out.println("\n");
System.out.println("Removing items VISION AND IRON MAN from Set B\n ");

s2.remove("VISION");
s2.remove("IRON MAN");
System.out.println("Items removed from Set B\n");
System.out.println("Serching for removed item IRON MAN\n");
System.out.println("Does Set B contains IRON MAN?"+s2.contains("IRON MAN"));
}
}
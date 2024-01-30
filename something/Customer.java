package something;
                      //  Map interface Program //

import java.util.*;
public class Customer {
int Account_No;
String Name;
public Customer(int Account_No,String Name)
{
this.Account_No=Account_No;
this.Name=Name;
}
public String getname()
{
return this.Name;
}
public int getacc()
{
return this.Account_No;
}
public static void main(String args[])   
{
HashMap<Customer,Integer> cus = new HashMap<>();
Customer c1 = new Customer(101,"IRON MAN");
Customer c2=new Customer(102,"DOCTOR STRANGE");
Customer c3 = new Customer(103,"THOR");
cus.put(c1, c1.getacc());
cus.put(c2, c2.getacc());


cus.put(c3, c3.getacc());
System.out.println("PRINTING ELEMENTS FROM HASHMAP:\n");
for (Customer i : cus.keySet())
{
System.out.println("ACCOUNT NO:" + cus.get(i) + "NAME:" + i.getname());

}
System.out.println("\nWhether there is a customer with ACCOUNT NO: 101? "+cus.containsValue(101));
for (Customer i : cus.keySet())
{
if(cus.get(i)==101)
{
System.out.println("ACCOUNT NO:" + cus.get(i) + "NAME:" + i.getname());
}
break;

}}}

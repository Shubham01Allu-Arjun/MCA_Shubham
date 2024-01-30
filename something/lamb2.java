package something;

interface ktom          //2) Kilometers to miles:
{
public double travel(double c);
}
public class lamb2 {
public static void main(String[] args)
{
ktom a=(double c)->{
return (c*0.6213);
};
System.out.println("Value in km to miles is:"+a.travel(5));
}
}
package something;


import java.util.*;
class ListInterface
{
static Scanner sc = new Scanner(System.in);
static void al()
{
ArrayList<Integer> nums = new ArrayList<Integer>();
System.out.println("ENTER NO OF ELEMENTS: ");
int n=sc.nextInt();
System.out.println("Enter the "+n+" elements");
for(int i=0;i<n;i++)
{
int inp = sc.nextInt();
nums.add(inp);
}
Iterator<Integer> it = nums.iterator();
System.out.println("ARRAY IS\n");
while(it.hasNext()) {
System.out.println(it.next());
}
System.out.println(' ');
}
public static void main(String args[])
{
System.out.println(' ');
al();
}
}
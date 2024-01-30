package something;

interface ftoc   {                  //1)Fahrenheit to celcius
	
public int convert(int c);
}

public class Lamb {
public static void main(String[] args)
{
ftoc s1=(c)->{
return ((c-32)*5/9);

};

System.out.println("Value in celcius is:"+s1.convert(50));
}
}
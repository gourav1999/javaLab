import java.lang.Math;
public class program
{
	public float[] test(int b, int c)
	{
		/*
		Exercise 11: Roots of polynomial- Write a Java program that given b and c,
		computes the roots of the polynomial x*x+b*x+c. You can assume that the
		roots are real valued and need to be return in an array.
		Return the result in an array [p,q] where p<=q meaning the smaller 
		element should be the first element of the array
		*/
		float ret[] = {1.0f,2.0f};

		ret[0] = ((-b - Math.round((Math.sqrt(b*b - 4*c))*10.0/10.0))/2);
		ret[1] = ((-b + Math.round((Math.sqrt(b*b - 4*c))*10.0/10.0))/2);
		return ret;
	}
	 public static void main(String[] args) {
		program o1 = new program();
		System.out.println(o1.test(5,3));
	}
}

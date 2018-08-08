/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner h = new Scanner (System.in);
		int a,b;
		a = h.nextInt();
		b = h.nextInt();
		long l=1;
		 while (b > 0)
		  {
		  	l = l*a;
		  	b-=1;
		  }
		  System.out.println(l);
	
	}
}

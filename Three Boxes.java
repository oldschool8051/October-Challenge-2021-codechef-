==========================================================================================================================
                                            Divyam Kumar
                                            Codechef id-oldschol_div
                                            
===========================================================================================================================

import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    int a[]=new int[4];
		    for(int j=0;j<4;j++)
		    {
		        a[j]=sc.nextInt();
		    }
		    if(a[0]+a[1]+a[2]<=a[3])
		    System.out.println("1");
		    else if(a[0]+a[1]<=a[3] && a[0]+a[1]+a[2]>=a[3])
		    System.out.println("2");
		    else if(a[0]<=a[3] && a[0]+a[1]>a[3])
		    System.out.println("3");
		}
	}
}

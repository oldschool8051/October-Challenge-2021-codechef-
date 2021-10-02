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
		    int x=sc.nextInt();
		    if(x==0)
		    System.out.println("1");
		    else if(x==1 || x==2)
		    System.out.println("2");
		    else{
		        int res=1;
		        while(res*2<=x){
		            res=res*2;
		        }
		        if(res==x)
		        System.out.println(x);
		        else if(x==(2*res-1))
		        System.out.println(x+1);
		        else
		        System.out.println(res);
		    }
		}
	}
}

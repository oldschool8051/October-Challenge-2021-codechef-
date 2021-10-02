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
		    int n=sc.nextInt();
		    int d=sc.nextInt();
		    System.out.println(divyam.minimum(n,d));
		}
	}
}
class divyam{
    static int minimum(int n,int d){
		    int x=n,count=0,c=0;
		    while(x>0){
		        int r=x%10;
		        x=x/10;
		        c=c+1;
		        if(r==d){
		            x=x*(int)Math.pow(10,c)+(r+1)*(int)Math.pow(10,c-1);
		            count=x-n;
		            c=0;
		        }
		    }return count;
		}
}

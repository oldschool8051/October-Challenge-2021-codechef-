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
		    if(n==1){
		    System.out.println("1");
		    continue;}
		    int ans=1;
		    while(ans*2<=n){
		        ans=ans*2;
		    }
		    int result=n-ans+1;
		    if(n==result)
		    System.out.println(ans/2);
		    else{
		    if(result>ans/2){
		    System.out.println(result);}
		    else{
		        System.out.println(ans/2);
		    }
		}}
	}
}

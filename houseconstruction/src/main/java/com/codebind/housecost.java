//Program for calculation of house cost
package com.codebind;

public class housecost {
	public double construction(int a,int area)
	{ 
		double res;
		if(a==1)
		{
		 res=area*1200; //for Standard Materials
				}
		else if(a==2)
		{
		 res=area*1500; //for Above Standard Materials
				}
		else if(a==3) {
		 res=area*1800; //for High Standard Materials
				}
		else {
		 res=area*2500; //for High Standard Materials and fully automated house
				}
		return res;
		}
}

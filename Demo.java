package com.Array.www;

import java.util.Arrays;

public class Demo {
	public static void main(String args[])
	{
		String str="hello57dk25goutam";
		String num="";
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				num=num+str.charAt(i);
			}
			else
			{
				if(!num.equals(""))
				{
					sum=sum+Integer.parseInt(num);
					num="";
				}
			}
		}
		System.out.println(sum);
		
	}

}

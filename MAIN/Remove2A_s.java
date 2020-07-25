package com.epam.TDD_Junit_master;
public class Remove2A_s {
	public String remove(String str)
	{
		int stringLength=str.length();
		if(stringLength<=1 && stringLength!=0 && str.charAt(0)=='A')
		{
			StringBuffer sb=new StringBuffer(str);
			sb.delete(0,1);
			return sb.toString();
		}
		else if(stringLength<=1)
		{
			return str;
		}
		if(str.charAt(0)=='A' && str.charAt(1)=='A')
		{
			StringBuffer sb=new StringBuffer(str);
			sb.delete(0,2);
			return sb.toString();
		}
		else if(str.charAt(0)=='A') {
				StringBuffer sb=new StringBuffer(str);
				sb.delete(0,1);
				return sb.toString();
			}
		else if(str.charAt(1)=='A')
			{
				StringBuffer sb=new StringBuffer(str);
				sb.delete(1,2);
				return sb.toString();
			}
	return str;
		}
		
	}
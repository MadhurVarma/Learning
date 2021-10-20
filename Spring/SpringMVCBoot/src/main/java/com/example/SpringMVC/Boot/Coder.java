package com.example.SpringMVC.Boot;

public class Coder {
	
	private  int cid;
	private String cname;
	
	
	public int getcid()
	{
		
		return cid;
	}
	
public String getcname()
{
		return cname;
}

public void setcid(int cid)
{
	
	this.cid=cid;
}

public void setcname(String cname)
{
	
	this.cname=cname;
 
}
public String toString()

{
	
	return "Coder[cid =" + cid + "cname=" + cname +"]";
	
}
}



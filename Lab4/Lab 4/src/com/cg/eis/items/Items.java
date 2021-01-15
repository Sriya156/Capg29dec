package com.cg.eis.items;


public abstract class Items
{
	int idNum;
	String title;
	int numberOfCopy;
	//constructors
	public Items(int idNum, String title, int numberOfCopy)
	{
		this.idNum = idNum;
		this.title = title;
		this.numberOfCopy = numberOfCopy;
	}
	//getters
	public int getIdNum()
	{
		return idNum;
	}
	public String getTitle()
	{
		return title;
	}
	public int getNumberOfCopy()
	{
		return numberOfCopy;
	}
	//setters
	public void setIdNum(int idNum)
	{
		this.idNum = idNum;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public void setNumberOfCopy(int numberOfCopy)
	{
		this.numberOfCopy = numberOfCopy;
	}
	@Override
	public String toString()
	{
		return "Items [idNum=" + idNum + ", title=" + title + ", numberOfCopy=" + numberOfCopy + "]";
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Items other = (Items) obj;
		if (idNum != other.idNum)
			return false;
		if (numberOfCopy != other.numberOfCopy)
			return false;
		if (title == null)
		{
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	public void print()
	{
		
	}
	public void checkin()
	{
		
	}
	public void checkout()
	{
		
	}
	public void addItems(int idNum, String title, int numberOfCopy)
	{
		this.idNum = idNum;
		this.title = title;
		this.numberOfCopy = numberOfCopy;
	}
	
}
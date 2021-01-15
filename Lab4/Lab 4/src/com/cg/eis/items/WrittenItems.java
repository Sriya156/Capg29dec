package com.cg.eis.items;
public abstract class WrittenItems extends Items
{
	private String author;
	//constructor
	public WrittenItems(int idNum, String title, int numberOfCopy, String author)
	{
		super(idNum, title, numberOfCopy);
		this.author = author;
	}
	//getter/setters
	public String getAuthor()
	{
		return author;
	}
	@Override
	public void print()
	{
		// TODO Auto-generated method stub
		super.print();
	}
	@Override
	public void checkin()
	{
		// TODO Auto-generated method stub
		super.checkin();
	}
	@Override
	public void checkout()
	{
		// TODO Auto-generated method stub
		super.checkout();
	}
	@Override
	public void addItems(int idNum, String title, int numberOfCopy)
	{
		super.idNum = idNum;
		super.title = title;
		super.numberOfCopy = numberOfCopy;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	@Override
	public String toString()
	{
		return super.toString()+"\nWrittenItems [author=" + author + "]";
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		WrittenItems other = (WrittenItems) obj;
		if (author == null)
		{
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		return true;
	}
	
}

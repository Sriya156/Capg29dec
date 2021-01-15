package com.cg.eis.items;
public class Book extends WrittenItems
{
	

	public void print()
	{
		System.out.println(super.toString());
	}

	@Override
	public void checkin()
	{
		super.checkin();
	}

	@Override
	public void checkout()
	{
		super.checkout();
	}

	@Override
	public void addItems(int idNum, String title, int numberOfCopy)
	{
		super.addItems(idNum, title, numberOfCopy);
	}

	public Book(int idNum, String title, int numberOfCopy, String author)
	{
		super(idNum, title, numberOfCopy, author);
	}

}

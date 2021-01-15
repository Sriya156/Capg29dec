package com.cg.eis.items;
public class JournalPaper extends WrittenItems
{

	private int publishYear;

	public JournalPaper(int idNum, String title, int numberOfCopy, String author, int publishYear)
	{
		super(idNum, title, numberOfCopy, author);
		this.publishYear = publishYear;
	}

	public int getPublishYear()
	{
		return publishYear;
	}

	public void setPublishYear(int publishYear)
	{
		this.publishYear = publishYear;
	}

	@Override
	public void print()
	{
		super.print();
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

}

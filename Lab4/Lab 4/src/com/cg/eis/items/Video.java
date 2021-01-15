package com.cg.eis.items;
public class Video extends MediaItems
{
	private String director;
	private String genre;
	private int releseYear ;
	public Video(int idNum, String title, int numberOfCopy, int runtime, String director, String genre, int releseYear)
	{
		super(idNum, title, numberOfCopy, runtime);
		this.director = director;
		this.genre = genre;
		this.releseYear = releseYear;
	}
	public String getDirector()
	{
		return director;
	}
	public String getGenre()
	{
		return genre;
	}
	public int getReleseYear()
	{
		return releseYear;
	}
	public void setDirector(String director)
	{
		this.director = director;
	}
	public void setGenre(String genre)
	{
		this.genre = genre;
	}
	public void setReleseYear(int releseYear)
	{
		this.releseYear = releseYear;
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

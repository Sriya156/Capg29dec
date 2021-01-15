package com.cg.eis.items;
public abstract class MediaItems extends Items
{
	private int runtime;

	public MediaItems(int idNum, String title, int numberOfCopy, int runtime)
	{
		super(idNum, title, numberOfCopy);
		this.runtime = runtime;
	}

	public int getRuntime()
	{
		return runtime;
	}

	public void setRuntime(int runtime)
	{
		this.runtime = runtime;
	}

	@Override
	public String toString()
	{
		return "MediaItem [runtime=" + runtime + ", idNum=" + idNum + ", title=" + title + ", numberOfCopy="
				+ numberOfCopy + "]";
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
		MediaItems other = (MediaItems) obj;
		if (runtime != other.runtime)
			return false;
		return true;
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


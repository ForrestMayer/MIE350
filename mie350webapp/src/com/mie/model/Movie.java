package com.mie.model;

public class Movie {
	
	private int id;
	private String movieTitle;
	private int year;
	private String shortDescription;
	private String director;
	private String genre;
	private int runningTime;
	private String language;
	private String actors;
	private String productionCompany;
	
	public void setID(int id){
		this.id = id;
	}
	public void setYear(int Year){
		this.year = year;
	}
	public void setrunningTime(int time){
		this.runningTime = time;
	}
	public void setmovieTitle(String movieTitle){
		this.movieTitle = movieTitle;
	}
	public void setGenre(String Genre){
		this.genre = Genre;
	}
	public void setlanguage(String language){
		this.language = language;
	}
	
	//get
	
	public int getId()
	{
		return id;
	}
	
	public String getMovieTitle()
	{
		return movieTitle;
	}

	public int getYear()
	{
		return year;
	}
	
	public String getShortDescription()
	{
		return shortDescription;
	}
	
	public String getDirector()
	{
		return director;
	}
	
	public String getGenre()
	{
		return genre;
	}
	
	public int getRunningTime()
	{
		return runningTime;
	}
	
	public String getLanguage()
	{
		return language;
	}
	
	public String getActors()
	{
		return actors;
	}
	
	public String getProductionCompany()
	{
		return productionCompany;
	}

}

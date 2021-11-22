package com.mie.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MovieList {
	private Map map = new HashMap();
	
	public void add(Movie newMovie)
	{
		map.put(newMovie.getId(), newMovie);
	}
	
	public boolean has(int movieId)
	{
		return map.containsKey(movieId);
	}
	
	public boolean has(Movie movie)
	{
		return map.containsKey(movie.getId());
	}
	
	public int size()
	{
		return map.size();
	}
	
	public Movie get(int movieId)
	{

		return (Movie) map.get(movieId);
		
	}
	
	public Iterator iterator()
	{
		return map.values().iterator();
	}
}

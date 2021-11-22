package com.mie.model;

public class Activity {
	private String Username;

	private String Posttype;

	private String DatePosted;

	private String RelatedMovie;

	public void Activity()
	{
		
	}
	
	public void setUsername (String Username){

	this.Username = Username;

	};

	public void setPosttype (String Posttype){

	this.Posttype = Posttype;

	};

	public void setDatePosted (String DatePosted){

	this.DatePosted = DatePosted;

	};

	public void setRelatedMovie (String RelatedMovie){

	this.RelatedMovie = RelatedMovie;

	};


	public String getUsername (String Username){

	return this.Username;

	};

	public String getPosttype (String Posttype){

	return this.Posttype;

	};

	public String getDatePosted (String DatePosted){

	return this.DatePosted;

	};

	public String getRelatedMovie (String RelatedMovie){

	return this.RelatedMovie;

	};
}

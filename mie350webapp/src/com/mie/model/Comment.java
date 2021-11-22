package com.mie.model;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Comment {
	private Integer ID;
	private String Username;
	private String DatePosted;
	private String RelatedMovie;
	private Integer LikeCount;
	private String content;
	private MemberList LikedUsers = new MemberList();
	
	public void addLikes(){
	this.LikeCount = this.LikeCount + 1;
	};	

	public void setContent(String content)
	{
		this.content = content;
	}
	
	public String getContent()
	{
		return this.content;
	}
	public void setID (Integer ID){
		this.ID = ID;
	};
	
	public void setUsername (String Username){
		this.Username = Username;
	};

	public void setDatePosted (String DatePosted){
		this.DatePosted = DatePosted;
	};
	public void setRelatedMovie (String RelatedMovie){
		this.RelatedMovie = RelatedMovie;
	};
	public void addLikedAccounts(Member Account){
		LikedUsers.add(Account);
	}; 
	
	public String getUsername (){
		return this.Username;
	};

	public String getDatePosted (){
		return this.DatePosted;
	};
	public String getRelatedMovie (){
		return this.RelatedMovie;
	};
	public Integer getID (){
		return this.ID;
	};
	public Integer getLikeCount(){
		return this.LikeCount;
	};
	 
	public void readUpdateComment(Iterator args) {
		try {
			ID = Integer.parseInt((String) args.next());
			Username= (String) args.next();
			DatePosted = (String) args.next();
			RelatedMovie = (String) args.next();
			LikeCount = Integer.parseInt((String) args.next());

		} catch (NumberFormatException e) {
			
		}
	}

	


		
}

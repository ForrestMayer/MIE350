package com.mie.model;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.NoSuchElementException;



public class Comment {
	private Integer ID;
	private int memberID;
	private int RelatedMovieID;
	private Integer LikeCount;
	private String content;
	private MemberList LikedUsers = new MemberList();
	

	public void addLikes(){
	this.LikeCount = this.LikeCount + 1;
	}	

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
	}
	
	public void setMemberID (int memberID){
		this.memberID = memberID;
	}

	
	public void setRelatedMovieID (int RelatedMovie){
		this.RelatedMovieID = RelatedMovie;
	}
	
	public void addLikedAccounts(Member Account){
		LikedUsers.add(Account);
	}
	
	public int getMemberID (){
		return this.memberID;
	}

	
	public int getRelatedMovieID(){
		return this.RelatedMovieID;
	}
	
	public Integer getID (){
		return this.ID;
	}
	
	public Integer getLikeCount(){
		return this.LikeCount;
	}
	
	public MemberList getLikedUsers() {
		return this.LikedUsers;
	}
	 
	public void readUpdateComment(Iterator args) {
		try {
			ID = Integer.parseInt((String) args.next());
			memberID= Integer.parseInt((String) args.next());
			RelatedMovieID = Integer.parseInt((String) args.next());
			LikeCount = Integer.parseInt((String) args.next());

		} catch (NumberFormatException e) {
			
		}
	}

	
	public void updateComment(String newComment) {
		this.content = newComment;
		
	}

	
	public void addLike(Member member) {
		this.LikeCount++;
		this.LikedUsers.add(member);
		
	}
	
	public void removeLike(Member member) {
		this.LikeCount = this.LikeCount-1;
		this.LikedUsers.remove(member);
		
		
	}

		
}

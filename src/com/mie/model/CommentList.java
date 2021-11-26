package com.mie.model;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import com.mie.dao.DatabaseQuery;

public class CommentList {
	private Map map = new HashMap();
	
	public void add(Comment newComment)
	{
		map.put(newComment.getID(), newComment);
	}
	
	public boolean has(int commentId)
	{
		return map.containsKey(commentId);
	}
	
	public boolean has(Comment Comment)
	{
		return map.containsKey(Comment.getID());
	}
	
	public int size()
	{
		return map.size();
	}
	
	public Comment get(int commentId)
	{

		return (Comment) map.get(commentId);
		
	}
	
	public Iterator iterator()
	{
		return map.values().iterator();
	}

	
	public boolean insert(Comment comment)
	{
		DatabaseQuery dbQ = new DatabaseQuery();
		int commentId = comment.getID();
	    int movieId = comment.getRelatedMovieID();
	    int memberId = comment.getMemberID();
	    String content = comment.getContent();
	    int likeCount = comment.getLikeCount();

	    String qStr = "INSERT INTO CommentDB Values ('" + commentId + "', '"+ movieId + "', '"+ memberId + "', '" + content + "', '"+ likeCount + "')";
		boolean updateResult = dbQ.runUpdate(qStr);
		return updateResult;
	
	}
	
	public boolean updateContent(Comment comment)
	{
		DatabaseQuery dbQ = new DatabaseQuery();
		int commentId = comment.getID();
	    int movieId = comment.getRelatedMovieID();
	    String content = comment.getContent();

	    String qStr = "UPDATE CommentDB SET Comment =  '" + content + "' Where CommentID = '" + commentId + "' AND MovieID = '" + movieId + "'";
		boolean updateResult = dbQ.runUpdate(qStr);
		return updateResult;
	}

	public boolean updateLike(Comment comment)
	{
		DatabaseQuery dbQ = new DatabaseQuery();
		int commentId = comment.getID();
	    int movieId = comment.getRelatedMovieID();
	    int likeCount = comment.getLikeCount();

	    String qStr = "UPDATE CommentDB SET LikeCounter =  '" + likeCount + "' Where CommentID = '" + commentId + "' AND MovieID = '" + movieId + "'";
		boolean updateResult = dbQ.runUpdate(qStr);
		return updateResult;
	}
	
	public boolean updateLikedUsers(Comment comment)
	{
		DatabaseQuery dbQ = new DatabaseQuery();
		int commentId = comment.getID();
	    int movieId = comment.getRelatedMovieID();
	    MemberList memberLikes = comment.getLikedUsers();

	    String qStr = "UPDATE CommentDB SET LikeCounter =  '" + likeCount + "' Where CommentID = '" + commentId + "' AND MovieID = '" + movieId + "'";
		boolean updateResult = dbQ.runUpdate(qStr);
		return updateResult;
	}
	
}

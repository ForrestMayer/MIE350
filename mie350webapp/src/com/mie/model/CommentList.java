package com.mie.model;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CommentList {
	private Map map = new HashMap();
	
	public void add(Comment newComment)
	{
		map.put(newComment.getId(), newComment);
	}
	
	public boolean has(int commentId)
	{
		return map.containsKey(commentId);
	}
	
	public boolean has(Comment Comment)
	{
		return map.containsKey(Comment.getId());
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
		
	}

}

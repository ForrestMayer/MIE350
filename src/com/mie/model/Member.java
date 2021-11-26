
package com.mie.model;

import java.util.Date;

public class Member {
	/**
	 * This class contains all of the relevant information, and getter/setter
	 * methods for the Member object.
	 */
	private int memberid;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String email;
	private boolean valid;
	private int phoneNumber;
	private String birthDate;
	private CommentList contentList = new CommentList();
	private MovieList favouriteMovies = new MovieList();
	private CommentList likedCommentList = new CommentList();

	public CommentList getContentList()
	{
		return this.contentList;
	}
	
	public void addContentList(Comment comment)
	{
		this.contentList.add(comment);
	}
	
	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean newValid) {
		valid = newValid;
	}
	
	public void setPhoneNumer(int phoneNumber) {
		this.phoneNumber = phoneNumber;
		}

	public void setBirthdate(String birthDate) {
		this.birthDate = birthDate;
		}

	public void addFavouriteMovie(Movie favouriteMovie) {
		this.favouriteMovies.add(favouriteMovie);
		}
	
	public void addlikedComment(Comment comment) {
		this.likedCommentList.add(comment);
		}
	
	public int getPhoneNumber() {
		return this.phoneNumber;
		}

	public String getBirthDate() {
		return this.birthDate;
		}

	public MovieList getFavouriteMovies() {
		return this.favouriteMovies;
		}
	
	public CommentList getLikedComments() {
		return this.likedCommentList;
		}
	
	// Absolutely no clue what this is for
	@Override
	public String toString() {
		return "Member [userid=" + memberid + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", username=" + username
				+ ", password=" + password + ", email=" + email + "]";
	}
}
package mytest;


import com.googlecode.objectify.annotation.Entity;
import com.google.appengine.api.users.User;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
 



@Entity 
public class Score implements Comparable<Score> {
	 @Id Long id;
	int score;
	String name;
	
	public Score () {}
	
	public Score(int x, String y)
	{
		this.score=x;
		this.name=y;
	}
	
	public int getscore(){return score;}
	
	public String getname(){return name;}
	
	
	
	
	
	   @Override
	    public int compareTo(Score other) {
	       return 1;
	    }
	
}
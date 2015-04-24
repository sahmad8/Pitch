package mytest;


import static com.googlecode.objectify.ObjectifyService.ofy;

import java.io.IOException;

import javax.servlet.http.*;

import com.googlecode.objectify.ObjectifyService;

import mytest.Score;

@SuppressWarnings("serial")
public class TestServlet extends HttpServlet {
	static 
	{
        ObjectifyService.register(Score.class);
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
                throws IOException {
    	String mine=req.getHeader("thename");
    	Score score=new Score(0, mine);
    	ofy().save().entity(score).now(); 
    	resp.sendRedirect("/index.html");
    }
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
    	doPost(req,resp);
    }
}

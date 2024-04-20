
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class verifyuser extends HttpServlet {  

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                     //To change body of generated methods, choose Tools | Templates.
        // to write the context to app name
        // fetch the and write the dATA
                    ServletContext context=getServletContext();
                     
                               context.setAttribute("aapname", "my app");
                     
                     String id=request.getParameter("uid");
       // fetch the session object create for the user
                  
     
      if(id.equals("abc")|| id.equals("xyz")|| id.equals("tarun")) {
                    HttpSession session=request.getSession();
           // store the data for this session object using a method call Attributes  
              session.setAttribute("Userid",id);
                    response.sendRedirect("dashboard.jsp");
                }
                else{
                  PrintWriter out=response.getWriter();
                    out.println("invalid Account");
                }
    }
}

         
                    
                  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/postServlet")
public class Post extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        String name = request.getParameter("naming");
        String age = request.getParameter("ageNaming");
        String gender = request.getParameter("gender");
        String job = request.getParameter("job");
        String[] languages = request.getParameterValues("languages");
        printWriter.println("<h2>Your name</h2> " + name);
        printWriter.println("<h2>Your age</h2> " + age);
        printWriter.println("<h2>Your gender</h2> " + gender);
        printWriter.println("<h2>Your job</h2> " + job);
        printWriter.println("<h2>Your language</h2> " );
        for (String item : languages){
            printWriter.println("<li>" + item + "</li>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<h1> Мороз и солнце; день чудесный! </h1>");
        pw.println("<h1> Ещё ты дремлешь, друг прелестный - </h1>");
        pw.println("<h1> Пора, красавица, проснись: </h1>");
        pw.println("<h1> Открой сомкнуты негой взоры </h1>");
        pw.println("<h1> Навстречу северной Авроры, </h1>");
        pw.println("<h1> Звездою севера явись! </h1>");
        pw.println("<h4>  Александр Сергеевич Абовян </h4>");
        pw.println("</html>");
    }
}


package Packkkete;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {

    /**
     *
     * @param req
     * @param res
     * @throws IOException
     */
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int i = 4;//Integer.parseInt(req.getParameter("num1"));
        int j = 4;//Integer.parseInt(req.getParameter("num2"));
        int k = i + j;
        PrintWriter out = res.getWriter();
        out.println("La suma es " + k);
    }
}

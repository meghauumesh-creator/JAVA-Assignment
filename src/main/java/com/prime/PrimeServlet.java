/*
 Build a servlet program to check the given number is prime number or not using HTML with step by
step procedure.
 */


package com.prime;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/PrimeServlet")

public class PrimeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String input = request.getParameter("num");

        out.println("<html><body>");

        // ✅ Error handling for empty input
        if (input == null || input.isEmpty()) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            out.println("<h2 style='color:red;'>Error: Please enter a number!</h2>");
        } 
        else {
            try {
                int num = Integer.parseInt(input);

                // ❌ Negative or 0/1 case
                if (num <= 1) {
                    out.println("<h2 style='color:red;'>"+ num +" is NOT a prime number</h2>");
                } 
                else {
                    boolean isPrime = true;

                    for (int i = 2; i <= Math.sqrt(num); i++) {
                        if (num % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }

                    // ✅ Output result
                    if (isPrime) {
                        out.println("<h2 style='color:green;'>"+ num +" is a PRIME number</h2>");
                    } else {
                        out.println("<h2 style='color:red;'>"+ num +" is NOT a prime number</h2>");
                    }
                }

            } 
            catch (NumberFormatException e) {
                // ✅ Invalid input error
                response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                out.println("<h2 style='color:red;'>Error: Invalid number entered!</h2>");
            }
        }

        // Back link
        out.println("<br><a href='index.html'>Go Back</a>");

        out.println("</body></html>");
    }
}
package com.primecheck;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/checkprime")
public class PrimeNumberServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));

            boolean isPrime = true;
            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            out.println("<html>");
            out.println("<head><title>Prime Number Result</title></head>");
            out.println("<body>");
            out.println("<div style='margin:20px; padding:20px; border:1px solid #ccc;'>");
            out.println("<h2>Prime Number Check</h2>");
            out.println("<p>Number Entered: " + number + "</p>");
            if (isPrime) {
                out.println("<p style='color:green;'>Result: " + number + " is a prime number.</p>");
            } else {
                out.println("<p style='color:red;'>Result: " + number + " is not a prime number.</p>");
            }
            out.println("<a href='index.html'>Check Another Number</a>");
            out.println("</div>");
            out.println("</body></html>");

        } catch (NumberFormatException e) {
            out.println("<html><body>");
            out.println("<p style='color:red;'>Invalid input. Please enter a valid number.</p>");
            out.println("<a href='index.html'>Try Again</a>");
            out.println("</body></html>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}

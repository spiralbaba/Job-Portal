package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_002dprofile_002deducation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String name = (String) session.getAttribute("session_name");
    String profile_pic = (String) session.getAttribute("session_profilepic");

      out.write('\n');
      out.write('\n');

    if (name == null || name.equals("")) {
        response.sendRedirect("login.jsp");
    }

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> HIT- Profile </title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" ></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "profileheader.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menubar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-2\"> </div>\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("                <div class=\"row\" style=\"border: 1px solid gray; box-shadow: 0px 0px 2px gray; border-radius: 3px\">\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("                        <img src=\"profilepics/");
      out.print(profile_pic);
      out.write("\" height=\"100\" style=\"border-radius: 50px\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-10\">\n");
      out.write("                        <h2> Add Education Details </h2> <br>\n");
      out.write("                        <form action=\"AddEducationDetails\" method=\"POST\">\n");
      out.write("                            <b> ");
      out.print(name);
      out.write(" </b>(");
      out.print( session.getAttribute("session_email") );
      out.write(") <br> <br>\n");
      out.write("                            School/College : <br> <input type=\"text\" name=\"school1\" class=\"textfield_design\"/> <br> <br>\n");
      out.write("                            Degree : <br> <input type=\"text\" name=\"degree1\" placeholder=\"Eg. 10th or B.tech\" class=\"textfield_design\" /> <br> <br>\n");
      out.write("                            Year : <br> <input type=\"text\" name=\"year1\" placeholder=\"Eg. 2001-2004\" class=\"textfield_design\" /> <br> <br>\n");
      out.write("                            Grade : <br> <input type=\"text\" name=\"grade1\" placeholder=\"Eg. 90\" class=\"textfield_design\" /> % <br> <br>\n");
      out.write("                            Description : <br> <textarea placeholder=\"Your certifications, Activities and societies\" name=\"description1\" style=\"padding: 5px 10px; width: 300px; height: 100px; border-radius: 5px; border: 1px solid gray;\"></textarea> <br> <br>\n");
      out.write("                            <input type=\"submit\" value=\"Add Education\" class=\"btn btn-danger\" />\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-2\"> </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

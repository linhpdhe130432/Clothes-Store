package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\n");
      out.write("              integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\n");
      out.write("                integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"\n");
      out.write("                integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"\n");
      out.write("                integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Spinnaker&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script>\n");
      out.write("            function submitDataToInsert()\n");
      out.write("            {\n");
      out.write("                document.getElementById(\"frm\").submit();\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\" style=\"font-size: 20px;\">\n");
      out.write("            <nav class=\"container navbar navbar-expand-lg navbar-light\">\n");
      out.write("                <a class=\"navbar-brand text-white\" href=\"home\"><span\n");
      out.write("                        style=\"font-size: 40px;text-decoration: line-through\">HF</span></a>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link text-white\" href=\"home\"><span style=\"font-size: 15px;\">awesome sneakers</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item mx-3\">\n");
      out.write("                            <a class=\"nav-link text-white\" href=\"home\">Home </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item mx-3 dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle text-white\" href=\"#\" id=\"navbarDropdown\" role=\"button\"\n");
      out.write("                               data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                Shop\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-menu\" style=\"background-color: black;\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                <a class=\"dropdown-item text-white\" href=\"men\">Men</a>\n");
      out.write("                                <a class=\"dropdown-item text-white\" href=\"women\">Women</a>\n");
      out.write("                                <a class=\"dropdown-item text-white\" href=\"sale\">Sale</a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item mx-3\">\n");
      out.write("                            <a class=\"nav-link text-white\" href=\"");
      out.print(request.getSession().getAttribute("user") == null ? "login" : "logout");
      out.write('"');
      out.write('>');
      out.print(request.getSession().getAttribute("user") == null ? "Login" : "LogOut");
      out.write("</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item mx-3\">\n");
      out.write("                            <a class=\"nav-link text-white\" href=\"#\">Customer Service</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                        <form id=\"frm\" action=\"search\" method=\"GET\">\n");
      out.write("                            <input type=\"text\" name=\"search\" value=\"");
      out.print((request.getSession().getAttribute("search")== null?"":request.getSession().getAttribute("search") ));
      out.write("\" placeholder=\"Search...\">\n");
      out.write("                </form>\n");
      out.write("                <button style=\"border:1px solid black;background-color: black; padding-left: 2px\"><i\n");
      out.write("                        class=\"fa fa-search text-white\" onclick=\"submitDataToInsert();\"></i></button>\n");
      out.write("                <a href=\"cart\" style=\"border:1px solid black;background-color: black; padding: 2px\"><i\n");
      out.write("                        class=\"fa fa-shopping-cart text-white\"></i></a>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
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

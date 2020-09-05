package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import util.HtmlHelper;
import java.util.ArrayList;
import model.Product;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/contact.jsp");
  }

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
      out.write("        <title>Search</title>\n");
      out.write("        ");

            ArrayList<Product> products
                    = (ArrayList<Product>) request.getAttribute("products");
            Integer pageindex = (Integer) request.getAttribute("pageindex");
            Integer pagecount = (Integer) request.getAttribute("pagecount");
            String x = (String) request.getSession().getAttribute("search");
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- header -->\n");
      out.write("        ");
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
      out.write("                        style=\"font-size: 40px;text-decoration: line-through\">as</span></a>\n");
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
      out.print(request.getSession().getAttribute("search") );
      out.write("\" placeholder=\"Search...\">\n");
      out.write("                </form>\n");
      out.write("                <button style=\"border:1px solid black;background-color: black; padding-left: 2px\"><i\n");
      out.write("                        class=\"fa fa-search text-white\" onclick=\"submitDataToInsert();\"></i></button>\n");
      out.write("                <a href=\"cart.jsp\" style=\"border:1px solid black;background-color: black; padding: 2px\"><i\n");
      out.write("                        class=\"fa fa-shopping-cart text-white\"></i></a>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <!-- content -->\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <div class=\"logo container d-flex align-items-center text-white\" style=\"height: 215px;\">\n");
      out.write("                <span style=\"font-size: 40px;text-decoration: line-through\">FOLLOW YOUR CHOICE</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"product\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <table style=\"width:100%\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th class=\" w-25\">\n");
      out.write("                                    <div class=\"filter\">\n");
      out.write("                                        <h4>Filter by</h4>\n");
      out.write("                                        <hr>\n");
      out.write("                                        Price<br>\n");
      out.write("                                        <input class=\"w-100aaa\" type=\"range\" name=\"limit-price\" min=\"0\" max=\"1000\">\n");
      out.write("                                        <hr>\n");
      out.write("                                        Color<br>\n");
      out.write("                                        <hr>\n");
      out.write("                                        Size<br>\n");
      out.write("                                        <hr>\n");
      out.write("                                    </div>\n");
      out.write("                                </th>\n");
      out.write("                                <th class=\"w-75\">\n");
      out.write("                                    <div class=\"dropdown d-flex justify-content-end\" style=\"margin-right: 50px;\">\n");
      out.write("                                        <button class=\"btn btn-secondary dropdown-toggle bg-white text-dark\" type=\"button\"\n");
      out.write("                                                id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("                                                aria-expanded=\"false\" style=\"margin-top: 50px;\">\n");
      out.write("                                            Sort by\n");
      out.write("                                        </button>\n");
      out.write("                                        <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\">Newest</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\">Price (low to hight)</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\">price (hight to low)</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\">Name A-Z</a>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"#\">Name Z-A</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"item\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            ");
for (Product d : products) {
      out.write("\n");
      out.write("                                            <div class=\"col-12 col-md-6 d-flex justify-content-end\">\n");
      out.write("                                                <a class=\"py-5\" href=\"product?id=");
      out.print(d.getId());
      out.write("\"> <img src=\"./image/");
      out.print(d.getImg());
      out.write("\" alt=\"\" style=\"height: 200px; width: 288px\"> \n");
      out.write("                                                    <br><p class=\"text-dark\">");
      out.print(d.getName());
      out.write("</p></a>\n");
      out.write("                                            </div>\n");
      out.write("                                            ");
}
      out.write("\n");
      out.write("                                            <div class=\"d-flex justify-content-center w-100\">");
      out.print(HtmlHelper.pagerSearch(pageindex, pagecount, 1, x));
      out.write("</div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </th>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"height: 150px;\">\n");
      out.write("            </div>\n");
      out.write("            ");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"contact container text-white\">\n");
      out.write("            <div class=\"row\" style=\"margin-left: 70px;\">\n");
      out.write("                <div class=\"col-sm\">\n");
      out.write("                    <div>\n");
      out.write("                        <h3><span style=\" font-weight: bold; text-decoration: line-through;\">ADDRESS</span></h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <p>500 Terry Francois Street<br>\n");
      out.write("                            San Francisco, CA 94158<br>\n");
      out.write("                            info@mysite.com<br>\n");
      out.write("                            Tel: 123-456-7890</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <a href=\"https://www.facebook.com/vgdackhai\"><i class=\"fa fa-facebook text-white\"></i></a>\n");
      out.write("                        <a href=\"https://twitter.com/home\"><i class=\"fa fa-twitter text-white\"></i></a>\n");
      out.write("                        <a href=\"https://www.instagram.com/carot_xanh_/\"><i class=\"fa fa-instagram text-white\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm\">\n");
      out.write("                    <div>\n");
      out.write("                        <h3><span style=\" font-weight: bold; text-decoration: line-through;\">CONTACT US</span></h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <form action=\"\">\n");
      out.write("                            <div>\n");
      out.write("                                <table style=\"width:100%\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th><input style=\"color: white\" type=\"text\" name=\"name\" placeholder=\"name\"></th>\n");
      out.write("                                        <th rowspan=\"3\"> <input type=\"text\" name=\"message\"\n");
      out.write("                                                                placeholder=\"Type your message here...\"\n");
      out.write("                                                                style=\"padding-top: 40px;padding-bottom: 45px; color: white\"></th>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><input style=\"color: white\" type=\"text\" name=\"email\" placeholder=\"email\"></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><input style=\"color: white\" type=\"text\" name=\"phone\" placeholder=\"phone\"></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <input style=\"margin-left: 217px;\" type=\"submit\" name=\"\" value=\"Submit Contact\">\n");
      out.write("                            </div>\n");
      out.write("                            <p style=\"margin-left: 177px;margin-top: 5px;\">Thanks for submitting!</p>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm\">\n");
      out.write("                    <div>\n");
      out.write("                        <h3><span style=\" font-weight: bold; text-decoration: line-through;\">STAY IN TOUCH</span></h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        <form action=\"\">\n");
      out.write("                            Join our mailist list<br>\n");
      out.write("                            <input style=\"color: white\" class=\"w-75\" type=\"text\" name=\"mailist\" placeholder=\"Enter your email here*\"><br>\n");
      out.write("                            <input class=\"w-75\" type=\"submit\" name=\"Subscribe\" value=\"Subscribe Now\">\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"height: 150px;\">\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

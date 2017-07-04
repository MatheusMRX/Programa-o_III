package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cadastro</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"conteiner\">\n");
      out.write("            <h1 align=\"center\">Cadastro</h1>\n");
      out.write("            <form action=\"MyServlet\" method=\"POST\" align=\"center\">\n");
      out.write("                <table align=\"center\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td align=\"left\">Nome:</td>\n");
      out.write("                        <td align=\"left\"><input type=\"text\" name=\"nome\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td align=\"left\">Idade:</td>\n");
      out.write("                        <td align=\"left\"><input type=\"number\" name=\"idade\" max=\"120\" min=\"1\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td align=\"left\">Tipo de ciclo:</td>\n");
      out.write("                        <td align=\"left\">\n");
      out.write("                            <select name=\"tipo\">\n");
      out.write("                                <option value=\"Regular\">Regular</option>\n");
      out.write("                                <option value=\"Irregular\">Irregular</option>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td align=\"left\">Data da ultima mestruação:</td>\n");
      out.write("                        <td align=\"left\"><input type=\"date\" name=\"data\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("                <br><input type=\"submit\" value=\"Gravar\"/>\n");
      out.write("            </form>\n");
      out.write("            <form action=\"resul.jsp\" align=\"center\">\n");
      out.write("                <input type=\"submit\" value=\"Resultados\" />\n");
      out.write("            </form>\n");
      out.write("            <footer><br><br>Matheus</footer>\n");
      out.write("\n");
      out.write("        </div>\n");
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

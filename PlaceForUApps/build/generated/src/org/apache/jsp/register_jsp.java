package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Pendaftaran User</h2>\n");
      out.write("        <form method='post' action='register'>\n");
      out.write("        <fieldset>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                <fieldset>\n");
      out.write("                <legend><h4>Profil</h4></legend>    \n");
      out.write("                    <table>   \n");
      out.write("                        <tr>\n");
      out.write("                            <td>Nama</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td><input type='text' name='nama' /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Tipe pengguna</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td>\n");
      out.write("                                <select>\n");
      out.write("                                    <option value=\"1\">Pemilik Tempat</option>\n");
      out.write("                                    <option value=\"2\">Penyewa Tempat</option>\n");
      out.write("                                </select>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Email</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td><input type='text' name='email' /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Alamat</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td><input type='text' name='alamat' /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>No.Hp</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td><input type='text' name='hape' /></td>\n");
      out.write("                        </tr>       \n");
      out.write("                        <tr>\n");
      out.write("                            <td>No.Telp</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td><input type='text' name='telp' /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Foto</td>\n");
      out.write("                            <td>:</td>\n");
      out.write("                            <td><input type='file' name='foto' /></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table> \n");
      out.write("                </fieldset>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    <fieldset>\n");
      out.write("                    <legend><h4>Akun Pengguna</h4></legend>\n");
      out.write("                    <table>   \n");
      out.write("                    <tr>\n");
      out.write("                        <td>Username</td>\n");
      out.write("                        <td>:</td>\n");
      out.write("                        <td><input type='text' name='usname' /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Password</td>\n");
      out.write("                        <td>:</td>\n");
      out.write("                        <td><input type='password' name='psword' /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><input type='submit' value='Register' /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    </table> \n");
      out.write("                    </fieldset>\n");
      out.write("                </table>\n");
      out.write("                </fieldset>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        </form>\n");
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

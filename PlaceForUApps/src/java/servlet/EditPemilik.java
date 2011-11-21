/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servlet;

import entity.DaftarUser;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Yuni
 */
public class EditPemilik extends HttpServlet {
   
    /** 
     *kelas ini digunakan untuk melakukan edit profil pemilik
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String message = null;
        String nama = request.getParameter("nama");
        int tipe = Integer.parseInt(request.getParameter("tipe"));
        String email = request.getParameter("email");
        String telp = request.getParameter("telp");
        String alamat = request.getParameter("alamat");
        String hape = request.getParameter("hape");
        String usname = request.getParameter("usname");
        String pass = request.getParameter("psword");
        int status = 0;

        User user = new User();
        RequestDispatcher page = null;
        DaftarUser a = new DaftarUser();
        HttpSession session = request.getSession();
        user = a.getUserFromName(usname);

        user.setNama(nama);
                user.setTipe(tipe);
                user.setEmail(email);
                user.setTelp(telp);
                user.setAlamat(alamat);
                user.setHape(hape);
                user.setUsername(usname);
                user.setPassword(pass);
                session.setAttribute("pemilik", user);
        try {
             a.editUser(user);
             page = request.getRequestDispatcher("/pemilik/profil");
             page.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String destination = "/pemilik/editProfil.jsp";

        RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
        rd.forward(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

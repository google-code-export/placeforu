/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import entity.DaftarSubGedung;
import entity.DaftarUser;
import entity.SubGedung;
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
 * @author Widiasa
 */
public class DetailSubGedungPemilik extends HttpServlet {

    /**
    kelas ini digunakan untuk melihat profil penyewa dengan kondisi session todak boleh null
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        RequestDispatcher dis = null;
        HttpSession session = request.getSession();
        DaftarSubGedung ds = new DaftarSubGedung();
        SubGedung gd = new SubGedung();
        DaftarUser du = new DaftarUser();
        User u = new User();

        if (session.getAttribute("sessionusername") != null) {
            String username = (String) session.getAttribute("sessionusername");
            //melakukan pengecekan untuk memastikan bahwa username telah terdaftar
            boolean hasilCheck = du.checkUser(username);
            if (hasilCheck) {
                //mengambil user berdasarkan username dari Daftar User
                u = du.getUserFromName(username);
                long idPemilik = u.getId();

                //jika pengguna merupakan pemilik
                if (u.getTipe() == 1) {
                    Long id_sub_gedung = Long.parseLong(request.getParameter("idsub"));
                    gd = (SubGedung) ds.getSubGedung(id_sub_gedung);
                    request.setAttribute("subgedung", gd);
                    dis = request.getRequestDispatcher("/pemilik/informasiSub.jsp");
                    dis.include(request, response);

                } else if (u.getTipe() == 2) {
                    Long id_sub_gedung = Long.parseLong(request.getParameter("idsub"));
                    gd = (SubGedung) ds.getSubGedung(id_sub_gedung);
                    request.setAttribute("subgedung", gd);
                    dis = request.getRequestDispatcher("/penyewa/detailSubGedung.jsp");
                    dis.include(request, response);

                } else if (u.getTipe() == 0) {
                    Long id_sub_gedung = Long.parseLong(request.getParameter("idsub"));
                    gd = (SubGedung) ds.getSubGedung(id_sub_gedung);
                    request.setAttribute("subgedung", gd);
                    dis = request.getRequestDispatcher("/admin/informasiSub.jsp");
                    dis.include(request, response);
                }
            } else {
                RequestDispatcher requestDispatcher =
                        request.getRequestDispatcher("index.jsp");
                requestDispatcher.forward(request, response);
            }
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
        processRequest(request, response);
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

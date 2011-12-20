<%--
    Document   : index
    Created on : Oct 29, 2011, 1:26:33 PM
    Author     : Ika
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta name="keywords" content="" />
        <meta name="description" content="" />
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <title>PlaceForU - Cara Cepat Sewa Tempat dengan Cepat</title>
        <link href="css/style.css" rel="stylesheet" type="text/css" media="screen" />
    </head>
    <body>
        <div id="wrapper">
            <div id="logo">
                <h1>PlaceForU</h1>
                <p>Cara Cepat Sewa Tempat dengan Cepat</p>
            </div>
            <div id="header">
                <div id="menu">
                    <ul>
                        <li class="current_page_item"><a href="pemilik">Homepage Pemilik</a></li>
                        <li class="current_page_item"><a href="pemilik/profil">Manajemen Profil</a></li>
                        <li class="current_page_item"><a href="ListGedung">Manajemen Informasi Gedung</a></li>
                        <li class="current_page_item"><a href="#">Manajemen Penyewaan</a></li>
                        <li class="current_page_item"><a href="#">Manajemen Administrasi</a></li>
                        <li class="current_page_item"><a href="logout">Log Out</a></li>
                    </ul>
                </div>
                <div id="gallery"><img src="images/img03.jpg" width="692" height="340" alt="" /></div>
            </div>
            <div id="page">
                <div id="page-bgtop">
                    <div id="content">
                        <div class="post">
                            <h2 class="title"><a href="#">Halaman Administrator</a></h2>
                            <p class="meta"><span class="date"><% new Date();%></span><span class="posted">Posted by <a href="#">Administrator</a></span></p>
                            <div style="clear: both;">&nbsp;</div>
                            <div class="entry">
                                <form method='post'  action='EditGedung'>
                                    <table>
                                        <input type="hidden" name="id_gedung" value="${gedung.id}">
                                        <tr>
                                            <td>Nama Gedung <font color="red">*</font></td>
                                            <td>:</td>
                                            <td><input type="text" name="nama_gedung" value="${gedung.namaGedung}"></td>
                                            <td></td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td>Tipe Gedung Gedung <font color="red">*</font></td>
                                            <td>:</td>
                                            <td>

                                                <input type="radio" name="tipe_gedung" value="1" /> Indoor<br />
                                                <input type="radio" name="tipe_gedung" value="2" /> Outdoor<br />

                                            </td>
                                            <td></td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td>Kategori Gedung <font color="red">*</font></td>
                                            <td>:</td>
                                            <td>
                                                <select name="kategori_gedung">
                                                    <option value="1">Pernikahan</option>
                                                    <option value="2">Seminar</option>
                                                    <option value="3">Serba Guna</option>
                                                    <option value="4">Olahraga</option>
                                                </select>
                                            </td>
                                            <td></td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td>Alamat Gedung <font color="red">*</font></td>
                                            <td>:</td>
                                            <td>
                                                <select name="propinsi_gedung">
                                                    <option value="" selected>Propinsi</option>
                                                    <option value="Jawa Barat">Jawa Barat</option>
                                                    <option value="Jawa Timur">Jawa Timur</option>
                                                    <option value="Jawa Tengah">Jawa Tengah</option>
                                                </select> 
                                            </td>
                                        <tr><td></td><td></td>
                                            <td>
                                                <input type="text" name="kota_gedung" value="${gedung.kotaGedung}">
                                            </td>
                                        </tr>
                                        <tr><td></td><td></td>
                                            <td>
                                                <input name="alamat_gedung" type="text" value="${gedung.alamatGedung}">

                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                Deskripsi Gedung<font color="red">*</font>
                                            </td>
                                            <td>:</td>
                                            <td>
                                                <textarea name="deskripsi_gedung" value="${gedung.namaGedung}">${gedung.deskripsiGedung}</textarea>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>
                                                Fasilitas
                                            </td>
                                            <td>:</td>
                                            <td>
                                                <textarea name="fasilitas_gedung"value="${gedung.namaGedung}">${gedung.namaGedung}</textarea>
                                            </td>
                                        </tr>
                                        <tr><td></td><td></td>
                                            <td>
                                                <font color="red">*Pisahkan tiap fasilitas dengan tanda titik (.)</font>
                                            </td>
                                        </tr>
                                        <tr><td>
                                                Foto
                                            </td>
                                            <td>:</td>
                                            <td><input type="file" name="foto_gedung">
                                            </td>
                                        </tr>
                                        <tr><td>Email</td>
                                            <td>:</td>
                                            <td><input type="text" name="email_gedung" value="${gedung.emailGedung}">
                                            </td>
                                        </tr>
                                        <tr><td>Telp<font color="red">*</font></td>
                                            <td>:</td>
                                            <td><input type="text" name="telp_gedung" value="${gedung.telpGedung}">
                                            </td>
                                        </tr>
                                        <tr><td><input type="submit" name="tambah" value="Simpan"><input type="reset" value="Reset"></td>
                                            <td></td>
                                            <td>
                                            </td>
                                        </tr>
                                    </table>
                                </form>
                            </div>
                        </div>

                    </div>
                    <div id="sidebar">
                        <ul>
                            <li>
                                <div id="search" >
                                    <form method="get" action="#">
                                        <div>
                                            <input type="text" name="s" id="search-text" value="" />
                                            <input type="submit" id="search-submit" value="GO" />
                                        </div>
                                    </form>
                                </div>
                                <div style="clear: both;">&nbsp;</div>
                            </li>
                            <li>
                                <h2> </h2>

                                <fieldset>
                                    <table>
                                        <tr>
                                            <td><a href="TambahGedung">Tambah Gedung</a></td>
                                        </tr>                                 
                                    </table>
                                </fieldset>

                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div id="footer-bg">
                <div id="footer-content">
                    <div id="col1">
                        <ul class="style1">
                            <li><a href="#">Etiam malesuada rutrum enim</a></li>
                            <li><a href="#">Aenean elementum facilisis ligula</a></li>
                            <li><a href="#">Ut tincidunt elit vitae augue</a></li>
                        </ul>
                    </div>
                </div>
                <div id="footer">
                    <p>Copyright (c) 2011 PlaceForU.com. All rights reserved. Design by <a href="http://www.freecsstemplates.org/">CSS Templates</a> & PlaceForU Team.</p>
                </div>
            </div>
            <!-- end #footer -->
    </body>
</html>

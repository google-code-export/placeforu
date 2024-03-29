<%--
    Document   : entriInformasiSub
    Created on : Dec 19, 2011, 6:17:27 PM
    Author     : Yuni
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
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
                        <li class="current_page_item"><a href="pemilik/profil">Profil</a></li>
                        <li class="current_page_item"><a href="ListGedung">Manajemen Gedung</a></li>
                        <li class="current_page_item"><a href="HistoriSewa">Manajemen Penyewaan</a></li>
                        <li class="current_page_item"><a href="HistoriAdministrasi">Manajemen Administrasi</a></li>
                        <li class="current_page_item"><a href="logout">Log Out</a></li>
                    </ul>
                </div>
                <div id="gallery"><img src="images/img03.jpg" width="692" height="340" alt="" /></div>
            </div>
            <div id="page">
                <div id="page-bgtop">
                    <div id="content">
                        <div class="post">
                            <h2 class="title"><a href="#">Edit Informasi Gedung</a></h2>
                            <p class="meta"><span class="date"><% new Date();%></span><span class="posted">Posted by <a href="#">Administrator</a></span></p>
                            <div style="clear: both;">&nbsp;</div>
                            <div class="entry">
                                <fieldset>
                                    <legend><h4>Informasi Sub Gedung</h4></legend>
                                    <form method='post'  action='EditSubGedung'>
                                        <table>
                                            <tr>
                                            <input type="hidden" name="id_sub_gedung" value='${subgedung.id}'>
                                            </tr>
                                            <tr>
                                                <td>Nama SubGedung <font color="red">*</font></td>
                                                <td>:</td>
                                                <td><input type="text" name="nama_sub_gedung" value="${subgedung.nama_sub_gedung}"></td>
                                                <td></td>
                                                <td></td>
                                            </tr>
                                            <tr>
                                                <td>Tipe Sub Gedung <font color="red">*</font></td>
                                                <td>:</td>
                                                <td>
                                                    <select name="tipe_sub_gedung">
                                                        <option value="">Pilih tipe gedung</option>
                                                        <option value="Outdoor">Outdoor</option>
                                                        <option value="Indoor">Indoor</option>
                                                        <option value="Outdoor&Indoor">Outdoor&Indoor</option>
                                                    </select>
                                                </td>
                                                <td></td>
                                                <td></td>
                                            </tr>
                                            <tr><td>Harga Sewa /jam<font color="red">*</font></td>
                                                <td>:</td>
                                                <td><input type="text" name="harga" value="${subgedung.harga}">
                                                    Satuan
                                                    :
                                                    <select name="satuan">
                                                        <option value="IDR">IDR</option>
                                                        <option value="USD">USD</option>
                                                        <option value="EURO">EURO</option>
                                                    </select>
                                                </td>
                                            </tr>
                                            <tr><td>Kapasitas</td>
                                                <td>:</td>
                                                <td><input type="text" name="kapasitas" value="${subgedung.kapasitas}">

                                                    orang</td>
                                            </tr>
                                            <tr><td>Luas </td>
                                                <td>:</td>
                                                <td><input type="text" name="luas" value="${subgedung.luas}">
                                                    meter persegi</td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    Fasilitas Sub Gedung<font color="red">*</font>
                                                </td>
                                                <td>:</td>
                                                <td>
                                                    <textarea name="fasilitas_sub" value="${subgedung.nama_sub_gedung}">${subgedung.fasilitas_sub}</textarea>
                                                </td>
                                            </tr>
                                            <tr><td></td><td></td>
                                                <td>
                                                    <font color="red">*Pisahkan tiap fasilitas dengan tanda titik (.)</font>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    Deskripsi Sub Gedung<font color="red">*</font>
                                                </td>
                                                <td>:</td>
                                                <td>
                                                    <textarea name="deskripsi_sub" value="${subgedung.deskripsi_sub}">${subgedung.deskripsi_sub}</textarea>
                                                </td>
                                            </tr>
                                            <tr><td>Status Sewa <font color="red">*</font></td>
                                                <td>:</td>
                                                <td>
                                                    <select name="status">
                                                        <option value="">    </option>
                                                        <option value="Tersedia">Tersedia</option>
                                                        <option value="Telah Disewa">Telah Disewa</option>
                                                    </select>
                                                </td>
                                            </tr>
                                            <tr><td><input type="submit" name="tambah" value="Simpan"><input type="reset" value="Reset"></td>
                                                <td></td>
                                                <td>
                                                </td>
                                            </tr>
                                        </table>
                                    </form>
                                </fieldset>
                                <tr>
                                    <td>
                                        <fieldset>
                                            <legend><h4>Upload Gambar Sub Gedung</h4></legend>
                                            <table>
                                                <form action="uploadfotosub?idsub=${subgedung.id}" enctype="multipart/form-data" method="POST">
                                                    <tr>
                                                        <td>Gambar 1</td>
                                                        <td>:</td>
                                                        <td><input type="file" name="foto"></td>
                                                    </tr>
                                                    <tr>
                                                        <td></td>
                                                        <td></td>
                                                        <td><input type="submit" name="Submit" value="Upload"></td>
                                                    </tr>
                                                </form>
                                                <tr>
                                                </tr>
                                            </table>
                                        </fieldset>
                                    </td>
                                </tr>
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
            </div>
            <div id="footer">
                <p>Copyright (c) 2011 PlaceForU.com. All rights reserved. Design by <a href="http://www.freecsstemplates.org/">CSS Templates</a> & PlaceForU Team.</p>
            </div>
        </div>
        <!-- end #footer -->
    </body>
</html>


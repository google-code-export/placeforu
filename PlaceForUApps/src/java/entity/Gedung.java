/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Ika
 */
@Entity
public class Gedung implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long idPemilik;
    private String namaGedung;
    private String tipeGedung;
    private String kategoriGedung;
    private String propinsiGedung;
    private String kotaGedung;
    private String alamatGedung;
    private String deskripsiGedung;
    private String fasilitasGedung;
    private String noTelpGedung;
    private String emailGedung;
    private String fotoUtamaGedung;
    private String fotoGedung1;
    private String fotoGedung2;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFotoGedung1() {
        return fotoGedung1;
    }

    public void setFotoGedung1(String fotoGedung1) {
        this.fotoGedung1 = fotoGedung1;
    }

    public String getFotoGedung2() {
        return fotoGedung2;
    }

    public void setFotoGedung2(String fotoGedung2) {
        this.fotoGedung2 = fotoGedung2;
    }

    public String getFotoUtamaGedung() {
        return fotoUtamaGedung;
    }

    public void setFotoUtamaGedung(String fotoUtamaGedung) {
        this.fotoUtamaGedung = fotoUtamaGedung;
    }

    public String getNoTelpGedung() {
        return noTelpGedung;
    }

    public void setNoTelpGedung(String noTelpGedung) {
        this.noTelpGedung = noTelpGedung;
    }

    //getting Nama Gedung
    public String getNamaGedung(){
        return namaGedung;
    }

    //setting Nama Gedung
    public void setNamaGedung(String namaGedung){
        this.namaGedung = namaGedung;
    }

    //getting Tipe Gedung
    public String getTipeGedung(){
        return tipeGedung;
    }

    //setting Tipe Gedung
    public void setTipeGedung(String tipeGedung){
        this.tipeGedung = tipeGedung;
    }

    //getting Kategori Gedung
    public String getKategoriGedung(){
        return kategoriGedung;
    }

    //setting Kategori Gedung
    public void setKategoriGedung(String kategoriGedung){
        this.kategoriGedung = kategoriGedung;
    }

    //getting Propinsi Gedung
    public String getPropinsiGedung(){
        return propinsiGedung;
    }

    //setting Propinsi Gedung
    public void setPropinsiGedung(String propinsiGedung){
        this.propinsiGedung = propinsiGedung;
    }

    //getting Kota Gedung
    public String getKotaGedung(){
        return kotaGedung;
    }

    //setting Kota Gedung
    public void setKotaGedung(String kotaGedung){
        this.kotaGedung = kotaGedung;
    }

    //getting Alamat Gedung
    public String getAlamatGedung(){
        return alamatGedung;
    }

    //setting Kota Gedung
    public void setAlamatGedung(String alamatGedung){
        this.alamatGedung = alamatGedung;
    }

    //getting Deskripsi Gedung
    public String getDeskripsiGedung(){
        return deskripsiGedung;
    }

    //setting Deskripsi Gedung
    public void setDeskripsiGedung(String deskripsiGedung){
        this.deskripsiGedung = deskripsiGedung;
    }

    //getting Fasilitas Gedung
    public String getFasilitasGedung(){
        return fasilitasGedung;
    }

    //setting Fasilitas Gedung
    public void setFasilitasGedung(String fasilitasGedung){
        this.fasilitasGedung = fasilitasGedung;
    }

    //getting No Telp Gedung
    public String getTelpGedung(){
        return noTelpGedung;
    }

    //setting No Telp Gedung
    public void setTelpGedung(String noTelpGedung){
        this.noTelpGedung = noTelpGedung;
    }

    //getting email Gedung
    public String getEmailGedung(){
        return emailGedung;
    }

    //setting Email Gedung
    public void setEmailGedung(String emailGedung){
        this.emailGedung = emailGedung;
    }

    //getting Deskripsi Gedung
    public Long getIdPemilik(){
        return idPemilik;
    }

    //setting Deskripsi Gedung
    public void setIdPemilik(Long idPemilik){
        this.idPemilik = idPemilik;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gedung)) {
            return false;
        }
        Gedung other = (Gedung) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Gedung[ id=" + id + " ]";
    }

}

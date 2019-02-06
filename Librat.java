/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "Librat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Librat.findAll", query = "SELECT l FROM Librat l")
    , @NamedQuery(name = "Librat.findByLibratID", query = "SELECT l FROM Librat l WHERE l.libratID = :libratID")
    , @NamedQuery(name = "Librat.findByEmri", query = "SELECT l FROM Librat l WHERE l.emri = :emri")
    , @NamedQuery(name = "Librat.findByAutori", query = "SELECT l FROM Librat l WHERE l.autori = :autori")
    , @NamedQuery(name = "Librat.findByIssn", query = "SELECT l FROM Librat l WHERE l.issn = :issn")
    , @NamedQuery(name = "Librat.findByLexo", query = "SELECT l FROM Librat l WHERE l.lexo = :lexo")})
public class Librat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Librat_ID")
      @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer libratID;
    @Column(name = "Emri")
    private String emri;
    @Column(name = "Autori")
    private String autori;
    @Column(name = "ISSN")
    private Integer issn;
    @Column(name = "LEXO")
    private String lexo;

    public Librat() {
    }

    public Librat(Integer libratID) {
        this.libratID = libratID;
    }

    public Integer getLibratID() {
        return libratID;
    }

    public void setLibratID(Integer libratID) {
        this.libratID = libratID;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getAutori() {
        return autori;
    }

    public void setAutori(String autori) {
        this.autori = autori;
    }

    public Integer getIssn() {
        return issn;
    }

    public void setIssn(Integer issn) {
        this.issn = issn;
    }

    public String getLexo() {
        return lexo;
    }

    public void setLexo(String lexo) {
        this.lexo = lexo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (libratID != null ? libratID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Librat)) {
            return false;
        }
        Librat other = (Librat) object;
        if ((this.libratID == null && other.libratID != null) || (this.libratID != null && !this.libratID.equals(other.libratID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Librat[ libratID=" + libratID + " ]";
    }
    
}

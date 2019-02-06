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
@Table(name = "Revistat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Revistat.findAll", query = "SELECT r FROM Revistat r")
    , @NamedQuery(name = "Revistat.findByRevistatid", query = "SELECT r FROM Revistat r WHERE r.revistatid = :revistatid")
    , @NamedQuery(name = "Revistat.findByEmri", query = "SELECT r FROM Revistat r WHERE r.emri = :emri")
    , @NamedQuery(name = "Revistat.findByBotuesi", query = "SELECT r FROM Revistat r WHERE r.botuesi = :botuesi")
    , @NamedQuery(name = "Revistat.findByIssn", query = "SELECT r FROM Revistat r WHERE r.issn = :issn")})
public class Revistat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Revistat_id")
      @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer revistatid;
    @Column(name = "Emri")
    private String emri;
    @Column(name = "Botuesi")
    private String botuesi;
    @Column(name = "ISSN")
    private Integer issn;

    public Revistat() {
    }

    public Revistat(Integer revistatid) {
        this.revistatid = revistatid;
    }

    public Integer getRevistatid() {
        return revistatid;
    }

    public void setRevistatid(Integer revistatid) {
        this.revistatid = revistatid;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getBotuesi() {
        return botuesi;
    }

    public void setBotuesi(String botuesi) {
        this.botuesi = botuesi;
    }

    public Integer getIssn() {
        return issn;
    }

    public void setIssn(Integer issn) {
        this.issn = issn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (revistatid != null ? revistatid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Revistat)) {
            return false;
        }
        Revistat other = (Revistat) object;
        if ((this.revistatid == null && other.revistatid != null) || (this.revistatid != null && !this.revistatid.equals(other.revistatid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Revistat[ revistatid=" + revistatid + " ]";
    }
    
}

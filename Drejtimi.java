/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "Drejtimi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Drejtimi.findAll", query = "SELECT d FROM Drejtimi d")
    , @NamedQuery(name = "Drejtimi.findByDrejtimiID", query = "SELECT d FROM Drejtimi d WHERE d.drejtimiID = :drejtimiID")
    , @NamedQuery(name = "Drejtimi.findByEmri", query = "SELECT d FROM Drejtimi d WHERE d.emri = :emri")})
public class Drejtimi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Drejtimi_ID")
      @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer drejtimiID;
    @Basic(optional = false)
    @Column(name = "Emri")
    private String emri;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "drejtimie")
    private Collection<Eventi> eventiCollection;

    public Drejtimi() {
    }

    public Drejtimi(Integer drejtimiID) {
        this.drejtimiID = drejtimiID;
    }

    public Drejtimi(Integer drejtimiID, String emri) {
        this.drejtimiID = drejtimiID;
        this.emri = emri;
    }

    public Integer getDrejtimiID() {
        return drejtimiID;
    }

    public void setDrejtimiID(Integer drejtimiID) {
        this.drejtimiID = drejtimiID;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    @XmlTransient
    public Collection<Eventi> getEventiCollection() {
        return eventiCollection;
    }

    public void setEventiCollection(Collection<Eventi> eventiCollection) {
        this.eventiCollection = eventiCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (drejtimiID != null ? drejtimiID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Drejtimi)) {
            return false;
        }
        Drejtimi other = (Drejtimi) object;
        if ((this.drejtimiID == null && other.drejtimiID != null) || (this.drejtimiID != null && !this.drejtimiID.equals(other.drejtimiID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return emri;
    }
    
}

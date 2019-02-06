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
@Table(name = "Profesori")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profesori.findAll", query = "SELECT p FROM Profesori p")
    , @NamedQuery(name = "Profesori.findByProfesoriID", query = "SELECT p FROM Profesori p WHERE p.profesoriID = :profesoriID")
    , @NamedQuery(name = "Profesori.findByEmri", query = "SELECT p FROM Profesori p WHERE p.emri = :emri")})
public class Profesori implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Profesori_ID")
      @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer profesoriID;
    @Basic(optional = false)
    @Column(name = "Emri")
    private String emri;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "profesorie")
    private Collection<Eventi> eventiCollection;

    public Profesori() {
    }

    public Profesori(Integer profesoriID) {
        this.profesoriID = profesoriID;
    }

    public Profesori(Integer profesoriID, String emri) {
        this.profesoriID = profesoriID;
        this.emri = emri;
    }

    public Integer getProfesoriID() {
        return profesoriID;
    }

    public void setProfesoriID(Integer profesoriID) {
        this.profesoriID = profesoriID;
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
        hash += (profesoriID != null ? profesoriID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profesori)) {
            return false;
        }
        Profesori other = (Profesori) object;
        if ((this.profesoriID == null && other.profesoriID != null) || (this.profesoriID != null && !this.profesoriID.equals(other.profesoriID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return emri;
    }
    
}

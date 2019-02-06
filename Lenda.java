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
@Table(name = "Lenda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lenda.findAll", query = "SELECT l FROM Lenda l")
    , @NamedQuery(name = "Lenda.findByLendaID", query = "SELECT l FROM Lenda l WHERE l.lendaID = :lendaID")
    , @NamedQuery(name = "Lenda.findByEmri", query = "SELECT l FROM Lenda l WHERE l.emri = :emri")})
public class Lenda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Lenda_ID")
      @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer lendaID;
    @Basic(optional = false)
    @Column(name = "Emri")
    private String emri;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lendae")
    private Collection<Eventi> eventiCollection;

    public Lenda() {
    }

    public Lenda(Integer lendaID) {
        this.lendaID = lendaID;
    }

    public Lenda(Integer lendaID, String emri) {
        this.lendaID = lendaID;
        this.emri = emri;
    }

    public Integer getLendaID() {
        return lendaID;
    }

    public void setLendaID(Integer lendaID) {
        this.lendaID = lendaID;
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
        hash += (lendaID != null ? lendaID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lenda)) {
            return false;
        }
        Lenda other = (Lenda) object;
        if ((this.lendaID == null && other.lendaID != null) || (this.lendaID != null && !this.lendaID.equals(other.lendaID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return emri;
    }
    
}

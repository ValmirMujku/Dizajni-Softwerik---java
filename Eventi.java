/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "Eventi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Eventi.findAll", query = "SELECT e FROM Eventi e")
    , @NamedQuery(name = "Eventi.findByEventiID", query = "SELECT e FROM Eventi e WHERE e.eventiID = :eventiID")
    , @NamedQuery(name = "Eventi.findByAnetaret", query = "SELECT e FROM Eventi e WHERE e.anetaret = :anetaret")
    , @NamedQuery(name = "Eventi.findByData", query = "SELECT e FROM Eventi e WHERE e.data = :data")})
public class Eventi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Eventi_ID")
      @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer eventiID;
    @Basic(optional = false)
    @Column(name = "Anetaret")
    private String anetaret;
    @Column(name = "Data")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    @JoinColumn(name = "Drejtimie", referencedColumnName = "Drejtimi_ID")
    @ManyToOne(optional = false)
    private Drejtimi drejtimie;
    @JoinColumn(name = "Lendae", referencedColumnName = "Lenda_ID")
    @ManyToOne(optional = false)
    private Lenda lendae;
    @JoinColumn(name = "Profesorie", referencedColumnName = "Profesori_ID")
    @ManyToOne(optional = false)
    private Profesori profesorie;

    public Eventi() {
    }

    public Eventi(Integer eventiID) {
        this.eventiID = eventiID;
    }

    public Eventi(Integer eventiID, String anetaret) {
        this.eventiID = eventiID;
        this.anetaret = anetaret;
    }

    public Integer getEventiID() {
        return eventiID;
    }

    public void setEventiID(Integer eventiID) {
        this.eventiID = eventiID;
    }

    public String getAnetaret() {
        return anetaret;
    }

    public void setAnetaret(String anetaret) {
        this.anetaret = anetaret;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Drejtimi getDrejtimie() {
        return drejtimie;
    }

    public void setDrejtimie(Drejtimi drejtimie) {
        this.drejtimie = drejtimie;
    }

    public Lenda getLendae() {
        return lendae;
    }

    public void setLendae(Lenda lendae) {
        this.lendae = lendae;
    }

    public Profesori getProfesorie() {
        return profesorie;
    }

    public void setProfesorie(Profesori profesorie) {
        this.profesorie = profesorie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventiID != null ? eventiID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eventi)) {
            return false;
        }
        Eventi other = (Eventi) object;
        if ((this.eventiID == null && other.eventiID != null) || (this.eventiID != null && !this.eventiID.equals(other.eventiID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Eventi[ eventiID=" + eventiID + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "Pagesa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pagesa.findAll", query = "SELECT p FROM Pagesa p")
    , @NamedQuery(name = "Pagesa.findByPagesaId", query = "SELECT p FROM Pagesa p WHERE p.pagesaId = :pagesaId")
    , @NamedQuery(name = "Pagesa.findByDigitsnumbers", query = "SELECT p FROM Pagesa p WHERE p.digitsnumbers = :digitsnumbers")
    , @NamedQuery(name = "Pagesa.findByCvv", query = "SELECT p FROM Pagesa p WHERE p.cvv = :cvv")
    , @NamedQuery(name = "Pagesa.findByShuma", query = "SELECT p FROM Pagesa p WHERE p.shuma = :shuma")})
public class Pagesa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "pagesa_id")
      @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq", sequenceName = "INV_SEQ", allocationSize = 1)
    private Integer pagesaId;
    @Basic(optional = false)
    @Column(name = "digitsnumbers")
    private long digitsnumbers;
    @Basic(optional = false)
    @Column(name = "CVV")
    private int cvv;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Shuma")
    private BigDecimal shuma;

    public Pagesa() {
    }

    public Pagesa(Integer pagesaId) {
        this.pagesaId = pagesaId;
    }

    public Pagesa(Integer pagesaId, long digitsnumbers, int cvv) {
        this.pagesaId = pagesaId;
        this.digitsnumbers = digitsnumbers;
        this.cvv = cvv;
    }

    public Integer getPagesaId() {
        return pagesaId;
    }

    public void setPagesaId(Integer pagesaId) {
        this.pagesaId = pagesaId;
    }

    public long getDigitsnumbers() {
        return digitsnumbers;
    }

    public void setDigitsnumbers(long digitsnumbers) {
        this.digitsnumbers = digitsnumbers;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public BigDecimal getShuma() {
        return shuma;
    }

    public void setShuma(BigDecimal shuma) {
        this.shuma = shuma;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pagesaId != null ? pagesaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagesa)) {
            return false;
        }
        Pagesa other = (Pagesa) object;
        if ((this.pagesaId == null && other.pagesaId != null) || (this.pagesaId != null && !this.pagesaId.equals(other.pagesaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Pagesa[ pagesaId=" + pagesaId + " ]";
    }
    
}

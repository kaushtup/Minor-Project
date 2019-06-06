/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mymatch.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "messagestore")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Messagestore.findAll", query = "SELECT m FROM Messagestore m"),
    @NamedQuery(name = "Messagestore.findByMid", query = "SELECT m FROM Messagestore m WHERE m.mid = :mid"),
    @NamedQuery(name = "Messagestore.findByFrom", query = "SELECT m FROM Messagestore m WHERE m.from = :from"),
    @NamedQuery(name = "Messagestore.findByTo", query = "SELECT m FROM Messagestore m WHERE m.to = :to"),
    @NamedQuery(name = "Messagestore.findByMessage", query = "SELECT m FROM Messagestore m WHERE m.message = :message")})
public class Messagestore implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mid")
    private Integer mid;
    @Basic(optional = false)
    @Column(name = "from")
    private String from;
    @Basic(optional = false)
    @Column(name = "to")
    private String to;
    @Basic(optional = false)
    @Column(name = "message")
    private String message;

    public Messagestore() {
    }

    public Messagestore(Integer mid) {
        this.mid = mid;
    }

    public Messagestore(Integer mid, String from, String to, String message) {
        this.mid = mid;
        this.from = from;
        this.to = to;
        this.message = message;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mid != null ? mid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Messagestore)) {
            return false;
        }
        Messagestore other = (Messagestore) object;
        if ((this.mid == null && other.mid != null) || (this.mid != null && !this.mid.equals(other.mid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mymatch.model.Messagestore[ mid=" + mid + " ]";
    }
    
}

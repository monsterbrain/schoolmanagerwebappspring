/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websystique.spring.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author monster
 */
@Entity
@Table(name = "breaktime_master")
@NamedQueries({
    @NamedQuery(name = "BreaktimeMaster.findAll", query = "SELECT b FROM BreaktimeMaster b")
    , @NamedQuery(name = "BreaktimeMaster.findById", query = "SELECT b FROM BreaktimeMaster b WHERE b.id = :id")
    , @NamedQuery(name = "BreaktimeMaster.findByName", query = "SELECT b FROM BreaktimeMaster b WHERE b.name = :name")
    , @NamedQuery(name = "BreaktimeMaster.findByAfterPeriodPosition", query = "SELECT b FROM BreaktimeMaster b WHERE b.afterPeriodPosition = :afterPeriodPosition")
    , @NamedQuery(name = "BreaktimeMaster.findByStartTime", query = "SELECT b FROM BreaktimeMaster b WHERE b.startTime = :startTime")
    , @NamedQuery(name = "BreaktimeMaster.findByEndTime", query = "SELECT b FROM BreaktimeMaster b WHERE b.endTime = :endTime")})
public class BreaktimeMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "name")
    private String name;
    @Column(name = "after_period_position")
    private Integer afterPeriodPosition;
    @Column(name = "start_time")
    @Temporal(TemporalType.TIME)
    private Date startTime;
    @Column(name = "end_time")
    @Temporal(TemporalType.TIME)
    private Date endTime;

    public BreaktimeMaster() {
    }

    public BreaktimeMaster(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAfterPeriodPosition() {
        return afterPeriodPosition;
    }

    public void setAfterPeriodPosition(Integer afterPeriodPosition) {
        this.afterPeriodPosition = afterPeriodPosition;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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
        if (!(object instanceof BreaktimeMaster)) {
            return false;
        }
        BreaktimeMaster other = (BreaktimeMaster) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.websystique.spring.model.BreaktimeMaster[ id=" + id + " ]";
    }
    
}

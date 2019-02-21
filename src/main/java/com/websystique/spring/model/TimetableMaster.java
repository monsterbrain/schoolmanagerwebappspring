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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author monster
 */
@Entity
@Table(name = "timetable_master")
@NamedQueries({
    @NamedQuery(name = "TimetableMaster.findAll", query = "SELECT t FROM TimetableMaster t")
    , @NamedQuery(name = "TimetableMaster.findById", query = "SELECT t FROM TimetableMaster t WHERE t.id = :id")
    , @NamedQuery(name = "TimetableMaster.findByDayId", query = "SELECT t FROM TimetableMaster t WHERE t.dayId = :dayId")
    , @NamedQuery(name = "TimetableMaster.findByPeriodPos", query = "SELECT t FROM TimetableMaster t WHERE t.periodPos = :periodPos")
    , @NamedQuery(name = "TimetableMaster.findByClassId", query = "SELECT t FROM TimetableMaster t WHERE t.classId = :classId")
    , @NamedQuery(name = "TimetableMaster.findBySubjectId", query = "SELECT t FROM TimetableMaster t WHERE t.subjectId = :subjectId")
    , @NamedQuery(name = "TimetableMaster.findByTeacherId", query = "SELECT t FROM TimetableMaster t WHERE t.teacherId = :teacherId")
    , @NamedQuery(name = "TimetableMaster.findByRoomId", query = "SELECT t FROM TimetableMaster t WHERE t.roomId = :roomId")
    , @NamedQuery(name = "TimetableMaster.findByStartTime", query = "SELECT t FROM TimetableMaster t WHERE t.startTime = :startTime")
    , @NamedQuery(name = "TimetableMaster.findByEndTime", query = "SELECT t FROM TimetableMaster t WHERE t.endTime = :endTime")})
public class TimetableMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "day_id")
    private Integer dayId;
    @Column(name = "period_pos")
    private Integer periodPos;
    @Column(name = "class_id")
    private Integer classId;
    @Column(name = "subject_id")
    private Integer subjectId;
    @Column(name = "teacher_id")
    private Integer teacherId;
    @Column(name = "room_id")
    private Integer roomId;
    @Column(name = "start_time")
    @Temporal(TemporalType.TIME)
    private Date startTime;
    @Column(name = "end_time")
    @Temporal(TemporalType.TIME)
    private Date endTime;
    
    @ManyToOne()
    @JoinColumn(name = "subject_id",insertable = false, updatable = false)
    private SubjectMaster subjectInfo;
    
    @ManyToOne()
    @JoinColumn(name = "teacher_id",insertable = false, updatable = false)
    private TeacherMaster teacherInfo;

    public TimetableMaster() {
    }

    public TimetableMaster(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDayId() {
        return dayId;
    }

    public void setDayId(Integer dayId) {
        this.dayId = dayId;
    }

    public Integer getPeriodPos() {
        return periodPos;
    }

    public void setPeriodPos(Integer periodPos) {
        this.periodPos = periodPos;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
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
        if (!(object instanceof TimetableMaster)) {
            return false;
        }
        TimetableMaster other = (TimetableMaster) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.websystique.spring.model.TimetableMaster[ id=" + id + " ]";
    }
    
}

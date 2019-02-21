/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websystique.spring.model;

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
import javax.validation.constraints.Size;

/**
 *
 * @author monster
 */
@Entity
@Table(name = "student_master")
@NamedQueries({
    @NamedQuery(name = "StudentMaster.findAll", query = "SELECT s FROM StudentMaster s")
    , @NamedQuery(name = "StudentMaster.findById", query = "SELECT s FROM StudentMaster s WHERE s.id = :id")
    , @NamedQuery(name = "StudentMaster.findByFirstName", query = "SELECT s FROM StudentMaster s WHERE s.firstName = :firstName")
    , @NamedQuery(name = "StudentMaster.findByLastName", query = "SELECT s FROM StudentMaster s WHERE s.lastName = :lastName")
    , @NamedQuery(name = "StudentMaster.findByClassId", query = "SELECT s FROM StudentMaster s WHERE s.classId = :classId")})
public class StudentMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 20)
    @Column(name = "first_name")
    private String firstName;
    @Size(max = 20)
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "class_id")
    private Integer classId;

    public StudentMaster() {
    }

    public StudentMaster(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
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
        if (!(object instanceof StudentMaster)) {
            return false;
        }
        StudentMaster other = (StudentMaster) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.websystique.spring.model.StudentMaster[ id=" + id + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websystique.spring.dao;

import com.websystique.spring.model.TimetableMaster;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Projections;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author monster
 */
@Repository("timetableDao")
public class TimetableDao extends AbstractDao{
 
//    public void deleteEmployeeBySsn(String ssn) {
//        Query query = getSession().createSQLQuery("delete from Employee where ssn = :ssn");
//        query.setString("ssn", ssn);
//        query.executeUpdate();
//    }
// 
//     
//    public Employee findBySsn(String ssn){
//        Criteria criteria = getSession().createCriteria(Employee.class);
//        criteria.add(Restrictions.eq("ssn",ssn));
//        return (Employee) criteria.uniqueResult();
//    }
//     
//    public void updateEmployee(Employee employee){
//        getSession().update(employee);
//    }

    public List getTimetable() {
        Criteria criteria = getSession().createCriteria(TimetableMaster.class);
        //criteria.createAlias("subjectMaster", "sub", JoinType.INNER_JOIN);
                
        criteria.createAlias("subjectInfo", "sub");
        criteria.createAlias("teacherInfo", "teacher");
        
        criteria.setProjection(Projections.projectionList()
                .add(Projections.property("periodPos"))
                .add(Projections.property("startTime"))
                .add(Projections.property("endTime"))
                .add(Projections.property("teacher.name"))
                .add(Projections.property("sub.name"))
                
                );
        //criteria.add( "sub.name", "subjectname");
        return (List<TimetableMaster>) criteria.list();
    }
     
}

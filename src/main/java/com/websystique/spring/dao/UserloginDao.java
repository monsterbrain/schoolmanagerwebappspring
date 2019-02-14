/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websystique.spring.dao;

import com.websystique.spring.model.Employee;
import com.websystique.spring.model.UserloginMaster;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author monster
 */
@Repository("userloginDao")
public class UserloginDao extends AbstractDao{
 
//    public void saveEmployee(Employee employee) {
//        persist(employee);
//    }
 
    @SuppressWarnings("unchecked")
    public List<UserloginMaster> getUserlist() {
        Criteria criteria = getSession().createCriteria(UserloginMaster.class);
        return (List<UserloginMaster>) criteria.list();
    }
    
    @SuppressWarnings("unchecked")
    public List<UserloginMaster> checkUsers(String username, String pwd) {
        
        Criteria criteria = getSession().createCriteria(UserloginMaster.class);
        criteria.add(Restrictions.eq("username", username));
        criteria.add(Restrictions.eq("password", pwd));
        
        return (List<UserloginMaster>) criteria.list();
    }
 
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
     
}

package com.websystique.springmvc.dao;

import java.util.List;

import com.websystique.springmvc.model.Employee;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("employeeDao")
public class EmployeeDaoImpl extends AbstractDao<Integer, Employee> implements EmployeeDao {
    @Override
    public Employee findById(int id) {
        return null;
    }

    @Override
    public void saveEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployeeBySsn(String ssn) {

    }

    @Override
    public List<Employee> findAllEmployees() {
        return null;
    }

    @Override
    public Employee findEmployeeBySsn(String ssn) {
        return null;
    }

    //   public Employee findById(int id) {
     //   return getByKey(id);
  //  }

  //  public void saveEmployee(Employee employee) {
   //     persist(employee);
  //  }

  //  public void deleteEmployeeBySsn(String ssn) {
    //    Query query = getSession().createSQLQuery("delete from Employee where ssn = :ssn");
    /*    query.setString("ssn", ssn);
        query.executeUpdate();
    }

    @SuppressWarnings("unchecked")
    public List<Employee> findAllEmployees() {
        Criteria criteria = createEntityCriteria();
        return (List<Employee>) criteria.list();
    }

    public Employee findEmployeeBySsn(String ssn) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("ssn", ssn));
        return (Employee) criteria.uniqueResult();
    }*/
}

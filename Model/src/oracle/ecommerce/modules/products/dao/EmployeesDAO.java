package oracle.ecommerce.modules.products.dao;

import com.sun.corba.se.spi.activation.Repository;

import javax.persistence.Query;

import oracle.ecommerce.model.dao.BaseDAO;
import oracle.ecommerce.model.dao.BaseInterfaceDAO;
import oracle.ecommerce.model.eo.EmployeesEO;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javax.transaction.Transactional;


public class EmployeesDAO extends BaseDAO<EmployeesEO> {
    public EmployeesDAO(){
        super("EmployeesEO");
    }
}

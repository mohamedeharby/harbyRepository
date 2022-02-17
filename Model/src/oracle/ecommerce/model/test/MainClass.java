package oracle.ecommerce.model.test;

import java.util.List;

import oracle.ecommerce.modules.products.dao.EmployeesDAO;
import oracle.ecommerce.model.eo.EmployeesEO;

import java.util.Date;

import oracle.ecommerce.modules.products.dto.EmployeesDTO;
import oracle.ecommerce.model.eo.base.BaseEO;
import oracle.ecommerce.model.exception.ECommereceModelException;
import oracle.ecommerce.modules.products.ProductsFacade;
import oracle.ecommerce.modules.products.ProductsFacadeImpl;
import oracle.ecommerce.utils.ModelUtils;

public class MainClass {
    public static void main(String[] args) {
        EmployeesDAO employeesDAO = new EmployeesDAO();
        EmployeesEO employeesEO = new EmployeesEO(null,60L,"m23@w669599f.com","z3bola 3",
                                                  new Date(),"AD_PRES","elharby",null,null,20L);
        
        
        
        employeesDAO.save(employeesEO);
        

        //        EmployeesEO byId = employeesDAO.findById(243);
//        EmployeesDTO convertEOtoDTO = ModelUtils.convertEOtoDTO(EmployeesDTO.class, byId);
//
//        System.err.println("///"+convertEOtoDTO.getFirstName());

    }
}

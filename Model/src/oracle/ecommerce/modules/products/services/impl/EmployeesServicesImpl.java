package oracle.ecommerce.modules.products.services.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import oracle.ecommerce.model.eo.EmployeesEO;
import oracle.ecommerce.model.eo.base.BaseEO;
import oracle.ecommerce.model.exception.ECommereceModelException;
import oracle.ecommerce.modules.products.dao.EmployeesDAO;
import oracle.ecommerce.modules.products.services.EmployeesServices;
import oracle.ecommerce.modules.products.dto.EmployeesDTO;
import oracle.ecommerce.utils.ConvertUtils;
import oracle.ecommerce.utils.ModelUtils;

public class EmployeesServicesImpl implements EmployeesServices{
    private EmployeesDAO employeesDAO = new EmployeesDAO();
    @Override
    public EmployeesDTO insertEmployee(EmployeesDTO employeesDTO) throws ECommereceModelException{
        if(employeesDTO != null){
            EmployeesEO eo = ConvertUtils.convertToEntity(employeesDTO,EmployeesEO.class);
            return ConvertUtils.convertToDto(employeesDAO.save(eo),EmployeesDTO.class);
        }
        
     return null;   
    }

    @Override
    public List<EmployeesDTO> findAll() throws ECommereceModelException{
        return ConvertUtils.convertToDtoList(new ArrayList(employeesDAO.findAll()), 
                                             EmployeesDTO.class);
    }
}

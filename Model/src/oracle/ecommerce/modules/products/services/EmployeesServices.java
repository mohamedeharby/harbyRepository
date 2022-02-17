package oracle.ecommerce.modules.products.services;

import java.util.List;

import oracle.ecommerce.model.exception.ECommereceModelException;
import oracle.ecommerce.modules.products.dto.EmployeesDTO;

public interface EmployeesServices {
    public EmployeesDTO insertEmployee(EmployeesDTO employeesDTO) throws ECommereceModelException;
    public List<EmployeesDTO> findAll() throws ECommereceModelException;
}

package oracle.ecommerce.modules.products;

import java.util.List;

import oracle.ecommerce.model.exception.ECommereceModelException;
import oracle.ecommerce.modules.products.dto.EmployeesDTO;

public interface ProductsFacade {
    public EmployeesDTO insertEmployee(EmployeesDTO employeesDTO) throws ECommereceModelException;
    public List<EmployeesDTO> findAll() throws ECommereceModelException;
}

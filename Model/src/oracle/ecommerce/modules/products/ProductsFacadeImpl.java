package oracle.ecommerce.modules.products;

import java.util.Collections;
import java.util.List;

import oracle.ecommerce.model.exception.ECommereceModelException;
import oracle.ecommerce.modules.products.dto.EmployeesDTO;
import oracle.ecommerce.modules.products.services.EmployeesServices;
import oracle.ecommerce.modules.products.services.impl.EmployeesServicesImpl;

public class ProductsFacadeImpl implements ProductsFacade {
    private EmployeesServices employeesServices = new EmployeesServicesImpl();
    @Override
    public EmployeesDTO insertEmployee(EmployeesDTO employeesDTO) throws ECommereceModelException {
        return employeesServices.insertEmployee(employeesDTO);
    }

    @Override
    public List<EmployeesDTO> findAll() throws ECommereceModelException {
        return employeesServices.findAll();
    }
}

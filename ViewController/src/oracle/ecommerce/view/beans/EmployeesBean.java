package oracle.ecommerce.view.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import oracle.ecommerce.model.exception.ECommereceModelException;
import oracle.ecommerce.modules.products.ProductsFacade;
import oracle.ecommerce.modules.products.dto.EmployeesDTO;
import oracle.ecommerce.view.beans.base.BaseBean;

@ManagedBean(name="employeesBean")
@ViewScoped
public class EmployeesBean extends BaseBean{
    public ProductsFacade productsFacade = getProductFacade() ;
    List<EmployeesDTO> employees = new ArrayList<EmployeesDTO>();
    @PostConstruct
    public void postConstructor(){
        try {
            employees = productsFacade.findAll();
        } catch (ECommereceModelException e) {
            e.printStackTrace();
        }
    }
    public EmployeesBean(){
        
    }

    public void setEmployees(List<EmployeesDTO> employees) {
        this.employees = employees;
    }

    public List<EmployeesDTO> getEmployees() {
        return employees;
    }
}

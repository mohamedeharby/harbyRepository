package oracle.ecommerce.modules.products.dto;

import java.util.Date;

import oracle.ecommerce.model.dto.BaseDTO;


public class EmployeesDTO extends BaseDTO {
    private Integer commissionPct;
    private Integer departmentId;
    private String email;
    private Integer id;
    private String firstName;
    private Date hireDate;
    private String jobId;
    private String lastName;
    private Integer managerId;
    private String phoneNumber;
    private Integer salary;

    public EmployeesDTO(){
        
    }
    public EmployeesDTO(Integer commissionPct, Integer departmentId, String email, Integer id, String firstName,
                        Date hireDate, String jobId, String lastName, Integer managerId, String phoneNumber,
                        Integer salary) {
        this.commissionPct = commissionPct;
        this.departmentId = departmentId;
        this.email = email;
        this.id = id;
        this.firstName = firstName;
        this.hireDate = hireDate;
        this.jobId = jobId;
        this.lastName = lastName;
        this.managerId = managerId;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public void setCommissionPct(Integer commissionPct) {
        this.commissionPct = commissionPct;
    }

    public Integer getCommissionPct() {
        return commissionPct;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobId() {
        return jobId;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getSalary() {
        return salary;
    }
}

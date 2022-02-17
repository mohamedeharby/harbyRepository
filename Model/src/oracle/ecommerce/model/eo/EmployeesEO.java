package oracle.ecommerce.model.eo;

import oracle.ecommerce.model.eo.base.BaseEO;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * To create ID generator sequence "EMPLOYEES_ID_SEQ_GEN":
 * CREATE SEQUENCE "EMPLOYEES_ID_SEQ_GEN" INCREMENT BY 50 START WITH 50;
 */
@Entity
@Table(name="Employees")
@NamedQueries({ @NamedQuery(name = "Employees.findAll", query = "select o from EmployeesEO o") })
public class EmployeesEO extends BaseEO implements Serializable{
    
    @Id
    @Column(name = "EMPLOYEE_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMPLOYEES_SEQ")
    @SequenceGenerator(sequenceName = "EMPLOYEES_SEQ", allocationSize = 1, name = "EMPLOYEES_SEQ")
    
//    @Id 
//    @Column(name="ID")
//    @GeneratedValue(strategy = GenerationType.TABLE)
    protected Long id;
    
    
    @Column(name = "COMMISSION_PCT")
    private Long commissionPct;
    @Column(name = "DEPARTMENT_ID")
    private Long departmentId;
    @Column(nullable = false, unique = true, length = 25)
    private String email;
    
    @Column(name = "FIRST_NAME", length = 20)
    private String firstName;
    @Temporal(TemporalType.DATE)
    @Column(name = "HIRE_DATE", nullable = false)
    private Date hireDate;
    @Column(name = "JOB_ID", nullable = false, length = 10)
    private String jobId;
    @Column(name = "LAST_NAME", nullable = false, length = 25)
    private String lastName;
    @Column(name = "MANAGER_ID")
    private Long managerId;
    @Column(name = "PHONE_NUMBER", length = 20)
    private String phoneNumber;
    private Long salary;
    


    public EmployeesEO() {
    }

    public EmployeesEO(Long commissionPct, Long departmentId, String email, String firstName,
                     Date hireDate, String jobId, String lastName, Long managerId, String phoneNumber,
                     Long salary) {
        this.commissionPct = commissionPct;
        this.departmentId = departmentId;
        this.email = email;
        this.firstName = firstName;
        this.hireDate = hireDate;
        this.jobId = jobId;
        this.lastName = lastName;
        this.managerId = managerId;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public Long getCommissionPct() {
        return commissionPct;
    }

    public void setCommissionPct(Long commissionPct) {
        this.commissionPct = commissionPct;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }


    public Long getId() {
        return id;
    }
}

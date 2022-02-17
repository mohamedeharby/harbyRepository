package oracle.ecommerce.model.dto;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseDTO {
    protected String isDeleted;
    
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getIsDeleted() {
        return isDeleted;
}
}

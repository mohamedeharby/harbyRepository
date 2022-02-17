package oracle.ecommerce.model.exception;

import java.io.Serializable;

public class ECommereceModelException extends Exception implements Serializable {
    @SuppressWarnings("compatibility:-3122947955906745611")
    private static final long serialVersionUID = 1L;
    private String errorMessage;
    
    public ECommereceModelException(String errorMessage){
        this.errorMessage = errorMessage;
    }
}

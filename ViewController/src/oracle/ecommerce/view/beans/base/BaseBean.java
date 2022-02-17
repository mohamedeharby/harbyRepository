package oracle.ecommerce.view.beans.base;

import javax.persistence.MappedSuperclass;

import oracle.ecommerce.modules.products.ProductsFacade;
import oracle.ecommerce.view.factory.impl.FacadeFactoryImpl;

@MappedSuperclass
public abstract class BaseBean extends FacadeFactoryImpl {
    
}

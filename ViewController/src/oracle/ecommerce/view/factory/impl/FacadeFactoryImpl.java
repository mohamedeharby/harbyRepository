package oracle.ecommerce.view.factory.impl;

import oracle.ecommerce.modules.products.ProductsFacade;
import oracle.ecommerce.modules.products.ProductsFacadeImpl;
import oracle.ecommerce.view.factory.FacadeFactory;

public class FacadeFactoryImpl implements FacadeFactory {
    @Override
    public ProductsFacade getProductFacade() {
        return new ProductsFacadeImpl();
    }
}

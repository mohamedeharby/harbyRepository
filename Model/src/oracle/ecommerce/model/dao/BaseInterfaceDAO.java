package oracle.ecommerce.model.dao;

import oracle.ecommerce.model.eo.base.BaseEO;

import java.util.List;

public interface BaseInterfaceDAO<EO extends BaseEO> {
    List<EO> findAll();

    EO findById(Integer id);

    EO save(EO eo);

    void delete(EO eo);

    EO update(EO eo);
}

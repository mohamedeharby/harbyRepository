package oracle.ecommerce.utils;

import java.io.EOFException;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import javax.persistence.Query;

import oracle.ecommerce.model.dto.BaseDTO;
import oracle.ecommerce.model.eo.base.BaseEO;

import org.modelmapper.ModelMapper;

public final class ModelUtils {

    
    public static <EO extends BaseEO> List<EO> executeJPQLQuery(String Query,EntityManager entityManager) {
        Query query = entityManager.createQuery(Query);
        @SuppressWarnings("unchecked")
        List<EO> list = query.getResultList();
        return list;
    }

    public static void executeUpdateJPQLQuery(String Query,EntityManager entityManager) {
        Query query = entityManager.createQuery(Query);
        query.executeUpdate();
    }
  
}

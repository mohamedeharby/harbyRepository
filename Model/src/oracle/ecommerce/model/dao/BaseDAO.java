package oracle.ecommerce.model.dao;

import java.io.Serializable;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.MappedSuperclass;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import javax.persistence.Query;

import oracle.ecommerce.model.eo.base.BaseEO;

@MappedSuperclass
public abstract class BaseDAO<EO extends BaseEO> implements BaseInterfaceDAO<EO> {
    protected final EntityManagerFactory entityManagerFactory = 
                                    Persistence.createEntityManagerFactory("Model");  
    protected String eoName;
    
    @PersistenceContext        
    private static EntityManager entityManager ;
    
    public BaseDAO(){
        
    }
    
    public BaseDAO(String eoName) {
        this.eoName = eoName;
    }
    

    protected EntityManager getEntityManager() {
        if(entityManager == null)
            return entityManagerFactory.createEntityManager();
        else
            return this.entityManager;    
    }
    
    protected void commitTransaction(EntityManager entityManager){
        entityManager.getTransaction().commit();
    }
    
    protected void rollbackTransaction(EntityManager entityManager){
        entityManager.getTransaction().rollback();
    }
    
    protected void beginTransaction(EntityManager entityManager){
        if(entityManager != null)
            entityManager.getTransaction().begin();
    }
    
    protected void closeTranaction(EntityManager entityManager){
        if(entityManager != null)
            entityManager.close(); 
    }

    @Override
    public List<EO>  findAll() {
        EntityManager entityManager = getEntityManager();
        beginTransaction(entityManager);
        Query createQuery = entityManager.createQuery("select o from " + eoName + " o ");
        rollbackTransaction(entityManager);
        return createQuery.getResultList();
    }

    @Override
    public EO findById(Integer id) {
        EntityManager entityManager = getEntityManager();
        beginTransaction(entityManager);
        Query createQuery = entityManager.createQuery("select o from " + eoName + " o where o.id = "+id);
        rollbackTransaction(entityManager);
        return (EO) createQuery.getSingleResult();     
     }

    @Override
    public EO save(EO eo) {
        EntityManager entityManager = getEntityManager();
        beginTransaction(entityManager);
        entityManager.persist(eo);
        entityManager.flush();
        commitTransaction(entityManager);
        return eo;
    }

    @Override
    public void delete(EO eo) {
         eo.setIsDeleted("Y");
         update(eo);
    }

    @Override
    public EO update(EO eo) {
        EntityManager entityManager = getEntityManager();
        beginTransaction(entityManager);
        entityManager.merge(eo);
        entityManager.flush();
        commitTransaction(entityManager);
        return eo;
    }
}

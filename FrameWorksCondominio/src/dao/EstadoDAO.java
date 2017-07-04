package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import modelo.Estado;

@Stateless
public class EstadoDAO {

    @PersistenceContext
    private EntityManager em;

    public void cadastrar(Estado o) {
        em.persist(o);
    }

    public List<Estado> listar() {
        Query query = em.createQuery("select o from Estado o");
        List<Estado> resultList = query.getResultList();
        return resultList;
    }

}
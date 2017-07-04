package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import modelo.Condominio;

@Stateless
public class CondominioDAO {

    @PersistenceContext
    private EntityManager em;

    public void cadastrar(Condominio o) {
        em.persist(o);
    }

    public List<Condominio> listar() {
        Query query = em.createQuery("select o from Condominio o");
        List<Condominio> resultList = query.getResultList();
        return resultList;
    }

}
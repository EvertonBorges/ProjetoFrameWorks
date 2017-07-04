package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import modelo.Cidade;

@Stateless
public class CidadeDAO {

    @PersistenceContext
    private EntityManager em;

    public void cadastrar(Cidade o) {
        em.persist(o);
    }

    public List<Cidade> listar() {
        Query query = em.createQuery("select o from Cidade o");
        List<Cidade> resultList = query.getResultList();
        return resultList;
    }

}
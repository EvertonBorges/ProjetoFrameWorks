package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import modelo.Bairro;

@Stateless
public class BairroDAO {

    @PersistenceContext
    private EntityManager em;

    public void cadastrar(Bairro o) {
        em.persist(o);
    }

    public List<Bairro> listar() {
        Query query = em.createQuery("select o from Bairro o");
        List<Bairro> resultList = query.getResultList();
        return resultList;
    }

}
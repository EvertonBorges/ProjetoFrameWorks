package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import modelo.Pessoa;

@Stateless
public class PessoaDAO {

    @PersistenceContext
    private EntityManager em;

    public void cadastrar(Pessoa o) {
        em.persist(o);
    }

    public List<Pessoa> listar() {
        Query query = em.createQuery("select o from Pessoa o");
        List<Pessoa> resultList = query.getResultList();
        return resultList;
    }

}
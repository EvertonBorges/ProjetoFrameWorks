package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import modelo.TipoPessoa;

@Stateless
public class TipoPessoaDAO {

    @PersistenceContext
    private EntityManager em;

    public void cadastrar(TipoPessoa o) {
        em.persist(o);
    }

    public List<TipoPessoa> listar() {
        Query query = em.createQuery("select o from TipoPessoa o");
        List<TipoPessoa> resultList = query.getResultList();
        return resultList;
    }

}
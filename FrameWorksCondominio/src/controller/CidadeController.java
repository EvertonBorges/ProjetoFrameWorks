/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.CidadeDAO;
import modelo.Cidade;

/**
 *
 * @author DuAraujo
 */
@SessionScoped
@ManagedBean
public class CidadeController {
    
    @EJB
    private CidadeDAO dao;
    
    private Cidade cidade = new Cidade();
    
    private List<Cidade> cidades = new ArrayList();
    
    @PostConstruct
    public void listar(){
        this.cidades = dao.listar();
    }   
    public void salvar(){
        dao.cadastrar(cidade);
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }

}
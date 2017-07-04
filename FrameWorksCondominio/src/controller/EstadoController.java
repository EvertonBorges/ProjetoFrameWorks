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

import dao.EstadoDAO;
import modelo.Estado;

/**
 *
 * @author DuAraujo
 */
@SessionScoped
@ManagedBean
public class EstadoController {
    
    @EJB
    private EstadoDAO dao;
    
    private Estado estado = new Estado();
    
    private List<Estado> estados = new ArrayList();
    
    @PostConstruct
    public void listar(){
        this.estados = dao.listar();
    }   
    public void salvar(){
        dao.cadastrar(estado);
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }
    
    
    
    
}

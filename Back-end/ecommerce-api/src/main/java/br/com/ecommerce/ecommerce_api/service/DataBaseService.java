package br.com.ecommerce.ecommerce_api.service;

import org.springframework.stereotype.Service;

import br.com.ecommerce.ecommerce_api.model.DataBase;

/**
 * @author Kadu Ribeiro
 *
 */

@Service
public class DataBaseService {

    private final DataBase database = new DataBase();
    
    public void salvarObjeto(Object obj){
        database.salvarObjeto(obj);
    }

    public Object buscarObject (int id){
        return database.buscarObjeto(id);
    }

    public void listarObjetos(){
        database.listarObjetos();
    }
}

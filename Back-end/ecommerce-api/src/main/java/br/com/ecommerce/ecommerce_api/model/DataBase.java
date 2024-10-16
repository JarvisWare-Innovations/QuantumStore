package br.com.ecommerce.ecommerce_api.model;

/**
 * @author Kadu Ribeiro
 *
 */

import java.util.HashMap;
import java.util.Map;

public class DataBase {

    private Map<Integer, Object> database = new HashMap<>();

    private int idSequence = 1;

    public void salvarObjeto(Object obj) {
        database.put(idSequence++, obj);
        System.out.println("Objeto salvo com sucesso:" + obj);
    }

    public Object buscarObjeto(int id) {
        return database.get(id);
    }

    public void listarObjetos(){
        database.forEach((id, obj) -> System.out.println("ID:" + id + " - Objeto:" + obj));
    }

}

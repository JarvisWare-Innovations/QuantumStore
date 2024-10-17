package br.com.ecommerce.ecommerce_api.service;

import br.com.ecommerce.ecommerce_api.model.Admin;
import br.com.ecommerce.ecommerce_api.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Nícolas Santos
 */

@Service
public class AdminService {

    //    Injeção dependências
    @Autowired
    private AdminRepository adminRepository;

    public Admin create(Admin admin) {
        return adminRepository.save(admin);
    }

    public List<Admin> obterAdmin() {
        return adminRepository.findAll();
    }

    public Admin update(Long id, Admin admin) {
        if (adminRepository.existsById(id)) {
            admin.setId_admin(id);
        } else {
            throw new RuntimeException("Este Admin não consta em nosso base de dados, Para de viajar e digita certo o bagulho!");
        }

        return admin;
    }

    public String delete(Long id) {
        if (adminRepository.existsById(id)) {
            adminRepository.deleteById(id);
            return "Admin excluido com sucesso";

        } else {

            throw new RuntimeException("Pelo amor de Deus Digite certo essa budega!");
        }
    }


}

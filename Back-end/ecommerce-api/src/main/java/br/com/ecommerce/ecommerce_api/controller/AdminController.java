package br.com.ecommerce.ecommerce_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ecommerce.ecommerce_api.model.Admin;
import br.com.ecommerce.ecommerce_api.service.AdminService;

/**
 * @author Kadu Ribeiro
 */

@RestController
@RequestMapping("/admins")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping
    public List<Admin> obterAdmin() {
        return adminService.obterAdmin();
    }

    @PostMapping
    public Admin criarAdmin(Admin admin) {
        return adminService.create(admin);
    }

    @PutMapping("/{id}")
    public Admin atualizarAdmin(@PathVariable Long id, Admin admin) {
        return adminService.update(id, admin);
    }

    @DeleteMapping("/{id}")
    public void deletarAdmin(@PathVariable Long id) {
        adminService.delete(id);
    }
}

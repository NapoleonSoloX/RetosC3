package com.example.masterclass3.masterclass3.service;

import com.example.masterclass3.masterclass3.entidades.Admin;
import com.example.masterclass3.masterclass3.entidades.Category;
import com.example.masterclass3.masterclass3.repositorio.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> getAll(){
        return adminRepository.getAll();
    }
    public Optional<Admin> getAdmin (int id){
        return adminRepository.getAdmin(id);
    }

    public Admin save(Admin p){
        if(p.getId()==null){
            return adminRepository.save(p);
        }else{
            Optional<Admin> e= adminRepository.getAdmin(p.getId());
            if(e.isPresent()){
                return p;
            }else{
                return adminRepository.save(p);
            }
        }

    }

    public Admin update (Admin p) {
        if (p.getId() != null) {
            Optional<Admin> q = adminRepository.getAdmin(p.getId());
            if (q.isPresent()) {
                if (p.getName() != null) {
                    q.get().setName(p.getName());
                }
                if (p.getPassword() != null) {
                    q.get().setPassword(p.getPassword());
                }
                if (p.getEmail() != null) {
                    q.get().setEmail(p.getEmail());
                }
                adminRepository.save(q.get());
                return q.get();
            } else {
                return p;
            }
        } else {
            return p;
        }
    }

    public boolean delete (int id){
        boolean flag = false;
        Optional<Admin>p= adminRepository.getAdmin(id);

        if(p.isPresent()) {
            adminRepository.delete(p.get());
            flag = true;
        }
        return flag;
    }

}

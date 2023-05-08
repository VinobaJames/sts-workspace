package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Login;
@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {
    public List<Login> getByEmailAndPassword(String email,String password);
}

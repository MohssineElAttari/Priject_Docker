package com.example.bamcoreport.repository;


import com.example.bamcoreport.model.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

}
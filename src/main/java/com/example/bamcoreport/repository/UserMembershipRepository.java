package com.example.bamcoreport.repository;

import com.example.bamcoreport.model.entity.UserMembership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMembershipRepository extends JpaRepository<UserMembership, Long> {

}

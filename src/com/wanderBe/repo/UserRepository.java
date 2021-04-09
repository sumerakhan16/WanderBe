package com.wanderBe.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wanderBe.entities.User;





@Repository
public interface UserRepository extends JpaRepository<User, String> {

	User getByuName(String uName);

}
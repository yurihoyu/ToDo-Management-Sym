package com.dmm.tasks.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmm.tasks.data.entity.Users;

public interface UsersRepository extends JpaRepository<Users, String> {

}


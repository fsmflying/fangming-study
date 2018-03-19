package com.bidostar.study.fangming.springboot.quickstart.dao;

import com.bidostar.study.fangming.springboot.quickstart.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}

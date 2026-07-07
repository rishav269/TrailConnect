package com.rishav.trailconnect.repository;

import com.rishav.trailconnect.entity.users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<users, Long>
{
}

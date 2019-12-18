package com.wcmei.demo.service.user.repository;

import com.wcmei.demo.service.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wcmei
 * @date 2019-12-16
 * @description
 */
public interface UserRepository extends JpaRepository<User, Long> {
}

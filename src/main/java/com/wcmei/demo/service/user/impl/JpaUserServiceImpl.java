package com.wcmei.demo.service.user.impl;

import com.wcmei.demo.commons.jpa.service.impl.JpaCommServiceImpl;
import com.wcmei.demo.service.user.api.UserService;
import com.wcmei.demo.service.user.domain.User;
import com.wcmei.demo.service.user.repository.UserRepository;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author wcmei
 * @date 2019-12-16
 * @description
 */
@Service(version = "1.0.0",protocol = "dubbo")
public class JpaUserServiceImpl extends JpaCommServiceImpl<User, UserRepository> implements UserService {

    @Override
    public String Test() {
        return "Jpa Service";
    }

}

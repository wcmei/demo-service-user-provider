package com.wcmei.demo.service.user.impl;

import com.wcmei.demo.commons.mybatis.service.impl.TkCommServiceImpl;
import com.wcmei.demo.service.user.api.UserService;
import com.wcmei.demo.service.user.domain.User;
import com.wcmei.demo.service.user.mapper.UserMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author wcmei
 * @date 2019-12-16
 * @description
 */
@Service(version = "2.0.0", protocol = "dubbo")
public class TkUserServiceImpl extends TkCommServiceImpl<User, UserMapper> implements UserService {

    @Override
    public String Test() {
        return "Tk Service";
    }
}

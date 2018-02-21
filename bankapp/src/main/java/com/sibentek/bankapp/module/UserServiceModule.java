package com.sibentek.bankapp.module;

import com.sibentek.bankapp.facade.UserFacade;
import com.sibentek.bankapp.service.UserServiceIntf;
import com.sibentek.bankapp.service.business.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by william on 20/02/2018.
 */
@Configuration
public class UserServiceModule {

    @Bean
    public UserFacade userFacade(UserService userService) {
        return new UserFacade(userService);
    }

    @Bean
    public UserService userService(UserServiceIntf userServiceIntf) {
        return new UserService(userServiceIntf);
    }
}

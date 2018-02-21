package com.sibentek.bankapp.facade;

import com.sibentek.bankapp.domain.User;
import com.sibentek.bankapp.service.business.UserService;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;

/**
 * Created by william on 01/02/2018.
 */
@AllArgsConstructor
public class UserFacade {

    private UserService userService;

    public String signUp(User user, Model model) {
        return userService.signupPost(user, model);
    }
}

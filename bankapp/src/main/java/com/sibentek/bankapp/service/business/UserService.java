package com.sibentek.bankapp.service.business;

import com.sibentek.bankapp.domain.User;
import com.sibentek.bankapp.service.UserServiceIntf;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;

/**
 * Created by william on 20/02/2018.
 */
@AllArgsConstructor
public class UserService {

    private UserServiceIntf userServiceIntf;

    public String signupPost(User user, Model model) {
        if (userServiceIntf.checkUserExists(user.getUsername(), user.getEmail())) {
            if(userServiceIntf.checkEmailExists(user.getEmail())){
                model.addAttribute("emailExists", true);
            }
            if(userServiceIntf.checkUsernameExists(user.getUsername())){
                model.addAttribute("usernameExists", true);
            }
            return "signup";
        } else {
            userServiceIntf.save(user);
            return "redirect:/";
        }
    }
}

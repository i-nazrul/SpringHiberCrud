/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springmvc.service;

import springmvc.model.User;
import java.util.List;


public interface UserService {
    
    public void addUser(User user);

    public User loginUsers(User user);
    
}

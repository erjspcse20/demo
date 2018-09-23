package com.ctl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ctl.model.UserModel;

public interface UserInterface extends JpaRepository<UserModel, Integer>{

}

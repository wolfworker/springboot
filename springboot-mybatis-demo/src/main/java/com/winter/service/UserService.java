package com.winter.service;

import com.winter.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/16.
 */
@Service
public interface UserService {

    int addUser(User user);
}


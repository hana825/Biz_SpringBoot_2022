package com.na.data.service;

import com.na.data.model.UserVO;

import java.util.List;

public interface UserService {

    public List<UserVO> selectAll();
    public UserVO findById(Long seq);
    // Jpa 는 return type 이 void 다.
    public void insert(UserVO userVO);
    public void update(UserVO userVO);
    public void delete(Long seq);
}

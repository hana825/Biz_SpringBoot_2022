package com.na.data.persistence;

import com.na.data.model.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;

/*
Spring-data(JPA)에서는 JpaRepository 를 Generic 방식으로 상속받아 사용한다.
 */
public interface UserRepository extends JpaRepository<UserVO, Long> {

    // [Ctrl] + o

}

package com.example.demo;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;
import org.springframework.stereotype.Component;

import java.util.List;

@ConfigAutowireable
@Dao
public interface UserDataDao {

	@Select
    List<UserData> findAll();

}

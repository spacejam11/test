package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

  // @Autowired
  private UserDataDao userDataDao;

  public DemoService(UserDataDao userDataDao) {
    this.userDataDao = userDataDao;
  }


  public void getUser() {

    // return userDataDao.findAll();
  }
}

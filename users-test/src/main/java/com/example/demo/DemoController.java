package com.example.demo;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

  private DemoService demoService;

  public DemoController(DemoService demoService) {
    this.demoService = demoService;
  }


  @RequestMapping("/")
  public String index(Model model) {

    // ユーザーデータリストを取得
    List<UserData> users = demoService.getUser();

    model.addAttribute("user", users);
    return "index";
  }
}

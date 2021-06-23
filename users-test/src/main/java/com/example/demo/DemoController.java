package com.example.demo;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.support.SessionStatus;


import java.util.ArrayList;
import java.util.List;
 
@Controller
public class DemoController {

    private DemoService demoService;
    
	public DemoController(DemoService demoService) {
		this.demoService = demoService;
	}
	

    @RequestMapping("/")
    public String index(Model model){
    	
        //ユーザーデータリストを取得
        List<UserData> users = demoService.getUser();

        model.addAttribute("user", users);
        return "index";
    }
 }
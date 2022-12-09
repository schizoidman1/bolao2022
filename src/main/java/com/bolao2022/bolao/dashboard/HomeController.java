package com.bolao2022.bolao.dashboard;

import com.bolao2022.bolao.selecao.Selecao;
import com.bolao2022.bolao.selecao.SelecaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    SelecaoRepository selecaoRepository;

    @GetMapping("/dashboard")
    public ModelAndView register(){
        List<Selecao> selecoes = this.selecaoRepository.findAll();
        ModelAndView mv = new ModelAndView("dist/index");
        mv.addObject("selecoes",selecoes);
        return mv;
    }


}

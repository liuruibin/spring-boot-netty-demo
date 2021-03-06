package com.fit2cloud.netty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.result.view.Rendering;
import org.springframework.web.server.WebSession;

@Controller
public class IndexController {

    //    @GetMapping("/")
//    public Mono<String> allMessages(WebSession session, Model model) {
//        model.addAttribute("sessionId", session.getId());
//        return Mono.create(s -> s.success("index"));
//    }

    /**
     * 返回页面的写法
     *
     * @param session 当前session
     * @return render page
     */
    @GetMapping("/")
    public Rendering index(WebSession session) {
        return Rendering.view("index")
                .modelAttribute("sessionId", session.getId()).build();
    }

}



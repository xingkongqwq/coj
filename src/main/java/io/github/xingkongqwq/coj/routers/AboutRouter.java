package io.github.xingkongqwq.coj.routers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutRouter {
    @GetMapping("/")
    public String hello(){
        return "This is the about page<br>Powered by xingkongqwq<br>Github: xingkongqwq<br>Version alpha.0.0.1";
    }
}

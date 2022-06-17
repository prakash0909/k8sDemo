package edu.mvj.k8sDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class K8sController {

    @Autowired
    private K8sService k8sService;

        @GetMapping("/hello/{audience}")
        public String sayHello(@PathVariable String audience) {
            return k8sService.sayHello(audience);
        }
}

package edu.mvj.k8sDemo;

import org.springframework.stereotype.Service;

@Service
public class K8sService {

    public String sayHello(String audience) {
        return "Hello "+audience+"!!";
    }
}

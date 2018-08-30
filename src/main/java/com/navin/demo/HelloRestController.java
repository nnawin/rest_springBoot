package com.navin.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**



Simple REST call that says from where its invoked from
*/
@RequestMapping(path="/")
@RestController
public class HelloRestController {


 @GetMapping("/whereami")
 public String whereami() {


return String.format("Hello from %s", System.getenv().getOrDefault("HOSTNAME", "localhost"));
 }
}


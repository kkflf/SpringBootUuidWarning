package com.kkflf.controller;

import java.util.UUID;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UuidController {

  //The request URL is using different identifiers to avoid ambiguous handler methods mapped for HTTP path
  
 @GetMapping("/")
 public String index() {
   return "index";
 }
  
  // http://localhost:8080/method0/b74adb59-af60-423e-a3dd-c2f356114b51
  @GetMapping("/method0/{id1}")
  public String method0(@PathVariable UUID id1) {
    System.out.println("method0 : This view contains a valid path to an existent file.\n"
        + "This method will NOT give a warnings");
    return "valid";
  }

  // http://localhost:8080/method1/b74adb59-af60-423e-a3dd-c2f356114b51/
  @GetMapping("/method1/{id1}/")
  public String method1(@PathVariable UUID id1) {
    System.out.println("method1 : This view contains a invalid path to an non existent file.\n"
        + "This method will NOT give a warnings");
    return "invalid";
  }

  // http://localhost:8080/method2/b74adb59-af60-423e-a3dd-c2f356114b51/
  @GetMapping("/method2/{id1}")
  public String method2(@PathVariable UUID id1) {
    System.out.println("method2 : This view contains a invalid path to an non existent file.\n"
        + "This method will give a warnings");
    return "invalid";
  }
}

package com.kkflf.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController {
  // This is only done to catch the warning, this does NOT return a view. It only prints the warning
  // in the console.
  @ExceptionHandler(value = {Exception.class, RuntimeException.class})
  public String defaultErrorHandler(HttpServletRequest request, Exception e) {
    e.printStackTrace();
    return "/error";
  }
}

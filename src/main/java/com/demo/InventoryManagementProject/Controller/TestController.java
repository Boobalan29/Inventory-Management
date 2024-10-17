package com.demo.InventoryManagementProject.Controller;

//package com.demo.InventoryManagement.Controller;

//package com.EnterpriseResourcePlanning.InventoryManagement.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

  @GetMapping("/test")
  public ResponseEntity<String> testEndpoint() {
      return ResponseEntity.ok("Test endpoint is working!");
  }
}


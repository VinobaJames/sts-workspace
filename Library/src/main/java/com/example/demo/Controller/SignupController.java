	package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.SignupService;
import com.example.demo.model.Signup;

@RestController
public class SignupController {
   @Autowired
   private SignupService ss;
   @GetMapping("/getdata")
   public List<Signup> getAllDetail(){
	   return ss.getData();
   }
   @PostMapping("/savedata")
   public void saveDetails(@RequestBody Signup S) {
	   ss.saveData(S);
   }
   @PutMapping("/updatedata")
   public void updateDetails(@RequestParam int id,@RequestBody Signup S)
   {
	   S.setId(id);
	   ss.updateData(S);
   }
   @DeleteMapping("/deletedata")
   public void deleteDetails(@RequestParam int id) {
	   ss.deleteData(id);
   }
}
    
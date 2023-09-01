package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Userentity;
import com.example.demo.repository.Userrepository;
@RestController
public class Usercontroller {
	@Autowired
	public Userrepository repo;
	@PostMapping("/user")
	public Userentity addData(@RequestBody Userentity user) {
		try {
			repo.save(user);
			return user;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	   @GetMapping("/getuser")
	   public List<Userentity>get(){
		   try {
			   return repo.findAll();
			   }catch(Exception e) {
			   e.printStackTrace();
			   return null;
		   }
		   
		  }
	   @PutMapping("/update")
	   public Userentity updateuser(@RequestBody Userentity user) {
		   try {
			   repo.save(user);
			   return user;
		   }catch(Exception e) {
			   e.printStackTrace();	   
	   }
	    return user;
	   }
	   @DeleteMapping("/getdele/{userid}")
	   public String del(@PathVariable int id) {
		   @SuppressWarnings("deprecation")
		   Userentity user=repo.getOne(id);
		   repo.delete(user);
		   return "DELETE";
	   }
	   


}
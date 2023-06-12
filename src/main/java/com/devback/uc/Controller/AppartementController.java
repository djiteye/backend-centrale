package com.devback.uc.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devback.uc.Entity.Appartement;

import com.devback.uc.Service.AppartementService;


@RestController
@RequestMapping(value="Appartement")
@CrossOrigin(origins = "http://localhost:4200")
public class AppartementController {
	@Autowired
	private AppartementService appartementService; 

	@GetMapping("/listA")
	public List<Appartement> getAppartements(){
		return appartementService.getAppartements();
		}
	@GetMapping("/A/{id}")
	public Appartement getAppartement(@PathVariable long id) {
		return appartementService.getAppartement(id);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable long id) {
		appartementService.deleteAppartement(id);
	}
	@PostMapping("/addA")
	public void add(@RequestBody Appartement car) {
		appartementService.addAppartement(car);
	}
	@PutMapping("/upA/{id}")
	public void upa(@RequestBody Appartement car,@PathVariable long id) {
		appartementService.updateAppartement(car,id);
	}

}

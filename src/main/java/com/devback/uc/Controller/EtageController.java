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

import com.devback.uc.Entity.Etage;
import com.devback.uc.Service.EtageService;

@RestController
@RequestMapping(value="Etage")
@CrossOrigin(origins = "http://localhost:4200")
public class EtageController {
	@Autowired
	private EtageService etageService; 

	@GetMapping("/listE")
	public List<Etage> getEtages(){
		return etageService.getEtages();
		}
	@GetMapping("/E/{id}")
	public Etage getEtage(@PathVariable long id) {
		return etageService.getEtage(id);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable long id) {
		 etageService.deleteEtage(id);
	}
	@PostMapping("/addE")
	public void add(@RequestBody Etage car) {
		 etageService.addVoiture(car);
	}
	@PutMapping("/upE/{id}")
	public void upE(@RequestBody Etage car,@PathVariable long id) {
		 etageService.updateVoiture(car,id);
	}
}

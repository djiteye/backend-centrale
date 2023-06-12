package com.devback.uc.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devback.uc.Entity.Chambre;

import com.devback.uc.Service.ChambreService;


@RestController
@RequestMapping(value="Chambre")
@CrossOrigin(origins = "http://localhost:4200")
public class ChambreController {
	Chambre chsh=new Chambre( 0,"single", "homme", "A-2-1", null, null, null, null, null, null);
	Chambre chdh=new Chambre( 0,"double", "homme", "A-2-1", null, null, null, null, null, null);
	Chambre chth=new Chambre( 0,"triple", "homme", "A-2-1", null, null, null, null, null, null);
	Chambre chsf=new Chambre( 0,"single", "femme", "A-1-1", null, null, null, null, null, null);
	Chambre chdf=new Chambre( 0,"double", "femme", "A-1-1", null, null, null, null, null, null);
	Chambre chtf=new Chambre( 0,"triple", "femme", "A-1-1", null, null, null, null, null, null);
	@Autowired
	private ChambreService chambreService; 
	
     
	
	@GetMapping("/listC")
	public List<Chambre> getChambres(){
		return chambreService.getChambres();
		}
	
	@GetMapping("/C/{id}")
	public Chambre getChambre(@PathVariable int id) {
		return chambreService.getChambre(id);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable long id) {
		chambreService.deleteChambre(id);
	}
	
	@PostMapping("/addC")
	public void add(@RequestBody Chambre car) {
		chambreService.addChambre(car);
	}
	@PutMapping("/upC/{id}")
	public void upc(@RequestBody Chambre car,@PathVariable long id) {
		chambreService.updateChambre(car,id);
	}
	
	@PostMapping("/prepCSH")
	public ResponseEntity<?> add() {
		int co= chambreService.getChambressh().size();
		int ca= chambreService.getChambres().size();
		
		if(co<=20 && chsh.getPlace()=="single" && chsh.getGenre()=="homme"){
			int a=ca;
			a=a+1;
			chsh.setId(a);
		chambreService.addChambre(chsh);
		//a=a+1;
		
		return ResponseEntity.ok("OK");
			}
		else{
			return (ResponseEntity<?>) ResponseEntity.internalServerError();}
		
	}
	@GetMapping("/listCSH")
	public List<Chambre> getchsh(){
		return chambreService.getChambressh();
		
	}
	@PostMapping("/prepCDH")
	public ResponseEntity<?> addd() {
int co= chambreService.getChambresdh().size();
int ca= chambreService.getChambres().size();
		if(co<=28 && chdh.getPlace()=="double" && chdh.getGenre()=="homme"){
			int a= ca;
			a=a+1;
			chdh.setId(a);
		chambreService.addChambre(chdh);
		
		return ResponseEntity.ok("OK");}else{
			return (ResponseEntity<?>) ResponseEntity.internalServerError();}
	}
	@GetMapping("/listCDH")
	public List<Chambre> getchdh(){
		return chambreService.getChambresdh();
		
	}
	@PostMapping("/prepCTH")
	public ResponseEntity<?> adddd() {
int co= chambreService.getChambresth().size();
int ca= chambreService.getChambres().size();	
		if(co<=12 && chth.getPlace()=="triple" && chth.getGenre()=="homme"){
			int a=ca;
			a=a+1;
			chth.setId(a);
		chambreService.addChambre(chth);
		return ResponseEntity.ok("OK");}else{
			return (ResponseEntity<?>) ResponseEntity.internalServerError();}
	}
	@GetMapping("/listCTH")
	public List<Chambre> getchth(){
		return chambreService.getChambresth();
		
	}
	@PostMapping("/prepCSF")
	public ResponseEntity<?> addf() {
int co= chambreService.getChambressf().size();
int ca= chambreService.getChambres().size();
		if(co<=10 && chsf.getPlace()=="single" && chsf.getGenre()=="femme"){
			int a= ca;
			a=a+1;
			chsf.setId(a);
		chambreService.addChambre(chsf);
		return ResponseEntity.ok("OK");}else{
			return (ResponseEntity<?>) ResponseEntity.internalServerError();}
	}
	@GetMapping("/listCSF")
	public List<Chambre> getchsf(){
		return chambreService.getChambressf();
		
	}
	@PostMapping("/prepCDF")
	public ResponseEntity<?> adddf() {
int co= chambreService.getChambresdf().size();
int ca= chambreService.getChambres().size();
		if(co<=14 && chdf.getPlace()=="double" && chdf.getGenre()=="femme"){
			int a= ca;
			a=a+1;
			chdf.setId(a);
		chambreService.addChambre(chdf);
		return ResponseEntity.ok("OK");}else{
			return (ResponseEntity<?>) ResponseEntity.internalServerError();}
	}
	@GetMapping("/listCDF")
	public List<Chambre> getchdf(){
		return chambreService.getChambresdf();
		
	}
	@PostMapping("/prepCTF")
	public ResponseEntity<?> addddf() {
int co= chambreService.getChambrestf().size();
int ca= chambreService.getChambres().size();
		if(co<=6 && chtf.getPlace()=="triple" && chtf.getGenre()=="femme"){
			int a= ca;
			a=a+1;
			chtf.setId(a);
		chambreService.addChambre(chtf);
		return ResponseEntity.ok("OK");}else{
			return (ResponseEntity<?>) ResponseEntity.internalServerError();}
	}
	@GetMapping("/listCTF")
	public List<Chambre> getchtf(){
		return chambreService.getChambrestf();
		
	}
	

}

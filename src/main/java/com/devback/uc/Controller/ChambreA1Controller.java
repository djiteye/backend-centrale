package com.devback.uc.Controller;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
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

import com.devback.uc.Entity.ChambreA1;
import com.devback.uc.Service.ChambreA1Service;

@RestController
@RequestMapping(value="ChambreA1")
@CrossOrigin(origins = "http://localhost:4200")
public class ChambreA1Controller {
	List<ChambreA1> chambreA=new ArrayList<>();
	//ChambreA1[] chshh=new ChambreA1[30];
	ChambreA1 chsh=new ChambreA1( 0,null,null, "femme", null, null, null, null, null,null, null, null, null,false);
	//chambres dans l'appartement A1-N1
	ChambreA1 chsh1=new ChambreA1( 1,"A1-N1","triple", "femme", "N1", null,null, null,null, null, null, null, null,false);
	ChambreA1 chsh2=new ChambreA1( 2,"A1-N1","triple", "femme", "N1", null,null, null, null,null, null, null, null,false);
	ChambreA1 chsh3=new ChambreA1( 3,"A1-N1","triple", "femme", "N1", null,null, null, null, null, null, null, null,false);
	ChambreA1 chsh4=new ChambreA1( 4,"A1-N1","double", "femme", "N2", null,null, null, null, null, null, null, null,false);
	ChambreA1 chsh5=new ChambreA1( 5,"A1-N1","double", "femme", "N2", null,null, null, null, null, null, null, null,false);
	ChambreA1 chsh6=new ChambreA1( 6,"A1-N1","single", "femme", "N3", null,null, null, null, null, null, null, null,false);
	//chambres dans l'appartement A1-N2
	ChambreA1 chsh7=new ChambreA1( 7,"A1-N2","double", "femme", "N4", null,null, null, null, null, null, null, null,false);
	ChambreA1 chsh8=new ChambreA1( 8,"A1-N2","double", "femme", "N4", null,null, null, null, null, null, null, null,false);
	ChambreA1 chsh9=new ChambreA1( 9,"A1-N2","double", "femme", "N5", null,null, null, null, null, null, null, null,false);
	ChambreA1 chsh10=new ChambreA1( 10,"A1-N2","double", "femme", "N5", null,null, null, null, null, null, null, null,false);
	ChambreA1 chsh11=new ChambreA1( 11,"A1-N2","double", "femme", "N6", null,null, null, null, null, null, null, null,false);
	ChambreA1 chsh12=new ChambreA1( 12,"A1-N2","double", "femme", "N6", null,null, null, null, null, null, null, null,false);
	ChambreA1 chsh13=new ChambreA1( 13,"A1-N2","single", "femme", "N7", null,null, null, null, null, null, null, null,false);
	//chambres dans l'appartement A1-N3
	ChambreA1 chsh14=new ChambreA1( 14,"A1-N3","single", "femme", "N8", null,null, null, null, null, null, null, null,false);
	ChambreA1 chsh15=new ChambreA1( 15,"A1-N3","double", "femme", "N9", null,null, null, null, null, null, null, null,false);
	ChambreA1 chsh16=new ChambreA1( 16,"A1-N3","double", "femme", "N9", null,null, null, null, null, null, null, null,false);
	ChambreA1 chsh17=new ChambreA1(17,"A1-N3","double", "femme", "N10", null,null, null, null, null, null, null, null,false);
	ChambreA1 chsh18=new ChambreA1(18 ,"A1-N3","double", "femme", "N10", null,null, null, null, null, null, null, null,false);
	ChambreA1 chsh19=new ChambreA1( 19,"A1-N3","single", "femme", "N11", null, null,null, null, null, null, null, null,false);
	//chambres dans l'appartement A1-N4
	ChambreA1 chsh20=new ChambreA1( 20,"A1-N4","single", "femme", "N12", null,null, null, null, null, null, null, null,false);
	ChambreA1 chsh21=new ChambreA1( 21,"A1-N4","triple", "femme", "N13", null,null, null, null, null, null, null, null,false);
	ChambreA1 chsh22=new ChambreA1( 22,"A1-N4","triple", "femme", "N13", null,null, null, null, null, null, null, null,false);
	ChambreA1 chsh23=new ChambreA1(23,"A1-N4","triple", "femme", "N13", null,null, null, null, null, null, null, null,false);
	ChambreA1 chsh24=new ChambreA1(24 ,"A1-N4","single", "femme", "N14", null,null, null, null, null, null, null, null,false);
	ChambreA1 chsh25=new ChambreA1( 25,"A1-N4","single", "femme", "N15", null,null, null, null, null, null, null, null,false);
	//chambres dans l'appartement A1-N5
	ChambreA1 chsh26=new ChambreA1( 26,"A1-N5","single", "femme", "N16", null,null, null, null, null, null, null, null,false);
	ChambreA1 chsh27=new ChambreA1( 27,"A1-N5","single", "femme", "N17", null,null, null, null, null, null, null, null,false);
	ChambreA1 chsh28=new ChambreA1( 28,"A1-N5","double", "femme", "N18", null,null, null, null, null, null, null, null,false);
	ChambreA1 chsh29=new ChambreA1(29,"A1-N5","double", "femme", "N18", null,null, null, null, null, null, null, null,false);
	ChambreA1 chsh30=new ChambreA1(30 ,"A1-N5","single", "femme", "N19", null,null, null, null, null, null, null, null,false);
	
	@Autowired
	private ChambreA1Service chambreService; 
	@GetMapping("/listC")
	public List<ChambreA1> getChambres(){
		return chambreService.getChambres();
		}
	@GetMapping("/listCV")
	public List<ChambreA1> getChambresv(){
		return chambreService.getChambresv();
		}
	@GetMapping("/NCSV")
	public  int Nombrecsv(){
		 return chambreService.getChambressv().size(); 
		}
	@GetMapping("/NCDV")
	public  int Nombrecdv(){
		 return chambreService.getChambresdv().size(); 
		}
	@GetMapping("/NCTV")
	public  int Nombrectv(){
		 return chambreService.getChambrestv().size(); 
		}
	@GetMapping("/listCNV")
	public List<ChambreA1> getChambresnv(){
		return chambreService.getChambresnv();
		}
	@GetMapping("/listCVA")
	public List<ChambreA1> getChambresva(){
		return chambreService.getChambresva();
		}
	
	@GetMapping("/C/{id}")
	public ChambreA1 getChambre(@PathVariable int id) {
		return chambreService.getChambre(id);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		chambreService.deleteChambre(id);
	}
	
	@PostMapping("/addC")
	public void add(@RequestBody ChambreA1 car) {
		chambreService.addChambre(car);
	}
	@PutMapping("/upC/{id}")
	public void upc(@RequestBody ChambreA1 car,@PathVariable int id) {
		chambreService.updateChambre(car,id);
	}
	@PostMapping("/prepCA1")
	public ResponseEntity<?> add() {
		int co= chambreService.getChambresv().size();
		//int ca= chambreService.getChambres().size();
		
		
		if(co==0){
			int a,b=1;
			
			
			for(a=1;a<=30;a++) {
				if(a>6 && a<=13) {
					b=2;
				}else if(a>13 && a<20) {
					b=3;
				}else if(a>19 && a<26) {
					b=4;
				}
				else if(a>25 && a<31) {
					b=5;
				}
					
					chsh.setAppartement("A1-N"+b);	
			chsh.setId(a);
			
			
		chambreService.addChambre(chsh);
		
			}
			
		return ResponseEntity.ok("OK");
			}
		else{
			return (ResponseEntity<?>) ResponseEntity.internalServerError();}}
		
		//@SuppressWarnings("unchecked")
		@SuppressWarnings("unchecked")
		@GetMapping("/prepCAP")
		public ResponseEntity<Boolean> addc() {
			int co= chambreService.getChambresv().size();
			//int ca= chambreService.getChambres().size();
			
			
			if(co==0){
				
				
				
			chambreService.addChambre(chsh1);
			chambreService.addChambre(chsh2);
			chambreService.addChambre(chsh3);
			chambreService.addChambre(chsh4);
			chambreService.addChambre(chsh5);
			chambreService.addChambre(chsh6);
			chambreService.addChambre(chsh7);
			chambreService.addChambre(chsh8);
			chambreService.addChambre(chsh9);
			chambreService.addChambre(chsh10);
			chambreService.addChambre(chsh11);
			chambreService.addChambre(chsh12);
			chambreService.addChambre(chsh13);
			chambreService.addChambre(chsh14);
			chambreService.addChambre(chsh15);
			chambreService.addChambre(chsh16);
			chambreService.addChambre(chsh17);
			chambreService.addChambre(chsh18);
			chambreService.addChambre(chsh19);
			chambreService.addChambre(chsh20);
			chambreService.addChambre(chsh21);
			chambreService.addChambre(chsh22);
			chambreService.addChambre(chsh23);
			chambreService.addChambre(chsh24);
			chambreService.addChambre(chsh25);
			chambreService.addChambre(chsh26);
			chambreService.addChambre(chsh27);
			chambreService.addChambre(chsh28);
			chambreService.addChambre(chsh29);
			chambreService.addChambre(chsh30);
			
				
				
			return ResponseEntity.ok(true);
				}
			else{
				return (ResponseEntity<Boolean>) ResponseEntity.internalServerError();}
			
		
	}
		@DeleteMapping("/deletes")
		public void deleteA() {
			// Obtient la zone horaire locale
			 ZoneId zoneId = ZoneId.systemDefault();
		        
		        // Obtient la date actuelle dans la zone horaire locale
		        LocalDate dat = LocalDate.now(zoneId);
		        int mois = dat.getMonthValue();
		        if(mois > 5 && mois <10) {
		        	chambreService.deleteChambres();
		        }else {
		        	System.out.println("Ce n'est pas le moment pour supprimer toutes les places ");
		        }
			
		}
		//chambre dispos
		@GetMapping("/NCD")
		public int nombreCD() {
			return chambreService.getChambresv().size();
		}
		//chambre reservée
		@GetMapping("/NCR")
		public int nombreCR() {
			return chambreService.getChambresnv().size();
		}
		//chambre réellement valider
		@GetMapping("/NCVA")
		public int nombreCVA() {
			return chambreService.getChambresrva().size();
		}
		//chambre réellement vide
		@GetMapping("/NCV")
		public int nombreCV() {
			return chambreService.getChambresrvi().size();
		}
		
	    @GetMapping("/valider/{id}")
	    public ResponseEntity<Boolean> valider(@PathVariable int id) {
	    	ChambreA1 cha= this.getChambre(id);
	    	cha.setValider(true);
	    	this.chambreService.updateChambre(cha, id);
	    	return ResponseEntity.ok(true);
	    	
	    }
	    @SuppressWarnings("deprecation")
		@GetMapping("/confirmer/{id}")
	    public ResponseEntity<Boolean> confirmer(@PathVariable int id) {
	    	ChambreA1 cha= this.getChambre(id);
	    	// Obtient la zone horaire locale
			 ZoneId zoneId = ZoneId.systemDefault();
		        
		        // Obtient la date actuelle dans la zone horaire locale
		        LocalDate dat = LocalDate.now(zoneId);
		        Date dats=new Date();
		        dats.setMonth(5);
		        dats.setDate(30);
		        cha.setDate_sortie(dats);
	    	cha.setDate_entre(dat);
	    	this.chambreService.updateChambre(cha, id);
	    	return ResponseEntity.ok(true);
	    	
	    }
	   /* @PutMapping("/sortie/{id}")
	    public ResponseEntity<ChambreA1> confirmer(@RequestBody ChambreA1 car,@PathVariable int id) {
	    	this.chambreService.updateChambre(car, id);
	    	return (ResponseEntity<ChambreA1>) ResponseEntity.ok();
	    	
	    }*/

}

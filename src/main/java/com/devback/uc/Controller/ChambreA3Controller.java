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

import com.devback.uc.Entity.ChambreA3;
import com.devback.uc.Service.ChambreA3Service;

@RestController
@RequestMapping(value="ChambreA3")
@CrossOrigin(origins = "http://localhost:4200")
public class ChambreA3Controller {
	List<ChambreA3> chambreA=new ArrayList<>();
	//ChambreA1[] chshh=new ChambreA1[30];
	ChambreA3 chsh=new ChambreA3( 0,null,null, "homme", null, null, null, null, null,null, null, null, null,false);
	//chambres dans l'appartement A1-N1
	ChambreA3 chsh1=new ChambreA3( 1,"A3-N1","double", "homme", "N39", null,null, null,null, null, null, null, null,false);
	ChambreA3 chsh2=new ChambreA3( 2,"A3-N1","double", "homme", "N39", null,null, null, null,null, null, null, null,false);
	ChambreA3 chsh3=new ChambreA3( 3,"A3-N1","single", "homme", "N40", null,null, null, null, null, null, null, null,false);
	ChambreA3 chsh4=new ChambreA3( 4,"A3-N1","triple", "homme", "N41", null,null, null, null, null, null, null, null,false);
	ChambreA3 chsh5=new ChambreA3( 5,"A3-N1","triple", "homme", "N41", null,null, null, null, null, null, null, null,false);
	ChambreA3 chsh6=new ChambreA3( 6,"A3-N1","triple", "homme", "N41", null,null, null, null, null, null, null, null,false);
	//chambres dans l'appartement A1-N2
	ChambreA3 chsh7=new ChambreA3( 7,"A3-N2","double", "homme", "N42", null,null, null, null, null, null, null, null,false);
	ChambreA3 chsh8=new ChambreA3( 8,"A3-N2","double", "homme", "N42", null,null, null, null, null, null, null, null,false);
	ChambreA3 chsh9=new ChambreA3( 9,"A3-N2","double", "homme", "N43", null,null, null, null, null, null, null, null,false);
	ChambreA3 chsh10=new ChambreA3( 10,"A3-N2","double", "homme", "N43", null,null, null, null, null, null, null, null,false);
	ChambreA3 chsh11=new ChambreA3( 11,"A3-N2","double", "homme", "N44", null,null, null, null, null, null, null, null,false);
	ChambreA3 chsh12=new ChambreA3( 12,"A3-N2","double", "homme", "N44", null,null, null, null, null, null, null, null,false);
	ChambreA3 chsh13=new ChambreA3( 13,"A3-N2","single", "homme", "N45", null,null, null, null, null, null, null, null,false);
	//chambres dans l'appartement A1-N3
	ChambreA3 chsh14=new ChambreA3( 14,"A3-N3","single", "homme", "N46", null,null, null, null, null, null, null, null,false);
	ChambreA3 chsh15=new ChambreA3( 15,"A3-N3","double", "homme", "N47", null,null, null, null, null, null, null, null,false);
	ChambreA3 chsh16=new ChambreA3( 16,"A3-N3","double", "homme", "N47", null,null, null, null, null, null, null, null,false);
	ChambreA3 chsh17=new ChambreA3(17,"A3-N3","double", "homme", "N48", null,null, null, null, null, null, null, null,false);
	ChambreA3 chsh18=new ChambreA3(18 ,"A3-N3","double", "homme", "N48", null,null, null, null, null, null, null, null,false);
	ChambreA3 chsh19=new ChambreA3( 19,"A3-N3","single", "homme", "N49", null, null,null, null, null, null, null, null,false);
	//chambres dans l'appartement A1-N4
	ChambreA3 chsh20=new ChambreA3( 20,"A3-N4","single", "homme", "N50", null,null, null, null, null, null, null, null,false);
	ChambreA3 chsh21=new ChambreA3( 21,"A3-N4","triple", "homme", "N51", null,null, null, null, null, null, null, null,false);
	ChambreA3 chsh22=new ChambreA3( 22,"A3-N4","triple", "homme", "N51", null,null, null, null, null, null, null, null,false);
	ChambreA3 chsh23=new ChambreA3(23,"A3-N4","triple", "homme", "N51", null,null, null, null, null, null, null, null,false);
	ChambreA3 chsh24=new ChambreA3(24 ,"A3-N4","single", "homme", "N52", null,null, null, null, null, null, null, null,false);
	ChambreA3 chsh25=new ChambreA3( 25,"A3-N4","single", "homme", "N53", null,null, null, null, null, null, null, null,false);
	//chambres dans l'appartement A1-N5
	ChambreA3 chsh26=new ChambreA3( 26,"A3-N5","single", "homme", "N54", null,null, null, null, null, null, null, null,false);
	ChambreA3 chsh27=new ChambreA3( 27,"A3-N5","single", "homme", "N55", null,null, null, null, null, null, null, null,false);
	ChambreA3 chsh28=new ChambreA3( 28,"A3-N5","double", "homme", "N56", null,null, null, null, null, null, null, null,false);
	ChambreA3 chsh29=new ChambreA3(29,"A3-N5","double", "homme", "N56", null,null, null, null, null, null, null, null,false);
	ChambreA3 chsh30=new ChambreA3(30 ,"A3-N5","single", "homme", "N57", null,null, null, null, null, null, null, null,false);
	
	@Autowired
	private ChambreA3Service chambreService; 
	@GetMapping("/listC")
	public List<ChambreA3> getChambres(){
		return chambreService.getChambres();
		}
	@GetMapping("/listCV")
	public List<ChambreA3> getChambresv(){
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
	public List<ChambreA3> getChambresnv(){
		return chambreService.getChambresnv();
		}
	@GetMapping("/listCVA")
	public List<ChambreA3> getChambresva(){
		return chambreService.getChambresva();
		}
	
	@GetMapping("/C/{id}")
	public ChambreA3 getChambre(@PathVariable int id) {
		return chambreService.getChambre(id);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		chambreService.deleteChambre(id);
	}
	
	@PostMapping("/addC")
	public void add(@RequestBody ChambreA3 car) {
		chambreService.addChambre(car);
	}
	@PutMapping("/upC/{id}")
	public void upc(@RequestBody ChambreA3 car,@PathVariable int id) {
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
		        if(mois > 0 && mois <13) {
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
	    	ChambreA3 cha= this.getChambre(id);
	    	cha.setValider(true);
	    	this.chambreService.updateChambre(cha, id);
	    	return ResponseEntity.ok(true);
	    	
	    }
	    @SuppressWarnings("deprecation")
		@GetMapping("/confirmer/{id}")
	    public ResponseEntity<Boolean> confirmer(@PathVariable int id) {
	    	ChambreA3 cha= this.getChambre(id);
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

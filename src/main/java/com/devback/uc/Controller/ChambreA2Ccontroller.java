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

import com.devback.uc.Entity.ChambreA2;
import com.devback.uc.Service.ChambreA2Service;

@RestController
@RequestMapping(value="ChambreA2")
@CrossOrigin(origins = "http://localhost:4200")
public class ChambreA2Ccontroller {
	List<ChambreA2> chambreA=new ArrayList<>();
	//ChambreA1[] chshh=new ChambreA1[30];
	ChambreA2 chsh=new ChambreA2( 0,null,null, "homme", null, null, null, null, null,null, null, null, null,false);
	//chambres dans l'appartement A1-N1
	ChambreA2 chsh1=new ChambreA2( 1,"A2-N1","double", "homme", "N20", null,null, null,null, null, null, null, null,false);
	ChambreA2 chsh2=new ChambreA2( 2,"A2-N1","double", "homme", "N20", null,null, null, null,null, null, null, null,false);
	ChambreA2 chsh3=new ChambreA2( 3,"A2-N1","single", "homme", "N21", null,null, null, null, null, null, null, null,false);
	ChambreA2 chsh4=new ChambreA2( 4,"A2-N1","triple", "homme", "N22", null,null, null, null, null, null, null, null,false);
	ChambreA2 chsh5=new ChambreA2( 5,"A2-N1","triple", "homme", "N22", null,null, null, null, null, null, null, null,false);
	ChambreA2 chsh6=new ChambreA2( 6,"A2-N1","triple", "homme", "N22", null,null, null, null, null, null, null, null,false);
	//chambres dans l'appartement A1-N2
	ChambreA2 chsh7=new ChambreA2( 7,"A2-N2","double", "homme", "N23", null,null, null, null, null, null, null, null,false);
	ChambreA2 chsh8=new ChambreA2( 8,"A2-N2","double", "homme", "N23", null,null, null, null, null, null, null, null,false);
	ChambreA2 chsh9=new ChambreA2( 9,"A2-N2","double", "homme", "N24", null,null, null, null, null, null, null, null,false);
	ChambreA2 chsh10=new ChambreA2( 10,"A2-N2","double", "homme", "N24", null,null, null, null, null, null, null, null,false);
	ChambreA2 chsh11=new ChambreA2( 11,"A2-N2","double", "homme", "N25", null,null, null, null, null, null, null, null,false);
	ChambreA2 chsh12=new ChambreA2( 12,"A2-N2","double", "homme", "N25", null,null, null, null, null, null, null, null,false);
	ChambreA2 chsh13=new ChambreA2( 13,"A2-N2","single", "homme", "N26", null,null, null, null, null, null, null, null,false);
	//chambres dans l'appartement A1-N3
	ChambreA2 chsh14=new ChambreA2( 14,"A2-N3","single", "homme", "N27", null,null, null, null, null, null, null, null,false);
	ChambreA2 chsh15=new ChambreA2( 15,"A2-N3","double", "homme", "N28", null,null, null, null, null, null, null, null,false);
	ChambreA2 chsh16=new ChambreA2( 16,"A2-N3","double", "homme", "N28", null,null, null, null, null, null, null, null,false);
	ChambreA2 chsh17=new ChambreA2(17,"A2-N3","double", "homme", "N29", null,null, null, null, null, null, null, null,false);
	ChambreA2 chsh18=new ChambreA2(18 ,"A2-N3","double", "homme", "N29", null,null, null, null, null, null, null, null,false);
	ChambreA2 chsh19=new ChambreA2( 19,"A2-N3","single", "homme", "N30", null, null,null, null, null, null, null, null,false);
	//chambres dans l'appartement A1-N4
	ChambreA2 chsh20=new ChambreA2( 20,"A2-N4","single", "homme", "N31", null,null, null, null, null, null, null, null,false);
	ChambreA2 chsh21=new ChambreA2( 21,"A2-N4","triple", "homme", "N32", null,null, null, null, null, null, null, null,false);
	ChambreA2 chsh22=new ChambreA2( 22,"A2-N4","triple", "homme", "N32", null,null, null, null, null, null, null, null,false);
	ChambreA2 chsh23=new ChambreA2(23,"A2-N4","triple", "homme", "N32", null,null, null, null, null, null, null, null,false);
	ChambreA2 chsh24=new ChambreA2(24 ,"A2-N4","single", "homme", "N33", null,null, null, null, null, null, null, null,false);
	ChambreA2 chsh25=new ChambreA2( 25,"A2-N4","single", "homme", "N34", null,null, null, null, null, null, null, null,false);
	//chambres dans l'appartement A1-N5
	ChambreA2 chsh26=new ChambreA2( 26,"A2-N5","single", "homme", "N35", null,null, null, null, null, null, null, null,false);
	ChambreA2 chsh27=new ChambreA2( 27,"A2-N5","single", "homme", "N36", null,null, null, null, null, null, null, null,false);
	ChambreA2 chsh28=new ChambreA2( 28,"A2-N5","double", "homme", "N37", null,null, null, null, null, null, null, null,false);
	ChambreA2 chsh29=new ChambreA2(29,"A2-N5","double", "homme", "N37", null,null, null, null, null, null, null, null,false);
	ChambreA2 chsh30=new ChambreA2(30 ,"A2-N5","single", "homme", "N38", null,null, null, null, null, null, null, null,false);
	
	@Autowired
	private ChambreA2Service chambreService; 
	@GetMapping("/listC")
	public List<ChambreA2> getChambres(){
		return chambreService.getChambres();
		}
	@GetMapping("/listCV")
	public List<ChambreA2> getChambresv(){
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
	public List<ChambreA2> getChambresnv(){
		return chambreService.getChambresnv();
		}
	@GetMapping("/listCVA")
	public List<ChambreA2> getChambresva(){
		return chambreService.getChambresva();
		}
	
	@GetMapping("/C/{id}")
	public ChambreA2 getChambre(@PathVariable int id) {
		return chambreService.getChambre(id);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		chambreService.deleteChambre(id);
	}
	
	@PostMapping("/addC")
	public void add(@RequestBody ChambreA2 car) {
		chambreService.addChambre(car);
	}
	@PutMapping("/upC/{id}")
	public void upc(@RequestBody ChambreA2 car,@PathVariable int id) {
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
	    	ChambreA2 cha= this.getChambre(id);
	    	cha.setValider(true);
	    	this.chambreService.updateChambre(cha, id);
	    	return ResponseEntity.ok(true);
	    	
	    }
	    @SuppressWarnings("deprecation")
		@GetMapping("/confirmer/{id}")
	    public ResponseEntity<Boolean> confirmer(@PathVariable int id) {
	    	ChambreA2 cha= this.getChambre(id);
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

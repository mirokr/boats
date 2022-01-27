package com.boats.price.nci.controllers;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.boats.price.nci.entities.Boat;
import com.boats.price.nci.service.BoatService;











@Controller
public class BoatController {
	
	@Autowired
	BoatService service;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createBoat";
	}
	
	@RequestMapping("/saveBoat")
	public String saveBoat(@ModelAttribute("boat") Boat boat, ModelMap modelMapd) {
		float a = 0.0f,b = 0.0f,c = 0.0f,d = 0.0f,e = 0.0f,f = 0.0f,g = 0.0f,fa = 0.0f,fb = 0.0f,fc = 0.0f,fd = 0.0f,fe = 0.0f,ff=0.0f;
		
		if (boat.getbType() == 0.0f){a=1.0f; b= 0.0f; c=0.0f; d=0.0f; e=0.0f; f=0.0f; g=0.0f;}
		if (boat.getbType() == 1.0f){a=0.0f; b= 1.0f; c=0.0f; d=0.0f; e=0.0f; f=0.0f; g=0.0f;}
		if (boat.getbType() == 2.0f){a=0.0f; b= 0.0f; c=1.0f; d=0.0f; e=0.0f; f=0.0f; g=0.0f;}
		if (boat.getbType() == 3.0f){a=0.0f; b= 0.0f; c=0.0f; d=1.0f; e=0.0f; f=0.0f; g=0.0f;}
		if (boat.getbType() == 4.0f){a=0.0f; b= 0.0f; c=0.0f; d=0.0f; e=1.0f; f=0.0f; g=0.0f;}
		if (boat.getbType() == 5.0f){a=0.0f; b= 0.0f; c=0.0f; d=0.0f; e=0.0f; f=1.0f; g=0.0f;}
		if (boat.getbType() == 6.0f){a=0.0f; b= 0.0f; c=0.0f; d=0.0f; e=0.0f; f=0.0f; g=1.0f;}
		if (boat.getfType() == 0.0f){fa=1.0f; fb=0.0f; fc=0.0f; fd=0.0f; fe=0.0f; ff=0.0f;}
		if (boat.getfType() == 1.0f){fa=0.0f; fb=1.0f; fc=0.0f; fd=0.0f; fe=0.0f; ff=0.0f;}
		if (boat.getfType() == 2.0f){fa=0.0f; fb=0.0f; fc=1.0f; fd=0.0f; fe=0.0f; ff=0.0f;}
		if (boat.getfType() == 3.0f){fa=0.0f; fb=0.0f; fc=0.0f; fd=1.0f; fe=0.0f; ff=0.0f;}
		if (boat.getfType() == 4.0f){fa=0.0f; fb=0.0f; fc=0.0f; fd=0.0f; fe=1.0f; ff=0.0f;}
		if (boat.getfType() == 5.0f){fa=0.0f; fb=0.0f; fc=0.0f; fd=0.0f; fe=0.0f; ff=1.0f;}
		float [] input = {boat.getYearBuilt(),boat.getLength(),boat.getWidth(),a,b,c,d,e,f,g,fa,fb,fc,fd,fe,ff};
		
		double calc =((((((((((((((((-59.41473695747893f) + ((input[0]) * (0.03388162295782835f))) + ((input[1]) * (0.18937054159865566f))) + ((input[2]) * (0.2652399064351538f))) + ((input[3]) * (0.02695870137383033f))) + ((input[4]) * (0.02247125462862746f))) + ((input[5]) * (0.07440626140876394f))) + ((input[6]) * (0.20201740237369228f))) + ((input[7]) * (-0.008975037270257995f))) + ((input[8]) * (0.035744149584928823f))) + ((input[9]) * (-0.35262273209958483f))) + ((input[10]) * (-0.24273505793530623f))) + ((input[11]) * (-0.1519973266786563f))) + ((input[12]) * (0.3578182572109012f))) + ((input[13]) * (-0.046416251892144905f))) + ((input[14]) * (-0.060179928171620725f))) + ((input[15]) * (0.14351030746682686f));
		calc = Math.exp(calc);
		boat.setPrice_prediction(calc);
		
		Boat boatSaved = service.saveBoat(boat);
		String msg = "Boat Saved with ID: "+ boatSaved.getId();
		modelMapd.addAttribute("msg", msg);
		
		return "createBoat";
	}
	
	@RequestMapping("displayBoats")
	public String displayBoats(ModelMap modelMap) {
		List<Boat> boats = service.getAllBoats();
		List<ArrayList<String>> boatList = new ArrayList<>();
		ArrayList<String>temp;
		for(Boat boat:boats) {
			temp=new ArrayList<>();
			temp.add(String.valueOf(boat.getId()));
			if(boat.getbType()==0.0) {temp.add("Other");}if(boat.getbType()==1.0) {temp.add("Sport");}if(boat.getbType()==2.0) {temp.add("Yacht");}if(boat.getbType()==3.0) {temp.add("Trawler");}if(boat.getbType()==4.0) {temp.add("Cabin Boat");}if(boat.getbType()==5.0) {temp.add("Flybridge");}if(boat.getbType()==6.0) {temp.add("Fishing");}
			temp.add(String.valueOf(Math.round(boat.getYearBuilt())));
			temp.add(String.valueOf(boat.getLength())+" m");
			temp.add(String.valueOf(boat.getWidth())+" m");
			if(boat.getfType()==0.0) {temp.add("No Fuel");}if(boat.getfType()==1.0) {temp.add("Gas");}if(boat.getfType()==2.0) {temp.add("Hybrid");}if(boat.getfType()==3.0) {temp.add("Unleaded");}if(boat.getfType()==4.0) {temp.add("Diesel");}if(boat.getfType()==5.0) {temp.add("Electric");}
			Locale locale = Locale.GERMAN;
			DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(locale); 
	        decimalFormat.setMaximumFractionDigits(0);
			temp.add(decimalFormat.format(boat.getPrice_prediction())+" euro");
			boatList.add(temp);
		}
		
		modelMap.addAttribute("boatList", boatList);
		return "displayBoats";
	}
	
	@RequestMapping("/deleteBoat")
	public String deleteBoat(@RequestParam("id") String id, ModelMap modelMap) {
		int idInt = Integer.parseInt(id);
		//Boat boat = service.getBoatById(idInt);
		Boat boatTemp = new Boat();
		boatTemp.setId(idInt);
		service.deleteBoat(boatTemp);
		
		List<Boat> boats = service.getAllBoats();
		List<ArrayList<String>> boatList = new ArrayList<>();
		ArrayList<String>temp;
		for(Boat boat:boats) {
			temp=new ArrayList<>();
			temp.add(String.valueOf(boat.getId()));
			if(boat.getbType()==0.0) {temp.add("Other");}if(boat.getbType()==1.0) {temp.add("Sport");}if(boat.getbType()==2.0) {temp.add("Yacht");}if(boat.getbType()==3.0) {temp.add("Trawler");}if(boat.getbType()==4.0) {temp.add("Cabin Boat");}if(boat.getbType()==5.0) {temp.add("Flybridge");}if(boat.getbType()==6.0) {temp.add("Fishing");}
			temp.add(String.valueOf(Math.round(boat.getYearBuilt())));
			temp.add(String.valueOf(boat.getLength())+" m");
			temp.add(String.valueOf(boat.getWidth())+" m");
			if(boat.getfType()==0.0) {temp.add("No Fuel");}if(boat.getfType()==1.0) {temp.add("Gas");}if(boat.getfType()==2.0) {temp.add("Hybrid");}if(boat.getfType()==3.0) {temp.add("Unleaded");}if(boat.getfType()==4.0) {temp.add("Diesel");}if(boat.getfType()==5.0) {temp.add("Electric");}
			Locale locale = Locale.GERMAN;
			DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(locale); 
	        decimalFormat.setMaximumFractionDigits(0);
			temp.add(decimalFormat.format(boat.getPrice_prediction())+" euro");
			boatList.add(temp);
		}
		
		modelMap.addAttribute("boatList", boatList);
		
		return "displayBoats";	
	}
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") String id, ModelMap modelMap) {
		int idInt = Integer.parseInt(id);
		Boat boat = service.getBoatById(idInt);
		modelMap.addAttribute("boat", boat);
		return "updateBoat";
	}
	
	@RequestMapping("/updateB")
	public String updateBoat(@ModelAttribute("boat") Boat boatT, ModelMap modelMapd) {
		
float a = 0.0f,b = 0.0f,c = 0.0f,d = 0.0f,e = 0.0f,f = 0.0f,g = 0.0f,fa = 0.0f,fb = 0.0f,fc = 0.0f,fd = 0.0f,fe = 0.0f,ff=0.0f;
		
		if (boatT.getbType() == 0.0f){a=1.0f; b= 0.0f; c=0.0f; d=0.0f; e=0.0f; f=0.0f; g=0.0f;}
		if (boatT.getbType() == 1.0f){a=0.0f; b= 1.0f; c=0.0f; d=0.0f; e=0.0f; f=0.0f; g=0.0f;}
		if (boatT.getbType() == 2.0f){a=0.0f; b= 0.0f; c=1.0f; d=0.0f; e=0.0f; f=0.0f; g=0.0f;}
		if (boatT.getbType() == 3.0f){a=0.0f; b= 0.0f; c=0.0f; d=1.0f; e=0.0f; f=0.0f; g=0.0f;}
		if (boatT.getbType() == 4.0f){a=0.0f; b= 0.0f; c=0.0f; d=0.0f; e=1.0f; f=0.0f; g=0.0f;}
		if (boatT.getbType() == 5.0f){a=0.0f; b= 0.0f; c=0.0f; d=0.0f; e=0.0f; f=1.0f; g=0.0f;}
		if (boatT.getbType() == 6.0f){a=0.0f; b= 0.0f; c=0.0f; d=0.0f; e=0.0f; f=0.0f; g=1.0f;}
		if (boatT.getfType() == 0.0f){fa=1.0f; fb=0.0f; fc=0.0f; fd=0.0f; fe=0.0f; ff=0.0f;}
		if (boatT.getfType() == 1.0f){fa=0.0f; fb=1.0f; fc=0.0f; fd=0.0f; fe=0.0f; ff=0.0f;}
		if (boatT.getfType() == 2.0f){fa=0.0f; fb=0.0f; fc=1.0f; fd=0.0f; fe=0.0f; ff=0.0f;}
		if (boatT.getfType() == 3.0f){fa=0.0f; fb=0.0f; fc=0.0f; fd=1.0f; fe=0.0f; ff=0.0f;}
		if (boatT.getfType() == 4.0f){fa=0.0f; fb=0.0f; fc=0.0f; fd=0.0f; fe=1.0f; ff=0.0f;}
		if (boatT.getfType() == 5.0f){fa=0.0f; fb=0.0f; fc=0.0f; fd=0.0f; fe=0.0f; ff=1.0f;}
		float [] input = {boatT.getYearBuilt(),boatT.getLength(),boatT.getWidth(),a,b,c,d,e,f,g,fa,fb,fc,fd,fe,ff};
		
		double calc =((((((((((((((((-59.41473695747893f) + ((input[0]) * (0.03388162295782835f))) + ((input[1]) * (0.18937054159865566f))) + ((input[2]) * (0.2652399064351538f))) + ((input[3]) * (0.02695870137383033f))) + ((input[4]) * (0.02247125462862746f))) + ((input[5]) * (0.07440626140876394f))) + ((input[6]) * (0.20201740237369228f))) + ((input[7]) * (-0.008975037270257995f))) + ((input[8]) * (0.035744149584928823f))) + ((input[9]) * (-0.35262273209958483f))) + ((input[10]) * (-0.24273505793530623f))) + ((input[11]) * (-0.1519973266786563f))) + ((input[12]) * (0.3578182572109012f))) + ((input[13]) * (-0.046416251892144905f))) + ((input[14]) * (-0.060179928171620725f))) + ((input[15]) * (0.14351030746682686f));
		calc = Math.exp(calc);
		boatT.setPrice_prediction(calc);
		service.updateBoat(boatT);
		
		List<Boat> boats = service.getAllBoats();
		List<ArrayList<String>> boatList = new ArrayList<>();
		ArrayList<String>temp;
		for(Boat boat:boats) {
			temp=new ArrayList<>();
			temp.add(String.valueOf(boat.getId()));
			if(boat.getbType()==0.0) {temp.add("Other");}if(boat.getbType()==1.0) {temp.add("Sport");}if(boat.getbType()==2.0) {temp.add("Yacht");}if(boat.getbType()==3.0) {temp.add("Trawler");}if(boat.getbType()==4.0) {temp.add("Cabin Boat");}if(boat.getbType()==5.0) {temp.add("Flybridge");}if(boat.getbType()==6.0) {temp.add("Fishing");}
			temp.add(String.valueOf(Math.round(boat.getYearBuilt())));
			temp.add(String.valueOf(boat.getLength())+" m");
			temp.add(String.valueOf(boat.getWidth())+" m");
			if(boat.getfType()==0.0) {temp.add("No Fuel");}if(boat.getfType()==1.0) {temp.add("Gas");}if(boat.getfType()==2.0) {temp.add("Hybrid");}if(boat.getfType()==3.0) {temp.add("Unleaded");}if(boat.getfType()==4.0) {temp.add("Diesel");}if(boat.getfType()==5.0) {temp.add("Electric");}
			Locale locale = Locale.GERMAN;
			DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(locale); 
	        decimalFormat.setMaximumFractionDigits(0);
			temp.add(decimalFormat.format(boat.getPrice_prediction())+" euro");
			boatList.add(temp);
		}
		
		modelMapd.addAttribute("boatList", boatList);
		return"displayBoats";
		
	}

}

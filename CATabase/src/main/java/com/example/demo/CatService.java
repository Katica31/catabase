package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatService {

	@Autowired
	private CatRepository catrepo;
	
	public List<Cat>ListAllCat(){
	return (List<Cat>) catrepo.findAll();
	}
	
	public void saveCat(Cat caty) {
		catrepo.save(caty);
	}
	
	public Cat getCat(Integer idCat) {
		return catrepo.findById(idCat).get();
	}

	public void deleteCat(Integer idCat) {
		catrepo.deleteById(idCat);
}
	
	
}

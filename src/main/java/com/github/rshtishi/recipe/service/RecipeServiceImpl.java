package com.github.rshtishi.recipe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.rshtishi.recipe.entity.Recipe;
import com.github.rshtishi.recipe.repository.RecipeRepository;


@Service
public class RecipeServiceImpl implements RecipeService {
	
	@Autowired
	private RecipeRepository repository;

	@Override
	public List<Recipe> findAll() {
		return repository.findAll();
	}

	@Override
	public Recipe findById(int id) {
		Recipe recipe = repository.findById(id).orElse(null);
		return recipe;
	}

	@Override
	public Recipe update(Recipe recipe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Recipe save(Recipe recipe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRecipe(int id) {
		// TODO Auto-generated method stub
		
	}

}

package com.github.rshtishi.recipe.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.rshtishi.recipe.entity.Recipe;
import com.github.rshtishi.recipe.service.RecipeService;

@Controller
@RequestMapping("/recipes")
public class RecipeController {
	
	@Autowired
	private RecipeService recipeService;

	@GetMapping
	public String showRecipes(Model model) {
		List<Recipe> recipes = recipeService.findAll();
		model.addAttribute("recipes", recipes);
		return "recipe";
	}
	
	@GetMapping("/view/{id}")
	public String viewRecipe(Model model) {
		Recipe recipe = new Recipe(1, "Apple Pie", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit.  ");
		model.addAttribute("recipe", recipe);
		return "view-recipe";
	}
	
	@GetMapping("/new")
	public String showNewRecipeForm(Recipe recipe) {
		return "new-recipe";
	}
	
	@PostMapping("/new")
	public String addRecipe(@Valid Recipe recipe, BindingResult result, Model model) {
		System.out.println(recipe.getId());
		System.out.println(recipe.getName());
		System.out.println(recipe.getDescription());
		return "view-recipe";
	}
}

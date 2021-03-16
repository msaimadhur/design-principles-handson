package com.cts.handson3.builder;

import java.util.logging.Logger;

public class BuilderPatternDemo {
	private static final Logger logger = Logger.getLogger(BuilderPatternDemo.class.getName());

	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();

		logger.info("Veg Meal");

		vegMeal.showItems();

		logger.info("Total Cost: " + vegMeal.getCost());

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();

		logger.info("Non Veg Meal");

		nonVegMeal.showItems();

		logger.info("Total Cost: " + nonVegMeal.getCost());

	}

}
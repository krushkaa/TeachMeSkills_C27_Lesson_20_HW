package com.teachmeskills.lesson20.task1.task1_1.run;

import com.teachmeskills.lesson20.task1.task1_1.threads.DrinkingCoffee;
import com.teachmeskills.lesson20.task1.task1_1.threads.EatingBreakfast;
import com.teachmeskills.lesson20.task1.task1_1.threads.ReadingNews;

public class Runner {
    public static void main(String[] args) {
        DrinkingCoffee drinkingCoffee = new DrinkingCoffee("coffee");
        EatingBreakfast eatingBreakfast = new EatingBreakfast("breakfast");
        ReadingNews readingNews = new ReadingNews("news");
    }
}

package com.teachmeskills.lesson20.task1.task1_2.run;

import com.teachmeskills.lesson20.task1.task1_2.threads.DrinkingCoffee;
import com.teachmeskills.lesson20.task1.task1_2.threads.EatingBreakfast;
import com.teachmeskills.lesson20.task1.task1_2.threads.ReadingNews;

public class Runner {
    public static void main(String[] args) {
        DrinkingCoffee drinkingCoffee = new DrinkingCoffee("coffee");
        drinkingCoffee.setPriority(1);
        drinkingCoffee.start();
        EatingBreakfast eatingBreakfast = new EatingBreakfast("breakfast");
        eatingBreakfast.setPriority(2);
        eatingBreakfast.start();
        ReadingNews readingNews = new ReadingNews("news");
        readingNews.setPriority(3);
        readingNews.start();
    }
}

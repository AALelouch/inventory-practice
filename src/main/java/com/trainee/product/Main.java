package com.trainee.product;

import com.trainee.product.core.entity.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(findByRegularExpression("Chicken"));
    }

    public static List<String> findByRegularExpression(String regular){
        List<String> all = new ArrayList<>();
        all.add("Chicken soup");
        all.add("Meal soup");
        all.add("Classic soup");

        return all.stream().filter(category -> category.contains(regular)).collect(Collectors.toList());
    }
}

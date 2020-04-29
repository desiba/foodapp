/*-----------------------------------------------------------------------------
 - Developed by Haerul Muttaqin                                               -
 - Last modified 4/29/20 12:32 PM                                             -
 - Subscribe : https://www.youtube.com/haerulmuttaqin                         -
 - Copyright (c) 2020. All rights reserved                                    -
 -----------------------------------------------------------------------------*/
package com.haerul.foodsapp.view.category;

import com.haerul.foodsapp.model.Meals;

import java.util.List;

public interface CategoryView {
    void showLoading();
    void hideLoading();
    void setMeals(List<Meals.Meal> meals);
    void onErrorLoading(String message);
}
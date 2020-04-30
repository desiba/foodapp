/*-----------------------------------------------------------------------------
 - Developed by Haerul Muttaqin                                               -
 - Last modified 4/29/20 5:35 PM                                              -
 - Subscribe : https://www.youtube.com/haerulmuttaqin                         -
 - Copyright (c) 2020. All rights reserved                                    -
 -----------------------------------------------------------------------------*/
package com.haerul.foodsapp.view.detail;

import com.haerul.foodsapp.model.Meals;

public interface DetailView {

    void showLoading();
    void hideLoading();
    void setMeal(Meals.Meal meal);
    void onErrorLoading(String message);
}

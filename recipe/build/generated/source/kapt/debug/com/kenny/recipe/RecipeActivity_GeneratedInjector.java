package com.kenny.recipe;

import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = RecipeActivity.class
)
@GeneratedEntryPoint
@InstallIn(ActivityComponent.class)
public interface RecipeActivity_GeneratedInjector {
  void injectRecipeActivity(RecipeActivity recipeActivity);
}

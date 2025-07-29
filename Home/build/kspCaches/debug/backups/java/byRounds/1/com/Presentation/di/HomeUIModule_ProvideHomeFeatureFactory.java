package com.Presentation.di;

import com.Presentation.Navigation.HomeFeature;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation"
})
public final class HomeUIModule_ProvideHomeFeatureFactory implements Factory<HomeFeature> {
  @Override
  public HomeFeature get() {
    return provideHomeFeature();
  }

  public static HomeUIModule_ProvideHomeFeatureFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static HomeFeature provideHomeFeature() {
    return Preconditions.checkNotNullFromProvides(HomeUIModule.INSTANCE.provideHomeFeature());
  }

  private static final class InstanceHolder {
    private static final HomeUIModule_ProvideHomeFeatureFactory INSTANCE = new HomeUIModule_ProvideHomeFeatureFactory();
  }
}

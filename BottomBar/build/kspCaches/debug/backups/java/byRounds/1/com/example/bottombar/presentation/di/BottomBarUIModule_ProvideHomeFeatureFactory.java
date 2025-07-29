package com.example.bottombar.presentation.di;

import com.example.bottombar.presentation.Navigation.BottomBarFeature;
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
public final class BottomBarUIModule_ProvideHomeFeatureFactory implements Factory<BottomBarFeature> {
  @Override
  public BottomBarFeature get() {
    return provideHomeFeature();
  }

  public static BottomBarUIModule_ProvideHomeFeatureFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static BottomBarFeature provideHomeFeature() {
    return Preconditions.checkNotNullFromProvides(BottomBarUIModule.INSTANCE.provideHomeFeature());
  }

  private static final class InstanceHolder {
    private static final BottomBarUIModule_ProvideHomeFeatureFactory INSTANCE = new BottomBarUIModule_ProvideHomeFeatureFactory();
  }
}

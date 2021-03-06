package com.decawave.argomanager.ui.fragment;

import com.decawave.argomanager.prefs.AppPreferenceAccessor;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AbstractArgoFragment_MembersInjector
    implements MembersInjector<AbstractArgoFragment> {
  private final Provider<AppPreferenceAccessor> appPreferenceAccessorProvider;

  public AbstractArgoFragment_MembersInjector(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider) {
    assert appPreferenceAccessorProvider != null;
    this.appPreferenceAccessorProvider = appPreferenceAccessorProvider;
  }

  public static MembersInjector<AbstractArgoFragment> create(
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider) {
    return new AbstractArgoFragment_MembersInjector(appPreferenceAccessorProvider);
  }

  @Override
  public void injectMembers(AbstractArgoFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.appPreferenceAccessor = appPreferenceAccessorProvider.get();
  }

  public static void injectAppPreferenceAccessor(
      AbstractArgoFragment instance,
      Provider<AppPreferenceAccessor> appPreferenceAccessorProvider) {
    instance.appPreferenceAccessor = appPreferenceAccessorProvider.get();
  }
}

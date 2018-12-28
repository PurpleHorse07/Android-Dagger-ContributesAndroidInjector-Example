package com.example.daggersample.di.qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * @author Dhruvaraj Nagarajan
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}

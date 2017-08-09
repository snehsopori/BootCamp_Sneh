package com.cdk.Annotations;

import com.cdk.Enumerations.Day;
import com.cdk.Enumerations.Month;
import com.cdk.Enumerations.Year;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface TimeStamp {
    Year year();
    Month month();
    Day day();
}
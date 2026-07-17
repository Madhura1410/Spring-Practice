package com.day18;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;



@Retention(RetentionPolicy.RUNTIME)

public @interface BookInfo {
	String title();
	String author();
	double price();

}

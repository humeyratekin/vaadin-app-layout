package com.github.appreciated.app.layout.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/**
 * This annotation is meant to be used in combination with AppLayoutBuilder::add(Class<\? extends View> className) and AppLayoutBuilder withNavigationElementInfoProvider(...)
 */
public @interface MenuCaption {
    String value();
}

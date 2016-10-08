package com.facebook.infer.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PACKAGE, java.lang.annotation.ElementType.TYPE})
public @interface Strict
{
  String value() default "";
}


/* Location:              E:\apk\QQ_91\classes5-dex2jar.jar!\com\facebook\infer\annotation\Strict.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
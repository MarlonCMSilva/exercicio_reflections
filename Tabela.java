package br.com.msilva;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Tabela {

    String product_name();
    long product_id();
    String value();
}


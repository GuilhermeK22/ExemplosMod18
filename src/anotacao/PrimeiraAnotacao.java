package anotacao;

import java.lang.annotation.*;
import java.lang.reflect.Type;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR})

public @interface PrimeiraAnotacao {
    String value();
    String[] bairros();
    long numeroCasa();
    double valores() default 10d;
}

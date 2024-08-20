package br.com.msilva;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class AppReflections {

    public static void main(String args[]){
        executeLeituraDeAnotacao();
    }

    private static void executeLeituraDeAnotacao() {
        System.out.println("*** Annotation  ****");
        TabelaDeProdutos prod = new TabelaDeProdutos();
        Annotation[] annotations = prod.getClass().getAnnotations();

        for (Field field : prod.getClass().getDeclaredFields()){
            if(field.isAnnotationPresent(Tabela.class)){
                Tabela anno = field.getAnnotation(Tabela.class);
                System.out.println("Nome da Anotação: " + anno.toString());
            }
        }
    }


}

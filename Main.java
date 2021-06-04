package com.company;

import com.company.annotation.Reflectable;
import com.company.services.ICar;
import com.company.services.Wheel;
import com.company.services.impl.Car;
import com.company.services.impl.Lambo;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) throws Exception {
        Lambo lambo = new Lambo();



    }
}



/*
    // Получить Class класса

    // способ 1
    Class<?> lamboClass1 = Class.forName("com.company.services.impl.Lambo");
        System.out.println("lamboClass1: " + lamboClass1);

                // способ 2
                Class<? extends Car> lamboClass2 = lambo.getClass();
        System.out.println("lamboClass2: " + lamboClass2);

        // способ 3
        Class<Lambo> lamboClass3 = Lambo.class;
        System.out.println("lamboClass3: " + lamboClass3);


 // Получить название класса

                Class<Lambo> lamboClass = Lambo.class;


        String fullClassName = lamboClass.getName();
                System.out.println("fullClassName: " + fullClassName);


                String justClassName = lamboClass.getSimpleName();
                System.out.println("justClassName: " + justClassName);

// Работа с модификаторами доступа

                Class<Lambo> lamboClass = Lambo.class;
        int lamboModifiers = lamboClass.getModifiers();
                System.out.println("Lambo is Public: " + Modifier.isPublic(lamboModifiers));

                Class<ICar> iCarClass = ICar.class;
        int iCarModifiers = iCarClass.getModifiers();
                System.out.println("ICar is Interface: " + Modifier.isInterface(iCarModifiers));

                Class<Wheel> wheelClass = Wheel.class;
        int wheelModifiers = wheelClass.getModifiers();
                System.out.println("Wheel is Final: " + Modifier.isFinal(wheelModifiers));

// Получение информации о пакете

                Class<Lambo> lamboClass = Lambo.class;
        Package lamboPackage = lamboClass.getPackage();
                System.out.println("package of class Lambo: " + lamboPackage);


                // Получаем Superclass

                Class<Lambo> lamboClass = Lambo.class;
        Class superClass = lamboClass.getSuperclass();
                System.out.println("Super class Lambo: " + superClass);


// Получаем реализованные интерфейсы

                Class<Lambo> lamboClass = Lambo.class;
        Class<?>[] interfaces = lamboClass.getInterfaces();
        System.out.println("Реализованные интерфейсы Lambo: " + interfaces[0].toString());


        // Получаем конструкторы класса

        Class<Lambo> lamboClass = Lambo.class;
        Constructor<?>[] constructors = lamboClass.getConstructors();

        System.out.println("Конструкторы Lambo: ");

        for (Constructor constr: constructors) {
        System.out.println(constr.toString());
        }


// Создание объектов с помощью конструкторов

        Class<Lambo> lamboClass = Lambo.class;
        Constructor<Lambo> constructor = lamboClass.getConstructor(int.class, String.class);
        Lambo lamboObj = constructor.newInstance(2, "auto");

        System.out.println("Экземляр класса Lambo: " + lamboObj);


        // Получаем все public поля класса Lambo и его родителя

        Class<Lambo> lamboClass = Lambo.class;
        Field[] fields = lamboClass.getFields();
                System.out.println("Поля класса Lambo:");

                for (Field field: fields) {
                System.out.println(field);
                }


// Получаем public поле класса Lambo и его родителя

                Class<Lambo> lamboClass = Lambo.class;

        Field lamboField = lamboClass.getField("transmission");
                System.out.println("Lambo field = " + lamboField);

                Field lamboParentField = lamboClass.getField("serialNumber");
                System.out.println("Lambo parent field = " + lamboParentField);


                // Получаем название public поле класса Lambo и его родителя

                Class<Lambo> lamboClass = Lambo.class;

        Field lamboField = lamboClass.getField("transmission");
                System.out.println("Lambo field name = " + lamboField.getName());

                Field lamboParentField = lamboClass.getField("serialNumber");
                System.out.println("Lambo parent field name = " + lamboParentField.getName());


                // Получаем тип public поля класса Lambo и его родителя

                Class<Lambo> lamboClass = Lambo.class;

        Field lamboField = lamboClass.getField("transmission");
                System.out.println("Lambo field type = " + lamboField.getType());

                Field lamboParentField = lamboClass.getField("serialNumber");
                System.out.println("Lambo parent field type = " + lamboParentField.getType());


// Установить значение public поля класса Lambo
                System.out.println("Lambo before = " + lambo.toString());

                Class<Lambo> lamboClass = Lambo.class;
        Field field = lamboClass.getField("transmission");
                field.set(lambo, "mechanical");

                System.out.println("Lambo after = " + lambo.toString());

*/etrfhftghfghgfhfh



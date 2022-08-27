package ua.hillel.school.hw8.ex1.logistic;

public class Contract {

    int number;              //реєстраційний номер угоди (внутрішній)
    String dateSignature;    //дата підписання угоди
    String dateLoading;      //дата завантаження
    String dateShipment;     //орієнтовна дата вивантаження
    int quantity;            //кільксть посадочних місць під вантаж
    double weight;           //вага вантажу
    int capacity;            //обʼєм вантажу (см3)
    double value;            //оціночна вартість вантажу
    boolean insurance;       //наявність страховки на вантаж
    String conditions;       //спец умови щодо перевезення вантажу (негабарит, вогнестійкість, низька температура, тощо)
    boolean expedition;      //суповодження вантажу (необхідність експедитора)
    boolean security;        //необхідність охорони вантажу

}

package ua.hillel.school.hw8.ex1.olshop;

public class Contractor {

    int number;           //реєстраційний номер контрагента (внутрішній)
    String contrType;     //тип контрагента (покупець або продавець)
    String type;          //тип покупця (приватна особа, юридична особа)
    String name;          //імʼя або назва компанії
    String secondName;    //прізвище (для приватної особи)
    int year;             //рік народження (заснування)
    String country;       //країна проживання (реєстрації)
    String region;        //регіон, область
    String city;          //місто
    String address;       //адреса
    String phone;         //телефон
    String email;         //електронна пошта
    String owner;         //власник (тільки для юридичних осіб)
    String contact;       //контактна особа (тільки для юридичних осіб)
    String leadType;      //тип лідогенерації (інтернет, медіа, реклама на банерах, тощо)
    int dealsNumber;      //кількість завершених угод
    double discount;      //знижка
    String mainInterest;  //основна група товарів
    String otherInterest; //додаткова группа товарів (заповнюється по можливості)

}

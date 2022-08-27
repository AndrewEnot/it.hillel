package ua.hillel.school.hw8.ex2;

import java.util.Arrays;

public class GlobalRating {

     static Score[] data;

     static {
         data = new Score[4];
         Arrays.setAll(data, i -> new Score());
         data[0].category = "views";
         data[1].category = "actions";
         data[2].category = "sharings";
         data[3].category = "buyings";
     }
}

package ua.exercism.ex13;

public class TwelveDays {

    String verse(int verseNumber) {

        return switch (verseNumber) {
            case 1 -> "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n";
            case 2 -> "On the second day of Christmas my true love gave to me: two Turtle Doves, and a " +
                    "Partridge in a Pear Tree.\n";
            case 3 -> "On the third day of Christmas my true love gave to me: three French Hens, two Turtle" +
                    " Doves, and a Partridge in a Pear Tree.\n";
            case 4 -> "On the fourth day of Christmas my true love gave to me: four Calling Birds, three" +
                    " French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            case 5 -> "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling" +
                    " Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            case 6 -> "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold" +
                    " Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge " +
                    "in a Pear Tree.\n";
            case 7 -> "On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six " +
                    "Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle " +
                    "Doves, and a Partridge in a Pear Tree.\n";
            case 8 -> "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven " +
                    "Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French" +
                    " Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            case 9 -> "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight " +
                    "Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four " +
                    "Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            case 10 -> "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine " +
                    "Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, " +
                    "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a " +
                    "Partridge in a Pear Tree.\n";
            case 11 -> "On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten " +
                    "Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six" +
                    " Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle " +
                    "Doves, and a Partridge in a Pear Tree.\n";
            case 12 -> "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming," +
                    " eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, " +
                    "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three" +
                    " French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
            default -> "";
        };
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder result = new StringBuilder();

        for (int i = startVerse; i < endVerse; i++) {
            result.append(verse(i)).append("\n");
        }
        result.append(verse (endVerse));
        return result.toString();
    }

    String sing() {
        return verses(1, 12);
    }
}
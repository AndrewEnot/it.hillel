package ua.exercism.ex2;

public class Lasagna {

        //int exMinInOven;
        //int quantityLayers;

        public int expectedMinutesInOven() {
            return 40;
        }
        public int remainingMinutesInOven(int inOvenMinutes) {
            return expectedMinutesInOven() - inOvenMinutes;
        }
        public int preparationTimeInMinutes(int quantityLayers) {
            int timeLayer = 2;
            return quantityLayers * timeLayer;
        }
        public int totalTimeInMinutes (int quantityLayers, int inOvenMinutes){
            return inOvenMinutes + preparationTimeInMinutes(quantityLayers);
        }

    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        //lasagna.exMinInOven = 40;
        lasagna.expectedMinutesInOven();
        lasagna.remainingMinutesInOven(30);
        lasagna.preparationTimeInMinutes(2);
        lasagna.totalTimeInMinutes(3,20);

        System.out.println(lasagna.expectedMinutesInOven());
        System.out.println(lasagna.remainingMinutesInOven(30));
        System.out.println(lasagna.preparationTimeInMinutes(2));
        System.out.println(lasagna.totalTimeInMinutes(3,20));

        System.out.println(lasagna.totalTimeInMinutes(4,8));
        System.out.println(lasagna.totalTimeInMinutes(1,30));
        System.out.println(lasagna.remainingMinutesInOven(25));
    }
}

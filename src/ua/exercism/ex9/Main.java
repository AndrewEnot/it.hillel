package ua.exercism.ex9;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] birdsPerDay = new int[0];
        BirdWatcher newBirdWatcher = new BirdWatcher(birdsPerDay);

        System.out.println(Arrays.toString(newBirdWatcher.getLastWeek()));

        System.out.println(newBirdWatcher.getToday());

        newBirdWatcher.incrementTodaysCount();
        System.out.println(newBirdWatcher.getToday());

        System.out.println(newBirdWatcher.hasDayWithoutBirds());

        System.out.println(newBirdWatcher.getCountForFirstDays(10));

        System.out.println(newBirdWatcher.getBusyDays());
    }
}

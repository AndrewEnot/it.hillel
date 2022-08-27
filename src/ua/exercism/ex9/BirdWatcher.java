package ua.exercism.ex9;

import java.util.Arrays;

class BirdWatcher {
    private int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] birdsPerLastWeek;
        birdsPerLastWeek = Arrays.copyOfRange(birdsPerDay,0,7);
        return birdsPerLastWeek;
    }

    public int getToday() {
        if (birdsPerDay.length == 0) {
            return 0;
        } else {
        return birdsPerDay[birdsPerDay.length-1];
        }
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        boolean j = false;
        for (int k : birdsPerDay) {
            if (k == 0) {
                j = true;
                break;
            }
        }
        return j;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int[] firstDayCount;
        firstDayCount = Arrays.copyOfRange(birdsPerDay,0,numberOfDays);
        int sum = 0;
        for (int i = 0; i < numberOfDays; i++) {
            sum += firstDayCount[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int j : birdsPerDay) {
            if (j >= 5) {
                busyDays += 1;
            }
        }
        return busyDays;
    }
}

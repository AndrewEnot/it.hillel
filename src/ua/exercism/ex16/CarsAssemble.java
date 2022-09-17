package ua.exercism.ex16;

public class CarsAssemble {

  public double productionRatePerHour(int speed) {
    double index = 0;
    switch (speed) {
      case 1, 2, 3, 4:
        index = 1.0;
        break;
      case 5, 6, 7, 8:
        index = 0.9;
        break;
      case 9:
        index = 0.8;
        break;
      case 10:
        index = 0.77;
        break;
      default:
        return 0;
    }
    return (double) (speed * 221) * index;
  }

  public int workingItemsPerMinute(int speed) {
    return (int) (productionRatePerHour(speed) / 60);
  }
}

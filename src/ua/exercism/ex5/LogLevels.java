package ua.exercism.ex5;

public class LogLevels {

        public static String message(String logLine) {
            String[] log = logLine.split(":");
            return log[1].trim();
        }

        public static String logLevel(String logLine) {
            String[] log = logLine.split(":");
            return log[0].replace('[', ' ').replace(']',' ').trim().toLowerCase();
        }

        public static String reformat(String logLine) {
            String[] log = logLine.replace('[','(').replace(']',')').split(":");
            return log[1].trim() + " " + log[0].toLowerCase().replaceAll(" ",null);
        }
}

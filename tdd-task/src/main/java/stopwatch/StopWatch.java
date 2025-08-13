package stopwatch;

public class StopWatch {
    int minutes;
    int hours;
    int seconds;

    public void record(int seconds) {
        if (seconds < 0) {
            throw new IllegalArgumentException("Time cannot be negative");
        }
        if(seconds < 60){
            this.seconds = seconds;
            this.minutes = 0;
            this.hours = 0;
        }
        if(seconds >= 60 && seconds < 3600){
            this.seconds = seconds % 60;
            this.minutes = seconds / 60;
            this.hours = 0;
        }
        if(seconds >= 3600){
            this.hours = seconds / 3600;
            int remaining = seconds % 3600;
            this.seconds = remaining % 60;
            this.minutes = remaining / 60;

        }
    }

    public int getHours() {
        return hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }
}

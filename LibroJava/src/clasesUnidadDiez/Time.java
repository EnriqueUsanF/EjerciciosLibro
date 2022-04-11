package clasesUnidadDiez;

public class Time {
	private long hour;
    private long min;
    private long second;

    public Time() {
        long tiempo = System.currentTimeMillis();

        this.setTime(tiempo);
    }

    public Time(long tiempo) {

        this.setTime(tiempo);

    }

    public Time(long hour, long min, long second) {
        this.second = second;
        this.min = min;
        this.hour = hour;

    }

    public void setTime(long elapsedTime) {
        hour = (((elapsedTime / 1000) / 60) / 60) % 24;
        second = (elapsedTime / 1000) % 60;
        min = ((elapsedTime / 1000) / 60) % 60;
    }

    public long getHour() {
        return hour;
    }

    public long getMin() {
        return min;
    }

    public long getSec() {
        return second;
    }
}

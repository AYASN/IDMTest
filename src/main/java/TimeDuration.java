public class TimeDuration implements Comparable<TimeDuration>  {

    public int getNumberOfSeconds() {
        return numberOfSeconds;
    }

    private int numberOfSeconds;

    public TimeDuration(int numberOfSeconds) throws BadBadValueException {
        if (numberOfSeconds < 0) {
            throw new BadBadValueException();
        }
        this.numberOfSeconds = numberOfSeconds;
    }

    @Override
    public String toString() {

        int hours = numberOfSeconds / 3600;
        int remainder = numberOfSeconds - hours * 3600;
        int mins = remainder / 60;
        remainder = remainder - mins * 60;
        int secs = remainder;

        StringBuilder sb = new StringBuilder();
        if (hours != 0) {
            sb.append(hours + " h ");
        }
        if (mins != 0) {
            sb.append(mins + " m ");
        }
        sb.append(secs + " s");

        return sb.toString();
    }

    public int compareTo(TimeDuration timeDuration) {
        if (this.numberOfSeconds > timeDuration.numberOfSeconds) {
            return 1;
        }else return 0;
    }
}
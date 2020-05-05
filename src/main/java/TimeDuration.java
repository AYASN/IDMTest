public class TimeDuration implements Comparable<TimeDuration>  {

    private int numberOfSeconds;

    public int getNumberOfSeconds() {
        return numberOfSeconds;
    }

    TimeDuration(int numberOfSeconds) throws BadBadValueException {
        if (numberOfSeconds < 0) {
            throw new BadBadValueException("The input should be a positive integer!");
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

        StringBuilder dateBuilder = new StringBuilder();
        if (hours != 0) {
            dateBuilder.append(hours + "h ");
        }
        if (mins != 0) {
            dateBuilder.append(mins + "m ");
        } else if(hours != 0) {
            dateBuilder.append(mins + "m ");
        }
        dateBuilder.append(secs + "s");

        return dateBuilder.toString();
    }

    public int compareTo(TimeDuration timeDuration) {
        if (this.numberOfSeconds > timeDuration.numberOfSeconds) {
            return 1;
        }else return 0;
    }
}
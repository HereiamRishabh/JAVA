
class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}


class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}


class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}


class Time {
    private int hours;
    private int minutes;
    private int seconds;

 
    public Time(int hours, int minutes, int seconds) throws HrsException, MinException, SecException {
        if (hours > 24 || hours < 0) {
            throw new HrsException("Invalid hours value");
        } else {
            this.hours = hours;
        }
        if (minutes > 60 || minutes < 0) {
            throw new MinException("Invalid minutes value");
        } else {
            this.minutes = minutes;
        }
        if (seconds > 60 || seconds < 0) {
            throw new SecException("Invalid seconds value");
        } else {
            this.seconds = seconds;
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}

public class q1 {
    public static void main(String[] args) {
        try {
            Time time1 = new Time(25, 30, 45);
            System.out.println(time1);
        } catch (HrsException e) {
            System.out.println(e.getMessage());
        } catch (MinException e) {
            System.out.println(e.getMessage());
        } catch (SecException e) {
            System.out.println(e.getMessage());
        }

        try {
            Time time2 = new Time(18, 75, 45);
            System.out.println(time2);
        } catch (HrsException e) {
            System.out.println(e.getMessage());
        } catch (MinException e) {
            System.out.println(e.getMessage());
        } catch (SecException e) {
            System.out.println(e.getMessage());
        }

        try {
            Time time3 = new Time(18, 30, 70);
            System.out.println(time3);
        } catch (HrsException e) {
            System.out.println(e.getMessage());
        } catch (MinException e) {
            System.out.println(e.getMessage());
        } catch (SecException e) {
            System.out.println(e.getMessage());
        }

        try {
            Time time4 = new Time(18, 30, 45);
            System.out.println(time4);
        } catch (HrsException e) {
            System.out.println(e.getMessage());
        } catch (MinException e) {
            System.out.println(e.getMessage());
        } catch (SecException e) {
            System.out.println(e.getMessage());
        }
    }
}
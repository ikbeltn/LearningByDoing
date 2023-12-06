package de.panitz.subato;

record Time(int hour, int min, int sec) {

    boolean isEarlierThan(Time that) {
        if (this.hour < that.hour && this.min() <= that.min() && this.sec() <= that.sec()) {
            return true;
        } else if (this.hour <= that.hour && this.min < that.min() && this.sec() <= that.sec()) {
            return true;
        } else if (this.hour <= that.hour && this.min() <= that.min() && this.sec() < that.sec()) {
            return true;
        }
        return false;
    }

    boolean isLaterThan(Time that) {
        return that.isEarlierThan(this);
    }

    Time minutesLater(int min) {
        int totalMin = min() + min;
        return new Time((hour() + totalMin / 60) % 24, totalMin % 60, sec());
    }
}
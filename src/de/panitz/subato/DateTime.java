package de.panitz.subato;


record DateTime(Date date, Time time) {

    boolean isEarlierThan(DateTime that) {
        if (this.date.isEarlierThan(that.date)) {
            return true;
        } else if (this.equals(that.date) && this.time.isEarlierThan(that.time)) {
            return true;
        }
        return false;
    }

    boolean isLaterThan(DateTime that) {
        return false; /*TODO*/
    }

}
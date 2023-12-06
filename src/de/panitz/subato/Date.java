package de.panitz.subato;

record Date(int day, int month, int year) {
    boolean isInLeapYear() {
        if (this.year % 4 == 0 && this.year % 100 != 0) return true;
        return false;
    }

    boolean isEarlierThan(Date that) {
        if (this.day < that.day && this.month <= that.month && this.year <= that.year) {
            return true;
        } else if (this.day <= that.day && this.month < that.month && this.year <= that.year) {
            return true;
        } else if (this.day <= that.day && this.month <= that.month && this.year < that.year) {
            return true;
        }
        return false;
    }

    boolean isLaterThan(Date that) {
        if (this.day > that.day && this.month >= that.month && this.year >= that.year) {
            return true;
        } else if (this.day >= that.day && this.month > that.month && this.year >= that.year) {
            return true;
        } else if (this.day >= that.day && this.month >= that.month && this.year > that.year) {
            return true;
        }
        return false;
    }

    boolean isSameDate(Date that) {
        if (this.day == that.day && this.month == that.month && this.year == that.year) {
            return true;
        } else if (this.day == that.day && this.month > that.month && this.year == that.year) {
            return true;
        } else if (this.day == that.day && this.month == that.month && this.year == that.year) {
            return true;
        }
        return false;
    }
}
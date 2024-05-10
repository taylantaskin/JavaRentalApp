package Domain.Entity;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class DailyLog {
    private Date date;

    List<Rental> rentals;

    public DailyLog(Date date, List<Rental> rentals) {
        this.date = date;
        this.rentals = rentals;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void setRentals(List<Rental> rentals) {
        this.rentals = rentals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DailyLog dailyLog = (DailyLog) o;
        return Objects.equals(date, dailyLog.date) && Objects.equals(rentals, dailyLog.rentals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, rentals);
    }

    @Override
    public String toString() {
        return "Domain.Entity.DailyLog{" +
                "date=" + date +
                ", rentals=" + rentals +
                '}';
    }


}

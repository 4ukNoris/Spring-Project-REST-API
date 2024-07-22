package bg.softuni.CinemaTickets_Movies.models.dtos;

import bg.softuni.CinemaTickets_Movies.models.enums.BookingTimeEnum;
import jakarta.validation.constraints.NotEmpty;

import java.util.ArrayList;
import java.util.List;

public class BookingTimeDto {
    private long id;
    @NotEmpty(message = "You must select at least one booking time!")
    private List<BookingTimeEnum> startMovieTimes;

    public BookingTimeDto() {
        this.startMovieTimes = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public BookingTimeDto setId(long id) {
        this.id = id;
        return this;
    }

    public List<BookingTimeEnum> getStartMovieTimes() {
        return startMovieTimes;
    }

    public BookingTimeDto setStartMovieTimes(List<BookingTimeEnum> startMovieTimes) {
        this.startMovieTimes = startMovieTimes;
        return this;
    }
}

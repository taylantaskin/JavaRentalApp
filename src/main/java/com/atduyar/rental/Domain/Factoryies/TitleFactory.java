package com.atduyar.rental.Domain.Factoryies;

import com.atduyar.rental.Domain.Entity.Game;
import com.atduyar.rental.Domain.Entity.Movie;
import com.atduyar.rental.Domain.Entity.Music;
import com.atduyar.rental.Domain.Entity.Title;
import com.atduyar.rental.Domain.Enums.TitleType;

public class TitleFactory {
    public static Title createTitle(String type, String name, String description, int rentalCode, TitleType titleType, Object... additionalParams) {
        switch (type.toLowerCase()) {
            case "game":
                return new Game(name, description, rentalCode, titleType, (String) additionalParams[0], (int) additionalParams[1]);
            case "music":
                return new Music(name, description, rentalCode, titleType, (String) additionalParams[0], (String) additionalParams[1], (int) additionalParams[2], (int) additionalParams[3]);
            case "movie":
                return new Movie(name, description, rentalCode, titleType, (String) additionalParams[0], (String) additionalParams[1], (int) additionalParams[2], (int) additionalParams[3]);
        }
        throw new RuntimeException("Unknown title type");
    }
}

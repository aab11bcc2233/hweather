package co.codehe.hweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by codehe on 16-12-15.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort confort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {

        @SerializedName("txt")
        public String info;
    }

    public class CarWash {

        @SerializedName("txt")
        public String info;
    }

    public class Sport {

        @SerializedName("txt")
        public String info;
    }
}

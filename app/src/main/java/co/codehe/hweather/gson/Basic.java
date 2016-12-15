package co.codehe.hweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by codehe on 16-12-15.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}

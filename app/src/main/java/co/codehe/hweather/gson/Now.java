package co.codehe.hweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by codehe on 16-12-15.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}

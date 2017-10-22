package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ronny on 2017/10/22.
 */

public class Now {

    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}

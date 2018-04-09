package vn.home.htm.tripdemo.data.source.remote.service;

import android.database.Observable;

import retrofit2.http.GET;
import retrofit2.http.Query;
import vn.home.htm.tripdemo.data.module.Weather;

/**
 * Created by HaiMinhTran on 3/17/2018.
 */

public interface WeatherAPI {
    @GET("data/2.5/weather")
    Observable<Weather> getCurrentWeatherCityName(@Query("id") int id
            , @Query("appid") String appId);
}

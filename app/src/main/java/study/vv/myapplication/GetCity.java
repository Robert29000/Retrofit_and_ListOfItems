package study.vv.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by student2 on 20.04.18.
 */

public interface GetCity {
    @POST("city.php")
    Call<List<Data>> getCityNames();
}


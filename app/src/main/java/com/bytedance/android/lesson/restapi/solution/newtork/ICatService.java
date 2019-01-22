package com.bytedance.android.lesson.restapi.solution.newtork;


import com.bytedance.android.lesson.restapi.solution.bean.Cat;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * @author 吴正良
 * @date 2019.1.22.15.02
 */
public interface ICatService {
    // TODO-C1 (2) Implement your Cat Request here, url: https://api.thecatapi.com/v1/images/search?limit=5
    @GET("v1/images/search?limit=5")
    Call<Cat[]> randomCat();
}

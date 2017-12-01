package com.example.adminjs.jisoasheng01;


import retrofit2.Call;
import retrofit2.http.GET;

/**
 * 周旋
 * 2017/12/1  09:24
 */

public interface Service {
    //http://api.tianapi.com/
    @GET("social/?key=ac87b4a4e634eb4a4e96fd371490a667&num=10")
    Call<Bean> getNewsBean();
}

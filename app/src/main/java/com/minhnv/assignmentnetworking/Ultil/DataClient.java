package com.minhnv.assignmentnetworking.Ultil;

import com.minhnv.assignmentnetworking.model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DataClient {
    @GET("wp-json/wp/v2/posts")
    Call<Post> GetPost(@Query("_embed") String embed);

}

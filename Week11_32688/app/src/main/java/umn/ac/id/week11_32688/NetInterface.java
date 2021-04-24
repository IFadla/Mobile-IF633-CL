package umn.ac.id.week11_32688;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NetInterface {
    @GET("posts")
    Call<ArrayList<PostModel>> getPosts();

    @GET("")
    Call<ArrayList<PostModel>> getSomething();
}

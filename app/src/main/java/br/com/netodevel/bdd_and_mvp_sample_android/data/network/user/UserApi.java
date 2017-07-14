package br.com.netodevel.bdd_and_mvp_sample_android.data.network.user;

import br.com.netodevel.bdd_and_mvp_sample_android.data.network.user.request.UserRequest;
import br.com.netodevel.bdd_and_mvp_sample_android.data.network.user.response.UserResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserApi {

    @POST("user")
    Call<UserResponse> save(@Body UserRequest userModel);

}

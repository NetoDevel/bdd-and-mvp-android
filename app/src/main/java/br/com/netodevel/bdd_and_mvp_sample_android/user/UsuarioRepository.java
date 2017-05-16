package br.com.netodevel.bdd_and_mvp_sample_android.user;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * @author netodevel
 */
public interface UsuarioRepository {

    @POST("user")
    Call<UserModel> saveUser(@Body UserModel userModel);

}

package br.com.netodevel.bdd_and_mvp_sample_android.data.repository.user;
import br.com.netodevel.bdd_and_mvp_sample_android.data.network.user.UserApi;
import br.com.netodevel.bdd_and_mvp_sample_android.data.network.user.request.UserRequest;
import br.com.netodevel.bdd_and_mvp_sample_android.data.network.user.response.UserResponse;
import br.com.netodevel.bdd_and_mvp_sample_android.data.repository.BaseRepository;
import retrofit2.Call;

/**
 * @author josevieira
 */
public class UserRepository extends BaseRepository{

    private UserApi api;

    public UserRepository() {
        this.api = getIstance().create(UserApi.class);
    }

    public Call<UserResponse> saveUser(UserRequest userRequest) {
        return api.save(userRequest);
    }

}

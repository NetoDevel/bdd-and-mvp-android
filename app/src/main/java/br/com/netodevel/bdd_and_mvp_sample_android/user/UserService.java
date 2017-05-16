package br.com.netodevel.bdd_and_mvp_sample_android.user;

import br.com.netodevel.bdd_and_mvp_sample_android.rest.RetrofitConnection;
import retrofit2.Call;

/**
 * @author netodevel
 */
public class UserService {

    private UsuarioRepository usuarioRepository;

    public UserService() {
        this.usuarioRepository = new RetrofitConnection().getInstance().create(UsuarioRepository.class);
    }

    public Call<UserModel> save(UserModel userModel) {
        return this.usuarioRepository.saveUser(userModel);
    }

}

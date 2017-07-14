package br.com.netodevel.bdd_and_mvp_sample_android.data.repository;

import br.com.netodevel.bdd_and_mvp_sample_android.data.network.RetrofitFactory;
import br.com.netodevel.bdd_and_mvp_sample_android.data.Enviroments;
import retrofit2.Retrofit;

/**
 * @author netodevel
 */
public abstract class BaseRepository {

    public Retrofit getIstance() {
        return RetrofitFactory.create(Enviroments.baseURL);
    }

}

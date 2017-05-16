package br.com.netodevel.bdd_and_mvp_sample_android.user;

/**
 * @author netodevel
 */
public class UserPresenter {

    public interface UserPresenterListener {

        public void onAllFieldsRequired();

        public void onEmailInvalid();

        public void onPassWordInvalid();

        public void onRegister();
    }

}





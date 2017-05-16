package br.com.netodevel.bdd_and_mvp_sample_android.user;


import com.google.gson.annotations.Expose;

/**
 * @author netodevel
 */
public class UserModel {

    @Expose
    private Integer id;

    @Expose
    private String email;

    @Expose
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

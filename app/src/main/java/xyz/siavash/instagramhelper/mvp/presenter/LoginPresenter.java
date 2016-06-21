package xyz.siavash.instagramhelper.mvp.presenter;

import android.util.Log;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import xyz.siavash.instagramhelper.R;
import xyz.siavash.instagramhelper.mvp.presenter.interfaces.LoginPresenterInterface;
import xyz.siavash.instagramhelper.mvp.ui.interfaces.LoginViewInterface;
import xyz.siavash.instagramhelper.util.UserDataPreferences;

/**
 * Created by siavash on 4/28/16.
 */
public class LoginPresenter extends MvpBasePresenter<LoginViewInterface> implements LoginPresenterInterface {

    @Override
    public void attachView(LoginViewInterface view) {
        super.attachView(view);
    }

    @Override
    public void detachView(boolean retainInstance) {
        super.detachView(retainInstance);
    }

    @Override
    public void login() {
        //// TODO: 6/21/16 getTokenFromInternet
        UserDataPreferences.setToken("token");
        if(isViewAttached()) {
            getView().LoginSuccessful();
        }


    }

}

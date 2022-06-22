package uz.jl.controller;/*
  @author "Abdurashitov Shohimardon"
  @since 22/06/2022 16:01 (Wednesday)
  Quiz/IntelliJ IDEA
*/

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import uz.jl.utils.BaseUtils;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class BaseController {


    private static BaseController instance = null;


    public static BaseController getInstance() {
        if (instance == null) {
            instance = new BaseController();
        }
        return instance;
    }


    public void login() {

    }

    public void register() {

    }

    public void changeLang() {

    }
}

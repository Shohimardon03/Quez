package uz.jl.ui;/*
  @author "Abdurashitov Shohimardon"
  @since 22/06/2022 15:43 (Wednesday)
  Quiz/IntelliJ IDEA
*/

import uz.jl.BaseUtils;
import uz.jl.Colors;
import uz.jl.controller.BaseController;
import uz.jl.domains.auth.AuthUser;
import uz.jl.settings.Settings;
import uz.jl.vo.auth.Session;

import java.util.Objects;

public class BasicUi {

    private final static BaseController baseController = BaseController.getInstance();

    public static void main(String[] args) {
        baseMenu();

    }

    public static void baseMenu() {


        if (Objects.isNull(Session.sessionUser)) {
            BaseUtils.println(Settings.fields("login") + "->      1");//login
            BaseUtils.println(Settings.fields("register") + "->      2");//register
            BaseUtils.println(Settings.fields("change lang") + "->     3");
            BaseUtils.println(Settings.fields("quit") + "->      0");//quit
        } else if (Session.sessionUser.getRole().equals("USER")) {

            AuthUI.basemenu();
        } else if (Session.sessionUser.getRole().equals("ADMIN")) {
            AuthAdminUI.baseMenu();
        } else if (Session.sessionUser.getRole().equals("TEACHER")) {
            AuthTeacherUi.baseMenu();
        }


        String choice = BaseUtils.readText("?:");
        switch (choice) {
            case "1" -> baseController.login();
            case "2" -> baseController.register();
            case "3" -> baseController.changeLang();
            default -> BaseUtils.println("Wrong Choice", Colors.RED);
        }
        baseMenu();
    }
}

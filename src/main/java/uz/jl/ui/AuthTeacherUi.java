package uz.jl.ui;/*
  @author "Abdurashitov Shohimardon"
  @since 22/06/2022 15:43 (Wednesday)
  Quiz/IntelliJ IDEA
*/

import uz.jl.BaseUtils;
import uz.jl.Colors;
import uz.jl.controller.TeacherController;

import static uz.jl.ui.AuthUserUI.settings;

public class AuthTeacherUi {
    static TeacherController teacherController = TeacherController.getInstance();

    private void basemenu() {
        BaseUtils.println(settings.fields("Create test") + "->  1");
        BaseUtils.println(settings.fields("Show test") + "->  2");
        BaseUtils.println(settings.fields("Update test") + "->  3");
        BaseUtils.println(settings.fields("Delete test") + "->  4");
//        BaseUtils.println(settings.fields("Show result") + "->  5");   todo agar yoqsa  lekin muhim emas
        BaseUtils.println(settings.fields("Log out") + "->  0");
        BaseUtils.println(settings.fields("Quit") + "-> q");
        String choice = BaseUtils.readText("?:");
        switch (choice) {
            case "1" -> teacherController.createTest();
            case "2" -> teacherController.showTest();
            case "3" -> teacherController.updateTest();
            case "4" -> teacherController.deleteTest();
//            case "5" -> teacherController.showRes();  todo agar yoqsa  lekin muhim emas
            case "0" -> {

                BasicUi.baseMenu();
            }
            case "q" -> {
                BaseUtils.println("Bye", Colors.CYAN);
                System.exit(0);
            }
            default -> BaseUtils.println("Wrong Choice", Colors.RED);
        }

    }

}

package uz.jl.controller;/*
  @author "Abdurashitov Shohimardon"
  @since 22/06/2022 16:16 (Wednesday)
  Quiz/IntelliJ IDEA
*/

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import uz.jl.BaseUtils;
import uz.jl.settings.Settings;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static uz.jl.ui.AuthUserUI.settings;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TeacherController<T> {
    static Settings settings = Settings.getInstance();
    private static TeacherController instance;

    public static TeacherController getInstance() {
        if (instance == null) {
            instance = new TeacherController();
        }
        return instance;
    }

    public void createTest() {
        List<String> variants = new ArrayList<>();
        String des = BaseUtils.readText(settings.fields("enter description") + "  ");
        String variant_number = BaseUtils.readText(settings.fields("variant number") + "  ");

        try {
            for (int i = 0; i < Integer.parseInt(variant_number); i++) {
                System.out.println();
                variants.add(BaseUtils.readText(settings.fields("enter") + " -> "));
            }

        } catch (Exception e) {
            System.out.println("Error number");
        }


        String correctAns = BaseUtils.readText(settings.fields("enter correctAns") + "  ");
        String Level = BaseUtils.readText(settings.fields("enter level") + "  ");


    }

    public void showTest() {

    }

    public void updateTest() {

    }

    public void deleteTest() {

    }

    public void showRes() {

    }
}

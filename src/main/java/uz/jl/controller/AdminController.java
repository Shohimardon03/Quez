package uz.jl.controller;/*
  @author "Abdurashitov Shohimardon"
  @since 22/06/2022 16:16 (Wednesday)
  Quiz/IntelliJ IDEA
*/

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AdminController {
    private static AdminController instance;

    public static AdminController getInstance() {
        if (instance == null) {
            instance = new AdminController();
        }
        return instance;
    }
}

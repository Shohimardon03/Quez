package uz.jl.enums;/*
  @author "Abdurashitov Shohimardon"
  @since 22/06/2022 15:33 (Wednesday)
  Quiz/IntelliJ IDEA
*/

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Level {

    Hard(100),
    Medium(50),
    Easy(10);

    private final int priority;
}

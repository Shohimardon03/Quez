package uz.jl.domains;/*
  @author "Abdurashitov Shohimardon"
  @since 22/06/2022 15:22 (Wednesday)
  Quiz/IntelliJ IDEA
*/

import jakarta.persistence.*;
import lombok.*;
import uz.jl.enums.Language;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class BasicVo {
    private String username;
    @Column(nullable = false)
    private String password;
    @Enumerated(EnumType.STRING)
    private Language lang;
}

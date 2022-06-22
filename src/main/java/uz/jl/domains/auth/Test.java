package uz.jl.domains.auth;/*
  @author "Abdurashitov Shohimardon"
  @since 22/06/2022 15:33 (Wednesday)
  Quiz/IntelliJ IDEA
*/

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.jl.domains.Auditable;
import uz.jl.enums.Level;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(schema = "test")
@AllArgsConstructor
public class Test extends Auditable {

    private String description;
    @Convert(converter = String[].class)

    private List<String> variants;

    private String correctRes;

    private String subject;

    @Enumerated(EnumType.STRING)
    private Level level;

}

package uz.jl.domains.auth;

import jakarta.persistence.*;
import lombok.*;
import uz.jl.domains.Auditable;
import uz.jl.enums.AuthRole;
import uz.jl.enums.Language;
import uz.jl.enums.Status;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "hr")
public class AuthUser extends Auditable {

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;


    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "default 'USER'")
    private AuthRole role;
    @Enumerated(EnumType.STRING)
    private Language lang;
    @Convert(converter = Integer[].class)
    private List<Integer> workingTests;
    @Convert(converter = Status.StatusConvertor.class)
    private Status status;


}

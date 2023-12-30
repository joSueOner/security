package gts.security.Connection.User;

import com.fasterxml.jackson.annotation.JsonFormat;
import gts.security.Connection.ConnectionBase;
import gts.security.Shared.Enums.User.Status;
import gts.security.User.Core.Models.UserDTO;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "user")
public class UserEntity extends ConnectionBase<UserDTO, UserEntity> {

    @Id
    @Column(name = "id_user")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;

    @Column(
        name = "user",
        unique = true
    )
    private String user;

    @Column(
        name = "name"
    )
    private String name;

    @Column(
        name = "lastname"
    )
    private String lastname;

    @Column(
        name = "email",
        unique = true
    )
    private String email;

    @Column(
        name = "password"
    )
    private String password;

    @Column(
        name = "status",
        columnDefinition = "enum('ACTIVO','INACTIVO')"
    )
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(
        name = "create_date",
        columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP"
    )
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private String createDate;

    @Column(
        name = "create_datel",
        columnDefinition = "int DEFAULT DATE_FORMAT(now(), '%Y%m%d')"
    )
    private Integer createDatel;

    @Column(
        name = "create_user"
    )
    private String createUser;

    @Column(
        name = "update_date",
        columnDefinition = "DATETIME default NULL ON UPDATE CURRENT_TIMESTAMP"
    )
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private String updateDate;

    @Column(
        name = "update_datel",
        columnDefinition = "int DEFAULT NULL ON UPDATE DATE_FORMAT(now(), '%Y%m%d')"
    )
    private Integer updateDatel;

    @Column(
        name = "update_user"
    )
    private String updateUser;

    public UserEntity() {
    }

    public UserEntity(
        String user,
        String name,
        String lastname,
        String email,
        String password,
        Status status
    ) {
        this.user = user;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.status = status;
    }

    @Override
    public UserDTO MapEntityToDTO(UserEntity userEntity) {
        return userEntity.MapEntityToDTO();
    }

    @Override
    public UserDTO MapEntityToDTO() {
        return new UserDTO(
            this.getIdUser(),
            this.getUser(),
            this.getName(),
            this.getLastname(),
            this.getEmail(),
            this.getPassword(),
            this.getStatus()
        );
    }

}

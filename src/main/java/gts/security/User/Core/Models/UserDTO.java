package gts.security.User.Core.Models;

import gts.security.Shared.Enums.User.Status;
import lombok.Data;

@Data
public class UserDTO {
    private int idUser;
    private String user;
    private String name;
    private String lastname;
    private String email;
    private String password;
    private Status status;

    public UserDTO() {
    }

    public UserDTO(int idUser, String user, String name, String lastname, String email, String password, Status status) {
        this.idUser = idUser;
        this.user = user;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.status = status;
    }

}

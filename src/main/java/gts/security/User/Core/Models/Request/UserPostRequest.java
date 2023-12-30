package gts.security.User.Core.Models.Request;

import gts.security.Connection.User.UserEntity;
import gts.security.Shared.Enums.User.Status;
import gts.security.Shared.Interface.IRequest;
import lombok.Data;


@Data
public class UserPostRequest implements IRequest<UserEntity> {
    private String user;
    private String name;
    private String lastname;
    private String email;
    private String password;
    private Status status;

    @Override
    public UserEntity MapRequestToEntity() {
        return new UserEntity(
            this.user,
            this.name,
            this.lastname,
            this.email,
            this.password,
            this.status
        );
    }

}

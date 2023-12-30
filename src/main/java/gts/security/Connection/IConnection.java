package gts.security.Connection;

import java.util.List;

public interface IConnection<DTO, ENT> {
    public DTO MapEntityToDTO();
    public List<DTO> MapEntityListToDTOList(List<ENT> entityList);
}

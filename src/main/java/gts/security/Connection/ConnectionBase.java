package gts.security.Connection;

import java.util.ArrayList;
import java.util.List;

public abstract class ConnectionBase<DTO, ENT> implements IConnection<DTO, ENT> {

    public abstract DTO MapEntityToDTO();
    protected abstract DTO MapEntityToDTO(ENT entity);
    public List<DTO> MapEntityListToDTOList(List<ENT> entityList){
        List<DTO> dtoList = new ArrayList<>();
        for (ENT entity : entityList) {
            dtoList.add(MapEntityToDTO(entity));
        }
        return dtoList;
    };


}

package oracle.ecommerce.utils;

import java.util.ArrayList;
import java.util.List;

import oracle.ecommerce.model.dto.BaseDTO;

import oracle.ecommerce.model.eo.base.BaseEO;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

public final class ConvertUtils {

    private ConvertUtils() {
    }

    private static ModelMapper modelMapper = new ModelMapper();
   
    static {
    	modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }
    
    public static <T> T convertToDto(Object entity, Class<T> dtoClazz) {
        
        if (entity != null)
            return modelMapper.map(entity, dtoClazz);
        else 
            return null;
    }

    public static <T> T convertToEntity(Object dto, Class<T> entityClazz) {
        if (dto != null)
            return modelMapper.map(dto, entityClazz);
        else 
            return null;
    }
    
    public static <T extends BaseDTO> List<T> convertToDtoList(List<BaseEO> entityList, Class<T> dtoClazz) {
        List<T> res = new ArrayList<>();
        for(BaseEO eo : entityList)
        if (eo != null)
            res.add(modelMapper.map(eo, dtoClazz));
       
       return res;
    }

    public static <T> List<T> convertToEntityList(List<BaseDTO> dtoList, Class<T> entityClazz) {
        List<T> res = new ArrayList<>();
        for(Object dto : dtoList)
        if (dto != null)
            res.add(modelMapper.map(dto, entityClazz));
        
        return res;
    }
}

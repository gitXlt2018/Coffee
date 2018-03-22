package coffee.demo.mapper;

import coffee.demo.pojo.Drinktype;
import coffee.demo.pojo.DrinktypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrinktypeMapper {
    int countByExample(DrinktypeExample example);

    int deleteByExample(DrinktypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(Drinktype record);

    int insertSelective(Drinktype record);

    List<Drinktype> selectByExample(DrinktypeExample example);

    Drinktype selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") Drinktype record, @Param("example") DrinktypeExample example);

    int updateByExample(@Param("record") Drinktype record, @Param("example") DrinktypeExample example);

    int updateByPrimaryKeySelective(Drinktype record);

    int updateByPrimaryKey(Drinktype record);
}
package coffee.demo.mapper;

import coffee.demo.pojo.Drink;
import coffee.demo.pojo.DrinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrinkMapper {
    int countByExample(DrinkExample example);

    int deleteByExample(DrinkExample example);

    int deleteByPrimaryKey(Integer drinkId);

    int insert(Drink record);

    int insertSelective(Drink record);

    List<Drink> selectByExample(DrinkExample example);

    Drink selectByPrimaryKey(Integer drinkId);

    int updateByExampleSelective(@Param("record") Drink record, @Param("example") DrinkExample example);

    int updateByExample(@Param("record") Drink record, @Param("example") DrinkExample example);

    int updateByPrimaryKeySelective(Drink record);

    int updateByPrimaryKey(Drink record);
}
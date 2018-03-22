package coffee.demo.converter;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;



public class DateConverter implements Converter<String,Date> {

	@Override
	public Date convert(String source) {
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try {
			return sdf.parse(source);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
		
	}

}

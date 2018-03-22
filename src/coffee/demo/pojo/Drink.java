package coffee.demo.pojo;

import java.math.BigDecimal;

public class Drink {
	// Ù–‘
    private Integer drinkId;

    private Integer typeId;

    private String drinkname;

    private BigDecimal price;
    
    private Drinktype drinkType;

    
    //gets°¢sets∑Ω∑®
    public Integer getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(Integer drinkId) {
        this.drinkId = drinkId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getDrinkname() {
        return drinkname;
    }

    public void setDrinkname(String drinkname) {
        this.drinkname = drinkname == null ? null : drinkname.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

	public Drinktype getDrinkType() {
		return drinkType;
	}

	public void setDrinkType(Drinktype drinkType) {
		this.drinkType = drinkType;
	}
    
    
    
    
}
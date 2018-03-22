package coffee.demo.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DrinkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DrinkExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDrinkIdIsNull() {
            addCriterion("DRINK_ID is null");
            return (Criteria) this;
        }

        public Criteria andDrinkIdIsNotNull() {
            addCriterion("DRINK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDrinkIdEqualTo(Integer value) {
            addCriterion("DRINK_ID =", value, "drinkId");
            return (Criteria) this;
        }

        public Criteria andDrinkIdNotEqualTo(Integer value) {
            addCriterion("DRINK_ID <>", value, "drinkId");
            return (Criteria) this;
        }

        public Criteria andDrinkIdGreaterThan(Integer value) {
            addCriterion("DRINK_ID >", value, "drinkId");
            return (Criteria) this;
        }

        public Criteria andDrinkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DRINK_ID >=", value, "drinkId");
            return (Criteria) this;
        }

        public Criteria andDrinkIdLessThan(Integer value) {
            addCriterion("DRINK_ID <", value, "drinkId");
            return (Criteria) this;
        }

        public Criteria andDrinkIdLessThanOrEqualTo(Integer value) {
            addCriterion("DRINK_ID <=", value, "drinkId");
            return (Criteria) this;
        }

        public Criteria andDrinkIdIn(List<Integer> values) {
            addCriterion("DRINK_ID in", values, "drinkId");
            return (Criteria) this;
        }

        public Criteria andDrinkIdNotIn(List<Integer> values) {
            addCriterion("DRINK_ID not in", values, "drinkId");
            return (Criteria) this;
        }

        public Criteria andDrinkIdBetween(Integer value1, Integer value2) {
            addCriterion("DRINK_ID between", value1, value2, "drinkId");
            return (Criteria) this;
        }

        public Criteria andDrinkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DRINK_ID not between", value1, value2, "drinkId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("TYPE_ID =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("TYPE_ID <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("TYPE_ID >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TYPE_ID >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("TYPE_ID <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("TYPE_ID <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("TYPE_ID in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("TYPE_ID not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("TYPE_ID between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TYPE_ID not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andDrinknameIsNull() {
            addCriterion("DRINKNAME is null");
            return (Criteria) this;
        }

        public Criteria andDrinknameIsNotNull() {
            addCriterion("DRINKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDrinknameEqualTo(String value) {
            addCriterion("DRINKNAME =", value, "drinkname");
            return (Criteria) this;
        }

        public Criteria andDrinknameNotEqualTo(String value) {
            addCriterion("DRINKNAME <>", value, "drinkname");
            return (Criteria) this;
        }

        public Criteria andDrinknameGreaterThan(String value) {
            addCriterion("DRINKNAME >", value, "drinkname");
            return (Criteria) this;
        }

        public Criteria andDrinknameGreaterThanOrEqualTo(String value) {
            addCriterion("DRINKNAME >=", value, "drinkname");
            return (Criteria) this;
        }

        public Criteria andDrinknameLessThan(String value) {
            addCriterion("DRINKNAME <", value, "drinkname");
            return (Criteria) this;
        }

        public Criteria andDrinknameLessThanOrEqualTo(String value) {
            addCriterion("DRINKNAME <=", value, "drinkname");
            return (Criteria) this;
        }

        public Criteria andDrinknameLike(String value) {
            addCriterion("DRINKNAME like", value, "drinkname");
            return (Criteria) this;
        }

        public Criteria andDrinknameNotLike(String value) {
            addCriterion("DRINKNAME not like", value, "drinkname");
            return (Criteria) this;
        }

        public Criteria andDrinknameIn(List<String> values) {
            addCriterion("DRINKNAME in", values, "drinkname");
            return (Criteria) this;
        }

        public Criteria andDrinknameNotIn(List<String> values) {
            addCriterion("DRINKNAME not in", values, "drinkname");
            return (Criteria) this;
        }

        public Criteria andDrinknameBetween(String value1, String value2) {
            addCriterion("DRINKNAME between", value1, value2, "drinkname");
            return (Criteria) this;
        }

        public Criteria andDrinknameNotBetween(String value1, String value2) {
            addCriterion("DRINKNAME not between", value1, value2, "drinkname");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
package org.kin.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StocksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StocksExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andMarketIsNull() {
            addCriterion("market is null");
            return (Criteria) this;
        }

        public Criteria andMarketIsNotNull() {
            addCriterion("market is not null");
            return (Criteria) this;
        }

        public Criteria andMarketEqualTo(String value) {
            addCriterion("market =", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotEqualTo(String value) {
            addCriterion("market <>", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketGreaterThan(String value) {
            addCriterion("market >", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketGreaterThanOrEqualTo(String value) {
            addCriterion("market >=", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketLessThan(String value) {
            addCriterion("market <", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketLessThanOrEqualTo(String value) {
            addCriterion("market <=", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketLike(String value) {
            addCriterion("market like", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotLike(String value) {
            addCriterion("market not like", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketIn(List<String> values) {
            addCriterion("market in", values, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotIn(List<String> values) {
            addCriterion("market not in", values, "market");
            return (Criteria) this;
        }

        public Criteria andMarketBetween(String value1, String value2) {
            addCriterion("market between", value1, value2, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotBetween(String value1, String value2) {
            addCriterion("market not between", value1, value2, "market");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPinyinIsNull() {
            addCriterion("pinyin is null");
            return (Criteria) this;
        }

        public Criteria andPinyinIsNotNull() {
            addCriterion("pinyin is not null");
            return (Criteria) this;
        }

        public Criteria andPinyinEqualTo(String value) {
            addCriterion("pinyin =", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotEqualTo(String value) {
            addCriterion("pinyin <>", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinGreaterThan(String value) {
            addCriterion("pinyin >", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinGreaterThanOrEqualTo(String value) {
            addCriterion("pinyin >=", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLessThan(String value) {
            addCriterion("pinyin <", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLessThanOrEqualTo(String value) {
            addCriterion("pinyin <=", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinLike(String value) {
            addCriterion("pinyin like", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotLike(String value) {
            addCriterion("pinyin not like", value, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinIn(List<String> values) {
            addCriterion("pinyin in", values, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotIn(List<String> values) {
            addCriterion("pinyin not in", values, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinBetween(String value1, String value2) {
            addCriterion("pinyin between", value1, value2, "pinyin");
            return (Criteria) this;
        }

        public Criteria andPinyinNotBetween(String value1, String value2) {
            addCriterion("pinyin not between", value1, value2, "pinyin");
            return (Criteria) this;
        }

        public Criteria andCurrcapitalIsNull() {
            addCriterion("currcapital is null");
            return (Criteria) this;
        }

        public Criteria andCurrcapitalIsNotNull() {
            addCriterion("currcapital is not null");
            return (Criteria) this;
        }

        public Criteria andCurrcapitalEqualTo(BigDecimal value) {
            addCriterion("currcapital =", value, "currcapital");
            return (Criteria) this;
        }

        public Criteria andCurrcapitalNotEqualTo(BigDecimal value) {
            addCriterion("currcapital <>", value, "currcapital");
            return (Criteria) this;
        }

        public Criteria andCurrcapitalGreaterThan(BigDecimal value) {
            addCriterion("currcapital >", value, "currcapital");
            return (Criteria) this;
        }

        public Criteria andCurrcapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("currcapital >=", value, "currcapital");
            return (Criteria) this;
        }

        public Criteria andCurrcapitalLessThan(BigDecimal value) {
            addCriterion("currcapital <", value, "currcapital");
            return (Criteria) this;
        }

        public Criteria andCurrcapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("currcapital <=", value, "currcapital");
            return (Criteria) this;
        }

        public Criteria andCurrcapitalIn(List<BigDecimal> values) {
            addCriterion("currcapital in", values, "currcapital");
            return (Criteria) this;
        }

        public Criteria andCurrcapitalNotIn(List<BigDecimal> values) {
            addCriterion("currcapital not in", values, "currcapital");
            return (Criteria) this;
        }

        public Criteria andCurrcapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("currcapital between", value1, value2, "currcapital");
            return (Criteria) this;
        }

        public Criteria andCurrcapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("currcapital not between", value1, value2, "currcapital");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalIsNull() {
            addCriterion("totalcapital is null");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalIsNotNull() {
            addCriterion("totalcapital is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalEqualTo(BigDecimal value) {
            addCriterion("totalcapital =", value, "totalcapital");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalNotEqualTo(BigDecimal value) {
            addCriterion("totalcapital <>", value, "totalcapital");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalGreaterThan(BigDecimal value) {
            addCriterion("totalcapital >", value, "totalcapital");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalcapital >=", value, "totalcapital");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalLessThan(BigDecimal value) {
            addCriterion("totalcapital <", value, "totalcapital");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalcapital <=", value, "totalcapital");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalIn(List<BigDecimal> values) {
            addCriterion("totalcapital in", values, "totalcapital");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalNotIn(List<BigDecimal> values) {
            addCriterion("totalcapital not in", values, "totalcapital");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalcapital between", value1, value2, "totalcapital");
            return (Criteria) this;
        }

        public Criteria andTotalcapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalcapital not between", value1, value2, "totalcapital");
            return (Criteria) this;
        }

        public Criteria andProfitFourIsNull() {
            addCriterion("profit_four is null");
            return (Criteria) this;
        }

        public Criteria andProfitFourIsNotNull() {
            addCriterion("profit_four is not null");
            return (Criteria) this;
        }

        public Criteria andProfitFourEqualTo(BigDecimal value) {
            addCriterion("profit_four =", value, "profitFour");
            return (Criteria) this;
        }

        public Criteria andProfitFourNotEqualTo(BigDecimal value) {
            addCriterion("profit_four <>", value, "profitFour");
            return (Criteria) this;
        }

        public Criteria andProfitFourGreaterThan(BigDecimal value) {
            addCriterion("profit_four >", value, "profitFour");
            return (Criteria) this;
        }

        public Criteria andProfitFourGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_four >=", value, "profitFour");
            return (Criteria) this;
        }

        public Criteria andProfitFourLessThan(BigDecimal value) {
            addCriterion("profit_four <", value, "profitFour");
            return (Criteria) this;
        }

        public Criteria andProfitFourLessThanOrEqualTo(BigDecimal value) {
            addCriterion("profit_four <=", value, "profitFour");
            return (Criteria) this;
        }

        public Criteria andProfitFourIn(List<BigDecimal> values) {
            addCriterion("profit_four in", values, "profitFour");
            return (Criteria) this;
        }

        public Criteria andProfitFourNotIn(List<BigDecimal> values) {
            addCriterion("profit_four not in", values, "profitFour");
            return (Criteria) this;
        }

        public Criteria andProfitFourBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_four between", value1, value2, "profitFour");
            return (Criteria) this;
        }

        public Criteria andProfitFourNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profit_four not between", value1, value2, "profitFour");
            return (Criteria) this;
        }

        public Criteria andMgjzcIsNull() {
            addCriterion("mgjzc is null");
            return (Criteria) this;
        }

        public Criteria andMgjzcIsNotNull() {
            addCriterion("mgjzc is not null");
            return (Criteria) this;
        }

        public Criteria andMgjzcEqualTo(BigDecimal value) {
            addCriterion("mgjzc =", value, "mgjzc");
            return (Criteria) this;
        }

        public Criteria andMgjzcNotEqualTo(BigDecimal value) {
            addCriterion("mgjzc <>", value, "mgjzc");
            return (Criteria) this;
        }

        public Criteria andMgjzcGreaterThan(BigDecimal value) {
            addCriterion("mgjzc >", value, "mgjzc");
            return (Criteria) this;
        }

        public Criteria andMgjzcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mgjzc >=", value, "mgjzc");
            return (Criteria) this;
        }

        public Criteria andMgjzcLessThan(BigDecimal value) {
            addCriterion("mgjzc <", value, "mgjzc");
            return (Criteria) this;
        }

        public Criteria andMgjzcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mgjzc <=", value, "mgjzc");
            return (Criteria) this;
        }

        public Criteria andMgjzcIn(List<BigDecimal> values) {
            addCriterion("mgjzc in", values, "mgjzc");
            return (Criteria) this;
        }

        public Criteria andMgjzcNotIn(List<BigDecimal> values) {
            addCriterion("mgjzc not in", values, "mgjzc");
            return (Criteria) this;
        }

        public Criteria andMgjzcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mgjzc between", value1, value2, "mgjzc");
            return (Criteria) this;
        }

        public Criteria andMgjzcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mgjzc not between", value1, value2, "mgjzc");
            return (Criteria) this;
        }

        public Criteria andListingDateIsNull() {
            addCriterion("listing_date is null");
            return (Criteria) this;
        }

        public Criteria andListingDateIsNotNull() {
            addCriterion("listing_date is not null");
            return (Criteria) this;
        }

        public Criteria andListingDateEqualTo(Date value) {
            addCriterion("listing_date =", value, "listingDate");
            return (Criteria) this;
        }

        public Criteria andListingDateNotEqualTo(Date value) {
            addCriterion("listing_date <>", value, "listingDate");
            return (Criteria) this;
        }

        public Criteria andListingDateGreaterThan(Date value) {
            addCriterion("listing_date >", value, "listingDate");
            return (Criteria) this;
        }

        public Criteria andListingDateGreaterThanOrEqualTo(Date value) {
            addCriterion("listing_date >=", value, "listingDate");
            return (Criteria) this;
        }

        public Criteria andListingDateLessThan(Date value) {
            addCriterion("listing_date <", value, "listingDate");
            return (Criteria) this;
        }

        public Criteria andListingDateLessThanOrEqualTo(Date value) {
            addCriterion("listing_date <=", value, "listingDate");
            return (Criteria) this;
        }

        public Criteria andListingDateIn(List<Date> values) {
            addCriterion("listing_date in", values, "listingDate");
            return (Criteria) this;
        }

        public Criteria andListingDateNotIn(List<Date> values) {
            addCriterion("listing_date not in", values, "listingDate");
            return (Criteria) this;
        }

        public Criteria andListingDateBetween(Date value1, Date value2) {
            addCriterion("listing_date between", value1, value2, "listingDate");
            return (Criteria) this;
        }

        public Criteria andListingDateNotBetween(Date value1, Date value2) {
            addCriterion("listing_date not between", value1, value2, "listingDate");
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
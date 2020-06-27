package com.bootimooc.bootimooc.entity;

import java.util.ArrayList;
import java.util.List;

public class HomePageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HomePageExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleaIsNull() {
            addCriterion("titlea is null");
            return (Criteria) this;
        }

        public Criteria andTitleaIsNotNull() {
            addCriterion("titlea is not null");
            return (Criteria) this;
        }

        public Criteria andTitleaEqualTo(String value) {
            addCriterion("titlea =", value, "titlea");
            return (Criteria) this;
        }

        public Criteria andTitleaNotEqualTo(String value) {
            addCriterion("titlea <>", value, "titlea");
            return (Criteria) this;
        }

        public Criteria andTitleaGreaterThan(String value) {
            addCriterion("titlea >", value, "titlea");
            return (Criteria) this;
        }

        public Criteria andTitleaGreaterThanOrEqualTo(String value) {
            addCriterion("titlea >=", value, "titlea");
            return (Criteria) this;
        }

        public Criteria andTitleaLessThan(String value) {
            addCriterion("titlea <", value, "titlea");
            return (Criteria) this;
        }

        public Criteria andTitleaLessThanOrEqualTo(String value) {
            addCriterion("titlea <=", value, "titlea");
            return (Criteria) this;
        }

        public Criteria andTitleaLike(String value) {
            addCriterion("titlea like", value, "titlea");
            return (Criteria) this;
        }

        public Criteria andTitleaNotLike(String value) {
            addCriterion("titlea not like", value, "titlea");
            return (Criteria) this;
        }

        public Criteria andTitleaIn(List<String> values) {
            addCriterion("titlea in", values, "titlea");
            return (Criteria) this;
        }

        public Criteria andTitleaNotIn(List<String> values) {
            addCriterion("titlea not in", values, "titlea");
            return (Criteria) this;
        }

        public Criteria andTitleaBetween(String value1, String value2) {
            addCriterion("titlea between", value1, value2, "titlea");
            return (Criteria) this;
        }

        public Criteria andTitleaNotBetween(String value1, String value2) {
            addCriterion("titlea not between", value1, value2, "titlea");
            return (Criteria) this;
        }

        public Criteria andTitlebIsNull() {
            addCriterion("titleb is null");
            return (Criteria) this;
        }

        public Criteria andTitlebIsNotNull() {
            addCriterion("titleb is not null");
            return (Criteria) this;
        }

        public Criteria andTitlebEqualTo(String value) {
            addCriterion("titleb =", value, "titleb");
            return (Criteria) this;
        }

        public Criteria andTitlebNotEqualTo(String value) {
            addCriterion("titleb <>", value, "titleb");
            return (Criteria) this;
        }

        public Criteria andTitlebGreaterThan(String value) {
            addCriterion("titleb >", value, "titleb");
            return (Criteria) this;
        }

        public Criteria andTitlebGreaterThanOrEqualTo(String value) {
            addCriterion("titleb >=", value, "titleb");
            return (Criteria) this;
        }

        public Criteria andTitlebLessThan(String value) {
            addCriterion("titleb <", value, "titleb");
            return (Criteria) this;
        }

        public Criteria andTitlebLessThanOrEqualTo(String value) {
            addCriterion("titleb <=", value, "titleb");
            return (Criteria) this;
        }

        public Criteria andTitlebLike(String value) {
            addCriterion("titleb like", value, "titleb");
            return (Criteria) this;
        }

        public Criteria andTitlebNotLike(String value) {
            addCriterion("titleb not like", value, "titleb");
            return (Criteria) this;
        }

        public Criteria andTitlebIn(List<String> values) {
            addCriterion("titleb in", values, "titleb");
            return (Criteria) this;
        }

        public Criteria andTitlebNotIn(List<String> values) {
            addCriterion("titleb not in", values, "titleb");
            return (Criteria) this;
        }

        public Criteria andTitlebBetween(String value1, String value2) {
            addCriterion("titleb between", value1, value2, "titleb");
            return (Criteria) this;
        }

        public Criteria andTitlebNotBetween(String value1, String value2) {
            addCriterion("titleb not between", value1, value2, "titleb");
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
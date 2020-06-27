package com.bootimooc.bootimooc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andClassifyidIsNull() {
            addCriterion("classifyId is null");
            return (Criteria) this;
        }

        public Criteria andClassifyidIsNotNull() {
            addCriterion("classifyId is not null");
            return (Criteria) this;
        }

        public Criteria andClassifyidEqualTo(Integer value) {
            addCriterion("classifyId =", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidNotEqualTo(Integer value) {
            addCriterion("classifyId <>", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidGreaterThan(Integer value) {
            addCriterion("classifyId >", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("classifyId >=", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidLessThan(Integer value) {
            addCriterion("classifyId <", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidLessThanOrEqualTo(Integer value) {
            addCriterion("classifyId <=", value, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidIn(List<Integer> values) {
            addCriterion("classifyId in", values, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidNotIn(List<Integer> values) {
            addCriterion("classifyId not in", values, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidBetween(Integer value1, Integer value2) {
            addCriterion("classifyId between", value1, value2, "classifyid");
            return (Criteria) this;
        }

        public Criteria andClassifyidNotBetween(Integer value1, Integer value2) {
            addCriterion("classifyId not between", value1, value2, "classifyid");
            return (Criteria) this;
        }

        public Criteria andDirectionidIsNull() {
            addCriterion("directionId is null");
            return (Criteria) this;
        }

        public Criteria andDirectionidIsNotNull() {
            addCriterion("directionId is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionidEqualTo(Integer value) {
            addCriterion("directionId =", value, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidNotEqualTo(Integer value) {
            addCriterion("directionId <>", value, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidGreaterThan(Integer value) {
            addCriterion("directionId >", value, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("directionId >=", value, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidLessThan(Integer value) {
            addCriterion("directionId <", value, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidLessThanOrEqualTo(Integer value) {
            addCriterion("directionId <=", value, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidIn(List<Integer> values) {
            addCriterion("directionId in", values, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidNotIn(List<Integer> values) {
            addCriterion("directionId not in", values, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidBetween(Integer value1, Integer value2) {
            addCriterion("directionId between", value1, value2, "directionid");
            return (Criteria) this;
        }

        public Criteria andDirectionidNotBetween(Integer value1, Integer value2) {
            addCriterion("directionId not between", value1, value2, "directionid");
            return (Criteria) this;
        }

        public Criteria andLevelidIsNull() {
            addCriterion("levelId is null");
            return (Criteria) this;
        }

        public Criteria andLevelidIsNotNull() {
            addCriterion("levelId is not null");
            return (Criteria) this;
        }

        public Criteria andLevelidEqualTo(Integer value) {
            addCriterion("levelId =", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidNotEqualTo(Integer value) {
            addCriterion("levelId <>", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidGreaterThan(Integer value) {
            addCriterion("levelId >", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("levelId >=", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidLessThan(Integer value) {
            addCriterion("levelId <", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidLessThanOrEqualTo(Integer value) {
            addCriterion("levelId <=", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidIn(List<Integer> values) {
            addCriterion("levelId in", values, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidNotIn(List<Integer> values) {
            addCriterion("levelId not in", values, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidBetween(Integer value1, Integer value2) {
            addCriterion("levelId between", value1, value2, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidNotBetween(Integer value1, Integer value2) {
            addCriterion("levelId not between", value1, value2, "levelid");
            return (Criteria) this;
        }

        public Criteria andRaleasetimeIsNull() {
            addCriterion("raleaseTime is null");
            return (Criteria) this;
        }

        public Criteria andRaleasetimeIsNotNull() {
            addCriterion("raleaseTime is not null");
            return (Criteria) this;
        }

        public Criteria andRaleasetimeEqualTo(Date value) {
            addCriterion("raleaseTime =", value, "raleasetime");
            return (Criteria) this;
        }

        public Criteria andRaleasetimeNotEqualTo(Date value) {
            addCriterion("raleaseTime <>", value, "raleasetime");
            return (Criteria) this;
        }

        public Criteria andRaleasetimeGreaterThan(Date value) {
            addCriterion("raleaseTime >", value, "raleasetime");
            return (Criteria) this;
        }

        public Criteria andRaleasetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("raleaseTime >=", value, "raleasetime");
            return (Criteria) this;
        }

        public Criteria andRaleasetimeLessThan(Date value) {
            addCriterion("raleaseTime <", value, "raleasetime");
            return (Criteria) this;
        }

        public Criteria andRaleasetimeLessThanOrEqualTo(Date value) {
            addCriterion("raleaseTime <=", value, "raleasetime");
            return (Criteria) this;
        }

        public Criteria andRaleasetimeIn(List<Date> values) {
            addCriterion("raleaseTime in", values, "raleasetime");
            return (Criteria) this;
        }

        public Criteria andRaleasetimeNotIn(List<Date> values) {
            addCriterion("raleaseTime not in", values, "raleasetime");
            return (Criteria) this;
        }

        public Criteria andRaleasetimeBetween(Date value1, Date value2) {
            addCriterion("raleaseTime between", value1, value2, "raleasetime");
            return (Criteria) this;
        }

        public Criteria andRaleasetimeNotBetween(Date value1, Date value2) {
            addCriterion("raleaseTime not between", value1, value2, "raleasetime");
            return (Criteria) this;
        }

        public Criteria andStudycountIsNull() {
            addCriterion("studyCount is null");
            return (Criteria) this;
        }

        public Criteria andStudycountIsNotNull() {
            addCriterion("studyCount is not null");
            return (Criteria) this;
        }

        public Criteria andStudycountEqualTo(Integer value) {
            addCriterion("studyCount =", value, "studycount");
            return (Criteria) this;
        }

        public Criteria andStudycountNotEqualTo(Integer value) {
            addCriterion("studyCount <>", value, "studycount");
            return (Criteria) this;
        }

        public Criteria andStudycountGreaterThan(Integer value) {
            addCriterion("studyCount >", value, "studycount");
            return (Criteria) this;
        }

        public Criteria andStudycountGreaterThanOrEqualTo(Integer value) {
            addCriterion("studyCount >=", value, "studycount");
            return (Criteria) this;
        }

        public Criteria andStudycountLessThan(Integer value) {
            addCriterion("studyCount <", value, "studycount");
            return (Criteria) this;
        }

        public Criteria andStudycountLessThanOrEqualTo(Integer value) {
            addCriterion("studyCount <=", value, "studycount");
            return (Criteria) this;
        }

        public Criteria andStudycountIn(List<Integer> values) {
            addCriterion("studyCount in", values, "studycount");
            return (Criteria) this;
        }

        public Criteria andStudycountNotIn(List<Integer> values) {
            addCriterion("studyCount not in", values, "studycount");
            return (Criteria) this;
        }

        public Criteria andStudycountBetween(Integer value1, Integer value2) {
            addCriterion("studyCount between", value1, value2, "studycount");
            return (Criteria) this;
        }

        public Criteria andStudycountNotBetween(Integer value1, Integer value2) {
            addCriterion("studyCount not between", value1, value2, "studycount");
            return (Criteria) this;
        }

        public Criteria andCourescoverIsNull() {
            addCriterion("couresCover is null");
            return (Criteria) this;
        }

        public Criteria andCourescoverIsNotNull() {
            addCriterion("couresCover is not null");
            return (Criteria) this;
        }

        public Criteria andCourescoverEqualTo(String value) {
            addCriterion("couresCover =", value, "courescover");
            return (Criteria) this;
        }

        public Criteria andCourescoverNotEqualTo(String value) {
            addCriterion("couresCover <>", value, "courescover");
            return (Criteria) this;
        }

        public Criteria andCourescoverGreaterThan(String value) {
            addCriterion("couresCover >", value, "courescover");
            return (Criteria) this;
        }

        public Criteria andCourescoverGreaterThanOrEqualTo(String value) {
            addCriterion("couresCover >=", value, "courescover");
            return (Criteria) this;
        }

        public Criteria andCourescoverLessThan(String value) {
            addCriterion("couresCover <", value, "courescover");
            return (Criteria) this;
        }

        public Criteria andCourescoverLessThanOrEqualTo(String value) {
            addCriterion("couresCover <=", value, "courescover");
            return (Criteria) this;
        }

        public Criteria andCourescoverLike(String value) {
            addCriterion("couresCover like", value, "courescover");
            return (Criteria) this;
        }

        public Criteria andCourescoverNotLike(String value) {
            addCriterion("couresCover not like", value, "courescover");
            return (Criteria) this;
        }

        public Criteria andCourescoverIn(List<String> values) {
            addCriterion("couresCover in", values, "courescover");
            return (Criteria) this;
        }

        public Criteria andCourescoverNotIn(List<String> values) {
            addCriterion("couresCover not in", values, "courescover");
            return (Criteria) this;
        }

        public Criteria andCourescoverBetween(String value1, String value2) {
            addCriterion("couresCover between", value1, value2, "courescover");
            return (Criteria) this;
        }

        public Criteria andCourescoverNotBetween(String value1, String value2) {
            addCriterion("couresCover not between", value1, value2, "courescover");
            return (Criteria) this;
        }

        public Criteria andValiddayIsNull() {
            addCriterion("validDay is null");
            return (Criteria) this;
        }

        public Criteria andValiddayIsNotNull() {
            addCriterion("validDay is not null");
            return (Criteria) this;
        }

        public Criteria andValiddayEqualTo(String value) {
            addCriterion("validDay =", value, "validday");
            return (Criteria) this;
        }

        public Criteria andValiddayNotEqualTo(String value) {
            addCriterion("validDay <>", value, "validday");
            return (Criteria) this;
        }

        public Criteria andValiddayGreaterThan(String value) {
            addCriterion("validDay >", value, "validday");
            return (Criteria) this;
        }

        public Criteria andValiddayGreaterThanOrEqualTo(String value) {
            addCriterion("validDay >=", value, "validday");
            return (Criteria) this;
        }

        public Criteria andValiddayLessThan(String value) {
            addCriterion("validDay <", value, "validday");
            return (Criteria) this;
        }

        public Criteria andValiddayLessThanOrEqualTo(String value) {
            addCriterion("validDay <=", value, "validday");
            return (Criteria) this;
        }

        public Criteria andValiddayLike(String value) {
            addCriterion("validDay like", value, "validday");
            return (Criteria) this;
        }

        public Criteria andValiddayNotLike(String value) {
            addCriterion("validDay not like", value, "validday");
            return (Criteria) this;
        }

        public Criteria andValiddayIn(List<String> values) {
            addCriterion("validDay in", values, "validday");
            return (Criteria) this;
        }

        public Criteria andValiddayNotIn(List<String> values) {
            addCriterion("validDay not in", values, "validday");
            return (Criteria) this;
        }

        public Criteria andValiddayBetween(String value1, String value2) {
            addCriterion("validDay between", value1, value2, "validday");
            return (Criteria) this;
        }

        public Criteria andValiddayNotBetween(String value1, String value2) {
            addCriterion("validDay not between", value1, value2, "validday");
            return (Criteria) this;
        }

        public Criteria andLectureridIsNull() {
            addCriterion("lecturerId is null");
            return (Criteria) this;
        }

        public Criteria andLectureridIsNotNull() {
            addCriterion("lecturerId is not null");
            return (Criteria) this;
        }

        public Criteria andLectureridEqualTo(Integer value) {
            addCriterion("lecturerId =", value, "lecturerid");
            return (Criteria) this;
        }

        public Criteria andLectureridNotEqualTo(Integer value) {
            addCriterion("lecturerId <>", value, "lecturerid");
            return (Criteria) this;
        }

        public Criteria andLectureridGreaterThan(Integer value) {
            addCriterion("lecturerId >", value, "lecturerid");
            return (Criteria) this;
        }

        public Criteria andLectureridGreaterThanOrEqualTo(Integer value) {
            addCriterion("lecturerId >=", value, "lecturerid");
            return (Criteria) this;
        }

        public Criteria andLectureridLessThan(Integer value) {
            addCriterion("lecturerId <", value, "lecturerid");
            return (Criteria) this;
        }

        public Criteria andLectureridLessThanOrEqualTo(Integer value) {
            addCriterion("lecturerId <=", value, "lecturerid");
            return (Criteria) this;
        }

        public Criteria andLectureridIn(List<Integer> values) {
            addCriterion("lecturerId in", values, "lecturerid");
            return (Criteria) this;
        }

        public Criteria andLectureridNotIn(List<Integer> values) {
            addCriterion("lecturerId not in", values, "lecturerid");
            return (Criteria) this;
        }

        public Criteria andLectureridBetween(Integer value1, Integer value2) {
            addCriterion("lecturerId between", value1, value2, "lecturerid");
            return (Criteria) this;
        }

        public Criteria andLectureridNotBetween(Integer value1, Integer value2) {
            addCriterion("lecturerId not between", value1, value2, "lecturerid");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNull() {
            addCriterion("courseName is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNotNull() {
            addCriterion("courseName is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameEqualTo(String value) {
            addCriterion("courseName =", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotEqualTo(String value) {
            addCriterion("courseName <>", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThan(String value) {
            addCriterion("courseName >", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThanOrEqualTo(String value) {
            addCriterion("courseName >=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThan(String value) {
            addCriterion("courseName <", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThanOrEqualTo(String value) {
            addCriterion("courseName <=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLike(String value) {
            addCriterion("courseName like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotLike(String value) {
            addCriterion("courseName not like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameIn(List<String> values) {
            addCriterion("courseName in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotIn(List<String> values) {
            addCriterion("courseName not in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameBetween(String value1, String value2) {
            addCriterion("courseName between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotBetween(String value1, String value2) {
            addCriterion("courseName not between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNull() {
            addCriterion("describe is null");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNotNull() {
            addCriterion("describe is not null");
            return (Criteria) this;
        }

        public Criteria andDescribeEqualTo(String value) {
            addCriterion("describe =", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotEqualTo(String value) {
            addCriterion("describe <>", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThan(String value) {
            addCriterion("describe >", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("describe >=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThan(String value) {
            addCriterion("describe <", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThanOrEqualTo(String value) {
            addCriterion("describe <=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLike(String value) {
            addCriterion("describe like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotLike(String value) {
            addCriterion("describe not like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeIn(List<String> values) {
            addCriterion("describe in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotIn(List<String> values) {
            addCriterion("describe not in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeBetween(String value1, String value2) {
            addCriterion("describe between", value1, value2, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotBetween(String value1, String value2) {
            addCriterion("describe not between", value1, value2, "describe");
            return (Criteria) this;
        }

        public Criteria andFreeIsNull() {
            addCriterion("free is null");
            return (Criteria) this;
        }

        public Criteria andFreeIsNotNull() {
            addCriterion("free is not null");
            return (Criteria) this;
        }

        public Criteria andFreeEqualTo(String value) {
            addCriterion("free =", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotEqualTo(String value) {
            addCriterion("free <>", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeGreaterThan(String value) {
            addCriterion("free >", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeGreaterThanOrEqualTo(String value) {
            addCriterion("free >=", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeLessThan(String value) {
            addCriterion("free <", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeLessThanOrEqualTo(String value) {
            addCriterion("free <=", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeLike(String value) {
            addCriterion("free like", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotLike(String value) {
            addCriterion("free not like", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeIn(List<String> values) {
            addCriterion("free in", values, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotIn(List<String> values) {
            addCriterion("free not in", values, "free");
            return (Criteria) this;
        }

        public Criteria andFreeBetween(String value1, String value2) {
            addCriterion("free between", value1, value2, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotBetween(String value1, String value2) {
            addCriterion("free not between", value1, value2, "free");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCoursedurationIsNull() {
            addCriterion("courseDuration is null");
            return (Criteria) this;
        }

        public Criteria andCoursedurationIsNotNull() {
            addCriterion("courseDuration is not null");
            return (Criteria) this;
        }

        public Criteria andCoursedurationEqualTo(Date value) {
            addCriterion("courseDuration =", value, "courseduration");
            return (Criteria) this;
        }

        public Criteria andCoursedurationNotEqualTo(Date value) {
            addCriterion("courseDuration <>", value, "courseduration");
            return (Criteria) this;
        }

        public Criteria andCoursedurationGreaterThan(Date value) {
            addCriterion("courseDuration >", value, "courseduration");
            return (Criteria) this;
        }

        public Criteria andCoursedurationGreaterThanOrEqualTo(Date value) {
            addCriterion("courseDuration >=", value, "courseduration");
            return (Criteria) this;
        }

        public Criteria andCoursedurationLessThan(Date value) {
            addCriterion("courseDuration <", value, "courseduration");
            return (Criteria) this;
        }

        public Criteria andCoursedurationLessThanOrEqualTo(Date value) {
            addCriterion("courseDuration <=", value, "courseduration");
            return (Criteria) this;
        }

        public Criteria andCoursedurationIn(List<Date> values) {
            addCriterion("courseDuration in", values, "courseduration");
            return (Criteria) this;
        }

        public Criteria andCoursedurationNotIn(List<Date> values) {
            addCriterion("courseDuration not in", values, "courseduration");
            return (Criteria) this;
        }

        public Criteria andCoursedurationBetween(Date value1, Date value2) {
            addCriterion("courseDuration between", value1, value2, "courseduration");
            return (Criteria) this;
        }

        public Criteria andCoursedurationNotBetween(Date value1, Date value2) {
            addCriterion("courseDuration not between", value1, value2, "courseduration");
            return (Criteria) this;
        }

        public Criteria andHomepageidIsNull() {
            addCriterion("homepageId is null");
            return (Criteria) this;
        }

        public Criteria andHomepageidIsNotNull() {
            addCriterion("homepageId is not null");
            return (Criteria) this;
        }

        public Criteria andHomepageidEqualTo(Integer value) {
            addCriterion("homepageId =", value, "homepageid");
            return (Criteria) this;
        }

        public Criteria andHomepageidNotEqualTo(Integer value) {
            addCriterion("homepageId <>", value, "homepageid");
            return (Criteria) this;
        }

        public Criteria andHomepageidGreaterThan(Integer value) {
            addCriterion("homepageId >", value, "homepageid");
            return (Criteria) this;
        }

        public Criteria andHomepageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("homepageId >=", value, "homepageid");
            return (Criteria) this;
        }

        public Criteria andHomepageidLessThan(Integer value) {
            addCriterion("homepageId <", value, "homepageid");
            return (Criteria) this;
        }

        public Criteria andHomepageidLessThanOrEqualTo(Integer value) {
            addCriterion("homepageId <=", value, "homepageid");
            return (Criteria) this;
        }

        public Criteria andHomepageidIn(List<Integer> values) {
            addCriterion("homepageId in", values, "homepageid");
            return (Criteria) this;
        }

        public Criteria andHomepageidNotIn(List<Integer> values) {
            addCriterion("homepageId not in", values, "homepageid");
            return (Criteria) this;
        }

        public Criteria andHomepageidBetween(Integer value1, Integer value2) {
            addCriterion("homepageId between", value1, value2, "homepageid");
            return (Criteria) this;
        }

        public Criteria andHomepageidNotBetween(Integer value1, Integer value2) {
            addCriterion("homepageId not between", value1, value2, "homepageid");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("keyword is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("keyword is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("keyword =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("keyword <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("keyword >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("keyword >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("keyword <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("keyword <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("keyword like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("keyword not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("keyword in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("keyword not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("keyword between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("keyword not between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andEnumberIsNull() {
            addCriterion("enumber is null");
            return (Criteria) this;
        }

        public Criteria andEnumberIsNotNull() {
            addCriterion("enumber is not null");
            return (Criteria) this;
        }

        public Criteria andEnumberEqualTo(Integer value) {
            addCriterion("enumber =", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberNotEqualTo(Integer value) {
            addCriterion("enumber <>", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberGreaterThan(Integer value) {
            addCriterion("enumber >", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("enumber >=", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberLessThan(Integer value) {
            addCriterion("enumber <", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberLessThanOrEqualTo(Integer value) {
            addCriterion("enumber <=", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberIn(List<Integer> values) {
            addCriterion("enumber in", values, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberNotIn(List<Integer> values) {
            addCriterion("enumber not in", values, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberBetween(Integer value1, Integer value2) {
            addCriterion("enumber between", value1, value2, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("enumber not between", value1, value2, "enumber");
            return (Criteria) this;
        }

        public Criteria andLeveIsNull() {
            addCriterion("leve is null");
            return (Criteria) this;
        }

        public Criteria andLeveIsNotNull() {
            addCriterion("leve is not null");
            return (Criteria) this;
        }

        public Criteria andLeveEqualTo(String value) {
            addCriterion("leve =", value, "leve");
            return (Criteria) this;
        }

        public Criteria andLeveNotEqualTo(String value) {
            addCriterion("leve <>", value, "leve");
            return (Criteria) this;
        }

        public Criteria andLeveGreaterThan(String value) {
            addCriterion("leve >", value, "leve");
            return (Criteria) this;
        }

        public Criteria andLeveGreaterThanOrEqualTo(String value) {
            addCriterion("leve >=", value, "leve");
            return (Criteria) this;
        }

        public Criteria andLeveLessThan(String value) {
            addCriterion("leve <", value, "leve");
            return (Criteria) this;
        }

        public Criteria andLeveLessThanOrEqualTo(String value) {
            addCriterion("leve <=", value, "leve");
            return (Criteria) this;
        }

        public Criteria andLeveLike(String value) {
            addCriterion("leve like", value, "leve");
            return (Criteria) this;
        }

        public Criteria andLeveNotLike(String value) {
            addCriterion("leve not like", value, "leve");
            return (Criteria) this;
        }

        public Criteria andLeveIn(List<String> values) {
            addCriterion("leve in", values, "leve");
            return (Criteria) this;
        }

        public Criteria andLeveNotIn(List<String> values) {
            addCriterion("leve not in", values, "leve");
            return (Criteria) this;
        }

        public Criteria andLeveBetween(String value1, String value2) {
            addCriterion("leve between", value1, value2, "leve");
            return (Criteria) this;
        }

        public Criteria andLeveNotBetween(String value1, String value2) {
            addCriterion("leve not between", value1, value2, "leve");
            return (Criteria) this;
        }

        public Criteria andLabelaIsNull() {
            addCriterion("labela is null");
            return (Criteria) this;
        }

        public Criteria andLabelaIsNotNull() {
            addCriterion("labela is not null");
            return (Criteria) this;
        }

        public Criteria andLabelaEqualTo(String value) {
            addCriterion("labela =", value, "labela");
            return (Criteria) this;
        }

        public Criteria andLabelaNotEqualTo(String value) {
            addCriterion("labela <>", value, "labela");
            return (Criteria) this;
        }

        public Criteria andLabelaGreaterThan(String value) {
            addCriterion("labela >", value, "labela");
            return (Criteria) this;
        }

        public Criteria andLabelaGreaterThanOrEqualTo(String value) {
            addCriterion("labela >=", value, "labela");
            return (Criteria) this;
        }

        public Criteria andLabelaLessThan(String value) {
            addCriterion("labela <", value, "labela");
            return (Criteria) this;
        }

        public Criteria andLabelaLessThanOrEqualTo(String value) {
            addCriterion("labela <=", value, "labela");
            return (Criteria) this;
        }

        public Criteria andLabelaLike(String value) {
            addCriterion("labela like", value, "labela");
            return (Criteria) this;
        }

        public Criteria andLabelaNotLike(String value) {
            addCriterion("labela not like", value, "labela");
            return (Criteria) this;
        }

        public Criteria andLabelaIn(List<String> values) {
            addCriterion("labela in", values, "labela");
            return (Criteria) this;
        }

        public Criteria andLabelaNotIn(List<String> values) {
            addCriterion("labela not in", values, "labela");
            return (Criteria) this;
        }

        public Criteria andLabelaBetween(String value1, String value2) {
            addCriterion("labela between", value1, value2, "labela");
            return (Criteria) this;
        }

        public Criteria andLabelaNotBetween(String value1, String value2) {
            addCriterion("labela not between", value1, value2, "labela");
            return (Criteria) this;
        }

        public Criteria andLabelbIsNull() {
            addCriterion("labelb is null");
            return (Criteria) this;
        }

        public Criteria andLabelbIsNotNull() {
            addCriterion("labelb is not null");
            return (Criteria) this;
        }

        public Criteria andLabelbEqualTo(String value) {
            addCriterion("labelb =", value, "labelb");
            return (Criteria) this;
        }

        public Criteria andLabelbNotEqualTo(String value) {
            addCriterion("labelb <>", value, "labelb");
            return (Criteria) this;
        }

        public Criteria andLabelbGreaterThan(String value) {
            addCriterion("labelb >", value, "labelb");
            return (Criteria) this;
        }

        public Criteria andLabelbGreaterThanOrEqualTo(String value) {
            addCriterion("labelb >=", value, "labelb");
            return (Criteria) this;
        }

        public Criteria andLabelbLessThan(String value) {
            addCriterion("labelb <", value, "labelb");
            return (Criteria) this;
        }

        public Criteria andLabelbLessThanOrEqualTo(String value) {
            addCriterion("labelb <=", value, "labelb");
            return (Criteria) this;
        }

        public Criteria andLabelbLike(String value) {
            addCriterion("labelb like", value, "labelb");
            return (Criteria) this;
        }

        public Criteria andLabelbNotLike(String value) {
            addCriterion("labelb not like", value, "labelb");
            return (Criteria) this;
        }

        public Criteria andLabelbIn(List<String> values) {
            addCriterion("labelb in", values, "labelb");
            return (Criteria) this;
        }

        public Criteria andLabelbNotIn(List<String> values) {
            addCriterion("labelb not in", values, "labelb");
            return (Criteria) this;
        }

        public Criteria andLabelbBetween(String value1, String value2) {
            addCriterion("labelb between", value1, value2, "labelb");
            return (Criteria) this;
        }

        public Criteria andLabelbNotBetween(String value1, String value2) {
            addCriterion("labelb not between", value1, value2, "labelb");
            return (Criteria) this;
        }

        public Criteria andLabelcIsNull() {
            addCriterion("labelc is null");
            return (Criteria) this;
        }

        public Criteria andLabelcIsNotNull() {
            addCriterion("labelc is not null");
            return (Criteria) this;
        }

        public Criteria andLabelcEqualTo(String value) {
            addCriterion("labelc =", value, "labelc");
            return (Criteria) this;
        }

        public Criteria andLabelcNotEqualTo(String value) {
            addCriterion("labelc <>", value, "labelc");
            return (Criteria) this;
        }

        public Criteria andLabelcGreaterThan(String value) {
            addCriterion("labelc >", value, "labelc");
            return (Criteria) this;
        }

        public Criteria andLabelcGreaterThanOrEqualTo(String value) {
            addCriterion("labelc >=", value, "labelc");
            return (Criteria) this;
        }

        public Criteria andLabelcLessThan(String value) {
            addCriterion("labelc <", value, "labelc");
            return (Criteria) this;
        }

        public Criteria andLabelcLessThanOrEqualTo(String value) {
            addCriterion("labelc <=", value, "labelc");
            return (Criteria) this;
        }

        public Criteria andLabelcLike(String value) {
            addCriterion("labelc like", value, "labelc");
            return (Criteria) this;
        }

        public Criteria andLabelcNotLike(String value) {
            addCriterion("labelc not like", value, "labelc");
            return (Criteria) this;
        }

        public Criteria andLabelcIn(List<String> values) {
            addCriterion("labelc in", values, "labelc");
            return (Criteria) this;
        }

        public Criteria andLabelcNotIn(List<String> values) {
            addCriterion("labelc not in", values, "labelc");
            return (Criteria) this;
        }

        public Criteria andLabelcBetween(String value1, String value2) {
            addCriterion("labelc between", value1, value2, "labelc");
            return (Criteria) this;
        }

        public Criteria andLabelcNotBetween(String value1, String value2) {
            addCriterion("labelc not between", value1, value2, "labelc");
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
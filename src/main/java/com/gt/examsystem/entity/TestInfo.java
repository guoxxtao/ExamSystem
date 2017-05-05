package com.gt.examsystem.entity;

/**
 * Created by guotao on 2017/5/3.
 */
public class TestInfo {

    private int testId;

    private Integer testAge;

    private String testName;

    public int getTestId() {
        return testId;
    }

    public void setTestId( int testId ) {
        this.testId = testId;
    }

    public Integer getTestAge() {
        return testAge;
    }

    public void setTestAge( Integer testAge ) {
        this.testAge = testAge;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName( String testName ) {
        this.testName = testName;
    }

    @Override
    public String toString() {
        return "TestInfo [id=" + testId + ", userName=" + testName + ", age=" + testAge + "]";
    }
}

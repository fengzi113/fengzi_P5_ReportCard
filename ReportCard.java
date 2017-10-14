package com.example.android.miwok;

/**
 * {@link ReportCard}
 * Each object has 3 properties: chineseScore, mathScore, and englishScore
 */

public class ReportCard {
    // 非公有，非静态字段命名以m开头
    private double mChineseScore;
    private double mMathScore;
    private double mEnglishScore;
    //常量 全部字母大写，用下划线分隔单词
    static final double PASS_SCORE = 60;
    static final String PASS = "合格";
    static final String FAIL = "不合格";

    //    构造函数
    public ReportCard(double chineseScore, double mathScore, double englishScore) {
        mChineseScore = chineseScore;
        mMathScore = mathScore;
        mEnglishScore = englishScore;
    }

    //    设置各科分数
    public void setmChineseScore(double chineseScore) {
        mChineseScore = chineseScore;
    }

    public void setmMathScore(double mathScore) {
        mMathScore = mathScore;
    }

    public void setEnglishScore(double englishScore) {
        mEnglishScore = englishScore;
    }

    //   获取各科分数
    public double getmChineseScore() {
        return mChineseScore;
    }

    public double getmMathScore() {
        return mMathScore;
    }

    public double getmEnglishScore() {
        return mEnglishScore;
    }

    //   获取各科评定
    public String getChineseGrade() {
        if (mChineseScore >= PASS_SCORE) {
            return PASS;
        } else {
            return FAIL;
        }
    }

    public String getMathGrade() {
        if (mMathScore >= PASS_SCORE) {
            return PASS;
        } else {
            return FAIL;
        }
    }

    public String getEnglishGrade() {
        if (mEnglishScore >= PASS_SCORE) {
            return PASS;
        } else {
            return FAIL;
        }
    }

    //    返回以用户可读的字符串
    @Override
    public String toString() {
        return "成绩评价{" +
                "语文： " + getmChineseScore() + "~" + getChineseGrade() +
                ", 数学： " + getmMathScore() + "~" + getMathGrade() +
                ", 英语： " + getmEnglishScore() + "~" + getEnglishGrade() +
                '}';
    }
}

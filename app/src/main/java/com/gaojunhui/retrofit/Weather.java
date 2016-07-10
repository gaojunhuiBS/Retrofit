package com.gaojunhui.retrofit;

import java.util.List;

/**
 * Created by Administrator on 2016/7/10.
 */
public class Weather {

    /**
     * msg : success
     * result : [{"airCondition":"良","city":"南京","coldIndex":"低发期","date":"2016-07-10","distrct":"南京","dressingIndex":"薄短袖类","exerciseIndex":"不适宜","future":[{"date":"2016-07-10","dayTime":"雷阵雨","night":"雷阵雨","temperature":"28°C / 24°C","week":"今天","wind":"东风 4～5级"},{"date":"2016-07-11","dayTime":"雷阵雨","night":"多云","temperature":"30°C / 23°C","week":"星期一","wind":"东北风 4～5级"},{"date":"2016-07-12","dayTime":"多云","night":"雷阵雨","temperature":"32°C / 26°C","week":"星期二","wind":"西北风 3～4级"},{"date":"2016-07-13","dayTime":"雷阵雨","night":"中雨","temperature":"30°C / 26°C","week":"星期三","wind":"南风 小于3级"},{"date":"2016-07-14","dayTime":"中雨","night":"中雨","temperature":"29°C / 25°C","week":"星期四","wind":"南风 3～4级"},{"date":"2016-07-15","dayTime":"中雨","night":"雷阵雨","temperature":"29°C / 24°C","week":"星期五","wind":"西南风 3～4级"},{"date":"2016-07-16","dayTime":"阵雨","night":"局部多云","temperature":"27°C / 21°C","week":"星期六","wind":"南风 2级"},{"date":"2016-07-17","dayTime":"少云","night":"局部多云","temperature":"29°C / 22°C","week":"星期日","wind":"西风 1级"},{"date":"2016-07-18","dayTime":"雷雨","night":"雷雨","temperature":"29°C / 22°C","week":"星期一","wind":"东风 2级"},{"date":"2016-07-19","dayTime":"雷雨","night":"局部多云","temperature":"28°C / 22°C","week":"星期二","wind":"东风 3级"}],"humidity":"湿度：81%","pollutionIndex":"60","province":"江苏","sunrise":"05:07","sunset":"19:14","temperature":"27℃","time":"15:12","updateTime":"20160710152729","washIndex":"不适宜","weather":"阴","week":"周日","wind":"东风3级"}]
     * retCode : 200
     */

    private String msg;
    private String retCode;
    /**
     * airCondition : 良
     * city : 南京
     * coldIndex : 低发期
     * date : 2016-07-10
     * distrct : 南京
     * dressingIndex : 薄短袖类
     * exerciseIndex : 不适宜
     * future : [{"date":"2016-07-10","dayTime":"雷阵雨","night":"雷阵雨","temperature":"28°C / 24°C","week":"今天","wind":"东风 4～5级"},{"date":"2016-07-11","dayTime":"雷阵雨","night":"多云","temperature":"30°C / 23°C","week":"星期一","wind":"东北风 4～5级"},{"date":"2016-07-12","dayTime":"多云","night":"雷阵雨","temperature":"32°C / 26°C","week":"星期二","wind":"西北风 3～4级"},{"date":"2016-07-13","dayTime":"雷阵雨","night":"中雨","temperature":"30°C / 26°C","week":"星期三","wind":"南风 小于3级"},{"date":"2016-07-14","dayTime":"中雨","night":"中雨","temperature":"29°C / 25°C","week":"星期四","wind":"南风 3～4级"},{"date":"2016-07-15","dayTime":"中雨","night":"雷阵雨","temperature":"29°C / 24°C","week":"星期五","wind":"西南风 3～4级"},{"date":"2016-07-16","dayTime":"阵雨","night":"局部多云","temperature":"27°C / 21°C","week":"星期六","wind":"南风 2级"},{"date":"2016-07-17","dayTime":"少云","night":"局部多云","temperature":"29°C / 22°C","week":"星期日","wind":"西风 1级"},{"date":"2016-07-18","dayTime":"雷雨","night":"雷雨","temperature":"29°C / 22°C","week":"星期一","wind":"东风 2级"},{"date":"2016-07-19","dayTime":"雷雨","night":"局部多云","temperature":"28°C / 22°C","week":"星期二","wind":"东风 3级"}]
     * humidity : 湿度：81%
     * pollutionIndex : 60
     * province : 江苏
     * sunrise : 05:07
     * sunset : 19:14
     * temperature : 27℃
     * time : 15:12
     * updateTime : 20160710152729
     * washIndex : 不适宜
     * weather : 阴
     * week : 周日
     * wind : 东风3级
     */

    private List<ResultBean> result;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        private String airCondition;
        private String city;
        private String coldIndex;
        private String date;
        private String distrct;
        private String dressingIndex;
        private String exerciseIndex;
        private String humidity;
        private String pollutionIndex;
        private String province;
        private String sunrise;
        private String sunset;
        private String temperature;
        private String time;
        private String updateTime;
        private String washIndex;
        private String weather;
        private String week;
        private String wind;
        /**
         * date : 2016-07-10
         * dayTime : 雷阵雨
         * night : 雷阵雨
         * temperature : 28°C / 24°C
         * week : 今天
         * wind : 东风 4～5级
         */

        private List<FutureBean> future;

        public String getAirCondition() {
            return airCondition;
        }

        public void setAirCondition(String airCondition) {
            this.airCondition = airCondition;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getColdIndex() {
            return coldIndex;
        }

        public void setColdIndex(String coldIndex) {
            this.coldIndex = coldIndex;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getDistrct() {
            return distrct;
        }

        public void setDistrct(String distrct) {
            this.distrct = distrct;
        }

        public String getDressingIndex() {
            return dressingIndex;
        }

        public void setDressingIndex(String dressingIndex) {
            this.dressingIndex = dressingIndex;
        }

        public String getExerciseIndex() {
            return exerciseIndex;
        }

        public void setExerciseIndex(String exerciseIndex) {
            this.exerciseIndex = exerciseIndex;
        }

        public String getHumidity() {
            return humidity;
        }

        public void setHumidity(String humidity) {
            this.humidity = humidity;
        }

        public String getPollutionIndex() {
            return pollutionIndex;
        }

        public void setPollutionIndex(String pollutionIndex) {
            this.pollutionIndex = pollutionIndex;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getSunrise() {
            return sunrise;
        }

        public void setSunrise(String sunrise) {
            this.sunrise = sunrise;
        }

        public String getSunset() {
            return sunset;
        }

        public void setSunset(String sunset) {
            this.sunset = sunset;
        }

        public String getTemperature() {
            return temperature;
        }

        public void setTemperature(String temperature) {
            this.temperature = temperature;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public String getWashIndex() {
            return washIndex;
        }

        public void setWashIndex(String washIndex) {
            this.washIndex = washIndex;
        }

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public String getWeek() {
            return week;
        }

        public void setWeek(String week) {
            this.week = week;
        }

        public String getWind() {
            return wind;
        }

        public void setWind(String wind) {
            this.wind = wind;
        }

        public List<FutureBean> getFuture() {
            return future;
        }

        public void setFuture(List<FutureBean> future) {
            this.future = future;
        }

        public static class FutureBean {
            private String date;
            private String dayTime;
            private String night;
            private String temperature;
            private String week;
            private String wind;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getDayTime() {
                return dayTime;
            }

            public void setDayTime(String dayTime) {
                this.dayTime = dayTime;
            }

            public String getNight() {
                return night;
            }

            public void setNight(String night) {
                this.night = night;
            }

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }
        }
    }
}

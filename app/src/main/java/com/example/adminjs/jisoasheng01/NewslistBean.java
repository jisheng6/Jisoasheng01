package com.example.adminjs.jisoasheng01;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class NewslistBean {
        /**
         * ctime : 2017-10-26 07:53
         * title : 如何看待历史剧？ 媒体：把握好不虚与不拘
         * description : 搜狐社会
         * picUrl : 
         * url : http://news.sohu.com/20171026/n519914029.shtml
         */

        private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        @Generated(hash = 86141965)
        public NewslistBean(String ctime, String title, String description,
                String picUrl, String url) {
            this.ctime = ctime;
            this.title = title;
            this.description = description;
            this.picUrl = picUrl;
            this.url = url;
        }

        @Generated(hash = 923354944)
        public NewslistBean() {
        }

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    @Override
    public String toString() {
        return "NewslistBean{" +
                "ctime='" + ctime + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", picUrl='" + picUrl + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
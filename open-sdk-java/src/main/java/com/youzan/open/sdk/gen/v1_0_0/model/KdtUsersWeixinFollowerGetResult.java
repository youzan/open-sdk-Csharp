package com.youzan.open.sdk.gen.v1_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.model.FileParams;
import com.youzan.open.sdk.model.APIResult;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class KdtUsersWeixinFollowerGetResult implements APIResult {

        private CrmWeixinFans user;
    
    
    public void setUser(CrmWeixinFans user) {
        this.user = user;
    }

    public CrmWeixinFans getUser() {
        return this.user;
    }

    
        public static class CrmUserTag {
                private Long id;
                private String name;
        
                public void setId(Long id) {
            this.id = id;
        }

        public Long getId() {
            return this.id;
        }
                public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
        
    }
        public static class CrmFansLevel {
                private Long levelId;
                private String levelName;
        
                public void setLevelId(Long levelId) {
            this.levelId = levelId;
        }

        public Long getLevelId() {
            return this.levelId;
        }
                public void setLevelName(String levelName) {
            this.levelName = levelName;
        }

        public String getLevelName() {
            return this.levelName;
        }
        
    }
        public static class CrmWeixinFans {
                private Long userId;
                private String weixinOpenid;
                private String nick;
                private String avatar;
                private Date followTime;
                private String sex;
                private String province;
                private String city;
                private Long points;
                private Long tradedNum;
                private Float tradedMoney;
                private CrmUserTag[] tags;
                private CrmFansLevel levelInfo;
                private Boolean isFollow;
        
                public void setUserId(Long userId) {
            this.userId = userId;
        }

        public Long getUserId() {
            return this.userId;
        }
                public void setWeixinOpenid(String weixinOpenid) {
            this.weixinOpenid = weixinOpenid;
        }

        public String getWeixinOpenid() {
            return this.weixinOpenid;
        }
                public void setNick(String nick) {
            this.nick = nick;
        }

        public String getNick() {
            return this.nick;
        }
                public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getAvatar() {
            return this.avatar;
        }
                public void setFollowTime(Date followTime) {
            this.followTime = followTime;
        }

        public Date getFollowTime() {
            return this.followTime;
        }
                public void setSex(String sex) {
            this.sex = sex;
        }

        public String getSex() {
            return this.sex;
        }
                public void setProvince(String province) {
            this.province = province;
        }

        public String getProvince() {
            return this.province;
        }
                public void setCity(String city) {
            this.city = city;
        }

        public String getCity() {
            return this.city;
        }
                public void setPoints(Long points) {
            this.points = points;
        }

        public Long getPoints() {
            return this.points;
        }
                public void setTradedNum(Long tradedNum) {
            this.tradedNum = tradedNum;
        }

        public Long getTradedNum() {
            return this.tradedNum;
        }
                public void setTradedMoney(Float tradedMoney) {
            this.tradedMoney = tradedMoney;
        }

        public Float getTradedMoney() {
            return this.tradedMoney;
        }
                public void setTags(CrmUserTag[] tags) {
            this.tags = tags;
        }

        public CrmUserTag[] getTags() {
            return this.tags;
        }
                public void setLevelInfo(CrmFansLevel levelInfo) {
            this.levelInfo = levelInfo;
        }

        public CrmFansLevel getLevelInfo() {
            return this.levelInfo;
        }
                public void setIsFollow(Boolean isFollow) {
            this.isFollow = isFollow;
        }

        public Boolean getIsFollow() {
            return this.isFollow;
        }
        
    }
    
}
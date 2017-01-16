package com.com.baseapp.model.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by tp on 2016/12/21.
 */

public class LoginBean implements Serializable{


    /**
     * ResultCode : 1000
     * Message : 成功
     * Data : {"id":1023738,"storeMasterGuid":"1ed2a0e22b6e43b184cac857736a4f5b","storeMasterId":194358,"storeMasterEmpCode":"zxwp001","storeName":"13888678188","themeId":0,"storeLogo":"http://vpclub-img.oss-cn-shenzhen.aliyuncs.com/upload/Storelogo/100000015logo.png","weixinNum":"","otherContacts":"","isShowPhoneNo":0,"operatingTime":20,"storeUrl":"http://y3demoh5.vpclub.cn/ydsaleclub/ztewd/1023738.html","levelNo":0,"Status":1,"levelName":"初级","saleAmount":0,"nextLevelSaleAmount":0,"differNextLevelSaleAmount":0,"myOrder":0,"storesNumber":30519,"total":30519,"profit":0,"imAccount":"","imPassword":"","voipAccount":"","voipPassword":"","bankBinded":"false","token":"D30EE3C78A6011FF8D08D70F1755EEA02EF94C72DE7931CE253DD82A08D04B2BFF1DF47D4D11D047","myorderrate":"0.00%","IdentityId":0,"BuyerPhone":"","BuyerToken":"","BuyerBindStoreId":0,"ChannelId":"","CmccParam":{"SystemSign":"11","BCharge":"4001","BChargeName":"CZ","ChannelId":"","CityChannelId":"","CityCodeId":"","EmpCode":"zxwp001"},"jpushid":"1ed2a0e22b6e43b184cac857736a4f5b","jpushGroupId":"580","address":"","IsDirectSaler":5,"descript":"","ShareRebate":5,"LocOfPhone":"昆明","ParentStoreId":0}
     */

    @SerializedName("ResultCode")
    public int ResultCode;
    @SerializedName("Message")
    public String Message;
    @SerializedName("Data")
    public DataEntity Data;

    public static class DataEntity {
        /**
         * id : 1023738
         * storeMasterGuid : 1ed2a0e22b6e43b184cac857736a4f5b
         * storeMasterId : 194358
         * storeMasterEmpCode : zxwp001
         * storeName : 13888678188
         * themeId : 0
         * storeLogo : http://vpclub-img.oss-cn-shenzhen.aliyuncs.com/upload/Storelogo/100000015logo.png
         * weixinNum :
         * otherContacts :
         * isShowPhoneNo : 0
         * operatingTime : 20
         * storeUrl : http://y3demoh5.vpclub.cn/ydsaleclub/ztewd/1023738.html
         * levelNo : 0
         * Status : 1
         * levelName : 初级
         * saleAmount : 0.0
         * nextLevelSaleAmount : 0.0
         * differNextLevelSaleAmount : 0.0
         * myOrder : 0
         * storesNumber : 30519
         * total : 30519
         * profit : 0.0
         * imAccount :
         * imPassword :
         * voipAccount :
         * voipPassword :
         * bankBinded : false
         * token : D30EE3C78A6011FF8D08D70F1755EEA02EF94C72DE7931CE253DD82A08D04B2BFF1DF47D4D11D047
         * myorderrate : 0.00%
         * IdentityId : 0
         * BuyerPhone :
         * BuyerToken :
         * BuyerBindStoreId : 0
         * ChannelId :
         * CmccParam : {"SystemSign":"11","BCharge":"4001","BChargeName":"CZ","ChannelId":"","CityChannelId":"","CityCodeId":"","EmpCode":"zxwp001"}
         * jpushid : 1ed2a0e22b6e43b184cac857736a4f5b
         * jpushGroupId : 580
         * address :
         * IsDirectSaler : 5
         * descript :
         * ShareRebate : 5
         * LocOfPhone : 昆明
         * ParentStoreId : 0
         */

        @SerializedName("id")
        public int id;
        @SerializedName("storeMasterGuid")
        public String storeMasterGuid;
        @SerializedName("storeMasterId")
        public int storeMasterId;
        @SerializedName("storeMasterEmpCode")
        public String storeMasterEmpCode;
        @SerializedName("storeName")
        public String storeName;
        @SerializedName("themeId")
        public int themeId;
        @SerializedName("storeLogo")
        public String storeLogo;
        @SerializedName("weixinNum")
        public String weixinNum;
        @SerializedName("otherContacts")
        public String otherContacts;
        @SerializedName("isShowPhoneNo")
        public int isShowPhoneNo;
        @SerializedName("operatingTime")
        public int operatingTime;
        @SerializedName("storeUrl")
        public String storeUrl;
        @SerializedName("levelNo")
        public int levelNo;
        @SerializedName("Status")
        public int Status;
        @SerializedName("levelName")
        public String levelName;
        @SerializedName("saleAmount")
        public double saleAmount;
        @SerializedName("nextLevelSaleAmount")
        public double nextLevelSaleAmount;
        @SerializedName("differNextLevelSaleAmount")
        public double differNextLevelSaleAmount;
        @SerializedName("myOrder")
        public int myOrder;
        @SerializedName("storesNumber")
        public int storesNumber;
        @SerializedName("total")
        public int total;
        @SerializedName("profit")
        public double profit;
        @SerializedName("imAccount")
        public String imAccount;
        @SerializedName("imPassword")
        public String imPassword;
        @SerializedName("voipAccount")
        public String voipAccount;
        @SerializedName("voipPassword")
        public String voipPassword;
        @SerializedName("bankBinded")
        public String bankBinded;
        @SerializedName("token")
        public String token;
        @SerializedName("myorderrate")
        public String myorderrate;
        @SerializedName("IdentityId")
        public int IdentityId;
        @SerializedName("BuyerPhone")
        public String BuyerPhone;
        @SerializedName("BuyerToken")
        public String BuyerToken;
        @SerializedName("BuyerBindStoreId")
        public int BuyerBindStoreId;
        @SerializedName("ChannelId")
        public String ChannelId;
        @SerializedName("CmccParam")
        public CmccParamEntity CmccParam;
        @SerializedName("jpushid")
        public String jpushid;
        @SerializedName("jpushGroupId")
        public String jpushGroupId;
        @SerializedName("address")
        public String address;
        @SerializedName("IsDirectSaler")
        public int IsDirectSaler;
        @SerializedName("descript")
        public String descript;
        @SerializedName("ShareRebate")
        public int ShareRebate;
        @SerializedName("LocOfPhone")
        public String LocOfPhone;
        @SerializedName("ParentStoreId")
        public int ParentStoreId;

        public static class CmccParamEntity {
            /**
             * SystemSign : 11
             * BCharge : 4001
             * BChargeName : CZ
             * ChannelId :
             * CityChannelId :
             * CityCodeId :
             * EmpCode : zxwp001
             */

            @SerializedName("SystemSign")
            public String SystemSign;
            @SerializedName("BCharge")
            public String BCharge;
            @SerializedName("BChargeName")
            public String BChargeName;
            @SerializedName("ChannelId")
            public String ChannelId;
            @SerializedName("CityChannelId")
            public String CityChannelId;
            @SerializedName("CityCodeId")
            public String CityCodeId;
            @SerializedName("EmpCode")
            public String EmpCode;
        }
    }


    @Override
    public String toString() {
        return "LoginBean{" +
                "ResultCode=" + ResultCode +
                ", Message='" + Message + '\'' +
                ", Data=" + Data +
                '}';
    }
}

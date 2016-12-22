package com.example.retrofitokrxtest.xsbtest;

import android.os.Environment;

public class Contents {

    public static final String BASE_URL = "https://httpbin.org/";

    public static final String COOKIE_TEALINK_XML   = "tealink_xml";

    public static final String COOKIE_START_FIRST   = "start_first";
    
    // public static final String
    // url="http://zngooserver.xicp.net:82/tools/AppService.asmx";
    // public static final String url_update="http://192.168.1.160:82/";

    // public static final String
    public static final String URL_HTTP             = Config.getInstance().getProp("url_http");
    public static final String PIC_URL_HTTP         = Config.getInstance().getProp("pic_url_http");
    public static final String ACTIVITY_URL_HTTP    = Config.getInstance().getProp("activity_url_http");
    public static final String url_update           = Config.getInstance().getProp("url_update");
    public static final String url_version          = Config.getInstance().getProp("url_version");
    public static final String url_search          = Config.getInstance().getProp("url_search");
    public static final String url_rr_search          = Config.getInstance().getProp("url_rr_search");

    
    public static final String H5_URL               = Config.getInstance().getProp("url_h5");
 
    public static String       VERSION_CODE         = "";
    // "http://vpclub.octech.com.cn/";

    // public static final String
    // url="http://192.168.1.101:13005/tools/AppService.asmx";
    // public static final String url_update="http://192.168.1.101:13005/";

    /** 目录根路径 */
    public static final String HOME_DIR             = Environment.getExternalStorageDirectory() + "/ydxsb/";
    public static final String imagepath            = HOME_DIR + "image/";

    public static final String imagepathmemo        = HOME_DIR + "image/memo/";
    public static final String apkdir               = HOME_DIR + "download/";
    public static final String apkpath              = apkdir + "ydxsb.apk";
    public static final String faceImage            = "faceImage.jpg";
    public static final String wishImage            = "wish.jpg";
    public static final String UILCacheDir          = "ydxsb/image/";

    public static final String HotTimeStart         = "2014-11-6 08:00:00";
    public static final String HotTimeEnd           = "2014-11-10 23:59:59";
    // public static final String SECRET = "zy20060179";
    // public static final String SECRET = "pFE3ZMW6EJSXtMexMWjSaiQmtTYHFGPC";
    // public static final String APPKEY = "88888888";
    // public static final String APPKEY = "24927573 ";
    
    public static final String SECRET               = "90E24EFBA37A760C";
    public static final String APPKEY               = "100000015";
    
//    public static final String SECRET               = "C6D58B296BE90FDF";
//    public static final String APPKEY               = "100000029";
 
    public static String       TOKEN                = "";
    public static final String SUCCESS_CODE         = "1000";
    public static final String TIMEOUT_CODE         = "1009";
    public static final String PRAISESUCCESS_STATUS = "1";

    // public static final String
    // url="http://zngooserver.xicp.net:82/tools/AppService.asmx";
    // public static final String url_update="http://192.168.1.160:82/";

    // public static final String
    // url="http://115.29.234.137/tools/AppService.asmx";
    public static final String contacturl           = "http://yphh5.vpclub.cn/html/rua_yph.html";
/*    public static final String URL_HTTP             = Config.getInstance().getProp("url_http");
    public static final String PIC_URL_HTTP         = Config.getInstance().getProp("pic_url_http");
    public static final String ACTIVITY_URL_HTTP    = Config.getInstance().getProp("activity_url_http");
    // "http://vpclub.octech.com.cn/tools/AppService.asmx";
    public static final String url_update           = Config.getInstance().getProp("url_update");
    public static final String url_version          = Config.getInstance().getProp("url_version");

    public static final String PA_SID               = "2088611803113521";
    public static final String PA_SELLERID          = "zheng.qiang110@zte.com.cn";
    public static final String PA_RSA_PRIVATE       = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBANnWyqjdbBGZLzMwLCp83j/LD6F62OPQmHNpwXUE2ao0TkzEocRuoB8WNVsexrJrOo7FY+QmgCbPGYLLC0jYyUoXi20V2HowqoANrFdrAYPByJsCNIo7WPzx38FET+YwHPl6mYKrl2P3+W4oPCZJ3yam86MZXgDI8bZ1NJ4SJ3KZAgMBAAECgYEAslZzIV3svFeRWbHFZp9FgCpoyIV/DLrYJBxfYcKvw/UAaT7NRLhgZDLVSZzfhG/ex8V3qu+OGLeRpg8+VMwNtRPd/jV0dsIXKWWnnPpH+/m9m4jT/4SSF50+ZTjUKgLqfUfxO8c2mkCM3QwaX0pYYmEeDi2AJyR9O2q/Gg8G5AECQQD+ua/eUTQPpEixUI8cjWVb8NIBmlAN9d9nIPG/fRhmVp56e/r0YTn3duU6uD99PiRz1o9ONe6sVagNMhjte2sZAkEA2u3aE7TPqXjxONhNr8zGYY9oDhCW+nROTdkQv2LDOBn/SFLC38fu1MPgWX10GdiYw3wM98NFllwSfZ8vajSzgQJAZA9tFlevq7VNGNocXYrtlgAzfo2vhMxgxZIbZK0vOIQuHM829Wh77Mm3oileR0Rx7U8LXB2zc97x9L0JLcCdgQJBAMBukuIBawqWkMkbb2WYA8ObLqY2NM7eTjmlE1B2Ogvk5funKz1R2n7P0TI30EYrmVMyhZ9913urYGFk+2NKAYECQDWKvSgRzw+4v8Bn/TlUB8akR/BuM/QpEv5DjjoUyBstUq7fpidZ79e7ldcAffPEQAH62P3Ay6wo+yAHj5hk3BQ=";

    public static String       VERSION_CODE         = "";*/
    public static boolean      hideRebate           = false;
    // "http://vpclub.octech.com.cn/";

    // public static final String
    // url="http://192.168.1.101:13005/tools/AppService.asmx";
    // public static final String url_update="http://192.168.1.101:13005/";

    /** 目录根路径 */
/*    public static final String HOME_DIR             = Environment.getExternalStorageDirectory() + "/yupinhui/";
    public static final String imagepath            = HOME_DIR + "image/";
    public static final String UILCacheDir          = "yupinhui/image/";

    public static final String imagepathmemo        = HOME_DIR + "image/memo/";
    public static final String apkdir               = HOME_DIR + "download/";
    public static final String apkpath              = apkdir + "yupinhui.apk";
    public static final String faceImage            = "faceImage.jpg";
    public static final String wishImage            = "wish.jpg";

    public static final String HotTimeStart         = "2014-11-6 08:00:00";
    public static final String HotTimeEnd           = "2014-11-10 23:59:59";
    // public static final String SECRET = "zy20060179";
    public static final String SECRET               = "C6D58B296BE90FDF";
    // public static final String APPKEY = "88888888";
    public static final String APPKEY               = "100000029";
    public static String       TOKEN                = "";
    public static final String SUCCESS_CODE         = "1000";
    public static final String TIMEOUT_CODE         = "1009";
    public static final String PRAISESUCCESS_STATUS = "1";*/
    public static final String weixin_appid         = "wx2743cd1e1fecc30d";
    // public static final String http_fail = "网络请求超时";

    public class Url{
        public static final String SallerBoardList                         = "/StatisticServer/Statistic/SallerBoardList";

        public static final String CheckVersionForIos                      = "/SoapApiServer/Version/CheckVersionForIos";
        public static final String VerifyAccount                           = "/StoreServer/Store/VerifyAccount";
        public static final String VerifyPhoneNumber                       = "/SmsServer/SMS/SendSmsCode";
        public static final String GetVeriyCode                            = "/SmsServer/SMS/SendSmsCode";
        public static final String GetVeriyCode4g                          = "/VeriCodeServer/VeriCode/SendSMSCode";
        public static final String ValidateContract                        = "/VeriCodeServer/VeriCode/ValidateContract";
        public static final String VerfySignCode                           = "/SmsServer/SMS/VerifySignCode";
        public static final String IsYIDONGNumber                          = "/VeriCodeServer/VeriCode/IsYIDONGNumber";
        public static final String GetPreviewUrl                           = "/WXServer/WxServer/GetGuanYiGuanUrl";
        public static final String GetPerfectMobileList                           = "/ProdectServer/product/GetPerfectMobileList";
        // 微钱包
        public static final String GainBindBankList                        = "/FinanceServer/Verify/GainBindBankList";
        public static final String GainBindBankById                        = "/FinanceServer/Verify/GainBindBankById";
        public static final String SetBindBank                             = "/FinanceServer/Verify/SetBindBank";
        public static final String ValidBindBank                           = "/FinanceServer/Verify/ValidBindBank";
        public static final String WithdrawaBalance                        = "/FinanceServer/Finance/WithdrawaBalance";
        // 微钱包》实名认证
        public static final String RealNameAuthentication                  = "/FinanceServer/Verify/RealNameAuthentication";
        public static final String GainRealNameAuthentication              = "/FinanceServer/Verify/GainRealNameAuthentication";
        // public static final String VerifyAccount =
        // "/StoreServer/Store/VerifyAccount";
        // Reg流程：
        public static final String SendSmsCode                             = "/SmsServer/SMS/SendSmsCode";                                     // /:
                                                                                                                                                // by
                                                                                                                                                // Grow
        public static final String VerifySignCode                          = "/SmsServer/SMS/VerifySignCode";                                  // /:
                                                                                                                                                // by
                                                                                                                                                // Grow
        public static final String ResetPassword                           = "/StoreServer/StoreSet/ResetPassword";                            // /:
                                                                                                                                                // by
                                                                                                                                                // Grow
        public static final String ChangePassword                          = "/StoreServer/StoreSet/ChangePassword";                           // /:
                                                                                                                                                // by
                                                                                                                                                // Grow
        public static final String RegisterStore                           = "/StoreServer/Store/RegisterStore";                               // /:
                                                                                                                                                // by
                                                                                                                                                // Grow

        public static final String EditStore                               = "/StoreServer/Store/EditStore";
        public static final String GainMyProfile                           = "/StoreServer/StoreMasterInfo/GainMyProfile";
        public static final String ModifyProfile                           = "/StoreServer/StoreMasterInfo/ModifyProfile";
        public static final String MyProfit                                = "/StoreServer/Store/MyProfit";
        public static final String GetProfitDetail                         = "/StoreServer/Store/MyProfitDetails";

        public static final String GetStoreProductList                     = "/ProductServer/Product/GetStoreProductList";
        public static final String DeleteProduct                           = "/ProductServer/Product/DeleteProduct";
        public static final String SearchWithAllProducts                   = "/ProductServer/Product/SearchWithAllProducts";
        public static final String GainAdvertisementList                   = "/ProductServer/Artivities/GainAdvertisementList";
        public static final String GetSpecialActivitiesList                   = "/ProductServer/Artivities/GetSpecialActivitiesList";
        public static final String GetProductById                          = "/ProductServer/Product/GetProductById";
        public static final String GainActivitiesWithBaoKuanOrTeHui        = "/ProductServer/Artivities/GainActivitiesWithBaoKuanOrTeHui";
        public static final String TodayRecommed                           = "/ProductServer/Product/TodayRecommed";
        public static final String GetCategory                             = "/ProductServer/Product/GetCategory";
        public static final String GainActivityById                        = "/ProductServer/Artivities/GainActivityById";
        public static final String SHOP_GOODS_TUIJIAN                      = "/ProductServer/ProductHandle/Recommend";

        
        public static final String GainActivityByPageAndId                 = "/ProductServer/Artivities/GainActivityByPageAndId";

        public static final String dailyTVisits                            = "/ReportServer/Report/DailyTVisits";

        // wh start
        public static final String GainCartList                            = "/ProductServer/ShopCart/GainCartList";
        public static final String ModifyPrpductNum                        = "/ProductServer/ShopCart/ModifyPrpductNum";
        public static final String GainBookList                            = "/StoreServer/Store/GainBook";
        public static final String EditBook                                = "/StoreServer/Store/EditBook";
        public static final String CancelBook                              = "/StoreServer/Store/CancelBook";
        public static final String GainAreaList                            = "/SoapApiServer/CountryAreaManar/GainAreaList";
        public static final String SettingDefaultBook                      = "/StoreServer/Store/SettingDefaultBook";
        public static final String ReportDebug                             = "/SoapApiServer/Test/ReportDebug";
        public static final String ClearShopCartByProductId                = "/ProductServer/ShopCart/ClearShopCartByProductId";
        public static final String ClearShopCart                           = "/ProductServer/ShopCart/ClearShopCart";
        public static final String SetProductNum                           = "/ProductServer/ShopCart/SetPrpductNum";

        public static final String ChangeEmail                             = "/StoreServer/StoreSet/ChangeEmail";
        // end

        public static final String GetSalesOrder                           = "/ReportServer/Report/GainSalesOrder";

        // shenghaibo:
        public static final String GetProductLibrary                       = "/ProductServer/Product/GetProductLibrary";
        public static final String AddProducts                             = "/ProductServer/Product/AddProducts";
        public static final String GetBrandCategory                        = "/ProductServer/Product/GetBrandCategory";
        public static final String GetMerchant                             = "/ProductServer/Product/GetSupplierList";

        // myinfo
        public static final String GetCustomerList                         = "/StoreServer/Store/GainCustomerList";
        public static final String GetOrderList                            = "/OrderServer/Order/GainOrderList";
        public static final String DeleteOrder                             = "/OrderServer/Order/DeleteOrder";
        public static final String CloseOrder                             = "/OrderServer/Order/CloseOrder";
        public static final String getOrder                                = "/OrderServer/Order/GainOrder";
        public static final String DeleteAllProduct                        = "/ProductServer/Product/DeleteAllProduct";

        public static final String GetProductByList                        = "/ProductServer/Product/GetProductByList";

        public static final String GainStore                               = "/StoreServer/Store/GainStore";
        public static final String dailyOrders                             = "/OrderServer/Order/DailyOrders";
        public static final String dailyTurnover                           = "/OrderServer/Order/DailyOrders";
        public static final String Bandbankaccount                         = "/StoreServer/Store/Bandbankaccount";
        public static final String myProfit                                = "/StoreServer/Store/MyProfit";
        // 加入购物车
        public static final String AddToShopCart                           = "/ProductServer/ShopCart/AddToShopCart";
        public static final String AddPraise                               = "/ProductServer/ProductHandle/Zan";
        // public static final String ChangePassword =
        // "/StoreServer/StoreSet/ChangePassword"; //重复定义
        public static final String ChangePhoneNumber                       = "/StoreServer/StoreMasterInfo/ChangePhoneNumber";

        public static final String WithDrawCash                            = "/StoreServer/Store/WithdrawCash";
        public static final String GetIntegralList                         = "/ProductServer/Integral/GainIntegralList";
        public static final String AddProductShare                         = "/ProductServer/Product/AddProductShare";

        public static final String upload                                  = "/common/VPFileUpload.ashx";
        public static final String GainThemeList                           = "/StoreServer/GetTheme/GainThemeList";
        public static final String CommitOrder                             = "/OrderServer/Order/CommitOrder";

        // wish
        public static final String GetWishingWallInfo                      = "/WishingWallServer/Wish/GetWishingWallInfoByPage";
        public static final String GetOtherWishesByPage                    = "/WishingWallServer/Wish/GetWishingWallInfoNotContainUsersByPage";
        public static final String AddWish                                 = "/WishingWallServer/Wish/AddWishing";

        public static final String GetAllWishingWallInfoByPage             = "/WishingWallServer/Wish/GetAllWishingWallInfoByPage";
        public static final String GetSingleWishingWall                    = "/WishingWallServer/Wish/GetSingleWishingWall";
        public static final String AddWishingWithImages                    = "/WishingWallServer/Wish/AddWishingWithImages";
        public static final String DeleteWishing                           = "/WishingWallServer/Wish/DeleteWishing";
        public static final String CommentWishing                          = "/WishingWallServer/Wish/CommentWishing";
        public static final String CancelWishingPraise                     = "/WishingWallServer/Wish/CancelWishingPraise";
        public static final String GetCommentListByPage                    = "/WishingWallServer/Wish/GetCommentListByPage";
        public static final String GetCommentListFromReplyId               = "/WishingWallServer/Wish/GetCommentListFromReplyId";
        public static final String GetWishingWallInfoByPage                = "/WishingWallServer/Wish/GetWishingWallInfoByPage";
        public static final String GetWishingWallInfoNotContainUsersByPage = "/WishingWallServer/Wish/GetWishingWallInfoNotContainUsersByPage";

        // roam
        public static final String RoamTodayRecommed                       = "/ProductServer/Product/TodayRecommed";
        public static final String RoamGetCategory                         = "/ProductServer/Product/GetCategory";
        public static final String RoamActivitiesWithBaoKuanOrTeHui        = "/ProductServer/Artivities/GainActivitiesWithBaoKuanOrTeHui";
        public static final String RoamAdvertisementList                   = "/ProductServer/Artivities/GainAdvertisementList";
        public static final String GetRoamProuctByList                     = "/ProductServer/Product/GetProductByList";

        public static final String PayCallBack                             = "/PayServer/Pay/PayCallBack";
       public static final String GainPayInfo                             = "/PayServer/Pay/GainPayInfo";
//        public static final String GainPayInfo20160601                     = "/PayServer/Pay/GainPayInfo20160601";


        public static final String ActivityCheck                           = "/ActivitiesCheck/ActivityCheck";
        public static final String GainCustomer                            = "/StoreServer/Store/GainCustomer";
        public static final String InitApp                                 = "/SoapApiServer/AppStart/InitApp";

        public static final String ValidateContractYUPINHUI                = "/VeriCodeServer/VeriCode/ValidateContractYUPINHUI";

        public static final String GetStoreQrCode                          = "/StoreServer/Store/GetStoreQrCode";

        public static final String GetSpecialContentByProductId            = "/ProductServer/Product/GetSpecialContentByProductId";

        public static final String GainFinanceRecords                      = "/FinanceServer/Finance/GainFinanceRecords";
        public static final String GainFinanceIndex                        = "/FinanceServer/Finance/GainFinanceIndex";

        // mydata
        public static final String SaleStatisticList                       = "/StatisticServer/Statistic/ShopperDailySaleStatisticList";
        public static final String SallerBoardOfShopMasterList             = "/StatisticServer/Statistic/SallerBoardOfShopMasterList";

        public static final String VerifyGroups                            = "/ProductServer/Product/VerifyGroups";
        
        public static final String LoadStoresAndTopThirdProduct            = "/SearchServer/Product/LoadStoresAndTopThirdProduct";
        public static final String GetProductByList2            		   = "/SearchServer/Product/GetProductByList2";

        public static final String GetStoreInfoByStoreId                   = "/StoreServer/Store/GetStoreInfoByStoreId";
        public static final String AddAllProductsFromStore                   = "/ProductServer/Product/AddProductsFromStore";

        public static final String SearchBrandList                   = "/ProductServer/Product/SearchBrandList";//有好机筛选

        public static final String GetCommentByProductId                   = "/OrderServer/Order/GetCommentByProductId";//评论列表
        public static final String GetCommentBySubOrderNo                   = "/OrderServer/Order/GetCommentBySubOrderNo";//评论列表

        //3.3.1.1 搜索销售宝商品
        public static final String searchXsbArticle                   = "/xsbSearch/searchXsbArticle";//索销售宝商品

    }

    public class VeriyCodeType{
        public static final String SMSTYPE_REGISTE   = "1";
        public static final String SMSTYPE_FORGETPWD = "2";
        public static final String SMSTYPE_CHANGE    = "3";
    }

    public class HttpKey{

        public static final String AppKey        = "appkey";
        public static final String TimesSamp     = "timestamp";
        public static final String Digest        = "digest";
        public static final String ResultCode    = "ResultCode";
        public static final String Message       = "Message";
        public static final String Data          = "Data";

        public static final String Username      = "username";
        public static final String Password      = "password";

        public static final String Id            = "id";
        public static final String Token         = "token";
        public static final String Version       = "v";
        public static final String origin        = "origin";
        public static final String storeMasterId = "storeMasterId";
        public static final String IdentityId    = "IdentityId";

    }

    public class ServiceIntentKey{
        public static final String Whatkey = "Whatkey";

    }

    public class ServiceIntentValue{
        public static final int start = 1;

    }

    public class Version{
        public static final String ZH = "zh";
        public static final String EN = "en";
    }
    public class GoodsType{
    	public static final int GOODTYPE_TIKET = 11;//购机卷
    	public static final int GOODTYPE_POINT = 14;//积分
    }

    public class Shared{
        public static final String network                      = "network";
        public static final String oneint                       = "oneint";
        public static final String nowtime                      = "nowtime";
        public static final String username                     = " username";
        public static final String password                     = " password";
        public static final String jpushid                      = "jpushid";
        public static final String isClerk                      = "isClerk";

        public static final String ShareRebate                      = "ShareRebate";
        
        public static final String jpushGroupId                 = "jpushGroupId";

        public static final String newMessage                   = "newMessage";

        /** 缓存 **/
        public static final String myshop                       = "myshop";
        public static final String StoreId                      = "storeid";
        public static final String StoreMasterId                = "storeMasterId";
        public static final String IdentityId                   = "identityId";
        public static final String goods_rec                    = "goods_rec";
        public static final String goods_addtime                = "goods_addtime";
        public static final String goods_sales                  = "goods_sales";
        public static final String goods_def                    = "goods_default";
        public static final String goods_null                   = "goods_null";
        public static final String goods_stock                  = "goods_stock";
        public static final String goods_price                  = "goods_price";

        public static final String dailyOrders                  = "dailyOrders";
        public static final String dailyTurnover                = "dailyTurnover";
        public static final String dailyTVisits                 = "dailyTVisits";
        public static final String myProfit                     = "myProfit";
        public static final String GetSalesOrder                = "GetSalesOrder";

        public static final String VERSION_TIME                 = "versiontime";
        public static final String NETREMIND                    = "netRemind";
        public static final String GETDEVICEINFO                = "getdeviceinfo";
        public static final String today_recomend               = "today_recomend";
        public static final String today_recomend_time          = "today_recomend_time";
        public static final String today_recomend_list          = "today_recomend_list";
        public static final String today_recomend_list_time     = "today_recomend_list_time";
        public static final String SALES_ORDER                  = "sales_order";
        public static final String PROFIT_JSON                  = "profit_json";
        public static final String SALES_JSON                   = "sales_json";
        public static final String StoreProduct                 = "StoreProduct";
        public static final String Preference                   = "Preference";
        public static final String BIND_BANK_TIME               = "bind_bank_time";
        public static final String HOT_TIME_SHARE               = "hot_time_share";
        public static final String HOT_TIME_AUTO                = "hot_time_auto";
        public static final String IsDirectSaler                = "IsDirectSaler";
        public static final String ParentStoreId                = "ParentStoreId";

        public static final String today_recomend_advertisement = "today_recomend_advertisement";
        public static final String today_recomend_hot           = "today_recomend_hot";
        public static final String today_recomend_good          = "today_recomend_good";
        public static final String today_recomend_type          = "today_recomend_type";
        public static final String token                        = "token";
        public static final String agree                        = "agree";
		public static final String StoreURL = "my_store_url";
		public static final String StoreLogo = "my_store_logo";;
    }

    public class ActivityResultRequestCode{
        public static final int IMAGE_REQUEST_CODE  = 0;
        public static final int CAMERA_REQUEST_CODE = 1;
        public static final int RESULT_REQUEST_CODE = 2;
        public static final int RESULT_GOODS_INFO   = 3;

    }

    public class ShareDialogOnClick{

        public static final int ll_share_xl         = 0;
        public static final int ll_share_wx_f       = 1;
        public static final int ll_share_qqkj       = 2;
        public static final int ll_share_douban     = 3;
        public static final int ll_share_wx_q       = 4;
        public static final int btn_copy_info       = 5;
        public static final int btn_pre             = 6;
        public static final int btn_edit            = 7;
        public static final int btn_delete          = 8;
        public static final int btn_cancel          = 9;
        public static final int ll_share_sms        = 10;

        public static final int ll_share_facebook   = 11;
        public static final int ll_share_pinterest  = 12;
        public static final int ll_share_twitter    = 13;
        public static final int ll_share_linkedin   = 14;
        public static final int ll_share_instagram  = 15;
        public static final int ll_share_googleplus = 16;

    }

    /**
     * 
     * @ClassName: ShopGoodsSort
     * @Description:商品分类排序
     * @author A18ccms a18ccms_gmail_com
     * @date 2014-2-26 上午10:47:28
     * 
     */
    public class ShopGoodsSort{
        // 默认 销量 库存 已售完 上架 时间 卖空

        public static final int goods_sort_def     = 1;
        public static final int goods_sort_sales   = 2;
        public static final int goods_sort_stock   = 3;
        public static final int goods_sort_null    = 4;
        public static final int goods_sort_rec     = 5;
        public static final int goods_sort_addtime = 6;
        public static final int goods_sort_price   = 7;
        public static final int goods_sort_rebates = 8;
        public static final int goods_sort_type    = 9;
    }

    public class AddGoodSort{
        public static final int goods_sort_def     = 0;
        public static final int goods_sort_stock   = 1;
        public static final int goods_sort_rebates = 2;
        public static final int goods_sort_price   = 3;
        public static final int goods_sort_sales   = 4;
        
    }

    /**
     * 
     * @ClassName: OrderType
     * @Description: 订单状态
     * @author A18ccms a18ccms_gmail_com
     * @date 2014-2-26 上午10:46:28
     * 
     */
    public class OrderType{
        // 订单状态1生成订单,未付款,2确认订单，其他途径已经付款,3完成订单 已经完成的订单,4取消关闭订单 中途关闭，5未付款 ，6已付款
        public static final int order_type_1 = 1;
        public static final int order_type_2 = 2;
        public static final int order_type_3 = 3;
        public static final int order_type_4 = 4;
        public static final int order_type_5 = 5;
        public static final int order_type_6 = 6;

    }

    public class WebServiceName{

        public static final String DeleteProduct              = "DeleteProduct";
        public static final String DeleteOrder                = "DeleteOrder";
        public static final String SendMsg                    = "SendMsg";
        public static final String EditProduct                = "EditProduct";
        public static final String EditStore                  = "EditStore";
        public static final String GetSalesOrder              = "GetSalesOrder";
        public static final String Bandbankaccount            = "Bandbankaccount";
        public static final String AddProducts                = "AddProducts";
        public static final String showPromotions             = "showPromotions";
        public static final String searchStore                = "searchStore";
        public static final String savePromotions             = "savePromotions";
        public static final String saveProducts               = "saveProducts";
        public static final String saveInformation            = "saveInformation";
        public static final String myProfit                   = "myProfit";
        public static final String getProductCategory         = "GetParentCateGory";
        public static final String getPromotionList           = "getPromotionList";
        public static final String getOrder                   = "getOrder";
        public static final String getInformationList         = "getInformationList";
        public static final String getInformation             = "getInformation";
        public static final String editPromotions             = "editPromotions";
        public static final String editInformation            = "editInformation";
        public static final String dailyTurnover              = "dailyTurnover";
        public static final String dailyTVisits               = "dailyTVisits";
        public static final String dailyOrders                = "dailyOrders";
        public static final String createStore                = "createStore";
        public static final String choiceProducts             = "choiceProducts";
        public static final String UploadImage                = "UploadImage";
        public static final String GetProductList             = "GetProductList";
        public static final String GetStore                   = "GetStore";
        public static final String GetCustomerList            = "GetCustomerList";
        public static final String GetCustomer                = "GetCustomer";
        public static final String GetOrderList               = "GetOrderList";
        public static final String verifyIdentity             = "verifyIdentity";
        public static final String VerifyPassword             = "VerifyPassword";
        public static final String VerifyAccount              = "VerifyAccount";
        public static final String VerifyPhoneNumber          = "VerifyPhoneNumber";
        public static final String VerifySignCode             = "VerifySignCode";
        public static final String GetOrganization            = "GetOrganization";
        public static final String VerifyJobNumber            = "VerifyJobNumber";
        public static final String GetThemeList               = "GetThemeList";
        public static final String GetStoreProductList        = "GetStoreProductList";
        public static final String GetBrandsImAccounts        = "getBrandsImAccounts";
        // added by gong
        public static final String FORGET_PWD                 = "ForgetPassword";
        public static final String RESET_PWD                  = "ResetPassword";
        public static final String CHG_PWD                    = "ChangePassword";

        // added by duankai
        public static final String GetIntegralList            = "GetIntegralList";
        public static final String AddProductShare            = "AddProductShare";

        public static final String GetBussiness               = "getBusiness";
        public static final String GetCategory                = "getCategory";
        public static final String GetProductLibrary          = "getProductLibrary";
        public static final String SendPromotionsSms          = "sendPromotionsSms";
        public static final String GetPromotionsShare         = "getPromotionsShare";
        public static final String SendDeviceInfo             = "sendDeviceInfo";

        public static final String GetMyProfile               = "getMyProfile";
        public static final String ModifyProfile              = "modifyProfile";
        public static final String ChangePhoneNumber          = "changePhoneNumber";
        public static final String BindingEmail               = "bindingEmail";
        public static final String TodayRecommed              = "todayRecommed";
        public static final String TodayRecommedList          = "todayRecommedList";
        public static final String GetProfitDetail            = "myProfitDetails";
        public static final String GetPreferenceList          = "GetSpecialsProductList";
        public static final String GetProduct                 = "getProduct";
        public static final String WithDrawCash               = "withdrawCash";
        public static final String GetStoreProductGroupList   = "GetStoreProductGroupList";
        public static final String AddStoreProductGroup       = "AddStoreProductGroup";
        public static final String EditStoreProductGroup      = "EditStoreProductGroup";
        public static final String DeleteStoreProductGroup    = "DeleteStoreProductGroup";
        public static final String GetOrgdailyOrders          = "GetOrgdailyOrders";
        public static final String GetProuctByList            = "GetProuctByList";
        public static final String GetOfficialProduct         = "GetOfficialProductList";

        public static final String GetRoamProuctByList        = "GetProductByListIndex";

        public static final String RoamRecommed               = "todayRecommedIndex";
        public static final String RoamRecommedList           = "todayRecommedListIndex";

        // //add by zhangguorui
        public static final String GetWishingWallInfo         = "GetWishingWallInfoByPage";
        public static final String GetOtherWishesByPage       = "GetWishingWallInfoNotContainUsersByPage";
        public static final String AddWish                    = "AddWishing";
        public static final String DeleteWish                 = "DeleteWishing";
        public static final String CommentWish                = "CommentWishing";

        // 2014.10.14 add wh
        public static final String CommentInfo                = "GetCommentListByPage";

        public static final String UploadWishImg              = "UploadWishingImages";
        public static final String GetAvtivityAndProducts     = "GetAvtivityAndProducts";
        public static final String GetRoamAvtivityAndProducts = "GetAvtivityAndProductsIndex";
        public static final String SearchWithAllProducts      = "searchWithAllProducts";
    }

    public class WhatHTTP{
        public static final int http_fail                               = 0;
        // 绑定银行卡
        public static final int GainBindBankList_SUCCEED                = 400;
        public static final int GainBindBankById_SUCCEED                = 401;
        public static final int SetBindBank_SUCCEED                     = 402;
        public static final int ValidBindBank_SUCCEED                   = 403;
        // 微钱包》实名认证
        public static final int RealNameAuthentication_SUCCEED          = 414;
        public static final int GainRealNameAuthentication_SUCCEED      = 415;
        public static final int VerifyPassword_seccess                  = 1;
        public static final int VerifyAccount_seccess                   = 3;
        public static final int VerifyPhoneNumber_seccess               = 5;
        public static final int GetVerifyCode_success                   = 800;
        public static final int GetVerifyCode_failed                    = 801;
        public static final int VerifySignCode_seccess                  = 7;
        public static final int GetOrganization_seccess                 = 9;
        public static final int VerifyJobNumber_seccess                 = 10;
        public static final int verifyIdentity_seccess                  = 11;
        public static final int GetOrderList_seccess                    = 12;
        public static final int GetCustomer_seccess                     = 13;
        public static final int GetCustomerList_seccess                 = 14;
        public static final int GetStore_seccess                        = 15;
        public static final int GetStore_fail                           = 1015;
        public static final int GetProductList_seccess                  = 16;
        public static final int GetProductList_fail                     = 1016;
        public static final int UploadImage_seccess                     = 17;
        public static final int choiceProducts_seccess                  = 18;
        public static final int createStore_seccess                     = 19;
        public static final int dailyOrders_seccess                     = 20;
        public static final int dailyOrders_fail                        = 1020;
        public static final int dailyTVisits_seccess                    = 21;
        public static final int dailyTVisits_fail                       = 1021;
        public static final int dailyTurnover_seccess                   = 22;
        public static final int dailyTurnover_fail                      = 1022;
        public static final int editInformation_seccess                 = 23;
        public static final int editPromotions_seccess                  = 24;
        public static final int getInformationList_seccess              = 25;
        public static final int getOrder_seccess                        = 26;
        public static final int getPromotionList_seccess                = 27;
        public static final int myProfit_seccess                        = 28;
        public static final int myProfit_fail                           = 1028;
        public static final int saveInformation_seccess                 = 29;
        public static final int saveProducts_seccess                    = 30;
        public static final int savePromotions_seccess                  = 31;
        public static final int searchStore_seccess                     = 32;

        public static final int Bandbankaccount_seccess                 = 35;
        public static final int GetSalesOrder_seccess                   = 36;
        public static final int GetSalesOrder_fail                      = 1036;
        public static final int EditStore_seccess                       = 37;
        public static final int EditProduct_seccess                     = 38;
        public static final int SendMsg_seccess                         = 39;
        public static final int DeleteProduct_seccess                   = 40;
        public static final int DeleteProduct_fail                      = 170;
        public static final int DeleteOrder_seccess                     = 44;

        // added by gong
        public static final int GET_FORGET_PWD_SUCCESS                  = 41;
        public static final int RESET_PWD_SUCCESS                       = 42;
        public static final int CHG_PWD_SUCCESS                         = 43;

        public static final int GET_STORE_THEME_SUCCESS                 = 45;
        public static final int GET_STORE_THEME_FAIL                    = 46;

        // added by duankai
        public static final int GET_INTEGRALLIST_SUCCESS                = 60;
        public static final int GET_INTEGRALLIST_FAIL                   = 61;
        public static final int ADD_PRODUCTSHARE_SUCCESS                = 62;
        public static final int ADD_PRODUCTSHARE_FAIL                   = 63;
        public static final int VERSION_UPDATE_SUCCESS                  = 64;
        public static final int VERSION_UPDATE_FAIL                     = 65;
        public static final int REFRASH_ORDER_LIST_SUCCESS              = 66;
        public static final int REFRASH_ORDER_LIST_FAIL                 = 67;
        public static final int LOGIN_SUCCESS                           = 68;
        public static final int LOGIN_FAIL                              = 69;

        public static final int GET_BUSSINESS_SUCCESS                   = 70;
        public static final int GET_BUSSINESS_FAIL                      = 71;
        public static final int GET_CATEGORY_SUCCESS                    = 72;
        public static final int GET_CATEGORY_FAIL                       = 73;
        public static final int GET_PRODUCT_LIBRARY_SUCCESS             = 74;
        public static final int GET_PRODUCT_LIBRARY_FAIL                = 75;
        public static final int REFRASH_PRODUCT_LIBRARY_SUCCESS         = 76;
        public static final int REFRASH_PRODUCT_LIBRARY_FAIL            = 77;

        public static final int GET_STOREPRODUCTLIST_SUCCESS            = 78;
        public static final int GET_STOREPRODUCTLIST_FAIL               = 79;
        public static final int REFRASH_STOREPRODUCTLIST_SUCCESS        = 80;
        public static final int REFRASH_STOREPRODUCTLIST_FAIL           = 81;
        public static final int GET_PROMOTIONSHARE_SUCCESS              = 82;
        public static final int GET_PROMOTIONSHARE_FAIL                 = 83;
        public static final int SEND_PROMOTIONSMS_SUCCESS               = 84;
        public static final int SEND_PROMOTIONSMS_FAIL                  = 85;
        public static final int GET_REGSHARE_SUCCESS                    = 86;
        public static final int GET_REGSHARE_FAIL                       = 87;
        public static final int SELECT_MENU_MYSHOP_ALL                  = 88;
        public static final int SELECT_MENU_MYSHOP_SALESL               = 89;
        public static final int SELECT_MENU_MYSHOP_REBATES              = 90;
        public static final int SELECT_MENU_MYPREFERENCE_DEF            = 91;
        public static final int SELECT_MENU_MYSHOP_REC                  = 92;
        public static final int SELECT_MENU_MYSHOP_ADDTIME              = 93;
        public static final int SELECT_MENU_MYSHOP_PRICE                = 94;
        public static final int SEND_DEVICEINFO_SUCCESS                 = 95;
        public static final int SEND_DEVICEINFO_FAIL                    = 96;

        public static final int GET_MY_PROFILE_SUCCESS                  = 95;
        public static final int MODIFY_PROFILE_SUCCESS                  = 96;
        public static final int CHANGE_PHONE_NUM_SUCCESS                = 97;
        public static final int CHANGE_PHONE_NUM_FAIL                   = 98;
        public static final int BINDING_EMAIL_SUCCESS                   = 99;
        public static final int BINDING_EMAIL_FAIL                      = 100;

        public static final int GET_PROFIT_DETAIL_SUCCESS               = 101;
        public static final int REFLASH_PROFIT_DETAIL_SUCCESS           = 102;
        public static final int GET_TODAYRECOMMED_SUCCESS               = 103;
        public static final int GET_TODAYRECOMMED_FAIL                  = 104;
        public static final int REFRESH_TODAYRECOMMED_SUCCESS           = 105;
        public static final int REFRESH_TODAYRECOMMED_FAIL              = 106;

        public static final int SELECT_MENU_MYPREFERENCE_TYPE           = 107;
        public static final int SELECT_MENU_TYPE_SEARCH                 = 108;
        public static final int GET_PREFERENCE_CATEGORY_SUCCESS         = 109;
        public static final int GET_PREFERENCE_CATEGORY_FAIL            = 110;

        public static final int SELECT_MENU_MYSHOP_TYPE                 = 111;
        public static final int SELECT_MENU_MYSHOP_TYPE_SEARCH          = 112;
        public static final int GET_MYSHOP_CATEGORY_SUCCESS             = 113;
        public static final int GET_MYSHOP_CATEGORY_FAIL                = 114;

        public static final int SELECT_MENU_MYPREFERENCE_SALES          = 115;
        public static final int SELECT_MENU_MYPREFERENCE_PRICE          = 116;
        public static final int SELECT_MENU_MYPREFERENCE_ADDTIME        = 117;

        public static final int showPromotions_success                  = 118;
        public static final int showPromotions_fail                     = 119;
        public static final int GET_INFORMATION_SUCCESS                 = 120;
        public static final int GET_INFORMATION_FAIL                    = 121;
        public static final int GET_PRODUCT_SUCCESS                     = 122;
        public static final int GET_PRODUCT_FAIL                        = 123;
        public static final int AddProducts_seccess                     = 124;
        public static final int AddProducts_fail                        = 125;
        public static final int GetStoreProductGroupList_SUCCESS        = 126;
        public static final int GetStoreProductGroupList_FAIL           = 127;
        public static final int AddStoreProductGroup_SUCCESS            = 128;
        public static final int AddStoreProductGroup_FAIL               = 129;
        public static final int EditStoreProductGroup_SUCCESS           = 130;
        public static final int EditStoreProductGroup_FAIL              = 131;
        public static final int DeleteStoreProductGroup_SUCCESS         = 132;
        public static final int DeleteStoreProductGroup_FAIL            = 133;
        public static final int GetOrgdailyOrders_SUCCESS               = 134;
        public static final int WITHDRAW_CASH_SUCCESS                   = 135;
        public static final int WITHDRAW_CASH_FAIL                      = 136;
        public static final int GET_TODAYRECOMMEND_LIST_SUCCESS         = 137;
        public static final int GET_TODAYRECOMMEND_LIST_FAIL            = 138;
        public static final int GET_PRODUCT_BY_LIST_SUCCESS             = 139;
        public static final int GET_PRODUCT_BY_LIST_FAIL                = 140;
        public static final int REFRESH_PRODUCT_BY_LIST_SUCCESS         = 141;
        public static final int REFRESH_PRODUCT_BY_LIST_FAIL            = 142;

        // //add by zhangguorui
        public static final int GET_WishingWallInfo_SUCCESS             = 143;
        public static final int GET_WishingWallInfo_FAIL                = 144;
        public static final int GET_OtherWishes_SUCCESS                 = 145;
        public static final int GET_OtherWishes_FAIL                    = 146;
        public static final int AddWish_SUCCESS                         = 147;
        public static final int AddWish_FAIL                            = 148;
        public static final int DeleteWish_SUCCESS                      = 149;
        public static final int DeleteWish_FAIL                         = 150;
        public static final int CommentWish_SUCCESS                     = 151;
        public static final int CommentWish_FAIL                        = 152;

        public static final int GetImAccounts_SUCCESS                   = 153;
        public static final int GetImAccounts_FAIL                      = 154;
        public static final int cancel_progress_dialog                  = 155;

        // 2014.10.14 wh
        public static final int CommentInfo_SUCCESS                     = 160;
        public static final int CommentInfo_FAIL                        = 161;

        public static final int GetAvtivityAndProducts_SUCCESS          = 162;
        public static final int GetAvtivityAndProducts_FAIL             = 163;

        public static final int SEARCH_ALLPRODUCTS_SUCCESS              = 164;
        public static final int SEARCH_ALLPRODUCTS_FAIL                 = 165;
        public static final int REFLASH_ALLPRODUCTS_SUCCESS             = 166;
        public static final int REFLASH_ALLPRODUCTS_FAIL                = 167;
        public static final int GAIN_ADVERTISMENT_SUCCESS               = 168;
        public static final int GET_ACTIVITIES_SUCCESS                  = 169;

        // add wh
        public static final int GainCartList_SUCCESS                    = 180;
        public static final int GainCartList_FAIL                       = 181;
        public static final int GET_TODAYRECOMMENDCategory_LIST_SUCCESS = 182;
        public static final int GET_TODAYRECOMMENDCategory_LIST_FAIL    = 183;
        public static final int ModifyPrpductNum_SUCCESS                = 186;
        public static final int ModifyPrpductNum_FAIL                   = 187;

        public static final int GainBookList_SUCCESS                    = 188;
        public static final int GainBookList_FAIL                       = 189;

        public static final int CancelBook_SUCCESS                      = 190;
        public static final int CancelBook_FAIL                         = 191;
        public static final int EditBook_SUCCESS                        = 192;
        public static final int EditBook_FAIL                           = 193;
        public static final int GainAreaList_SUCCESS                    = 194;
        public static final int GainAreaList_FAIL                       = 195;

        public static final int SettingDefaultBook_SUCCESS              = 196;
        public static final int SettingDefaultBook_FAIL                 = 197;

        public static final int ReportDebug_SUCCESS                     = 198;
        public static final int ReportDebug_FAIL                        = 199;

        public static final int ClearShopCartByProductId_SUCCESS        = 200;
        public static final int ClearShopCartByProductId_FAIL           = 201;

        public static final int ClearShopCart_SUCCESS                   = 202;
        public static final int ClearShopCart_FAIL                      = 203;

        public static final int SetProductNum_SUCCESS                   = 204;
        public static final int SetProductNum_FAIL                      = 205;

        // add 加入购物车
        public static final int AddToShopCart_success                   = 206;
        public static final int AddToShopCart_fail                      = 207;

        public static final int CommitOrder_success                     = 208;
        public static final int CommitOrder_fail                        = 209;

        public static final int CancelWishingPraise_SUCCESS             = 210;
        public static final int CancelWishingPraise_FAIL                = 211;

        public static final int AddWishingWithImages_Finished           = 212;
        public static final int AddPraiseTask_SUCCESS                   = 213;
        public static final int AddPraiseTask_FAIL                      = 214;
        public static final int ChangeGoodNum                           = 215;
        public static final int RegisterStore_SUCCESS                   = 216;
        public static final int Add_product_backgroud                   = 217;

        public static final int ActivityCheck_SUCCESS                   = 218;
        public static final int ActivityCheck_FAIL                      = 219;
        public static final int VerifyCode_SUCCESS                      = 220;
        public static final int UploadImage_Fail                        = 221;

        public static final int InitApp_SUCCESS                         = 222;
        public static final int InitApp_FAIL                            = 223;

        public static final int Validate_failed                         = 224;

        public static final int Validate_success                        = 225;

        public static final int IsYIDONGNumber_success                  = 226;

        public static final int ValidateContractYUPINHUI_SUCCESS        = 227;

        public static final int SELECT_THIRD_TYPE_SEARCH                = 228;

        public static final int GET_SUMMARY_SUCCESS                     = 229;

        public static final int GainActivityByPageAndId_SUCCESS         = 230;

        public static final int DELETEALLPRODUCT_RESULT                 = 231;

        public static final int GetPreviewUrl_success                   = 232;

        public static final int GainFinanceRecords_success              = 233;
        public static final int WithdrawaBalance_success                = 234;

        public static final int SaleStatisticList_success               = 235;
        public static final int SallerBoardOfShopMasterList_success     = 236;

        public static final int GetMerchant_success                     = 237;

        public static final int VerifyGroups_success                    = 238;

        public static final int CheckVerifyGroupsCode_success           = 239;

    }

    public class LoginHandlerWhat{

        public static final int loginSeccess = 0;

    }

    public class IntentKey{
        public static final String info           = "info";
        public static final String img            = "img";
        public static final String order_type     = "order_type";
        public static final String storeinfo      = "storeinfo";
        public static final String saleschartInfo = "saleschartInfo";
        public static final String jsongoods      = "jsongoods";
        public static final String url            = "url";
        public static final String share_url      = "share_url";
        public static final String login          = "login";
        public static final String TAG            = "TAG";
        public static final String orderid        = "orderid";
        public static final String addgoods       = "addgoods";
        public static final String customerid     = "customerid";
        public static final String salesorder     = "salesorder";
        public static final String ordernum       = "ordernum";
        public static final String SETCREDIT      = "setcredit";
        public static final String STOREID        = "storeId";
        public static final String PRODUCTID      = "productId";
        public static final String PRODUCTINFO    = "productinfo";
        public static final String ADDBANK        = "addbank";
        public static final String MODIFYBANK     = "modbank";
        public static final String PREVIEW        = "preview";
        public static final String GORGRTPW       = "forgetpw";
        public static final String MESSAGE_TYPE   = "message_type";
        public static final String ID             = "id";
        public static final String MODIFY_TYPE    = "modify_type";
        public static final String MODIFY_RESULT  = "modify_result";

        // add by gong
        public static final String SALEINFO_FLAG  = "tvflag";

        public static final String SHARE_GOOD     = "sharegood";
        public static final String SHARE_SHOP     = "shareshop";
        public static final String SHARE_SALES    = "sharesales";
        public static final String SHARE_NEWS     = "sharenews";
        public static final String SHARE_BANNER   = "sharebanner";
        public static final String RECOMMEND_TAG  = "recommend";
        public static final String LOAD_INFO      = "load_info";
        public static final String STATUS         = "status";
        public static final String GET_PRODUCT    = "getProduct";
        public static final String OEDER_INFO     = "order_info";
        public static final String MODIFY_GROUP   = "modify_group";
        public static final String GROUP_INFO     = "group_info";
        public static final String SALES_JSON     = "sales_json";
        public static final String WEB_TITLE      = "web_title";
        public static final String preview_url    = "preview_url";
        // add by lihe
        public static final String ISFROM_MYSHOP  = "isFromMyShop";
        public static final String HOT_VIEW       = "hot_view";
        public static final String TAG_SEARCH_ALL = "tag_search_all";

        public static final String ORDER_NO       = "orderNo";

        public static final String ISHOTSALE      = "isHotSale";
        public static final String ACTIVITY_ID    = "activityId";
    }

    public class HttpResultKey{
        public static final String myorderrate          = "myorderrate";
        public static final String promotionId          = "promotionId";
        public static final String payurl               = "payurl";
        public static final String MoneyCount           = "MoneyCount";
        public static final String StoreName            = "StoreName";
        public static final String Countorderlist       = "countOrderList";
        public static final String BANK_BINDED          = "bankBinded";
        public static final String bankaccount          = "bankaccount";
        public static final String myorder              = "myOrder";
        public static final String totalStores          = "storesNumber";
        public static final String profit               = "profit";
        public static final String Integral             = "Integral";
        public static final String Images               = "Images";
        public static final String jgadded              = "jgadded";
        public static final String informationList      = "informationList";
        public static final String description          = "description";
        public static final String title                = "title";
        public static final String orderDescription     = "orderDescription";
        public static final String orderStatusUrl       = "orderStatusUrl";
        public static final String paymentTime          = "paymentTime";
        public static final String orderedTime          = "orderedTime";
        public static final String orderCode            = "orderCode";
        public static final String ordersOffers         = "ordersOffers";
        public static final String shippingRates        = "shippingRates";
        public static final String totalPrice           = "totalPrice";
        public static final String offersImages         = "offersImages";
        public static final String offersDescription    = "offersDescription";
        public static final String endTime              = "endTime";
        public static final String effectiveTime        = "effectiveTime";
        public static final String discount             = "discount";
        public static final String promotionsList       = "promotionsList";
        public static final String totalBuyAmount       = "totalBuyAmount";
        public static final String totalBuyMoney        = "totalBuyMoney";
        public static final String productDescription   = "productDescription";
        public static final String customer             = "customer";
        public static final String url                  = "url";
        public static final String productImage         = "productImage";
        public static final String productImage_300_300 = "productImage_300_300";
        public static final String productImage_688_320 = "productImage_688_320";
        public static final String productImage_720_470 = "productImage_720_470";
        public static final String storeLogo            = "storeLogo";
        public static final String product              = "product";
        public static final String data                 = "Data";
        public static final String quantity             = "quantity";
        public static final String addedTime            = "addedTime";
        public static final String sales                = "sales";
        public static final String stock                = "stock";
        public static final String rebates              = "rebates";
        public static final String storeUrl             = "storeUrl";
        public static final String storeurl             = "storeurl";
        public static final String operatingTime        = "operatingTime";
        public static final String storeName            = "storeName";
        public static final String WECHAT_NUM           = "weixinNum";
        public static final String store                = "store";
        public static final String THEME_ID             = "themeId";
        public static final String THEME                = "theme";
        public static final String THEME_NAME           = "theme_name";
        public static final String THEME_PATH           = "theme_path";
        public static final String THEME_THUMBNAIL      = "theme_thumbnail";
        public static final String THEME_DEFAULT        = "theme_default";
        public static final String productPrice         = "productPrice";
        public static final String productName          = "productName";
        public static final String productList          = "productList";
        public static final String buyerRemark          = "buyerRemark";
        public static final String pruductImage         = "pruductImage";
        public static final String consignee            = "consignee";
        public static final String phoneNumber          = "phoneNumber";
        public static final String email                = "email";
        public static final String deliveryAddress      = "deliveryAddress";
        public static final String orderList            = "orderList";
        public static final String DailyOrderNumList    = "DailyOrderNumList";
        public static final String DailyOrderAmountList    = "DailyOrderAmountList";
        public static final String DailyVisitAmountList    = "DailyVisitAmountList";
        public static final String DailyShareVisitAmountList    = "DailyShareVisitAmountList";
        public static final String DailyBroadBandAmountList    = "DailyBroadBandAmountList";
        public static final String id                   = "id";
        public static final String orgName              = "orgName";
        public static final String organization         = "organization";
        public static final String status               = "status";
        public static final String result               = "result";
        public static final String message              = "Message";
        public static final String bigmessage           = "Message";
        public static final String tag_img              = "tag_img";
        // added by gong
        public static final String COUNT                = "Count";
        public static final String TOTAL_PERSON         = "Stores";

        public static final String TOTAL_SALES          = "totalSales";
        public static final String MONTH_SUMMARY        = "monthSummary";
        /**
         * 销售排名Json返回字段
         */
        public static final String SALE_ORDER           = "salesorder";
        public static final String MONEY_COUNT          = "moneyCount";
        public static final String SALES                = "sales";
        public static final String STORE_NAME           = "storeName";
        public static final String STORE_ID             = "storeId";

        /**
         * 订单列表Json返回字段
         */
        public static final String ADD_TIME             = "addtime";

        // added by duankai
        public static final String INTEGRAL             = "integral";
        public static final String INTEGRAL_DES         = "description";

        public static final String OTHER_CONTACTS       = "otherContacts";
        public static final String IS_SHOW_PHONE_NUM    = "isShowPhoneNo";

        public static final String bankname             = "bankname";
        public static final String masterName           = "masterName";
        public static final String content              = "content";
        public static final String img_url              = "img_url";
        public static final String share_url            = "share_url";
        public static final String cover_img_url        = "cover_img_url";
        public static final String nickname             = "nickname";
        public static final String passPort             = "passPort";
        public static final String birthday             = "birthday";
        public static final String incomeRange          = "incomeRange";
        public static final String gender               = "gender";

        public static final String activities           = "activities";
        public static final String bannerImage          = "banner_img";
        public static final String thumbnails           = "thumbnails";
        public static final String banner_url           = "banner_url";
        public static final String banner_img           = "banner_img";
        public static final String activityName         = "activityName";
        public static final String type                 = "type";
        public static final String flage                = "flage";
        public static final String ProductGroup         = "productGroup";
        public static final String OrgdailyOrders       = "OrgdailyOrders";
        public static final String DisplayName          = "DisplayName";
        public static final String orgMoneyCount        = "orgMoneyCount";
        public static final String jgid                 = "jgid";
        public static final String SHOP_LEVEL           = "levelNo";
        public static final String LEVEL_NAME           = "LevelName";
        public static final String LEVEL_ICON           = "LevelIcon";
        public static final String SALES_MYORDER        = "myOrder";
        public static final String Category             = "category";
        public static final String CategoryName         = "Name";
        public static final String CategoryImgUrl       = "ImgUrl";
        public static final String CategoryId           = "Id";
        public static final String CategoryContent      = "Desc";

        public static final String CategorySortId       = "categorySortId";
        public static final String Superb               = "Superb";
        public static final String PREVIEW_URL          = "previewUrl";

        // //
        public static final String WISH_StoreName       = "StoreName";
        public static final String WISH_CONTENT         = "content";
        public static final String WISH_ID              = "walid";
        public static final String OWNER_IMG            = "";
        public static final String WISH_PIC             = "";

        public static final String integral             = "integral";
        public static final String orderNo              = "orderNo";

        public static final String ADVERTISE_IMAGE      = "activityImage";
        public static final String ADVERTISE_TYPE       = "secondType";
        public static final String ADVERTISE_URL        = "activityUrl";
        public static final String ADVERTISE_ID         = "activityID";
        public static final String ADVERTISE_TEXT       = "description";

        public static final String dayvisits            = "dayvisits";
        public static final String clickdate            = "clickdate";
        public static final String clicks               = "clicks";

        public static final String orders               = "orders";
        public static final String amount               = "amount";
        public static final String SaleAmount               = "SaleAmount";
        public static final String day                  = "day";
        public static final String SaleDate                  = "SaleDate";

        // 选择商品属性字段
        public static final String CartList             = "CartList";
        public static final String isToCart             = "isToCart";
        public static final String Sales                = "Sales";
        public static final String Albums               = "Albums";
        public static final String Gifts                = "Gifts";
        public static final String original_path        = "original_path";
        public static final String Content              = "Content";
        public static final String PreviewUrl           = "PreviewUrl";
        public static final String previewUrl           = "previewUrl";
        public static final String Url                  = "Url";
        public static final String Image_300_300        = "Image_300_300";
        public static final String Package_Basetitle    = "Package_Basetitle";
        public static final String Package_Title        = "Package_Title";
        public static final String SellPrice            = "SellPrice";
        public static final String Stock                = "Stock";
        public static final String virtual_type         = "virtual_type";
        public static final String Summary              = "Summary";
        public static final String Price                = "Price";
        public static final String Id                   = "Id";
        public static final String Goods_Id             = "Goods_Id";
        public static final String ReturnMoney7day      = "ReturnMoney7day";

        public static final String BRAND_ID             = "BrandId";
        public static final String BRAND_NAME           = "BrandName";
        public static final String BRAND_ARRAY          = "Brands";

        // 商品详情
        public static final String ProductName          = "ProductName";
        public static final String Rebates              = "Rebates";
        public static final String MarketPrice          = "MarketPrice";
        public static final String Skus                 = "Skus";
        public static final String Unit_Id              = "Unit_Id";
        public static final String Unit_Basetitle       = "Unit_Basetitle";
        public static final String Unit_Title           = "Unit_Title";
        public static final String Color_Id             = "Color_Id";
        public static final String Color_Basetitle      = "Color_Basetitle";
        public static final String Color_Title          = "Color_Title";
        public static final String Package_Id           = "Package_Id";
        public static final String IsVirtualProduct     = "IsVirtualProduct";

        // 支付
        public static final String PAY_ID               = "payOrdeNo";
        public static final String PAY_TN               = "tn";
        public static final String PAY_AMOUNT           = "payAmount";
        public static final String PAY_TYPE             = "payment";
        public static final String PAY_FRONTURL         = "frontUrl";
        public static final String PAY_BACKURL          = "backUrl";
        public static final String PAY_REMARK           = "payReamrk";
        public static final String PAY_TITLE            = "payTitle";

        public static final String productID            = "productID";
        public static final String productId            = "productId";
    }

    public class IntentValue{
        /** 登陆 */
        public static final int login    = 0;
        /** 注册 */
        public static final int reg      = 1;
        /** 我的微店相关 */
        public static final int myshop   = 2;
        /** 促销相关 */
        public static final int cam      = 3;

        public static final int fogetpwd = 4;
    }

    public class ViewHandler{

        public static final int login = 0;
        public static final int reg   = 1;
    }

    public class download{
        public static final String BACKDOWN           = "backgrouddown";
        public static final String SHOWNOTIFY         = "shownotify";
        public static final String USERCHECK          = "usercheck";
        public static final String DOWNLOADINGVERSION = "downloadingversion";
        public static final String DOWNLOADEDVERSION  = "downloadedversion";
        public static final String DOWNLOADINGOFFSET  = "downloadingoffset";
        public static final String INSTALLURL         = "installurl";

    }

    public static final String KEY_ISIDENTITY = "key_isidentity";
    public static final String KEY_ISBANK     = "key_isbank";
    public static final String KEY_ISBANK_ID  = "key_isbank_id";
}

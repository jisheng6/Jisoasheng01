package com.example.adminjs.jisoasheng01;

import java.util.List;

/**
 * Created by Adminjs on 2017/12/1.
 */

public class Bean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-10-26 07:53","title":"如何看待历史剧？ 媒体：把握好不虚与不拘","description":"搜狐社会","picUrl":"","url":"http://news.sohu.com/20171026/n519914029.shtml"},{"ctime":"2017-10-14 08:40","title":"西安一楼盘迟迟办不下证 460业主起诉开发商","description":"搜狐社会","picUrl":"","url":"http://news.sohu.com/20171014/n517767283.shtml"},{"ctime":"2017-10-03 20:41","title":"家国网事|因为这10元钱，70岁老人哭了两次，冒雨也要还！","description":"搜狐社会","picUrl":"http://photocdn.sohu.com/20171003/Img515929518_ss.jpeg","url":"http://news.sohu.com/20171003/n515929517.shtml"},{"ctime":"2017-09-30 13:28","title":"\u201c拒绝妻子手术\u201d现场医生：病人丈夫被冤枉了","description":"搜狐社会","picUrl":"http://photocdn.sohu.com/20170930/Img515443705_ss.jpeg","url":"http://news.sohu.com/20170930/n515443704.shtml"},{"ctime":"2017-09-30 08:54","title":"黑作坊用荷叶粉制减肥药 一盒220元每粒成本3毛","description":"搜狐社会","picUrl":"","url":"http://news.sohu.com/20170930/n515392928.shtml"},{"ctime":"2017-09-12 07:45","title":"80后团队操盘新媒体 六百岁故宫就这样炼成\u201c网红\u201d","description":"搜狐社会","picUrl":"http://photocdn.sohu.com/20170911/Img510908418_ss.jpeg","url":"http://news.sohu.com/20170911/n510908417.shtml"},{"ctime":"2017-09-04 06:40","title":"【塞罕坝造林人系列】刘军夫妇：做\u201c林场眼睛\u201d11年 无畏坚守护好绿","description":"搜狐社会","picUrl":"http://photocdn.sohu.com/20170903/Img509482875_ss.jpeg","url":"http://news.sohu.com/20170903/n509482874.shtml"},{"ctime":"2017-08-09 00:31","title":"辟谣：九寨沟县地震部分谣言网上流传 请大家不信谣不传谣","description":"搜狐社会","picUrl":"http://photocdn.sohu.com/20170809/Img505992955_ss.jpeg","url":"http://news.sohu.com/20170809/n505992954.shtml"},{"ctime":"2017-06-07 10:12","title":"舍不得媳妇套不住流氓！警察带女友约会\u201c钓色魔\u201d","description":"搜狐社会","picUrl":"","url":"http://news.sohu.com/20170607/n495984947.shtml"},{"ctime":"2017-06-06 06:19","title":"专题 | 三分钟带你看遍苹果WWDC 2017亮点","description":"网易VR","picUrl":"http://img4.cache.netease.com/photo/0009/2017-06-06/s_CM7TROL26PGI0009.jpg","url":"http://tech.163.com/special/S1496632396292/"}]
     */

    private int code;
    private String msg;
    private List<NewslistBean> newslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<NewslistBean> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<NewslistBean> newslist) {
        this.newslist = newslist;
    }


}

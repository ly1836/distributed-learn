package com.sz.earlysummer.smsbombing;

import com.sz.earlysummer.smsbombing.comm.HttpClientUtils;
import com.sz.earlysummer.smsbombing.module.BlockchainMedia;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SmsBombingApplicationTests {

    @Autowired
    private BlockchainMedia blockchainMedia;

    @Test
    public void contextLoads() throws Exception{
        /*for(int i=0;i<10;i++){
            boolean babite = blockchainMedia.gongxiangcaijing("18674492943");
            Thread.sleep(500);
        }*/

        HttpClientUtils.httpGetResponseHeader("http://new.gongxiangcj.com/user_info");
    }

}

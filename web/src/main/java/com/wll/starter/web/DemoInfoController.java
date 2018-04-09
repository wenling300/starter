package com.wll.starter.web;

import com.wll.starter.dao.DemoInfoRepository;
import com.wll.starter.dao.model.DemoInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoInfoController {

    @Autowired
    private DemoInfoRepository demoInfoRepository;

    @RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    public String add(DemoInfo demoInfo) {
        demoInfoRepository.save(demoInfo);
        return "add ok";
    }

    /**
     * 保存数据.
     * @return
     */
    @RequestMapping("/save")
    public String save(){
        // 内存数据库操作
        demoInfoRepository.save(new DemoInfo("title1", "content1"));
        demoInfoRepository.save(new DemoInfo("title2", "content2"));
        demoInfoRepository.save(new DemoInfo("title3", "content3"));
        demoInfoRepository.save(new DemoInfo("title4", "content4"));
        demoInfoRepository.save(new DemoInfo("title5", "content5"));
        return "save ok";
    }

    /**
     * 获取所有数据.
     * @return
     */
    @RequestMapping("/findAll")
    public Iterable<DemoInfo> findAll(){
        // 内存数据库操作
        return demoInfoRepository.findAll();
    }

}

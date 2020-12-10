package com.ali.Icontroller;

import com.ali.entity.Score;
import com.ali.entity.ScoreInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient("scoreprovider")
public interface ScoreInterfaceController {
    @RequestMapping(value = "selectOne",method = RequestMethod.GET)
    Score selectOne(@RequestParam("id")int id);

    @RequestMapping(value = "getScoreInfo",method = RequestMethod.GET)
    List<ScoreInfo> getScoreInfo(@RequestParam("uid")int uid);

    @RequestMapping(value = "getScoreAndCou",method = RequestMethod.GET)
    Map<String,Object> getScoreAndCou(@RequestParam("uid") int uid);

    @RequestMapping(value = "getScoreAndCouPie",method = RequestMethod.GET)
    Map<String,Object> getScoreAndCouPie(@RequestParam("uid") int uid);
}

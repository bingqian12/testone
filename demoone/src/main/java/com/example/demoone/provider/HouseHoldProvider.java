package com.example.demoone.provider;

import com.example.demoone.model.HouseHold;
import com.example.demoone.model.Result;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiuBingqian
 * @date
 */

//@RestSchema(schemaId = "household")
@RequestMapping(path = "/provider/v0")
public class HouseHoldProvider {

    private HouseHold houseHoldOne = new HouseHold("无霜冷藏冰箱",2500.00,"海尔","");
    private HouseHold houseHoldTwo = new HouseHold("变频空调",3000.00,"格力","");
    private HouseHold houseHoldThree = new HouseHold("洗衣机",1799.99,"合肥美的","");

    @RequestMapping(path = "/sell/{name}",method = RequestMethod.GET)
    public Result sell(@PathVariable("name")String name){
        Result result = new Result();
        List<HouseHold> list = new ArrayList<>();
        list.add(houseHoldOne);
        list.add(houseHoldTwo);
        list.add(houseHoldThree);
        for(HouseHold houseHold :list){
            if (houseHold.getName().indexOf(name)!= -1){
                result.setHouseHold(houseHold);
                return result;
            }
        }
        return null;
    }
}

package com.example.demoone.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiuBingqian
 * @date
 */
@Data
public class Result {
    private String msg;
    private HouseHold houseHold;
    private List<HouseHold> list = new ArrayList<HouseHold>();
    private List<PCService> plist = new ArrayList<PCService>();

    @Override
    public String toString() {
        return "Result{" +
                "msg='" + msg + '\'' +
                ", houseHold=" + houseHold +
                ", list=" + list +
                ", plist=" + plist +
                '}';
    }
}

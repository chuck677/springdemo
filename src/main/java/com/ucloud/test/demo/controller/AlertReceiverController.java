package com.ucloud.test.demo.controller;

import com.ucloud.test.demo.entity.AlertReceiver;
import com.ucloud.test.demo.service.AlertReceiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlertReceiverController {
    @Autowired
    private AlertReceiverService alertReceiverService;

    @RequestMapping(value = "/alertReceiver",method = RequestMethod.GET)
    public String getAlertReceiver(@RequestParam int id){
        return alertReceiverService.Select(id).toString();
    }

    @RequestMapping(value = "/alertReceiver",method = RequestMethod.POST)
    public int addAlertReceiver(@RequestBody AlertReceiver alertReceiver){
        return alertReceiverService.Insert(alertReceiver);
    }

    @RequestMapping(value = "/getAllAlertReceiver",method = RequestMethod.GET)
    public List<AlertReceiver> getAllAlertReceiver(){
        return alertReceiverService.SelectAll();
    }

}

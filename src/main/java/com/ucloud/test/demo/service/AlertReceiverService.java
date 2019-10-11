package com.ucloud.test.demo.service;

import com.ucloud.test.demo.entity.AlertReceiver;
import com.ucloud.test.demo.mapper.AlertReceiverMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertReceiverService {
    @Autowired
    AlertReceiverMapper alertReceiverMapper;

    public AlertReceiver Select(int id){
        return alertReceiverMapper.Select(id);
    }

    public int Insert(AlertReceiver alertReceiver){
        return alertReceiverMapper.Insert(alertReceiver);
    }

    public List<AlertReceiver> SelectAll(){
        return alertReceiverMapper.SelectAll();
    }
}

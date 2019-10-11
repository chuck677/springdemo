package com.ucloud.test.demo.mapper;

import com.ucloud.test.demo.entity.AlertReceiver;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlertReceiverMapper {
    AlertReceiver Select(int id);
    int Insert(AlertReceiver alertReceiver);
    List<AlertReceiver> SelectAll();
}

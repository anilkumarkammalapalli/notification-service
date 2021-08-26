package org.sunbird.service;

import org.sunbird.common.exception.BaseException;
import org.sunbird.pojo.NotificationV2Request;
import org.sunbird.common.response.Response;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface NotificationService {

    Map<String,Object> getTemplate(String actionType, Map<String,Object> reqContext) throws BaseException;

    void validateTemplate(Map<String,Object> paramObj, String templateSchema) throws BaseException;

    String transformTemplate(String templateData, Map<String,Object> paramObj) throws BaseException;

    Response createNotificationFeed(NotificationV2Request request, Map<String,Object> reqContext) throws BaseException;

    List<Map<String, Object>> readNotificationFeed(String userId, Map<String,Object> reqContext) throws BaseException, IOException;

    Response updateNotificationFeed( List<Map<String,Object>>  feeds,Map<String,Object> reqContext) throws BaseException;


}
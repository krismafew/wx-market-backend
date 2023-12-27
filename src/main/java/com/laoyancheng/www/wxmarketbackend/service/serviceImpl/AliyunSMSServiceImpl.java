package com.laoyancheng.www.wxmarketbackend.service.serviceImpl;

import com.aliyun.dysmsapi20170525.Client;
import com.aliyun.dysmsapi20170525.models.SendSmsRequest;
import com.aliyun.tea.TeaException;
import com.laoyancheng.www.wxmarketbackend.config.AliyunComponent;
import com.laoyancheng.www.wxmarketbackend.service.AliyunSMSService;
import com.laoyancheng.www.wxmarketbackend.util.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/25 15:26
 */
@Service
public class AliyunSMSServiceImpl implements AliyunSMSService {
    @Autowired
    private AliyunComponent aliyunComponent;
    @Autowired
    private Client smsClient;
    @Override
    public void sendCode(String phone) {
        SendSmsRequest sendSmsRequest = new SendSmsRequest()
                .setTemplateCode(aliyunComponent.getSms().getTemplateCode())
                .setSignName(aliyunComponent.getSms().getSignName())
                .setPhoneNumbers(phone)
                .setTemplateParam("{\"code\":" + RandomUtil.generateCode() + "}");

        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();


        try {
            com.aliyun.dysmsapi20170525.models.SendSmsResponse resp = smsClient.sendSmsWithOptions(sendSmsRequest, runtime);
            com.aliyun.teaconsole.Client.log(com.aliyun.teautil.Common.toJSONString(resp));
        } catch (TeaException error) {
            // 错误 message
            System.out.println(error.getMessage());
            // 诊断地址
            System.out.println(error.getData().get("Recommend"));
            com.aliyun.teautil.Common.assertAsString(error.message);
        } catch (Exception _error) {
            TeaException error = new TeaException(_error.getMessage(), _error);
            // 错误 message
            System.out.println(error.getMessage());
            // 诊断地址
            System.out.println(error.getData().get("Recommend"));
            com.aliyun.teautil.Common.assertAsString(error.message);
        }
    }
}

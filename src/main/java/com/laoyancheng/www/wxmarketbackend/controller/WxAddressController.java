package com.laoyancheng.www.wxmarketbackend.controller;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketAddress;
import com.laoyancheng.www.wxmarketbackend.db.dto.AddressDTO;
import com.laoyancheng.www.wxmarketbackend.db.dto.IdDTO;
import com.laoyancheng.www.wxmarketbackend.service.MarketAddressService;
import com.laoyancheng.www.wxmarketbackend.util.ResponseUtil;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.mgt.SecurityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/30 16:10
 */
@RestController
@RequestMapping("wx/address/")
public class WxAddressController {
    @Autowired
    private SecurityManager securityManager;
    @Autowired
    private MarketAddressService addressService;
    @GetMapping
    public Object list(){
        SecurityUtils.setSecurityManager(securityManager);
        Integer userId = (Integer) SecurityUtils.getSubject().getSession().getAttribute("userId");
        return ResponseUtil.okList(addressService.list(userId));
    }

    @GetMapping("detail")
    public Object detail(@RequestParam("id") @Min(value = 1, message = "id must be a positive integer") Integer id){
        SecurityUtils.setSecurityManager(securityManager);
        Integer userId = (Integer) SecurityUtils.getSubject().getSession().getAttribute("userId");
        return ResponseUtil.ok(addressService.getAddressById(userId, id));
    }

    @PostMapping("save")
    public Object save(@RequestBody @Valid AddressDTO addressDTO){
        SecurityUtils.setSecurityManager(securityManager);
        Integer userId = (Integer) SecurityUtils.getSubject().getSession().getAttribute("userId");
        Integer data = addressService.saveAndUpdate(userId, addressDTO.getAddressDetail(), addressDTO.getAreaCode(), addressDTO.getCity(), addressDTO.getCounty(),
                addressDTO.getId(), addressDTO.isDefault(), addressDTO.getName(), addressDTO.getProvince(), addressDTO.getTel());
        if(data == null)
            return ResponseUtil.badArgumentValue();
        return ResponseUtil.ok(data);
    }

    @PostMapping("delete")
    private Object delete(@RequestBody @Valid IdDTO idDTO){
        SecurityUtils.setSecurityManager(securityManager);
        Integer userId = (Integer) SecurityUtils.getSubject().getSession().getAttribute("userId");
        Integer result = addressService.delete(userId, idDTO.getId());
        if(result == 400){
            // 请求参数不对
            return ResponseUtil.badArgumentValue();
        }
        return ResponseUtil.ok();
    }
}

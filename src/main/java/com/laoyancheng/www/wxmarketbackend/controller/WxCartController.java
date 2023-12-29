package com.laoyancheng.www.wxmarketbackend.controller;

import com.laoyancheng.www.wxmarketbackend.db.domain.MarketCart;
import com.laoyancheng.www.wxmarketbackend.db.dto.AddCartDTO;
import com.laoyancheng.www.wxmarketbackend.db.dto.CartCheckDTO;
import com.laoyancheng.www.wxmarketbackend.db.dto.CartDTO;
import com.laoyancheng.www.wxmarketbackend.db.dto.ProductIdsDTO;
import com.laoyancheng.www.wxmarketbackend.service.MarketCartService;
import com.laoyancheng.www.wxmarketbackend.service.MarketProductService;
import com.laoyancheng.www.wxmarketbackend.util.ResponseUtil;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.mgt.SessionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/29 15:20
 */
@RestController
@RequestMapping("wx/cart/")
public class WxCartController {
    @Autowired
    private MarketCartService cartService;
    @Autowired
    private MarketProductService productService;
    @Autowired
    private SecurityManager securityManager;

    @PostMapping("update")
    public Object update(@RequestBody @Valid CartDTO cartDTO){
        Integer result = cartService.updateCartItem(cartDTO);
        if(result == 400)
            return ResponseUtil.badArgumentValue();
        return ResponseUtil.ok();
    }

    @PostMapping("delete")
    public Object deleteCart(@RequestBody ProductIdsDTO productIds){
        // 从session中获取userId
        SecurityUtils.setSecurityManager(securityManager);
        Integer userId = (Integer) SecurityUtils.getSubject().getSession().getAttribute("userId");
        return ResponseUtil.ok(cartService.deleteCart(userId,productIds.getProductIds()));
    }

    @GetMapping("goodscount")
    private Object goodscount(){
        // 从session中获取userId
        SecurityUtils.setSecurityManager(securityManager);
        Integer userId = (Integer) SecurityUtils.getSubject().getSession().getAttribute("userId");
        // 获取购物车中商品的总数量
        Integer counts = cartService.countGoods(userId);
        return ResponseUtil.ok(counts);
    }
    @PostMapping("add")
    private Object addCart(@RequestBody @Valid AddCartDTO addCartDTO){

        if(!addCartDTO.getGoodsId().equals(productService.selectGoodsIdByProductId(addCartDTO.getProductId()))){
            // 根据productId查询goodsId
            // 查询出的goodsId和请求中的goodsId不相同, 请求中的参数值错误
            return ResponseUtil.badArgumentValue();
        }
        SecurityUtils.setSecurityManager(securityManager);
        Integer userId = (Integer) SecurityUtils.getSubject().getSession().getAttribute("userId");
        Integer counts = cartService.addCart(userId, addCartDTO.getGoodsId(), addCartDTO.getProductId(), addCartDTO.getNumber());
        return ResponseUtil.ok(counts);
    }
    @GetMapping("index")
    public Object index(){
        SecurityUtils.setSecurityManager(securityManager);
        Integer userId = (Integer) SecurityUtils.getSubject().getSession().getAttribute("userId");
        return ResponseUtil.ok(cartService.index(userId));
    }

    @PostMapping("checked")
    public Object checkCart(@RequestBody @Valid CartCheckDTO cartCheckDTO){
        SecurityUtils.setSecurityManager(securityManager);
        Integer userId = (Integer) SecurityUtils.getSubject().getSession().getAttribute("userId");
        return ResponseUtil.ok(cartService.checkCart(userId, cartCheckDTO.getProductIds(), cartCheckDTO.getIsChecked()));
    }

    @PostMapping("fastadd")
    private Object fastadd(@RequestBody @Valid AddCartDTO addCartDTO){
        SecurityUtils.setSecurityManager(securityManager);
        Integer userId = (Integer) SecurityUtils.getSubject().getSession().getAttribute("userId");
        return ResponseUtil.ok(cartService.fastAdd(userId, addCartDTO.getGoodsId(), addCartDTO.getProductId(), addCartDTO.getNumber()));
    }

    @GetMapping("checkout")
    public Object checkout(@RequestParam("cartId") @Min(value = 0, message = "cartId must be non-negative integer") Integer cartId,
                           @RequestParam("addressId") @Min(value = 0, message = "address must be non-negative integer") Integer addressId,
                           @RequestParam("couponId") @Min(value = -1, message = "couponId must be greater than or equal to -1") Integer couponId,
                           @RequestParam("userCouponId") @Min(value = -1, message = "userCouponId must be greater than or equal to -1") Integer userCouponId,
                           @RequestParam("grouponRulesId") @Min(value = 0, message = "grouponRulesId must be greater than or equal to 0") Integer grouponRulesId){

        SecurityUtils.setSecurityManager(securityManager);
        Integer userId = (Integer) SecurityUtils.getSubject().getSession().getAttribute("userId");
        Map<String, Object> data = cartService.checkout(userId, cartId, addressId, couponId, userCouponId, grouponRulesId);
        if(data == null)
            // cartId所对应的MarketCart的userId字段和正在交互的用户的userId不匹配
            // 或cartId所对应的购物车未被选中
            // 或购物车已被删除
            // 或UserCouponId所查询出来的couponId和请求中的couponId不匹配
            return ResponseUtil.badArgumentValue();
        return ResponseUtil.ok();
    }
}

//package com.codefish.service.fallback;//package com.itheima.service.fallback;
//
//import com.codefish.domain.Product;
//import com.codefish.service.ProductService;
//import org.springframework.stereotype.Service;
//
//
////这是一个容错类
////它要求实现Feign所在接口,并实现里面的方法
////当feign调用出现问题的时候,就会进入到当前类中同名方法中
//// 实现的异常是直接把商品微服务关掉
//@Service
//public class ProductServiceFallback implements ProductService {
//
//    @Override
//    public Product findById(Integer pid) {
//        Product product = new Product();
//        product.setPid(-100);
//        product.setPname("商品微服务调用出现异常了,已经进入到了容错方法中");
//        return product;
//    }
//}

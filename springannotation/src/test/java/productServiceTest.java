import com.zhangchi.BaseTestCase;
import com.zhangchi.entity.Product;
import com.zhangchi.service.ProductService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

/**
 * @Author 张驰
 * @Description:
 * @Date: created in 23:30 2018/7/18
 * @Modified By:
 */

public class productServiceTest extends BaseTestCase {

    @Autowired
    private ProductService productService;

    @Test
    public void batchSave(){

        Product product = new Product();
        product.setProductName("ipone x");
        product.setProductNum(122);
        product.setProductSupplier("苹果");

        Product product1 = new Product();
        product1.setProductName(null);
        product1.setProductNum(122);
        product1.setProductSupplier("苹果");

        List<Product> list = Arrays.asList(product,product1);
        productService.batchSave(list);

    }


}

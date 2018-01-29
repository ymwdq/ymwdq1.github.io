/**
 * 产品接口
 */
public interface Product {
  void use();
}

/**
 * 工厂接口
 */
public interface Factory {
  Product createProduct();
}

/**
 * A产品
 */
public class ProductA implements Product {
  public void use() {
    System.out.println("use ProductA");
  }
}

/**
 * A1产品
 */
public class ProductA1 implements Product {
  public void use() {
    System.out.println("use ProductA1");
  }
}

/**
 * A2产品
 */
public class ProductA2 implements Product {
  public void use() {
    System.out.println("use ProductA2");
  }
}

/**
 * B产品
 */
public class ProductB implements Product {
  public void use() {
    System.out.println("use ProductB");
  }
}

/**
 * B1产品
 */
public class ProductB1 implements Product {
  public void use() {
    System.out.println("use ProductB1");
  }
}

/**
 * B2产品
 */
public class ProductB2 implements Product {
  public void use() {
    System.out.println("use ProductB2");
  }
}


/**
 * 工厂类
 */
public class Factory {
  public Product createProduct(String category) {
    switch(category) {
      case "A":
        return new ProductA();
      case "B":
        return new ProductB;
      default:
        return null;
    }
  }
}

/**
 * A类工厂
 */
public class FactoryA {
  public ProductA createProduct() {
    return new ProductA();
  }
}

/**
 * B类工厂
 */
public class FactoryB {
  public Product createProduct() {
    return new ProductB();
  }
}

/**
 * 1产品族工厂
 */
 public class Factory1{
   public Product createProductA() {
     return new ProductA1();
   }

   public Product createProductB() {
     return new ProductB1();
   }
 }

 /**
  * 2产品族工厂
  */
  public class Factory2{
    public Product createProductA() {
      return new ProductA2();
    }

    public Product createProductB() {
      return new ProductB2();
    }
  }

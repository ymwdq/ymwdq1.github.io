/**
 * 抽象组件：煎饼
 */
public interface JianBing {
  JianBing make();
}

/**
 * 具体组件：杨氏煎饼
 */
public class YangShiJianBing implements JianBing {
  public JianBing make() {
    System.out.println("杨式煎饼");
    return this;
  }
}

/**
 * 抽象装饰器：调料
 */
public AbstractClass TiaoLiao implements JianBing{
  protected JianBing jianbing;

  public TiaoLiao(JianBing jianbing) {
    this.jianbing = jianbing;
  }

  public JianBing make() {
    jianbing.make();
  }
}


/**
 * 具体装饰器：加孜然
 */
public class AddZiRan extends TiaoLiao {
  public AddZiRan (JianBing jianbing) {
    super(jianbing);
  }

  public JianBing make() {
    jianbing.make();
    addZiRan(jianbing);
  }

  public void addZiRan(JianBing jianbing) {
    System.out.println(" 加孜然 ");
  }
}

/**
 * 具体装饰器：加辣
 */
public class AddPepper extends TiaoLiao {
  public AddPepper (JianBing jianbing) {
    super(jianbing);
  }

  public JianBing make() {
    jianbing.make();
    addPepper(jianbing);
  }

  public void addPepper(JianBing jianbing) {
    System.out.println(" 加辣 ");
  }
}

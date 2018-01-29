/**
 * 懒汉模式，非线程安全
 */
public class SingleTon() {
  private static SingleTon instance;
  private SingleTon() {}

  public static SingleTon getInstance() {
    if (instance == null) {
      instance = new SingleTon();
    }
    return instance;
  }
}

/**
 * 懒汉模式，线程安全
 */
public class SingleTon() {
  private static SingleTon instance;
  private SingleTon() {}
  public static synchronized SingleTon() {
    if (instance == null) {
      instance = new SingleTon();
    }
    return instance;
  }
}

/**
 * 饿汉式
 */
public class SingleTon() {
  private static final SingleTon instance = new SingleTon();
  private SingleTon() {}
  public static SingleTon getInstance() {
    return instance;
  }
}

/**
 * 双重检查锁
 */
public class SingleTon {
  private volatile static SingleTon instance;
  public static SingleTon getInstance() {
    if (instance == null) {
      synchronized(SingleTon.class) {
        if (instance == null) {
          instance = new SingleTon();
        }
      }
    }
    return instance;
  }
}

/**
 * 静态内部类
 */
public class SingleTon() {
  private static class SingletonHolder {
    public static SingleTon INSTANCE = new SingleTon();
  }

  private SingleTon() {}

  public static SingleTon getInstance() {
    return SingletonHolder.INSTANCE;
  }
}

/**
 * 枚举实现单例模式
 */
public enum SingleTon() {
  INSTANCE;
}

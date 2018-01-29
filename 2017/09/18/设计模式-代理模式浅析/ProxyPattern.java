// 明星接口
public interface Star {
  // 明星演出
  void actoin();
}

// 明星周杰伦类
public class JayChou implements Star {
  public void action() {
    System.out.println("----唱歌----");
  }
}

// 周杰伦经纪人
public class JingJiRen implements Star {
  private JayChou jc;
  public JingJiRen(JayChou jc) {
    this.jc = jc;
  }

  // 演出前
  public void preAction() {
    System.out.println("----安排周杰伦唱歌乐队，场地和资金等----");
  }

  // 演出后
  public void postAction() {
    System.out.println("----安排周杰伦下榻酒店等----");
  }

  //正式演出
  public void action() {
    preAction();
    jc.action();
    postAction();
  }
}

//客户
public static void main(String[] args) {
  JingJiRen jjr = new JingJiRen();
  jjr.action();
}

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int ZeroNum = 0;
        int total = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                ZeroNum++;
                if (i == flowerbed.length - 1) {
                  total += ZeroNum / 2;
                }
            } else {
                if (ZeroNum > 0) {
                    if (i - ZeroNum == 0) {
                        total += ZeroNum / 2;
                    } else {
                        total += (ZeroNum - 1) / 2;
                        ZeroNum = 0;
                    }

                }
            }
        }
        return total >= n;
    }
}

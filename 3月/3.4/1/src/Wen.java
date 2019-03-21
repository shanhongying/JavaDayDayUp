import static java.lang.System.out;
public class Wen {
    String title;
    int see;

    public void print() {
        out.println("标题：" + title + ",浏览次数：" + see);
    }

    public void sort(Wen ws[]) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i - 1; j++) {
                if (ws[j + 1].see > ws[j].see) {
                    Wen temple;
                    temple = ws[j];
                    ws[j] = ws[j + 1];
                    ws[j + 1] = temple;
                }
            }

        }

    }
}

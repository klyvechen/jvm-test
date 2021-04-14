package rm.project;

/**
 * 逃逸分析
 *
 */
public class EscapeAnalysis {

    public EscapeAnalysis obj;

    //發生逃逸
    public EscapeAnalysis getInstance() {
        return obj == null ? new EscapeAnalysis() : obj;
    }

    //發生逃逸
    public void setObj() {
        obj = new EscapeAnalysis();
    }

    //無發生逃逸
    public void useEscapeAnalysis() {
        EscapeAnalysis e = new EscapeAnalysis();
    }

    //發生逃逸
    public void useEscapeAnalysis1() {
        EscapeAnalysis e = getInstance();
    }
}

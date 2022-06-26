package report;

import java.util.List;

public class Report {

    private Header header;
    private List<String> contents;
    private Footer footer;
    private IExportBehavior exportBehavior;

    @Override
    public String toString() {
        return "Report{" +
                "header=" + header +
                ", contents=" + contents +
                ", footer=" + footer +
                ", exportBehavior=" + exportBehavior +
                '}';
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public List<String> getContents() {
        return contents;
    }

    public void setContents(List<String> contents) {
        this.contents = contents;
    }

    public Footer getFooter() {
        return footer;
    }

    public void setFooter(Footer footer) {
        this.footer = footer;
    }

    public IExportBehavior getExportBehavior() {
        return exportBehavior;
    }

    public void setExportBehavior(IExportBehavior exportBehavior) {
        this.exportBehavior = exportBehavior;
    }
}

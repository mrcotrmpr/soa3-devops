package report;

public class ExportPDF implements IExportBehavior{


    @Override
    public void export(Report report) {
        System.out.println("PDF");// NOSONAR
        System.out.println("-----------------------------");// NOSONAR
        System.out.println(report.getHeader().toString());// NOSONAR
        System.out.println(report.getContents());// NOSONAR
        System.out.println(report.getFooter().toString());// NOSONAR
        System.out.println("-----------------------------");// NOSONAR
    }
}

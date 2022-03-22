package Sprint;

public class ExportPDF implements IExportBehavior{

    @Override
    public void export(SprintExportFormat sprintExportFormat) {
        System.out.println("Export PDF");
    }
}

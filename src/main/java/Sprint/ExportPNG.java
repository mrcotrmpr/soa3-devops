package Sprint;

public class ExportPNG implements IExportBehavior{

    @Override
    public void export(SprintExportFormat sprintExportFormat) {
        System.out.println("Export PNG");
    }
}

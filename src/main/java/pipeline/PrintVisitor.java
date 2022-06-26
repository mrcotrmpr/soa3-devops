package pipeline;

public class PrintVisitor extends Visitor {

    @Override
    public void visitPipeline(PipeLine pipeLine) {
        System.out.println("~~~~~~~~~" + pipeLine.getPipeLineName() + "~~~~~~~~~");// NOSONAR
    }

    @Override
    public void visitStage(Stage stage) {
        System.out.println("==========" + stage.getStageName()+ "==========");// NOSONAR

    }

    @Override
    public void visitCommand(Command command) {
        System.out.println("execute " + command.getCodeLine()+ ".....");// NOSONAR
    }
}

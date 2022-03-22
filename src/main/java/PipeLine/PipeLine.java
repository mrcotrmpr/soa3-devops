package PipeLine;

public class PipeLine extends CompositeComponent{
    private String pipeLineName;

    public PipeLine(String pipeLineName) {
        this.pipeLineName = pipeLineName;
    }
    public String getPipeLineName(){
        return this.pipeLineName;
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitPipeline(this);
        super.acceptVisitor(visitor);
    }
}

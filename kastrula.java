public class kastrula extends posuda{
    private float  V;
    public kastrula(String proizvoditel, float chena, String still,float V)
    {
    super(proizvoditel,chena,still);
    this.V =V;
    }
    public void info()
    {
        System.out.println("кастрюля от"+proizvoditel+" обьём см3"+V+" цена:"+chena+" стиль"+still);
    }
}

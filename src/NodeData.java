public class NodeData implements node_data{
    private int key;
    private double weight;
    private String info;
    private int tag;
    private geo_location geo;
    private static int count;

    public NodeData(){
        this.key=count;
        this.weight=0;
        this.info="";
        this.tag=Integer.MAX_VALUE;
        count++;
    }
    @Override
    public int getKey() {
        return this.key;
    }

    @Override
    public geo_location getLocation() {
        return this.geo;
    }

    @Override
    public void setLocation(geo_location p) {
    this.geo=p;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public void setWeight(double w) {
    this.weight=w;
    }

    @Override
    public String getInfo() {
        return this.info;
    }

    @Override
    public void setInfo(String s) {
    this.info=s;
    }

    @Override
    public int getTag() {
        return this.tag;
    }

    @Override
    public void setTag(int t) {
    this.tag=t;
    }
}

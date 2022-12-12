package ie.atu;

public class TrawlerApp {



        private String name;
        private long transponderid;
        private String type;

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public long getTransponderid () {
            return transponderid;
        }

        public void setTransponderid ( long transponderid){
            this.transponderid = transponderid;
        }

        public String getType () {
            return type;
        }

        public void setType (String type){
            this.type = type;
        }

    @Override
    public String toString() {
        return "TrawlerApp{" +
                "name='" + name + '\'' +
                ", transponderid=" + transponderid +
                ", type='" + type + '\'' +
                '}';
    }
}


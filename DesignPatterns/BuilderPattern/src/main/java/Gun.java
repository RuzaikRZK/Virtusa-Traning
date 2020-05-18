public class Gun {

    private final String license;
    private final int bulletsCount;
    private final String gunModel;
    private final String trainingStatus;

    public Gun(Builder builder) {

        this.license = builder.license;
        this.bulletsCount = builder.bulletsCount;
        this.gunModel =builder.gunModel;
        this.trainingStatus = builder.trainingStatus;


    }


    static class Builder{

        private String license;
        private int bulletsCount;
        private String gunModel;
        private String trainingStatus;


        public Gun build(){

            return  new Gun(this);

        }



        public Builder(String license){
            this.license = license;

        }



        public Builder bulletsCount (int bulletsCount){
            this.bulletsCount =bulletsCount;
            return this;
        }

        public Builder gunModel (String gunModel){
            this.gunModel =gunModel;
            return this;
        }

        public Builder trainingStatus (String trainingStatus){

            this.trainingStatus = trainingStatus;
            return this;

        }


    }

    @Override
    public String toString() {
        return "Gun{" +
                "license='" + license + '\'' +
                ", bulletsCount=" + bulletsCount +
                ", gunModel='" + gunModel + '\'' +
                ", trainingStatus='" + trainingStatus + '\'' +
                '}';
    }
}

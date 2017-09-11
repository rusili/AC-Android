package nyc.c4q;

public class ClassToBeBuilt {
    private final String mA;
    private final String mB;
    private final int mC;
    private final int mD;
    private final double mE;
    private final Class mF;

    public ClassToBeBuilt(
            String a,
            String b,
            int c,
            int d,
            double e,
            Class<?> f
    ){
        mA = a;
        mB = b;
        mC = c;
        mD = d;
        mE = e;
        mF = f;
    }

    public static class Builder {
        private String mA = "a";
        private String mB = "b";
        private int mC = 1;
        private int mD = 2;
        private double mE = 5.0;
        private Class<?> mF  = int.class;

        public Builder(){};

        public Builder setA(String mA) {
            this.mA = mA;
            return this;
        }

        public Builder setB(String mB) {
            this.mB = mB;
            return this;
        }

        public Builder setC(int mC) {
            this.mC = mC;
            return this;
        }

        public Builder setD(int mD) {
            this.mD = mD;
            return this;
        }

        public Builder setE(double mE) {
            this.mE = mE;
            return this;
        }

        public Builder setF(Class<?> mF) {
            this.mF = mF;
            return this;
        }

        public ClassToBeBuilt build(){
            return new ClassToBeBuilt(mA,mB,mC,mD,mE,mF);
        }


    }
}

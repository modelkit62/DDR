package a0_BuilderPattern;

class Pizza {

    static class Builder{
        int size;
        boolean tomato;
        boolean cheese;

        Builder(int size) {
            this.size = size;
        }

        Builder tomato(boolean tomato) {
            this.tomato = tomato;
            return this;
        }
        Builder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        Pizza build(){
            return new Pizza(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "size =" + size +
                    ", tomato =" + tomato +
                    ", cheese =" + cheese +
                    '}';
        }
    }

    private Pizza(Builder builder) {
        int size = builder.size;
        boolean cheese = builder.cheese;
        boolean tomato = builder.tomato;
    }

    public static void main(String[] args) {
        Pizza pizza = new Builder(12).tomato(true).cheese(true).build();
        System.out.println(pizza.toString());
    }


}

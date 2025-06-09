public  class Bird implements Animal{

    @Override
    public String getType() {
        return "Bird";
    }

    @Override
    public void talk() {
        System.out.println("I'm talking");
    }

    @Override
    public int getNumberOfLegs() {
        return 0;
    }

}

class DollToy extends Toy {
    public DollToy(int id, int weight, String name) {
        super(id, weight, name);
    }

    @Override
    public String getToyType() {
        return "doll";
    }
}

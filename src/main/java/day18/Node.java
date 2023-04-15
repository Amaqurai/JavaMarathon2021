package day18;

public class Node {
    private Node linkJunior;
    private Node linkSenior;
    private int value;

    public int getValue(){
        return this.value;
    }

    public void setValue(final int value){
        this.value = value;
    }

    public Node getLinkJunior() {
        return this.linkJunior;
    }

    public void setLinkJunior(final Node linkJunior) {
        this.linkJunior = linkJunior;
    }

    public Node getLinkSenior(){
        return this.linkSenior;
    }

    public void setLinkSenior(final Node linkSenior){
        this.linkSenior = linkSenior;
    }

}

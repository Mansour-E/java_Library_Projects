package info.emami;

public abstract class ListItem {

    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext();
    abstract ListItem previous();
    abstract ListItem setPrevious();
    abstract int compareTo();

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }



}

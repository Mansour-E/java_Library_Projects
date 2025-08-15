package info.emami;

public class SearchTree implements NodeList{

    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {

        if(this.root == null ){

            this.root = item;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {

            int comparison = currentItem.compareTo(item);
            if (comparison < 0) {// newItem is greater, move right if possible


            }
        }
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    private void performRemoval(ListItem item1, ListItem item2){


    }

    @Override
    public void traverse(ListItem root) {

    }
}

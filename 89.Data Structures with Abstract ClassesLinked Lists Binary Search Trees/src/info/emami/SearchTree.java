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
            if (comparison < 0) {// item is greater, move right if possible

                if (currentItem.next() != null) {

                    currentItem = currentItem.next();

                }else{

                    currentItem.setNext(item);
                    return true;

                }
            } else if (comparison > 0) { // item is less, move left if possible

                if(currentItem.previous() != null){

                    currentItem = currentItem.previous();
                }else{// there's no node to the left, so add at this

                    currentItem.setPrevious(item);
                    return true;
                }

            }else{// equal, so don't add

                System.out.println(item.getValue() + " is already present");
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {

        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                // equal: we've found the item so remove it
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;

    }

    private void performRemoval(ListItem item1, ListItem item2){



    }

    @Override
    public void traverse(ListItem root) {

    }
}

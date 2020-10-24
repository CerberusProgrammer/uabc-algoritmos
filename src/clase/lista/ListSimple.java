package src.clase.lista;

class ListSimple<T> {

    Node start;

    boolean insertFirst(T info) {
        Node node = new Node(info, null);
        start = node;
        return true;
    }

    T deleteFirst() {
        T delete;

        if(start == null)
            return null;
        
        delete = (T) start.getInfo();
        start = start.getNext();
        return delete;
    }
}
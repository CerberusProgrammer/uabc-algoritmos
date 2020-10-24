package src.clase.lista;

class Node<T> {

    T info;
    Node next;

    Node (T info, Node next) {

    }

    setInfo(T info) {
        this.info = info;
    }

    T getInfo() {
        return this.info;
    }

    setNext(Node next) {
        this.next = next;
    }

    Node getNext() {
        return this.next;
    }
}
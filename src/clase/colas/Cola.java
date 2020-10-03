package src.clase.colas;

public class Cola<T> {

    insert(T data){
        if (end < max){
            end++;
            queu[fin] = data;
            
            if (end==1)
                start = 1
        }
    }

    T remove(){
        T data;
        if (start != 0){
            data = queu[start];
            if (start == end){
                start = 0;
                end = 0
            } else {
                start++;

            }
        }
        return data;
    }

    insertCircular(T data) {
        if (start == 0){

        } else {
            data = colaCir[start];
        }

        if (start == fin){
            start = 0;
            end = 0;
        } else {
            if
        }
    }
}
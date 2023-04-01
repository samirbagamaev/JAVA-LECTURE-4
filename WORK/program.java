/* 
Java: знакомство и как пользоваться базовым API (лекции)

Урок 4. Хранение и обработка данных ч1: приоритетные коллекции
*/

//////////////////////////////////////////////////////////////////////////////////////

//LinkedList

/* 
Представляет собой двусвязный список.

Список – гибкая структура данных, позволяющая легко менять свой
размер. Элементы доступны для вставки или удаления в любой позиции.
*/

//Количество операций меньше => скорость доступа к данным выше.

//------------------------------------------------------------------------

/* 
LinkedList. Список

Мотивация.

LinkedList нужен для небольшого количества
элементов, в которых операции добавления\удаления
встречаются чаще операций чтения.

*/

// package WORK;

// import java.util.LinkedList;

/**
 * program
 */
public class program {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();

        ll.add(1);
        ll.add(2);
        ll.add(3);

        System.out.println(ll);
    }
}

//ОТВЕТ: [1, 2, 3]

//////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////

//Queue

//Коллекция Queue

Queue<Integer> queue = new LinkedList<Integer>(); //пишется так

queue.add(1); //для добавления значения
queue.add(2);
queue.add(3);
queue.add(4);

//-----------------------------------------------------------------

//Для извлечения

// Queue<Integer> queue = new LinkedList<Integer>();
// int item = queue.remove();

//-----------------------------------------------------------------

//Queue

package WORK;

import java.util.*;
public class program {
 public static void main(String[] args) {
 Queue<Integer> queue = new LinkedList<Integer>();
 queue.add(1);
 queue.add(2);
 queue.add(3);
 queue.add(4);
 System.out.println(queue); // [1, 2, 3, 4]
 int item = queue.remove();
 System.out.println(queue); // [2, 3, 4]
 queue.offer(2809);
 item = queue.remove();
 System.out.println(queue); // [3, 4, 2809]
 item = queue.remove();
 System.out.println(queue); // [4, 2809]
 item = queue.poll();
 System.out.println(queue); // [2809]
 }
}

//ОТВЕТ: 
// [1, 2, 3, 4]
// [2, 3, 4]
// [3, 4, 2809]
// [4, 2809]
// [2809]


//-----------------------------------------------------------------



//Queue

// package WORK;

// import java.util.*;
// public class program {
//  public static void main(String[] args) {
//  Queue<Integer> queue = new LinkedList<Integer>();
//  queue.add(1);
//  int item = queue.remove();
//  queue.offer(2809);
//  item = queue.poll();
//  System.out.println(queue);
//  }
// }

//ОТВЕТ: []

//-----------------------------------------------------------------

//Queue

package WORK;

import java.util.*;

public class program {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        int item = queue.remove();
        queue.offer(2809);
        item = queue.poll();
        System.out.println(queue);
        queue.element();
        queue.peek();
    }
}

// ОТВЕТ: 
// []
// Exception in thread "main" java.util.NoSuchElementException
// at java.base/java.util.LinkedList.getFirst(LinkedList.java:248)
// at java.base/java.util.LinkedList.element(LinkedList.java:667)
// at WORK.program.main(program.java:147)

//-----------------------------------------------------------------

//Queue

package WORK;

import java.util.*;

public class program {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        int item = queue.remove();
        queue.offer(2809);
        item = queue.poll();
        System.out.println(queue);
        queue.remove(2809); // зачем очередь??
        queue.element();
        queue.peek();
    }
}

// ОТВЕТ:
// []
// Exception in thread "main" java.util.NoSuchElementException
//         at java.base/java.util.LinkedList.getFirst(LinkedList.java:248)
//         at java.base/java.util.LinkedList.element(LinkedList.java:667)
//         at WORK.program.main(program.java:176)

//////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////

//PriorityQueue

//Наивысший приоритет имеет «наименьший» элемент.

package WORK;

import java.util.PriorityQueue;

/**
 * program
 */
public class program {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(1);
        pq.add(69);
        pq.add(111);
        pq.add(5);
        pq.add(200);

        System.out.println(pq);
    }
}

// ОТВЕТ: [1, 5, 111, 69, 200]

//////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////

//Deque –
//double ended
//queue

//Deque

// Линейная коллекция, которая поддерживает вставку и удаление
// элементов на обоих концах. |

//--------------------------------------------------------------------------

//Deque


package WORK;

import java.util.*;

public class program {
    public static void main(String[] args) {
 Deque<Integer> deque = new ArrayDeque<>();
 Deque<Integer> deque = new ArrayDeque<>();
 deque.addFirst(1);    deque.addLast(2);
 deque.removeLast();     deque.removeLast();
 deque.offerFirst(1);  deque.offerLast(2);
 deque.pollFirst();      deque.pollLast();
 deque.getFirst();       deque.getLast();
 deque.peekFirst();      deque.peekLast();
 }
}





//////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////

//Stack

/*

Stack представляет собой обработку данных по принципу LIFO.
Расширяет Vector пятью операциями, которые позволяют рассматривать
вектор как стек.
push(E item)
pop()

*/


package WORK;

import java.util.*;
public class program {
 public static void main(String[] args) {
 Stack<Integer> stack = new Stack<>();
 stack.push(1);
 stack.push(12);
 stack.push(123);
 System.out.println(stack.pop()); // 123
 System.out.println(stack.pop()); // 12
 System.out.println(stack.pop()); // 1
 }
}


// ОТВЕТ: 
// 123
// 12
// 1


//----------------------------------------------------------------

package WORK;

import java.util.Stack;

public class program {

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        // (1+2*3*4)*(10/5) - 20
        // 1 2 3 * 4 * + 10 5 / * 20 -
        
        //var exp = "20 30 - 10 *".split(" "); // (20-30)*10
        var exp = "1 2 + 3 *".split(" "); // (1 + 2) * 3
        
        //var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
        int res = 0;
        System.out.println(exp);
        
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {

            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res =  st.pop()/ st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }
}

//ОТВЕТ: 9


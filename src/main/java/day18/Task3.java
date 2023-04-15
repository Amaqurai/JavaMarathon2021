package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node();
        root.setValue(20);

        addNode(14, root);
        addNode(23, root);
        addNode(11, root);
        addNode(16, root);
        addNode(22, root);
        addNode(27, root);
        addNode(5, root);
        addNode(15, root);
        addNode(18, root);
        addNode(24, root);
        addNode(150, root);
        addNode(8, root);

        dfs(root);
    }

    public static void addNode(int value, Node root) {
        //Создаём узел и помещаем в него значение
        Node newNode = new Node();
        newNode.setValue(value);

        //Создаём временные ноды которые помогут нам перебрать вложенные значения начиная с корневого узла
        Node currentNode = root;
        Node parentNode;
        while (true) { // Что бы можно было глубоко проваливаться создаём бесконечный цикл
            parentNode = currentNode;
            if (value == currentNode.getValue()) { //Если входящее значение равно текущему значению, завершаем цикл
                return;
            } else if (value < currentNode.getValue()) { //Уходим влево?
                currentNode = currentNode.getLinkJunior();
                if (currentNode == null) {// Если левый узел пуст, кладём туда новый
                    parentNode.setLinkJunior(newNode);
                    return;
                }
            } else { //Либо уходим в право
                currentNode = currentNode.getLinkSenior();
                if (currentNode == null) { // Если правый узел пуст, кладём туда новый
                    parentNode.setLinkSenior(newNode);
                    return;
                }
            }
        }
    }

    public static void dfs(Node node) {
        if (node == null)
            return;

        dfs(node.getLinkJunior());
        System.out.print(node.getValue() + " ");
        dfs(node.getLinkSenior());
    }
}
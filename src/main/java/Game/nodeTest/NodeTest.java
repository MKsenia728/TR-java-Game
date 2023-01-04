package Game.nodeTest;

import Game.Participant;
import Game.enums.LeagueType;
import Game.manageListParticipant.ListParticipant;
import Game.node.Node;

import java.util.List;
import java.util.ListIterator;

public class NodeTest{
    Node<Participant> node = new Node<>();
//
    List<Participant> list;
    public NodeTest(LeagueType leagueType) {
        list = ListParticipant.getInstance().getLeagueType(leagueType);
    }

    public void nodeTest(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Работа с бинарным деревом~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        ListIterator<Participant> listIterator = list.listIterator();
        node.createNode(node, listIterator.next());
        while (listIterator.hasNext()) {
            node.insert(node, listIterator.next());
        }
        System.out.println();
        System.out.println("Симметричные вывод : ");
        node.inOrderTraversal(node);
        System.out.println("Минимальный игрок (первый по алфавиту) : " + node.getMin(node).value);
        System.out.println("Максимальный игрок (последний по алфавиту) : " + node.getMax(node).value);
        Participant participant = list.get(5);
        node.remove(node, participant);
        System.out.println("Из ноды был удален игрок : " + participant);
        System.out.println("Список игроков после удаления игрока : ");
        node.inOrderTraversal(node);
    }
}

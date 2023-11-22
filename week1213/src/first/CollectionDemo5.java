package first;

import java.util.HashMap;
import java.util.Map;

//Map
public class CollectionDemo5 {
    public static void main(String[] args) {
        Map<String, Integer> soldiers = Map.of("최일구",4, "박민석",2,"차병호",1,"성윤모",1);
        System.out.println(soldiers);
        System.out.println(soldiers.size());

        for (String idx : soldiers.keySet())
            System.out.println(idx + " 는(은) 작대기가 " + soldiers.get(idx) + "개 입니다.");

//        soldiers.put("심우진", 4); //추가, 삭제가 안됨

        //추가, 삭제하는 법
        Map<String , Integer> soldiers2 =new HashMap<>(soldiers);
        soldiers2.put("심우진", 4 );
        soldiers2.remove("성윤모");
        for (String idx : soldiers2.keySet())
            System.out.println(idx + " 는(은) 작대기가 " + soldiers.get(idx) + "개 입니다.");
    }
}

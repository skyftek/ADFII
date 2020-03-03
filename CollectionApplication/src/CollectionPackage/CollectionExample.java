package CollectionPackage;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        // Tao doi tuong chua danh sach so nguyen duong
        ArrayList<Integer> arl = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>(); // Truy xuat phan tu khong nhanh bang ArrayList, ko hieu nhe bang ArrayList
        Vector<Integer> vector = new Vector<>();
        List<Integer> list = new ArrayList<>();
        // Them phan tu vao mang
        arl.add(1);
        arl.add(3);
        arl.add(6);
        arl.add(8);
        arl.add(8);
        arl.add(7);
        arl.add(30);
        linkedList.add(20);
        vector.add(35);
        list.add(22);

        arl.addAll(vector);

        // Xoa 1 phan tu khoi mang
        arl.remove((Integer) 30);

        // Truy xuat phan tu cua mang
        Integer first = arl.get(0);

        // Duyet cac phan tu cua mang
            // dung for
        System.out.println("Danh sach cac phan tu trong mang (1): ");
        for(int i = 0; i < arl.size(); i++){
            System.out.println(arl.get(i));
        }

            // dung for in
        System.out.println("Danh sach cac phan tu trong mang (2): ");
        for(Integer i : arl){
            System.out.println(i);
        }

            // dung for each
        System.out.println("Danh sach cac phan tu trong mang (3): ");
        arl.forEach(x -> {
            System.out.println(x);
        });

            // dung while
        System.out.println("Danh sach cac phan tu trong mang (4): ");
        int count = 0;
        while(count < arl.size()){
            System.out.println(arl.get(count));
            count++;
        }

            // dung stream() + lamda
        System.out.println("Danh sach cac phan tu trong mang (5): ");
        arl.stream().forEach(y -> {
            System.out.println(y);
        });

            // dung Iterator - Khuyen dung tai ky II
        System.out.println("Danh sach cac phan tu trong mang (6): ");
        Iterator<Integer> iterator = arl.iterator();
        while (iterator.hasNext()){
            Integer val = iterator.next();
            System.out.println(val);
        }

            // dung ListIterator
        System.out.println("Danh sach cac phan tu trong mang (7): ");
        ListIterator<Integer> listIterator = arl.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        // EXERCISE 1
        // Khoi tao doi tuong Set de chua cac phan tu khong trung lap nhau
        Set<Integer> set = new HashSet<>();
//        for(int i = 0; i < arl.size(); i++){
//            set.add(arl.get(i));
//        }

        set.addAll(arl);

        System.out.println("Duyet Set -->");
        // Duyet Set
            // dung for
        System.out.println("Danh sach cac phan tu co trong mang (1)");
        for(Integer x : set){
            System.out.println(x);
        }

        // Khai bao Map
        Map<Integer, Integer> map = new HashMap<>();
//        map.put(40, 60);
//        map.put(30, 20);
//        map.put(30, 54);
//        map.put(2, 50);
            // duyet phan tu trong mang

            // tinh so lan xuat hien cua cac phan tu trong mang
        for(int i = 0; i < arl.size(); i++){
            Integer key = arl.get(i);
            if(map.containsKey(key)){
                // lay value theo key trong Map
                Integer val = map.get(key);
                val = val + 1;
                // gan lai value cho key
                map.put(key, val);
            } else{
                map.put(key, 1);
            }
        }

            // duyet cac phan tu trong map
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for(Map.Entry entry: entrySet){
            System.out.println("Key: " + entry.getKey() + " | Value: " + entry.getValue());
        }
    }
}
